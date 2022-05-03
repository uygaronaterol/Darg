package com.puncix.darg.common.entity.model;
// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.puncix.darg.common.entity.entities.*;
import net.minecraft.client.renderer.entity.model.EntityModel;

import com.puncix.darg.common.entity.entities.MoglingEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
public class NinjaModel <T extends NinjaEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer rightFoot;

    public NinjaModel() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(22, 0).addBox(-5.0F, -22.0F, 0.0F, 10.0F, 7.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(0, 21).addBox(-5.0F, -29.0F, -1.0F, 10.0F, 7.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(0, 16).addBox(-4.0F, -22.0F, -1.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(45, 0).addBox(-3.0F, -20.0F, -1.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(10, 0).addBox(-2.0F, -18.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(0, 12).addBox(-4.0F, -25.0F, -2.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(25, 21).addBox(-5.0F, -28.0F, -2.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -29.75F, 2.0F);
        body.addChild(head);
        head.setTextureOffset(40, 35).addBox(-3.0F, -1.25F, -4.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(22, 10).addBox(-3.0F, -4.25F, -3.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(5.5F, -28.0F, 2.0F);
        body.addChild(leftUpperArm);
        leftUpperArm.setTextureOffset(26, 29).addBox(-0.5F, -1.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(0.5F, 7.0F, 1.0F);
        leftUpperArm.addChild(leftLowerArm);
        leftLowerArm.setTextureOffset(12, 33).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(3.5F, -14.5F, 1.5F);
        body.addChild(leftUpperLeg);
        leftUpperLeg.setTextureOffset(37, 38).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(0.0F, 7.0F, -0.5F);
        leftUpperLeg.addChild(leftLowerLeg);
        leftLowerLeg.setTextureOffset(44, 10).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);

        leftFoot = new ModelRenderer(this);
        leftFoot.setRotationPoint(0.0F, 6.5F, 0.0F);
        leftLowerLeg.addChild(leftFoot);
        leftFoot.setTextureOffset(20, 41).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-5.5F, -28.0F, 2.0F);
        body.addChild(rightUpperArm);
        rightUpperArm.setTextureOffset(0, 0).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-0.5F, 7.0F, 1.0F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(0, 33).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
        rightLowerArm.setTextureOffset(14, 42).addBox(-1.0F, 6.0F, -19.0F, 1.0F, 1.0F, 21.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(-3.5F, -14.5F, 1.5F);
        body.addChild(rightUpperLeg);
        rightUpperLeg.setTextureOffset(40, 25).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(0.0F, 7.0F, -0.5F);
        rightUpperLeg.addChild(rightLowerLeg);
        rightLowerLeg.setTextureOffset(14, 47).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);

        rightFoot = new ModelRenderer(this);
        rightFoot.setRotationPoint(0.0F, 6.5F, 0.0F);
        rightLowerLeg.addChild(rightFoot);
        rightFoot.setTextureOffset(0, 44).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
    }


    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX =  MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.40F) * 1.4F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 1.4F * limbSwingAmount;
        this.rightLowerArm.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.4F * limbSwingAmount);
        this.leftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLowerLeg.rotateAngleX = -Math.abs(MathHelper.sin(limbSwing * 0.40F) * 1.4F * limbSwingAmount);
        this.rightUpperLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLowerLeg.rotateAngleX = -Math.abs(MathHelper.cos(limbSwing * 0.40F) * 1.4F * limbSwingAmount);
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