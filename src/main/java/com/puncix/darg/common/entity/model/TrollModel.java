package com.puncix.darg.common.entity.model;

import com.puncix.darg.common.entity.entities.TrollEntity;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.CorruptedChickenEntity;
import com.puncix.darg.common.entity.entities.CorruptedCowEntity;
import com.puncix.darg.common.entity.entities.GoldLayingChickenEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
public class TrollModel <T extends TrollEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer leftLowerLeg;

    public TrollModel() {
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-10.0F, -52.0F, -3.0F, 20.0F, 9.0F, 8.0F, 0.0F, false);
        body.setTextureOffset(0, 17).addBox(-9.0F, -43.0F, -2.0F, 18.0F, 9.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(0, 33).addBox(-9.0F, -34.0F, -1.0F, 18.0F, 8.0F, 7.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -51.5F, -2.0F);
        body.addChild(head);
        head.setTextureOffset(50, 9).addBox(-4.0F, -4.5F, -9.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(10.0F, -50.5F, 1.0F);
        body.addChild(leftUpperArm);
        leftUpperArm.setTextureOffset(42, 40).addBox(0.0F, -1.5F, -4.0F, 6.0F, 17.0F, 8.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(3.5F, 16.0F, 0.5F);
        leftUpperArm.addChild(leftLowerArm);
        leftLowerArm.setTextureOffset(63, 58).addBox(-2.5F, -0.5F, -3.5F, 5.0F, 17.0F, 7.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-10.0F, -50.5F, 1.0F);
        body.addChild(rightUpperArm);
        rightUpperArm.setTextureOffset(0, 48).addBox(-6.0F, -1.5F, -4.0F, 6.0F, 17.0F, 8.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-3.5F, 16.0F, 0.5F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(28, 65).addBox(-2.5F, -0.5F, -3.5F, 5.0F, 17.0F, 7.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(6.0F, -26.5F, 2.0F);
        body.addChild(rightUpperLeg);
        rightUpperLeg.setTextureOffset(62, 26).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(-0.5F, 14.0F, -0.5F);
        rightUpperLeg.addChild(rightLowerLeg);
        rightLowerLeg.setTextureOffset(28, 48).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(-6.0F, -26.5F, 2.0F);
        body.addChild(leftUpperLeg);
        leftUpperLeg.setTextureOffset(0, 73).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(0.5F, 14.0F, -0.5F);
        leftUpperLeg.addChild(leftLowerLeg);
        leftLowerLeg.setTextureOffset(16, 73).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX =  MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX = -Math.abs(MathHelper.cos(limbSwing * 0.40F) * 1.4F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 1.4F * limbSwingAmount;
        this.rightLowerArm.rotateAngleX = -Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.4F * limbSwingAmount);
        this.leftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLowerLeg.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.40F) * 1.4F * limbSwingAmount);
        this.rightUpperLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLowerLeg.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.40F) * 1.4F * limbSwingAmount);
    }
    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
