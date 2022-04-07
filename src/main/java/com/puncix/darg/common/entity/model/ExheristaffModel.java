package com.puncix.darg.common.entity.model;
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports



import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.ExheristaffEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ExheristaffModel <T extends ExheristaffEntity> extends EntityModel<T> {
    private final ModelRenderer exheristaff;
    private final ModelRenderer upperBody;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer robe;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer lowerBody;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer cube_r7;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer rightFoot;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer leftFoot;
    private final ModelRenderer cube_r13;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer cube_r17;
    private final ModelRenderer leftHand;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer cube_r20;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer cube_r21;
    private final ModelRenderer rightHand;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer staff;
    private final ModelRenderer cube_r24;
    private final ModelRenderer head;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;

    public ExheristaffModel() {
        textureWidth = 128;
        textureHeight = 128;

        exheristaff = new ModelRenderer(this);
        exheristaff.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotationAngle(exheristaff, 0.0F, 3.1416F, 0.0F);


        upperBody = new ModelRenderer(this);
        upperBody.setRotationPoint(0.0F, -29.0F, 0.0F);
        exheristaff.addChild(upperBody);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 29.0F, 0.0F);
        upperBody.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(44, 33).addBox(4.0F, -47.0F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r1.setTextureOffset(94, 12).addBox(-9.0F, -47.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r1.setTextureOffset(0, 0).addBox(-9.0F, -46.0F, -3.0F, 16.0F, 16.0F, 6.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 29.0F, 0.0F);
        upperBody.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
        cube_r2.setTextureOffset(16, 66).addBox(3.0F, -44.0F, -5.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
        cube_r2.setTextureOffset(66, 24).addBox(3.0F, -42.0F, -5.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
        cube_r2.setTextureOffset(64, 66).addBox(3.0F, -40.0F, -5.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
        cube_r2.setTextureOffset(80, 0).addBox(3.0F, -38.0F, -4.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r2.setTextureOffset(80, 12).addBox(3.0F, -36.0F, -4.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r2.setTextureOffset(82, 24).addBox(3.0F, -34.0F, -3.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
        cube_r2.setTextureOffset(90, 78).addBox(3.0F, -32.0F, -3.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);

        robe = new ModelRenderer(this);
        robe.setRotationPoint(0.0F, -16.0F, -4.0F);
        upperBody.addChild(robe);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 45.0F, 4.0F);
        robe.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(89, 103).addBox(15.0F, -13.0F, -11.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        cube_r3.setTextureOffset(36, 54).addBox(7.0F, -24.0F, -11.0F, 8.0F, 22.0F, 2.0F, 0.0F, false);
        cube_r3.setTextureOffset(56, 54).addBox(-17.0F, -24.0F, -11.0F, 8.0F, 22.0F, 2.0F, 0.0F, false);
        cube_r3.setTextureOffset(97, 103).addBox(-19.0F, -13.0F, -11.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        cube_r3.setTextureOffset(8, 22).addBox(-9.0F, -24.0F, -11.0F, 16.0F, 22.0F, 2.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, 45.0F, 4.0F);
        robe.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(16, 64).addBox(11.0F, -32.0F, -13.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
        cube_r4.setTextureOffset(26, 97).addBox(9.0F, -38.0F, -13.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);
        cube_r4.setTextureOffset(41, 90).addBox(7.0F, -43.0F, -13.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);
        cube_r4.setTextureOffset(105, 103).addBox(-15.0F, -32.0F, -13.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
        cube_r4.setTextureOffset(0, 102).addBox(-13.0F, -38.0F, -13.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);
        cube_r4.setTextureOffset(49, 90).addBox(-11.0F, -43.0F, -13.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);
        cube_r4.setTextureOffset(44, 0).addBox(-9.0F, -45.0F, -13.0F, 16.0F, 22.0F, 2.0F, 0.0F, false);

        lowerBody = new ModelRenderer(this);
        lowerBody.setRotationPoint(0.0F, -1.0F, 0.0F);
        upperBody.addChild(lowerBody);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 30.0F, 0.0F);
        lowerBody.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(38, 40).addBox(-8.0F, -30.0F, -3.0F, 14.0F, 8.0F, 6.0F, 0.0F, false);
        cube_r5.setTextureOffset(10, 96).addBox(-10.0F, -30.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);
        cube_r5.setTextureOffset(92, 91).addBox(6.0F, -30.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 30.0F, 0.0F);
        lowerBody.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
        cube_r6.setTextureOffset(72, 80).addBox(3.0F, -30.0F, -2.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
        cube_r6.setTextureOffset(8, 46).addBox(-5.0F, -30.0F, -5.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(5.0F, 7.0F, 0.0F);
        lowerBody.addChild(rightUpperLeg);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
        rightUpperLeg.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(73, 97).addBox(-2.8296F, -2.0F, -1.2941F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(-1.0F, 7.0F, 0.0F);
        rightUpperLeg.addChild(rightLowerLeg);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-4.0F, 16.0F, 0.0F);
        rightLowerLeg.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(24, 46).addBox(2.0F, -9.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightLowerLeg.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(98, 42).addBox(-1.8637F, 0.0299F, -1.3364F, 3.0F, 7.0F, 4.0F, 0.0F, false);

        rightFoot = new ModelRenderer(this);
        rightFoot.setRotationPoint(0.0F, 14.0F, 0.0F);
        rightLowerLeg.addChild(rightFoot);
        rightFoot.setTextureOffset(99, 19).addBox(-1.8978F, 0.0F, -0.7765F, 3.0F, 2.0F, 5.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(-8.0F, 7.0F, 0.0F);
        lowerBody.addChild(leftUpperLeg);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, -1.0F, 0.0F);
        leftUpperLeg.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(57, 97).addBox(-1.2726F, 0.0F, -2.0706F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(1.0F, 7.0F, 0.0F);
        leftUpperLeg.addChild(leftLowerLeg);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftLowerLeg.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(98, 30).addBox(-1.2385F, 0.0638F, -2.1121F, 3.0F, 7.0F, 4.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(7.0F, 16.0F, 0.0F);
        leftLowerLeg.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(8, 46).addBox(-8.0F, -9.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        leftFoot = new ModelRenderer(this);
        leftFoot.setRotationPoint(1.0F, 14.0F, 0.0F);
        leftLowerLeg.addChild(leftFoot);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-1.0F, 0.0F, 0.0F);
        leftFoot.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(102, 53).addBox(-1.2385F, 0.0F, -1.8117F, 3.0F, 2.0F, 5.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(-9.0F, -15.0F, 0.0F);
        upperBody.addChild(leftUpperArm);


        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(3.0F, 0.0F, -2.0F);
        leftUpperArm.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.0005F, -0.0432F, -1.2276F);
        cube_r14.setTextureOffset(0, 80).addBox(0.0F, -6.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, 0.0F, -2.0F);
        leftUpperArm.addChild(cube_r15);
        setRotationAngle(cube_r15, -0.0005F, -0.0432F, -1.2276F);
        cube_r15.setTextureOffset(0, 80).addBox(-4.0F, -6.0F, 0.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, 2.0F, -2.0F);
        leftUpperArm.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.0005F, -0.0432F, -1.2276F);
        cube_r16.setTextureOffset(0, 80).addBox(-8.0F, -4.0F, 0.0F, 11.0F, 4.0F, 4.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(-5.0F, 9.0F, 0.0F);
        leftUpperArm.addChild(leftLowerArm);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(5.0F, -7.0F, -2.0F);
        leftLowerArm.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.0077F, 0.0429F, -1.222F);
        cube_r17.setTextureOffset(80, 68).addBox(-19.0F, -3.0F, 0.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);

        leftHand = new ModelRenderer(this);
        leftHand.setRotationPoint(-2.0F, 10.0F, 0.0F);
        leftLowerArm.addChild(leftHand);


        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(7.0F, -17.0F, -2.0F);
        leftHand.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.0077F, 0.0429F, -1.222F);
        cube_r18.setTextureOffset(38, 0).addBox(-21.0F, -2.0F, 3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(7.0F, -17.0F, -2.0F);
        leftHand.addChild(cube_r19);
        setRotationAngle(cube_r19, -1.5785F, 0.0429F, -1.222F);
        cube_r19.setTextureOffset(102, 88).addBox(-24.0F, -3.0F, -2.0F, 5.0F, 3.0F, 2.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(7.0F, -16.0F, 0.0F);
        upperBody.addChild(rightUpperArm);


        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(15.0F, 3.0F, -2.0F);
        rightUpperArm.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.0008F, -0.9159F, 1.2282F);
        cube_r20.setTextureOffset(72, 38).addBox(-4.0F, 9.0F, 6.0F, 11.0F, 4.0F, 4.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(4.0F, 4.0F, 8.0F);
        rightUpperArm.addChild(rightLowerArm);


        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(11.0F, -1.0F, -10.0F);
        rightLowerArm.addChild(cube_r21);
        setRotationAngle(cube_r21, -0.0134F, -0.9606F, 1.2334F);
        cube_r21.setTextureOffset(80, 62).addBox(7.0F, 9.0F, 7.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);

        rightHand = new ModelRenderer(this);
        rightHand.setRotationPoint(2.0F, 5.0F, 9.0F);
        rightLowerArm.addChild(rightHand);


        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(0.0F, 1.0F, 0.0F);
        rightHand.addChild(cube_r22);
        setRotationAngle(cube_r22, 2.0974F, 1.5272F, 2.0973F);
        cube_r22.setTextureOffset(9, 88).addBox(-4.4793F, -1.7065F, -1.5875F, 5.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(0.0F, 1.0F, 0.0F);
        rightHand.addChild(cube_r23);
        setRotationAngle(cube_r23, 1.5265F, -0.0079F, 0.0004F);
        cube_r23.setTextureOffset(0, 0).addBox(-0.1532F, -0.3619F, 1.1523F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        staff = new ModelRenderer(this);
        staff.setRotationPoint(0.0F, 1.0F, 3.0F);
        rightHand.addChild(staff);


        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(9.0F, -7.0F, -22.0F);
        staff.addChild(cube_r24);
        setRotationAngle(cube_r24, 2.0974F, 1.5272F, 2.0973F);
        cube_r24.setTextureOffset(54, 33).addBox(-25.0F, -21.0F, -11.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r24.setTextureOffset(26, 80).addBox(-25.0F, -28.0F, -11.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r24.setTextureOffset(60, 38).addBox(-25.0F, -25.0F, -7.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(22, 64).addBox(-25.0F, -25.0F, -14.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(38, 78).addBox(-25.0F, -27.0F, -13.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
        cube_r24.setTextureOffset(8, 108).addBox(-28.0F, -23.0F, -11.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
        cube_r24.setTextureOffset(16, 108).addBox(-23.0F, -23.0F, -6.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
        cube_r24.setTextureOffset(108, 60).addBox(-23.0F, -23.0F, -16.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
        cube_r24.setTextureOffset(108, 71).addBox(-18.0F, -23.0F, -11.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
        cube_r24.setTextureOffset(80, 74).addBox(-28.0F, -16.0F, -11.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r24.setTextureOffset(0, 64).addBox(-23.0F, -16.0F, -16.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
        cube_r24.setTextureOffset(0, 22).addBox(-23.0F, -14.0F, -11.0F, 2.0F, 51.0F, 2.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(-2.0F, -18.0F, 0.0F);
        upperBody.addChild(head);


        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(9.0F, 47.0F, -7.0F);
        head.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, 0.0F);
        cube_r25.setTextureOffset(23, 83).addBox(-13.0F, -55.0F, 2.0F, 9.0F, 9.0F, 1.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(2.0F, 47.0F, 0.0F);
        head.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, 0.0F);
        cube_r26.setTextureOffset(0, 88).addBox(3.0F, -53.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        cube_r26.setTextureOffset(23, 83).addBox(-7.0F, -53.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        cube_r26.setTextureOffset(44, 24).addBox(-6.0F, -56.0F, -4.0F, 9.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r26.setTextureOffset(94, 0).addBox(-5.0F, -55.0F, -4.0F, 7.0F, 9.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(62, 80).addBox(2.0F, -55.0F, -4.0F, 1.0F, 9.0F, 8.0F, 0.0F, false);
        cube_r26.setTextureOffset(80, 80).addBox(-6.0F, -55.0F, -4.0F, 1.0F, 9.0F, 8.0F, 0.0F, false);
        cube_r26.setTextureOffset(76, 48).addBox(-5.0F, -54.0F, -3.0F, 7.0F, 8.0F, 6.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX = MathHelper.cos(limbSwing * 0.40F) * 1.4F * limbSwingAmount;
        this.rightUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 1.4F * limbSwingAmount;
        this.rightLowerArm.rotateAngleX = MathHelper.sin(limbSwing * 0.3F) * 1.4F * limbSwingAmount;
        this.leftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLowerLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.40F) * 1.4F * limbSwingAmount;
        this.rightUpperLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLowerLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.40F) * 1.4F * limbSwingAmount;
        this.robe.rotateAngleX = MathHelper.cos(limbSwing * 0.10F) * 1.1F * limbSwingAmount;
    }



    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        exheristaff.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
