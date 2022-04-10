package com.puncix.darg.common.entity.model;

import com.puncix.darg.common.entity.entities.*;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
public class ZorbigModel <T extends ZorbigEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer rightArm;
    private final ModelRenderer leftArm;
    private final ModelRenderer head;
    private final ModelRenderer rightEar;
    private final ModelRenderer leftEar;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r1;

    public ZorbigModel() {
        textureWidth = 32;
        textureHeight = 32;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(10, 3).addBox(1.0F, -6.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(10, 10).addBox(-1.0F, -6.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(0, 7).addBox(0.0F, -7.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);

        rightArm = new ModelRenderer(this);
        rightArm.setRotationPoint(1.0F, -6.0F, 2.0F);
        body.addChild(rightArm);
        rightArm.setTextureOffset(0, 7).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setRotationPoint(1.0F, -6.0F, -2.0F);
        body.addChild(leftArm);
        leftArm.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(1.0F, -7.0F, 0.0F);
        body.addChild(head);
        head.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

        rightEar = new ModelRenderer(this);
        rightEar.setRotationPoint(0.0F, -3.0F, 2.0F);
        head.addChild(rightEar);
        rightEar.setTextureOffset(15, 1).addBox(-1.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        rightEar.setTextureOffset(8, 17).addBox(-1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        rightEar.setTextureOffset(16, 0).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        leftEar = new ModelRenderer(this);
        leftEar.setRotationPoint(0.0F, -3.0F, -1.0F);
        head.addChild(leftEar);
        leftEar.setTextureOffset(0, 16).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        leftEar.setTextureOffset(16, 10).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        leftEar.setTextureOffset(10, 2).addBox(-1.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(1.0F, -3.0F, -1.0F);
        body.addChild(leftLeg);
        leftLeg.setTextureOffset(10, 0).addBox(-2.0F, 2.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        leftLeg.setTextureOffset(10, 10).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(1.0F, -2.0F, 1.0F);
        body.addChild(rightLeg);
        rightLeg.setTextureOffset(12, 17).addBox(-2.0F, 1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        rightLeg.setTextureOffset(6, 7).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(6.5F, -3.5F, 0.0F);
        body.addChild(tail);
        tail.setTextureOffset(0, 0).addBox(-4.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.48F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addBox(-2.5F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
