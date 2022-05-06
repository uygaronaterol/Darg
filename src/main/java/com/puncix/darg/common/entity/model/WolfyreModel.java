package com.puncix.darg.common.entity.model;

import com.puncix.darg.common.entity.entities.*;
import net.minecraft.client.renderer.entity.model.EntityModel;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class WolfyreModel <T extends WolfyreEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftHand;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftPinky;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftTwo;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftMiddle;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftPoint;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftThumb;
    private final ModelRenderer cube_r12;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer cube_r13;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer cube_r14;
    private final ModelRenderer rightHand;
    private final ModelRenderer cube_r15;
    private final ModelRenderer rightPinky;
    private final ModelRenderer cube_r16;
    private final ModelRenderer rightTwo;
    private final ModelRenderer cube_r17;
    private final ModelRenderer rightMiddle;
    private final ModelRenderer cube_r18;
    private final ModelRenderer rightPoint;
    private final ModelRenderer cube_r19;
    private final ModelRenderer rightThumb;
    private final ModelRenderer cube_r20;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer leftFoot;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer rightFoot;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;

    public WolfyreModel() {
        textureWidth = 256;
        textureHeight = 256;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, -2.0F, 6.0F);
        body.setTextureOffset(52, 68).addBox(-10.0F, -6.0F, -5.0F, 20.0F, 6.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(56, 25).addBox(-10.0F, -12.0F, -6.0F, 20.0F, 6.0F, 10.0F, 0.0F, false);
        body.setTextureOffset(0, 18).addBox(-11.0F, -18.0F, -8.0F, 22.0F, 6.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-15.0F, -24.0F, -10.0F, 29.0F, 6.0F, 12.0F, 0.0F, false);
        body.setTextureOffset(37, 44).addBox(-18.0F, -26.0F, -11.0F, 11.0F, 9.0F, 15.0F, 0.0F, false);
        body.setTextureOffset(0, 35).addBox(7.0F, -26.0F, -11.0F, 11.0F, 9.0F, 15.0F, 0.0F, false);
        body.setTextureOffset(70, 0).addBox(-15.0F, -24.0F, -12.0F, 30.0F, 6.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(74, 41).addBox(-10.0F, -18.0F, -10.0F, 20.0F, 6.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(74, 49).addBox(-9.0F, -12.0F, -8.0F, 18.0F, 3.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 59).addBox(-8.0F, -9.0F, -8.0F, 16.0F, 3.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(55, 21).addBox(-6.0F, -5.0F, -7.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(37, 41).addBox(-7.0F, -6.0F, -7.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 64).addBox(-5.0F, -4.0F, -7.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(98, 83).addBox(-8.0F, -5.0F, 4.0F, 16.0F, 4.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(95, 131).addBox(5.0F, -24.0F, 2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(130, 61).addBox(2.0F, -23.0F, 2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(130, 55).addBox(-1.0F, -24.0F, 2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(32, 129).addBox(-5.0F, -21.0F, 2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(18, 129).addBox(-5.0F, -24.0F, 2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(130, 22).addBox(-8.0F, -24.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(129, 69).addBox(-12.0F, -25.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(24, 129).addBox(-15.0F, -23.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(128, 104).addBox(3.0F, -19.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(128, 46).addBox(-11.0F, -21.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(128, 37).addBox(5.0F, -21.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(126, 114).addBox(9.0F, -21.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(66, 123).addBox(0.0F, -21.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(24, 120).addBox(12.0F, -23.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(88, 100).addBox(15.0F, -24.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(60, 100).addBox(15.0F, -20.0F, 3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(52, 124).addBox(3.0F, -15.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(98, 113).addBox(1.0F, -16.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(78, 113).addBox(-2.0F, -16.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(110, 77).addBox(-5.0F, -17.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(106, 28).addBox(7.0F, -16.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(98, 88).addBox(-7.0F, -15.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(38, 76).addBox(-8.0F, -16.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(37, 44).addBox(1.0F, -11.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(37, 35).addBox(6.0F, -10.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(0, 6).addBox(-3.0F, -10.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-7.0F, -11.0F, 3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -24.5F, -5.0F);
        body.addChild(neck);
        neck.setTextureOffset(72, 8).addBox(-5.0F, -2.5F, -5.0F, 10.0F, 3.0F, 10.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -2.1F, 0.2F);
        neck.addChild(head);
        head.setTextureOffset(0, 68).addBox(-6.0F, -8.4F, -8.2F, 12.0F, 8.0F, 14.0F, 0.0F, false);
        head.setTextureOffset(38, 68).addBox(-5.0F, -7.4F, -9.2F, 10.0F, 7.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(102, 8).addBox(-4.0F, -5.4F, -14.2F, 8.0F, 5.0F, 5.0F, 0.0F, false);
        head.setTextureOffset(70, 8).addBox(-6.0F, -11.4F, -2.2F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(24, 64).addBox(3.0F, -11.4F, -2.2F, 3.0F, 3.0F, 1.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setRotationPoint(0.0F, -0.4F, -7.2F);
        head.addChild(jaw);
        jaw.setTextureOffset(89, 54).addBox(-4.0F, 0.0F, -6.0F, 8.0F, 2.0F, 7.0F, 0.0F, false);
        jaw.setTextureOffset(249, 239).addBox(-4.0F, 0.0F, -7.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        jaw.setTextureOffset(89, 54).addBox(3.0F, 0.0F, -7.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(12.0F, -20.0F, -2.0F);
        body.addChild(leftUpperArm);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(2.0F, 5.0F, -1.0F);
        leftUpperArm.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(74, 123).addBox(-3.0F, 8.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r5.setTextureOffset(56, 123).addBox(1.0F, 8.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r5.setTextureOffset(96, 122).addBox(-1.0F, 6.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r5.setTextureOffset(120, 60).addBox(1.0F, 3.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r5.setTextureOffset(32, 120).addBox(-2.0F, 3.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r5.setTextureOffset(106, 18).addBox(-3.0F, 8.0F, -3.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);
        cube_r5.setTextureOffset(68, 100).addBox(-3.0F, 3.0F, -4.0F, 6.0F, 5.0F, 8.0F, 0.0F, false);
        cube_r5.setTextureOffset(75, 83).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 11.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(2.0F, 16.0F, 1.0F);
        leftUpperArm.addChild(leftLowerArm);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 1.2233F, 0.663F);
        leftLowerArm.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(84, 113).addBox(-2.0F, 1.5F, -3.5F, 4.0F, 4.0F, 6.0F, 0.0F, false);
        cube_r6.setTextureOffset(0, 113).addBox(-2.0F, -2.5F, -4.5F, 4.0F, 4.0F, 7.0F, 0.0F, false);

        leftHand = new ModelRenderer(this);
        leftHand.setRotationPoint(0.0F, 7.0F, 0.0F);
        leftLowerArm.addChild(leftHand);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, -5.7767F, 0.663F);
        leftHand.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(40, 100).addBox(-3.0F, 5.0F, -5.5F, 6.0F, 5.0F, 8.0F, 0.0F, false);

        leftPinky = new ModelRenderer(this);
        leftPinky.setRotationPoint(3.0F, 1.0F, -5.0F);
        leftHand.addChild(leftPinky);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.7933F, 0.6299F, -4.3366F);
        leftPinky.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.0915F, -0.3042F, 0.0275F);
        cube_r8.setTextureOffset(78, 10).addBox(-0.5F, 0.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(8, 45).addBox(-0.5F, -1.75F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(10, 129).addBox(-0.5F, -2.75F, -0.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        leftTwo = new ModelRenderer(this);
        leftTwo.setRotationPoint(1.0F, 1.0F, -5.0F);
        leftHand.addChild(leftTwo);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-0.2475F, 0.5543F, -5.2015F);
        leftTwo.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.0876F, -0.0869F, 0.0076F);
        cube_r9.setTextureOffset(78, 8).addBox(0.0F, 0.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r9.setTextureOffset(37, 44).addBox(0.0F, -1.75F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r9.setTextureOffset(128, 2).addBox(0.0F, -2.75F, -0.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        leftMiddle = new ModelRenderer(this);
        leftMiddle.setRotationPoint(-1.0F, 2.0F, -5.0F);
        leftHand.addChild(leftMiddle);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-0.2456F, -0.4381F, -5.1146F);
        leftMiddle.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.0873F, 0.0435F, -0.0038F);
        cube_r10.setTextureOffset(77, 56).addBox(-0.5F, 0.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r10.setTextureOffset(37, 35).addBox(-0.5F, -1.75F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r10.setTextureOffset(127, 94).addBox(-0.5F, -2.75F, -0.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        leftPoint = new ModelRenderer(this);
        leftPoint.setRotationPoint(-2.0F, 1.0F, -5.0F);
        leftHand.addChild(leftPoint);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-0.5F, 0.505F, -5.7651F);
        leftPoint.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.0915F, 0.3042F, -0.0275F);
        cube_r11.setTextureOffset(8, 77).addBox(-2.5F, 0.25F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r11.setTextureOffset(8, 35).addBox(-2.5F, -1.75F, -0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r11.setTextureOffset(127, 82).addBox(-2.5F, -2.75F, 0.25F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        leftThumb = new ModelRenderer(this);
        leftThumb.setRotationPoint(-3.0F, 1.0F, 0.0F);
        leftHand.addChild(leftThumb);


        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(1.4749F, 0.9407F, -5.7844F);
        leftThumb.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.0962F, 0.4346F, -0.0406F);
        cube_r12.setTextureOffset(4, 77).addBox(-3.5F, 0.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r12.setTextureOffset(0, 35).addBox(-3.5F, -1.75F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r12.setTextureOffset(124, 126).addBox(-3.5F, -2.75F, -0.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-12.0F, -20.0F, -2.0F);
        body.addChild(rightUpperArm);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-2.0F, 5.0F, -1.0F);
        rightUpperArm.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(14, 120).addBox(2.0F, 8.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r13.setTextureOffset(119, 69).addBox(-2.0F, 8.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r13.setTextureOffset(118, 105).addBox(0.0F, 6.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r13.setTextureOffset(118, 37).addBox(-2.0F, 3.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r13.setTextureOffset(116, 114).addBox(1.0F, 3.0F, 4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r13.setTextureOffset(0, 103).addBox(-3.0F, 8.0F, -3.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);
        cube_r13.setTextureOffset(20, 95).addBox(-3.0F, 3.0F, -4.0F, 6.0F, 5.0F, 8.0F, 0.0F, false);
        cube_r13.setTextureOffset(41, 83).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 11.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-2.0F, 16.0F, 1.0F);
        rightUpperArm.addChild(rightLowerArm);


        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, 1.2233F, 0.663F);
        rightLowerArm.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(64, 113).addBox(-2.0F, 1.5F, -3.5F, 4.0F, 4.0F, 6.0F, 0.0F, false);
        cube_r14.setTextureOffset(64, 83).addBox(-2.0F, -2.5F, -4.5F, 4.0F, 4.0F, 7.0F, 0.0F, false);

        rightHand = new ModelRenderer(this);
        rightHand.setRotationPoint(0.0F, 7.0F, 0.0F);
        rightLowerArm.addChild(rightHand);


        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, -5.7767F, 0.663F);
        rightHand.addChild(cube_r15);
        setRotationAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(0, 90).addBox(-3.0F, 5.0F, -5.5F, 6.0F, 5.0F, 8.0F, 0.0F, false);

        rightPinky = new ModelRenderer(this);
        rightPinky.setRotationPoint(-3.0F, 1.0F, -5.0F);
        rightHand.addChild(rightPinky);


        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-0.7933F, 0.6299F, -4.3366F);
        rightPinky.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.0915F, 0.3042F, -0.0275F);
        cube_r16.setTextureOffset(0, 77).addBox(-0.5F, 0.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r16.setTextureOffset(7, 22).addBox(-0.5F, -1.75F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r16.setTextureOffset(86, 126).addBox(-0.5F, -2.75F, -0.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        rightTwo = new ModelRenderer(this);
        rightTwo.setRotationPoint(-1.0F, 1.0F, -5.0F);
        rightHand.addChild(rightTwo);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(0.2475F, 0.5543F, -5.2015F);
        rightTwo.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.0876F, 0.0869F, -0.0076F);
        cube_r17.setTextureOffset(74, 57).addBox(-1.0F, 0.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r17.setTextureOffset(7, 6).addBox(-1.0F, -1.75F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r17.setTextureOffset(44, 126).addBox(-1.0F, -2.75F, -0.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        rightMiddle = new ModelRenderer(this);
        rightMiddle.setRotationPoint(1.0F, 2.0F, -5.0F);
        rightHand.addChild(rightMiddle);


        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(0.2456F, -0.4381F, -5.1146F);
        rightMiddle.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.0873F, -0.0435F, 0.0038F);
        cube_r18.setTextureOffset(11, 48).addBox(-0.5F, 0.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r18.setTextureOffset(7, 0).addBox(-0.5F, -1.75F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r18.setTextureOffset(125, 12).addBox(-0.5F, -2.75F, -0.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        rightPoint = new ModelRenderer(this);
        rightPoint.setRotationPoint(2.0F, 1.0F, -5.0F);
        rightHand.addChild(rightPoint);


        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(0.5F, 0.505F, -5.7651F);
        rightPoint.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.0915F, -0.3042F, 0.0275F);
        cube_r19.setTextureOffset(0, 39).addBox(1.5F, 0.25F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r19.setTextureOffset(0, 6).addBox(1.5F, -1.75F, -0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r19.setTextureOffset(0, 67).addBox(1.5F, -2.75F, 0.25F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        rightThumb = new ModelRenderer(this);
        rightThumb.setRotationPoint(3.0F, 1.0F, 0.0F);
        rightHand.addChild(rightThumb);


        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(-1.4749F, 0.9407F, -5.7844F);
        rightThumb.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.0962F, -0.4346F, 0.0406F);
        cube_r20.setTextureOffset(7, 27).addBox(2.5F, 0.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r20.setTextureOffset(0, 0).addBox(2.5F, -1.75F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r20.setTextureOffset(0, 35).addBox(2.5F, -2.75F, -0.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(7.0F, 0.0F, 0.25F);
        body.addChild(leftUpperLeg);
        leftUpperLeg.setTextureOffset(96, 100).addBox(-3.0F, 0.0F, -4.25F, 6.0F, 6.0F, 7.0F, 0.0F, false);
        leftUpperLeg.setTextureOffset(20, 108).addBox(-3.0F, 6.0F, -4.25F, 6.0F, 6.0F, 6.0F, 0.0F, false);
        leftUpperLeg.setTextureOffset(32, 64).addBox(0.0F, 0.0F, 2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        leftUpperLeg.setTextureOffset(63, 18).addBox(-2.0F, 2.0F, 2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        leftUpperLeg.setTextureOffset(60, 24).addBox(1.0F, 4.0F, 2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        leftUpperLeg.setTextureOffset(59, 18).addBox(1.0F, 7.0F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        leftUpperLeg.setTextureOffset(55, 18).addBox(-1.0F, 6.0F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        leftUpperLeg.setTextureOffset(52, 37).addBox(-2.0F, 9.0F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(-1.0F, 12.0F, -0.25F);
        leftUpperLeg.addChild(leftLowerLeg);
        leftLowerLeg.setTextureOffset(114, 123).addBox(-2.0F, 6.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
        leftLowerLeg.setTextureOffset(44, 113).addBox(-2.0F, 0.0F, -4.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
        leftLowerLeg.setTextureOffset(49, 35).addBox(-1.0F, 1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        leftLowerLeg.setTextureOffset(11, 38).addBox(1.0F, 8.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        leftLowerLeg.setTextureOffset(5, 18).addBox(1.0F, 4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        leftFoot = new ModelRenderer(this);
        leftFoot.setRotationPoint(-0.0298F, 10.875F, -1.5485F);
        leftLowerLeg.addChild(leftFoot);
        leftFoot.setTextureOffset(104, 113).addBox(-1.9702F, 0.125F, -4.4515F, 4.0F, 3.0F, 6.0F, 0.0F, false);
        leftFoot.setTextureOffset(44, 35).addBox(-0.4702F, 1.125F, -6.4515F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-2.9702F, 2.125F, -4.9515F);
        leftFoot.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.5672F, 0.0F);
        cube_r3.setTextureOffset(0, 23).addBox(0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(1.5298F, 2.125F, -4.9515F);
        leftFoot.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.3054F, 0.0F);
        cube_r4.setTextureOffset(0, 18).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(-7.0F, 0.0F, 0.25F);
        body.addChild(rightUpperLeg);
        rightUpperLeg.setTextureOffset(101, 64).addBox(-3.0F, 0.0F, -4.25F, 6.0F, 6.0F, 7.0F, 0.0F, false);
        rightUpperLeg.setTextureOffset(109, 88).addBox(-3.0F, 6.0F, -4.25F, 6.0F, 6.0F, 6.0F, 0.0F, false);
        rightUpperLeg.setTextureOffset(45, 76).addBox(-1.0F, 0.0F, 2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        rightUpperLeg.setTextureOffset(38, 76).addBox(1.0F, 2.0F, 2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        rightUpperLeg.setTextureOffset(74, 54).addBox(-2.0F, 4.0F, 2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        rightUpperLeg.setTextureOffset(8, 70).addBox(-2.0F, 7.0F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        rightUpperLeg.setTextureOffset(0, 70).addBox(0.0F, 6.0F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        rightUpperLeg.setTextureOffset(69, 41).addBox(1.0F, 9.0F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(1.0F, 12.0F, -0.25F);
        rightUpperLeg.addChild(rightLowerLeg);
        rightLowerLeg.setTextureOffset(0, 125).addBox(-2.0F, 6.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
        rightLowerLeg.setTextureOffset(113, 49).addBox(-3.0F, 0.0F, -4.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
        rightLowerLeg.setTextureOffset(67, 18).addBox(0.0F, 1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        rightLowerLeg.setTextureOffset(8, 67).addBox(-2.0F, 8.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        rightLowerLeg.setTextureOffset(0, 67).addBox(-2.0F, 4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        rightFoot = new ModelRenderer(this);
        rightFoot.setRotationPoint(0.0298F, 10.875F, -1.5485F);
        rightLowerLeg.addChild(rightFoot);
        rightFoot.setTextureOffset(116, 28).addBox(-2.0298F, 0.125F, -4.4515F, 4.0F, 3.0F, 6.0F, 0.0F, false);
        rightFoot.setTextureOffset(55, 24).addBox(-0.5298F, 1.125F, -6.4515F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(2.9702F, 2.125F, -4.9515F);
        rightFoot.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.5672F, 0.0F);
        cube_r1.setTextureOffset(0, 45).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-1.5298F, 2.125F, -4.9515F);
        rightFoot.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        cube_r2.setTextureOffset(44, 44).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX =  MathHelper.sin(limbSwing * 0.6662F) * 1.1F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.40F) * 1.1F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 1.1F * limbSwingAmount;
        this.rightLowerArm.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.1F * limbSwingAmount);
        this.leftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
        this.leftLowerLeg.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.40F) * 0.8F * limbSwingAmount);
        this.rightUpperLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
        this.rightLowerLeg.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.40F) * 0.8F * limbSwingAmount);
        this.body.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.10F) * 0.4F * limbSwingAmount);
        this.rightHand.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.5F * limbSwingAmount;
        this.rightMiddle.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.rightPinky.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.rightPoint.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.rightThumb.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.rightTwo.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftHand.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.5F * limbSwingAmount;
        this.leftMiddle.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftPinky.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftPoint.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftThumb.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.leftTwo.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.3F * limbSwingAmount;
        this.body.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 1.1F * limbSwingAmount;

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
