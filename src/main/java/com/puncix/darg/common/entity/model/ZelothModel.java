package com.puncix.darg.common.entity.model;
// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

import com.puncix.darg.common.entity.entities.*;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import com.puncix.darg.common.entity.entities.ZelothEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;

public class ZelothModel <T extends ZelothEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer clock;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer axe;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer rightFoot;

    public ZelothModel() {
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(58, 36).addBox(-7.0F, -19.0F, -1.0F, 14.0F, 3.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(23, 65).addBox(-7.0F, -26.0F, -2.0F, 14.0F, 7.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(55, 25).addBox(-8.0F, -30.0F, -3.0F, 16.0F, 4.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(0, 46).addBox(4.0F, -37.0F, -5.0F, 11.0F, 8.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(0, 32).addBox(-10.0F, -35.0F, -4.0F, 20.0F, 5.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(44, 46).addBox(-15.0F, -37.0F, -5.0F, 11.0F, 8.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(84, 68).addBox(-6.0F, -21.0F, 4.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(33, 46).addBox(-4.0F, -35.0F, -6.0F, 8.0F, 5.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(33, 21).addBox(-6.0F, -26.0F, -3.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(64, 0).addBox(-7.0F, -30.0F, -4.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(33, 53).addBox(-5.0F, -22.0F, -3.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -35.0F, 0.5F);
        body.addChild(neck);
        neck.setTextureOffset(0, 83).addBox(-3.0F, -4.0F, -3.5F, 6.0F, 4.0F, 7.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(-0.4444F, -4.5F, 0.0F);
        neck.addChild(head);
        head.setTextureOffset(33, 0).addBox(-4.5556F, -9.5F, -5.5F, 10.0F, 10.0F, 11.0F, 0.0F, false);
        head.setTextureOffset(108, 124).addBox(-4.5556F, -13.5F, -5.5F, 10.0F, 4.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(5, 113).addBox(-4.5556F, -13.5F, -5.5F, 0.0F, 4.0F, 11.0F, 0.0F, false);
        head.setTextureOffset(124, 0).addBox(-0.5556F, -15.5F, -0.5F, 2.0F, 6.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(52, 102).addBox(5.4444F, -13.5F, -5.5F, 0.0F, 4.0F, 11.0F, 0.0F, false);
        head.setTextureOffset(95, 28).addBox(-4.5556F, -13.5F, 5.5F, 10.0F, 4.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(124, 14).addBox(-3.5556F, -14.5F, 1.5F, 2.0F, 5.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(124, 83).addBox(1.4444F, -14.5F, 1.5F, 2.0F, 5.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(124, 102).addBox(-3.5556F, -14.5F, -2.5F, 2.0F, 5.0F, 0.0F, 0.0F, false);

        clock = new ModelRenderer(this);
        clock.setRotationPoint(0.0F, -31.0F, 0.0F);
        body.addChild(clock);
        clock.setTextureOffset(55, 81).addBox(-3.0F, -44.0F, 17.0F, 6.0F, 30.0F, 0.0F, 0.0F, false);
        clock.setTextureOffset(67, 84).addBox(3.0F, -43.0F, 17.0F, 3.0F, 28.0F, 0.0F, 0.0F, false);
        clock.setTextureOffset(12, 94).addBox(9.0F, -39.0F, 17.0F, 3.0F, 20.0F, 0.0F, 0.0F, false);
        clock.setTextureOffset(37, 98).addBox(12.0F, -36.0F, 17.0F, 3.0F, 15.0F, 0.0F, 0.0F, false);
        clock.setTextureOffset(0, 94).addBox(6.0F, -42.0F, 17.0F, 3.0F, 26.0F, 0.0F, 0.0F, false);
        clock.setTextureOffset(73, 84).addBox(-6.0F, -43.0F, 17.0F, 3.0F, 28.0F, 0.0F, 0.0F, false);
        clock.setTextureOffset(6, 94).addBox(-9.0F, -42.0F, 17.0F, 3.0F, 26.0F, 0.0F, 0.0F, false);
        clock.setTextureOffset(97, 81).addBox(-12.0F, -39.0F, 17.0F, 3.0F, 20.0F, 0.0F, 0.0F, false);
        clock.setTextureOffset(43, 98).addBox(-15.0F, -36.0F, 17.0F, 3.0F, 15.0F, 0.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(9.5F, -31.5F, 0.5F);
        body.addChild(leftUpperArm);
        leftUpperArm.setTextureOffset(0, 0).addBox(-0.5F, -4.5F, -3.5F, 5.0F, 13.0F, 7.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(2.5F, 9.0F, 0.0F);
        leftUpperArm.addChild(leftLowerArm);
        leftLowerArm.setTextureOffset(83, 5).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 9.0F, 5.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-9.5F, -31.5F, 0.5F);
        body.addChild(rightUpperArm);
        rightUpperArm.setTextureOffset(31, 78).addBox(-4.5F, -4.5F, -3.5F, 5.0F, 13.0F, 7.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-2.5F, 9.0F, 0.0F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(79, 84).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 9.0F, 5.0F, 0.0F, false);

        axe = new ModelRenderer(this);
        axe.setRotationPoint(12.0F, 22.5F, -0.5F);
        rightLowerArm.addChild(axe);
        axe.setTextureOffset(49, 36).addBox(-13.0F, -19.0F, -23.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
        axe.setTextureOffset(0, 0).addBox(-13.0F, -18.0F, -23.0F, 2.0F, 3.0F, 29.0F, 0.0F, false);
        axe.setTextureOffset(0, 65).addBox(-14.0F, -22.0F, -29.0F, 4.0F, 3.0F, 15.0F, 0.0F, false);
        axe.setTextureOffset(67, 68).addBox(-13.0F, -25.0F, -28.0F, 2.0F, 3.0F, 13.0F, 0.0F, false);
        axe.setTextureOffset(77, 56).addBox(-13.0F, -26.0F, -27.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);
        axe.setTextureOffset(19, 91).addBox(-13.0F, -27.0F, -25.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
        axe.setTextureOffset(17, 0).addBox(-13.0F, -15.0F, -23.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
        axe.setTextureOffset(60, 6).addBox(-14.0F, -14.0F, -29.0F, 4.0F, 3.0F, 15.0F, 0.0F, false);
        axe.setTextureOffset(50, 65).addBox(-13.0F, -11.0F, -28.0F, 2.0F, 3.0F, 13.0F, 0.0F, false);
        axe.setTextureOffset(77, 44).addBox(-13.0F, -8.0F, -27.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);
        axe.setTextureOffset(84, 73).addBox(-13.0F, -7.0F, -25.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(5.0F, -16.5F, 1.0F);
        body.addChild(leftUpperLeg);
        leftUpperLeg.setTextureOffset(92, 40).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(-0.5F, 8.0F, -0.5F);
        leftUpperLeg.addChild(leftLowerLeg);
        leftLowerLeg.setTextureOffset(0, 65).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        leftFoot = new ModelRenderer(this);
        leftFoot.setRotationPoint(0.0F, 6.5F, 0.0F);
        leftLowerLeg.addChild(leftFoot);
        leftFoot.setTextureOffset(94, 19).addBox(-1.5F, 0.0F, -3.5F, 3.0F, 2.0F, 5.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(-5.0F, -16.5F, 1.0F);
        body.addChild(rightUpperLeg);
        rightUpperLeg.setTextureOffset(92, 56).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(0.5F, 8.0F, -0.5F);
        rightUpperLeg.addChild(rightLowerLeg);
        rightLowerLeg.setTextureOffset(67, 65).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        rightFoot = new ModelRenderer(this);
        rightFoot.setRotationPoint(0.0F, 6.5F, 0.0F);
        rightLowerLeg.addChild(rightFoot);
        rightFoot.setTextureOffset(95, 73).addBox(-1.5F, 0.0F, -3.5F, 3.0F, 2.0F, 5.0F, 0.0F, false);
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