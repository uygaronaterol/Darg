package com.puncix.darg.common.entity.model;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.puncix.darg.common.entity.entities.CinnerEntity;
import com.puncix.darg.common.entity.entities.ExheristaffEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
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
public class CinnerModel <T extends CinnerEntity> extends EntityModel<T> {
    private final ModelRenderer lamb;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightThumb1;
    private final ModelRenderer rightThumb2;
    private final ModelRenderer rightPoint1;
    private final ModelRenderer rightPoint2;
    private final ModelRenderer rightMiddle1;
    private final ModelRenderer rightMiddle2;
    private final ModelRenderer rightLeft21;
    private final ModelRenderer rightLeft22;
    private final ModelRenderer rightPinky1;
    private final ModelRenderer rightPinky2;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftThumb3;
    private final ModelRenderer leftThumb4;
    private final ModelRenderer leftPoint3;
    private final ModelRenderer leftPoint4;
    private final ModelRenderer leftMiddle3;
    private final ModelRenderer leftMiddle4;
    private final ModelRenderer leftLeft;
    private final ModelRenderer leftLeft3;
    private final ModelRenderer leftPinky3;
    private final ModelRenderer leftPinky4;

    public CinnerModel() {
        textureWidth = 256;
        textureHeight = 256;

        lamb = new ModelRenderer(this);
        lamb.setRotationPoint(0.0F, 24.0F, 0.0F);
        lamb.setTextureOffset(114, 87).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 7.0F, 0.0F, false);
        lamb.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
        lamb.setTextureOffset(114, 72).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 6.0F, 9.0F, 0.0F, false);
        lamb.setTextureOffset(70, 88).addBox(-1.0F, -8.0F, -8.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
        lamb.setTextureOffset(60, 67).addBox(-1.0F, -7.0F, -7.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
        lamb.setTextureOffset(10, 29).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        lamb.setTextureOffset(0, 13).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -5.5F, 6.0F);
        lamb.addChild(cube_r1);
        setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(10, 32).addBox(-1.0F, 0.5F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -6.0F, 9.0F);
        lamb.addChild(cube_r2);
        setRotationAngle(cube_r2, -1.5708F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(0, 29).addBox(-1.0F, 1.5F, -2.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -8.5F, -1.0F);
        lamb.addChild(cube_r3);
        setRotationAngle(cube_r3, -1.5708F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(54, 37).addBox(-1.0F, -6.5F, 5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, -8.0F, -8.0F);
        lamb.addChild(body);
        body.setTextureOffset(0, 23).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(70, 81).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(119, 18).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 4.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(0, 114).addBox(-5.0F, -9.0F, -8.0F, 10.0F, 3.0F, 8.0F, 0.0F, false);
        body.setTextureOffset(71, 104).addBox(-6.0F, -12.0F, -9.0F, 12.0F, 3.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(100, 32).addBox(-7.0F, -15.0F, -10.0F, 14.0F, 3.0F, 10.0F, 0.0F, false);
        body.setTextureOffset(0, 79).addBox(-8.0F, -18.0F, -11.0F, 16.0F, 3.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(58, 61).addBox(-9.0F, -26.0F, -12.0F, 18.0F, 8.0F, 12.0F, 0.0F, false);
        body.setTextureOffset(47, 40).addBox(-10.0F, -34.0F, -13.0F, 20.0F, 8.0F, 13.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-12.0F, -42.0F, -14.0F, 24.0F, 8.0F, 15.0F, 0.0F, false);
        body.setTextureOffset(61, 6).addBox(-19.0F, -43.0F, -15.0F, 12.0F, 9.0F, 17.0F, 0.0F, false);
        body.setTextureOffset(0, 53).addBox(7.0F, -43.0F, -15.0F, 12.0F, 9.0F, 17.0F, 0.0F, false);
        body.setTextureOffset(42, 32).addBox(-9.0F, -34.0F, -14.0F, 18.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(80, 32).addBox(-7.0F, -39.0F, -15.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(0, 29).addBox(-7.0F, -42.0F, -15.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(9, 0).addBox(5.0F, -42.0F, -15.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(63, 0).addBox(-8.0F, -30.0F, -14.0F, 16.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(100, 45).addBox(-7.0F, -26.0F, -13.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(41, 61).addBox(-6.0F, -22.0F, -13.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(41, 66).addBox(-5.0F, -18.0F, -12.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(0, 37).addBox(-4.0F, -15.0F, -11.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -42.0F, -6.5F);
        body.addChild(neck);
        neck.setTextureOffset(0, 93).addBox(-5.0F, -2.0F, -6.5F, 10.0F, 2.0F, 13.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -2.5F, 1.1667F);
        neck.addChild(head);
        head.setTextureOffset(63, 5).addBox(-2.0F, -6.5F, -15.6667F, 4.0F, 4.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(0, 6).addBox(-2.0F, -7.5F, -13.6667F, 4.0F, 5.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(0, 23).addBox(-6.0F, -11.5F, -11.6667F, 12.0F, 12.0F, 18.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-16.25F, -40.5F, -4.25F);
        body.addChild(rightUpperArm);
        rightUpperArm.setTextureOffset(35, 104).addBox(-3.75F, 8.5F, -6.75F, 7.0F, 7.0F, 11.0F, 0.0F, false);
        rightUpperArm.setTextureOffset(84, 81).addBox(-3.75F, -0.5F, -9.75F, 8.0F, 9.0F, 14.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-0.75F, 15.5F, -0.25F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(104, 107).addBox(-3.0F, 0.0F, -4.5F, 6.0F, 10.0F, 9.0F, 0.0F, false);

        rightHand = new ModelRenderer(this);
        rightHand.setRotationPoint(-0.5F, 10.5F, 0.5F);
        rightLowerArm.addChild(rightHand);
        rightHand.setTextureOffset(28, 122).addBox(-2.5F, -0.5F, -4.0F, 5.0F, 9.0F, 8.0F, 0.0F, false);

        rightThumb1 = new ModelRenderer(this);
        rightThumb1.setRotationPoint(0.0F, 1.5F, -3.5F);
        rightHand.addChild(rightThumb1);
        rightThumb1.setTextureOffset(0, 63).addBox(-2.5F, -1.0F, -3.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);

        rightThumb2 = new ModelRenderer(this);
        rightThumb2.setRotationPoint(0.0F, 0.0F, -3.0F);
        rightThumb1.addChild(rightThumb2);
        rightThumb2.setTextureOffset(0, 58).addBox(-2.5F, -1.0F, -3.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);

        rightPoint1 = new ModelRenderer(this);
        rightPoint1.setRotationPoint(0.0F, 8.0F, -3.5F);
        rightHand.addChild(rightPoint1);
        rightPoint1.setTextureOffset(102, 18).addBox(-2.5F, 0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        rightPoint2 = new ModelRenderer(this);
        rightPoint2.setRotationPoint(0.0F, 4.0F, 0.0F);
        rightPoint1.addChild(rightPoint2);
        rightPoint2.setTextureOffset(60, 104).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        rightMiddle1 = new ModelRenderer(this);
        rightMiddle1.setRotationPoint(0.0F, 9.0F, -0.5F);
        rightHand.addChild(rightMiddle1);
        rightMiddle1.setTextureOffset(0, 108).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        rightMiddle2 = new ModelRenderer(this);
        rightMiddle2.setRotationPoint(0.0F, 3.0F, 0.0F);
        rightMiddle1.addChild(rightMiddle2);
        rightMiddle2.setTextureOffset(12, 108).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        rightLeft21 = new ModelRenderer(this);
        rightLeft21.setRotationPoint(0.0F, 9.0F, 1.5F);
        rightHand.addChild(rightLeft21);
        rightLeft21.setTextureOffset(24, 108).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        rightLeft22 = new ModelRenderer(this);
        rightLeft22.setRotationPoint(0.0F, 3.0F, 0.0F);
        rightLeft21.addChild(rightLeft22);
        rightLeft22.setTextureOffset(60, 108).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        rightPinky1 = new ModelRenderer(this);
        rightPinky1.setRotationPoint(0.0F, 9.0F, 3.5F);
        rightHand.addChild(rightPinky1);
        rightPinky1.setTextureOffset(81, 116).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        rightPinky2 = new ModelRenderer(this);
        rightPinky2.setRotationPoint(0.0F, 3.0F, 0.0F);
        rightPinky1.addChild(rightPinky2);
        rightPinky2.setTextureOffset(114, 18).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(16.25F, -40.5F, -4.25F);
        body.addChild(leftUpperArm);
        leftUpperArm.setTextureOffset(102, 0).addBox(-3.25F, 8.5F, -6.75F, 7.0F, 7.0F, 11.0F, 0.0F, false);
        leftUpperArm.setTextureOffset(40, 81).addBox(-4.25F, -0.5F, -9.75F, 8.0F, 9.0F, 14.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(0.75F, 15.5F, -0.25F);
        leftUpperArm.addChild(leftLowerArm);
        leftLowerArm.setTextureOffset(106, 52).addBox(-3.0F, 0.0F, -4.5F, 6.0F, 10.0F, 9.0F, 0.0F, false);

        leftHand = new ModelRenderer(this);
        leftHand.setRotationPoint(0.5F, 10.5F, 0.5F);
        leftLowerArm.addChild(leftHand);
        leftHand.setTextureOffset(63, 116).addBox(-2.5F, -0.5F, -4.0F, 5.0F, 9.0F, 8.0F, 0.0F, false);

        leftThumb3 = new ModelRenderer(this);
        leftThumb3.setRotationPoint(0.0F, 1.5F, -3.5F);
        leftHand.addChild(leftThumb3);
        leftThumb3.setTextureOffset(0, 53).addBox(-2.5F, -1.0F, -3.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);

        leftThumb4 = new ModelRenderer(this);
        leftThumb4.setRotationPoint(0.0F, 0.0F, -3.0F);
        leftThumb3.addChild(leftThumb4);
        leftThumb4.setTextureOffset(42, 23).addBox(-2.5F, -1.0F, -3.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);

        leftPoint3 = new ModelRenderer(this);
        leftPoint3.setRotationPoint(0.0F, 8.0F, -3.5F);
        leftHand.addChild(leftPoint3);
        leftPoint3.setTextureOffset(97, 0).addBox(-2.5F, 0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        leftPoint4 = new ModelRenderer(this);
        leftPoint4.setRotationPoint(0.0F, 4.0F, 0.0F);
        leftPoint3.addChild(leftPoint4);
        leftPoint4.setTextureOffset(0, 101).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        leftMiddle3 = new ModelRenderer(this);
        leftMiddle3.setRotationPoint(0.0F, 9.0F, -0.5F);
        leftHand.addChild(leftMiddle3);
        leftMiddle3.setTextureOffset(0, 97).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        leftMiddle4 = new ModelRenderer(this);
        leftMiddle4.setRotationPoint(0.0F, 3.0F, 0.0F);
        leftMiddle3.addChild(leftMiddle4);
        leftMiddle4.setTextureOffset(0, 93).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        leftLeft = new ModelRenderer(this);
        leftLeft.setRotationPoint(0.0F, 9.0F, 1.5F);
        leftHand.addChild(leftLeft);
        leftLeft.setTextureOffset(63, 11).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        leftLeft3 = new ModelRenderer(this);
        leftLeft3.setRotationPoint(0.0F, 3.0F, 0.0F);
        leftLeft.addChild(leftLeft3);
        leftLeft3.setTextureOffset(78, 88).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        leftPinky3 = new ModelRenderer(this);
        leftPinky3.setRotationPoint(0.0F, 9.0F, 3.5F);
        leftHand.addChild(leftPinky3);
        leftPinky3.setTextureOffset(42, 28).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        leftPinky4 = new ModelRenderer(this);
        leftPinky4.setRotationPoint(0.0F, 3.0F, 0.0F);
        leftPinky3.addChild(leftPinky4);
        leftPinky4.setTextureOffset(42, 37).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
    }

    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
        this.leftUpperArm.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.6662F) * 1.1F * limbSwingAmount);
        this.leftLowerArm.rotateAngleX = -Math.abs(MathHelper.cos(limbSwing * 0.40F) * 1.1F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX = -Math.abs(MathHelper.cos(limbSwing * 0.3F) * 1.1F * limbSwingAmount);
        this.rightLowerArm.rotateAngleX = -Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.1F * limbSwingAmount);
        this.body.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.10F) * 0.4F * limbSwingAmount);
        this.rightHand.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.5F * limbSwingAmount;
        this.rightMiddle1.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.rightPinky1.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.rightPoint1.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.rightThumb1.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.rightLeft21.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftHand.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.5F * limbSwingAmount;
        this.leftPinky3.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftLeft3.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftThumb3.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftMiddle3.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.body.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.3F) * 0.4F * limbSwingAmount);
    }
        @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        lamb.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
