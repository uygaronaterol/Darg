package com.puncix.darg.common.entity.model;
// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.DarbigEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import com.puncix.darg.common.entity.entities.DarbigEntity;
import com.puncix.darg.common.entity.entities.GoblinEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;

public class GoblinModel <T extends GoblinEntity> extends EntityModel<T> {
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer rightFoot;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer leftFoot;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer leftLowerArm;

    public GoblinModel() {
        textureWidth = 64;
        textureHeight = 64;

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(-4.0F, 13.0F, 1.5F);
        rightUpperLeg.setTextureOffset(10, 44).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(0.0F, 4.5F, -0.5F);
        rightUpperLeg.addChild(rightLowerLeg);
        rightLowerLeg.setTextureOffset(20, 45).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        rightFoot = new ModelRenderer(this);
        rightFoot.setRotationPoint(0.0F, 4.5F, 0.0F);
        rightLowerLeg.addChild(rightFoot);
        rightFoot.setTextureOffset(34, 21).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(4.0F, 13.0F, 1.5F);
        leftUpperLeg.setTextureOffset(0, 44).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(0.0F, 4.5F, -0.5F);
        leftUpperLeg.addChild(leftLowerLeg);
        leftLowerLeg.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        leftFoot = new ModelRenderer(this);
        leftFoot.setRotationPoint(0.0F, 4.5F, 0.0F);
        leftLowerLeg.addChild(leftFoot);
        leftFoot.setTextureOffset(32, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(29, 28).addBox(-6.0F, -14.0F, -1.0F, 12.0F, 3.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-6.0F, -20.0F, -3.0F, 12.0F, 6.0F, 8.0F, 0.0F, false);
        body.setTextureOffset(0, 14).addBox(-6.0F, -23.0F, -3.0F, 12.0F, 3.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(0, 24).addBox(-6.0F, -27.0F, -2.0F, 12.0F, 4.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(31, 14).addBox(-4.0F, -29.0F, -3.0F, 8.0F, 2.0F, 5.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -4.375F, -1.875F);
        head.setTextureOffset(17, 33).addBox(-1.0F, -1.625F, -6.125F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(40, 0).addBox(-6.0F, -1.625F, -1.125F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(32, 6).addBox(3.0F, -1.625F, -1.125F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 33).addBox(-3.0F, -3.625F, -4.125F, 6.0F, 6.0F, 5.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-6.5F, -2.5F, 1.0F);
        rightUpperArm.setTextureOffset(32, 36).addBox(-2.5F, -0.5F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-1.5F, 7.0F, 0.0F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(42, 36).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(6.5F, -2.5F, 1.0F);
        leftUpperArm.setTextureOffset(22, 36).addBox(-0.5F, -0.5F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(1.5F, 7.0F, 0.0F);
        leftUpperArm.addChild(leftLowerArm);
        leftLowerArm.setTextureOffset(42, 4).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
        this.rightUpperArm.rotateAngleX = -MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX = -Math.abs(MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount);
        this.rightLowerArm.rotateAngleX = -Math.abs(MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount);
        this.leftLowerLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLowerLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        rightUpperLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        leftUpperLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        rightUpperArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        leftUpperArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}