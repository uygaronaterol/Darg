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

public class DoranzerModel <T extends DoranzerEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer rightFoot;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer leftFoot;
    private final ModelRenderer cube_r19;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer shield;
    private final ModelRenderer cube_r24;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer cube_r25;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer cube_r26;
    private final ModelRenderer trident;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;

    public DoranzerModel() {
        textureWidth = 256;
        textureHeight = 256;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(94, 72).addBox(-14.0F, -37.0F, -2.0F, 28.0F, 4.0F, 8.0F, 0.0F, false);
        body.setTextureOffset(66, 140).addBox(-14.0F, -50.0F, -3.0F, 28.0F, 13.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(0, 66).addBox(-15.0F, -61.0F, -4.0F, 30.0F, 11.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(113, 93).addBox(-17.0F, -73.0F, -6.0F, 34.0F, 12.0F, 14.0F, 0.0F, false);
        body.setTextureOffset(0, 33).addBox(-26.0F, -75.0F, -8.0F, 19.0F, 15.0F, 18.0F, 0.0F, false);
        body.setTextureOffset(154, 119).addBox(-12.0F, -44.0F, 6.0F, 24.0F, 9.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(7.0F, -75.0F, -8.0F, 19.0F, 15.0F, 18.0F, 0.0F, false);
        body.setTextureOffset(86, 208).addBox(-7.0F, -73.0F, -8.0F, 14.0F, 13.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(182, 19).addBox(-12.0F, -60.0F, -6.0F, 24.0F, 7.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(142, 84).addBox(-10.0F, -50.0F, -5.0F, 20.0F, 4.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(94, 84).addBox(-11.0F, -53.0F, -6.0F, 22.0F, 3.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(196, 45).addBox(-9.0F, -46.0F, -5.0F, 18.0F, 4.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(94, 29).addBox(-5.0F, -40.0F, -5.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(94, 25).addBox(-7.0F, -42.0F, -5.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-15.0F, -53.2895F, 11.7464F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.7073F, -0.4891F, -0.3819F);
        cube_r1.setTextureOffset(0, 120).addBox(-5.0F, -3.0F, -1.0F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r1.setTextureOffset(0, 170).addBox(-6.0F, -4.0F, -14.0F, 8.0F, 6.0F, 13.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(15.0F, -53.2895F, 11.7464F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.7073F, 0.4891F, 0.3819F);
        cube_r2.setTextureOffset(0, 192).addBox(-1.0F, -3.0F, -1.0F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r2.setTextureOffset(173, 64).addBox(-2.0F, -4.0F, -14.0F, 8.0F, 6.0F, 13.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(2.0F, -58.0F, 11.5F);
        body.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(195, 83).addBox(10.0F, -22.0F, 22.5F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(167, 177).addBox(9.0F, -23.0F, 9.5F, 8.0F, 6.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(142, 195).addBox(-20.0F, -22.0F, 22.5F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(160, 40).addBox(8.0F, -24.0F, -6.5F, 10.0F, 8.0F, 16.0F, 0.0F, false);
        cube_r3.setTextureOffset(50, 162).addBox(-22.0F, -24.0F, -6.5F, 10.0F, 8.0F, 16.0F, 0.0F, false);
        cube_r3.setTextureOffset(185, 130).addBox(-21.0F, -11.0F, -3.5F, 8.0F, 6.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(182, 0).addBox(-21.0F, -23.0F, 9.5F, 8.0F, 6.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(196, 171).addBox(-20.0F, -10.0F, 9.5F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(180, 196).addBox(-15.0F, 2.0F, -0.5F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(29, 186).addBox(-16.0F, 1.0F, -13.5F, 8.0F, 6.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(71, 186).addBox(2.0F, 1.0F, -13.5F, 8.0F, 6.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(202, 51).addBox(3.0F, 2.0F, -0.5F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(113, 189).addBox(9.0F, -11.0F, -3.5F, 8.0F, 6.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(25, 205).addBox(10.0F, -10.0F, 9.5F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(205, 28).addBox(-7.0F, -7.0F, 9.5F, 6.0F, 4.0F, 13.0F, 0.0F, false);
        cube_r3.setTextureOffset(189, 152).addBox(-8.0F, -8.0F, -3.5F, 8.0F, 6.0F, 13.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(-9.9161F, -33.0895F, 1.6338F);
        body.addChild(rightUpperLeg);
        rightUpperLeg.setTextureOffset(118, 208).addBox(-3.0839F, 0.0895F, -3.6338F, 6.0F, 14.0F, 7.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-4.5839F, 5.0895F, -0.1338F);
        rightUpperLeg.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7418F);
        cube_r4.setTextureOffset(86, 162).addBox(-5.5F, 1.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);
        cube_r4.setTextureOffset(0, 120).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-1.8815F, 8.0386F, 4.8662F);
        rightUpperLeg.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.9599F, 0.0F, -0.7418F);
        cube_r5.setTextureOffset(0, 170).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(0.9161F, 19.3034F, -4.5769F);
        rightUpperLeg.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(30, 93).addBox(-2.0F, -13.0F, 6.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(-0.7597F, 13.5554F, -0.4775F);
        rightUpperLeg.addChild(rightLowerLeg);
        rightLowerLeg.setTextureOffset(29, 170).addBox(-1.3242F, 8.5342F, -3.1563F, 5.0F, 8.0F, 5.0F, 0.0F, false);
        rightLowerLeg.setTextureOffset(215, 68).addBox(-1.3242F, 0.5342F, -3.1563F, 5.0F, 8.0F, 6.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(1.6758F, 5.748F, -4.0994F);
        rightLowerLeg.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(170, 165).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(1.1758F, 15.5342F, -6.1563F);
        rightLowerLeg.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(176, 130).addBox(-0.5F, -6.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-1.1218F, -5.5167F, 5.3437F);
        rightLowerLeg.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.9599F, 0.0F, -0.7418F);
        cube_r9.setTextureOffset(98, 162).addBox(-11.5F, 4.0F, 8.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        cube_r9.setTextureOffset(113, 119).addBox(-6.5F, -2.0F, 2.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-3.8242F, -8.4658F, 0.3437F);
        rightLowerLeg.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7418F);
        cube_r10.setTextureOffset(178, 165).addBox(-12.5F, 11.0F, -1.5F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        cube_r10.setTextureOffset(182, 0).addBox(-9.5F, 8.0F, -1.5F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        rightFoot = new ModelRenderer(this);
        rightFoot.setRotationPoint(1.1758F, 16.6592F, 0.3437F);
        rightLowerLeg.addChild(rightFoot);
        rightFoot.setTextureOffset(211, 0).addBox(-2.5F, -0.125F, -8.5F, 5.0F, 3.0F, 10.0F, 0.0F, false);
        rightFoot.setTextureOffset(160, 40).addBox(-3.5F, 0.875F, -6.5F, 1.0F, 2.0F, 7.0F, 0.0F, false);
        rightFoot.setTextureOffset(160, 130).addBox(2.5F, 0.875F, -6.5F, 1.0F, 2.0F, 7.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, -1.125F, -6.5F);
        rightFoot.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(94, 0).addBox(-1.5F, -4.0F, -1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(9.9161F, -33.0895F, 1.6338F);
        body.addChild(leftUpperLeg);
        leftUpperLeg.setTextureOffset(94, 40).addBox(-2.9161F, 0.0895F, -3.6338F, 6.0F, 14.0F, 7.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(4.5839F, 5.0895F, -0.1338F);
        leftUpperLeg.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7418F);
        cube_r12.setTextureOffset(56, 33).addBox(2.5F, 1.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);
        cube_r12.setTextureOffset(113, 93).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(1.8815F, 8.0386F, 4.8662F);
        leftUpperLeg.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.9599F, 0.0F, 0.7418F);
        cube_r13.setTextureOffset(74, 34).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-0.9161F, 19.3034F, -4.5769F);
        leftUpperLeg.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(0, 93).addBox(-1.0F, -13.0F, 6.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(0.7597F, 13.5554F, -0.4775F);
        leftUpperLeg.addChild(leftLowerLeg);
        leftLowerLeg.setTextureOffset(25, 120).addBox(-3.6758F, 8.5342F, -3.1563F, 5.0F, 8.0F, 5.0F, 0.0F, false);
        leftLowerLeg.setTextureOffset(214, 122).addBox(-3.6758F, 0.5342F, -3.1563F, 5.0F, 8.0F, 6.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(-1.6758F, 5.748F, -4.0994F);
        leftLowerLeg.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(120, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-1.1758F, 15.5342F, -6.1563F);
        leftLowerLeg.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.4363F, 0.0F, 0.0F);
        cube_r16.setTextureOffset(106, 162).addBox(-1.5F, -6.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(1.1218F, -5.5167F, 5.3437F);
        leftLowerLeg.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.9599F, 0.0F, 0.7418F);
        cube_r17.setTextureOffset(82, 76).addBox(9.5F, 4.0F, 8.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        cube_r17.setTextureOffset(56, 0).addBox(3.5F, -2.0F, 2.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(3.8242F, -8.4658F, 0.3437F);
        leftLowerLeg.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7418F);
        cube_r18.setTextureOffset(132, 162).addBox(10.5F, 11.0F, -1.5F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        cube_r18.setTextureOffset(144, 165).addBox(7.5F, 8.0F, -1.5F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        leftFoot = new ModelRenderer(this);
        leftFoot.setRotationPoint(-1.1758F, 16.6592F, 0.3437F);
        leftLowerLeg.addChild(leftFoot);
        leftFoot.setTextureOffset(206, 109).addBox(-2.5F, -0.125F, -8.5F, 5.0F, 3.0F, 10.0F, 0.0F, false);
        leftFoot.setTextureOffset(74, 0).addBox(2.5F, 0.875F, -6.5F, 1.0F, 2.0F, 7.0F, 0.0F, false);
        leftFoot.setTextureOffset(71, 67).addBox(-3.5F, 0.875F, -6.5F, 1.0F, 2.0F, 7.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(0.0F, -1.125F, -6.5F);
        leftFoot.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.4363F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(0, 66).addBox(-1.5F, -4.0F, -1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(21.25F, -62.924F, -0.0739F);
        body.addChild(leftUpperArm);


        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(6.75F, 4.529F, -2.365F);
        leftUpperArm.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.3127F, 0.5338F, 1.0047F);
        cube_r20.setTextureOffset(144, 212).addBox(-3.0F, -6.0F, -2.5F, 6.0F, 12.0F, 5.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(-0.5F, 17.924F, 1.0739F);
        leftUpperArm.addChild(cube_r21);
        setRotationAngle(cube_r21, -0.6109F, 0.0F, 0.0F);
        cube_r21.setTextureOffset(102, 162).addBox(-4.75F, -15.0F, -17.0F, 9.0F, 15.0F, 12.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(0.0705F, 12.1533F, -6.1782F);
        leftUpperArm.addChild(leftLowerArm);


        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(6.6795F, -7.6242F, 3.8132F);
        leftLowerArm.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.3127F, 0.5338F, 1.0047F);
        cube_r22.setTextureOffset(0, 0).addBox(5.0F, 0.0F, -2.5F, 5.0F, 12.0F, 4.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-0.3205F, 5.605F, -6.0604F);
        leftLowerArm.addChild(cube_r23);
        setRotationAngle(cube_r23, -0.829F, 0.0F, 0.0F);
        cube_r23.setTextureOffset(144, 165).addBox(-4.5F, -8.5F, -6.0F, 8.0F, 15.0F, 10.0F, 0.0F, false);

        shield = new ModelRenderer(this);
        shield.setRotationPoint(-21.3205F, 50.7707F, 6.2521F);
        leftLowerArm.addChild(shield);


        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(21.0F, -45.1657F, -12.3125F);
        shield.addChild(cube_r24);
        setRotationAngle(cube_r24, -0.829F, 0.0F, 0.0F);
        cube_r24.setTextureOffset(0, 93).addBox(-17.5F, 9.5F, -19.0F, 34.0F, 2.0F, 45.0F, 0.0F, false);
        cube_r24.setTextureOffset(94, 0).addBox(-13.5F, 8.5F, -18.0F, 26.0F, 4.0F, 36.0F, 0.0F, false);
        cube_r24.setTextureOffset(94, 40).addBox(-10.5F, 7.5F, -13.0F, 20.0F, 6.0F, 26.0F, 0.0F, false);
        cube_r24.setTextureOffset(140, 140).addBox(-7.5F, 6.5F, -9.0F, 14.0F, 8.0F, 17.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-20.1009F, -60.9642F, 1.0F);
        body.addChild(rightUpperArm);
        rightUpperArm.setTextureOffset(0, 93).addBox(-4.8991F, 0.9642F, -6.0F, 9.0F, 15.0F, 12.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(-7.8991F, 7.4642F, 0.0F);
        rightUpperArm.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, -0.6981F);
        cube_r25.setTextureOffset(0, 209).addBox(0.0F, -6.5F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-1.743F, 16.1353F, 0.0F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(94, 0).addBox(-3.156F, -0.1711F, -5.0F, 8.0F, 15.0F, 10.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(-6.156F, -8.6711F, 0.0F);
        rightLowerArm.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, -0.6981F);
        cube_r26.setTextureOffset(202, 216).addBox(-7.0F, 1.5F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        trident = new ModelRenderer(this);
        trident.setRotationPoint(21.844F, 44.8289F, -1.0F);
        rightLowerArm.addChild(trident);
        trident.setTextureOffset(0, 0).addBox(-22.0F, -34.0F, -67.0F, 2.0F, 3.0F, 90.0F, 0.0F, false);
        trident.setTextureOffset(56, 33).addBox(-22.0F, -34.0F, -83.0F, 2.0F, 3.0F, 14.0F, 0.0F, false);
        trident.setTextureOffset(195, 100).addBox(-31.0F, -34.0F, -69.0F, 20.0F, 3.0F, 2.0F, 0.0F, false);
        trident.setTextureOffset(204, 199).addBox(-13.0F, -34.0F, -83.0F, 2.0F, 3.0F, 14.0F, 0.0F, false);
        trident.setTextureOffset(80, 67).addBox(-13.0F, -34.0F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        trident.setTextureOffset(82, 9).addBox(-31.0F, -34.0F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        trident.setTextureOffset(56, 0).addBox(-31.0F, -34.0F, -83.0F, 2.0F, 3.0F, 14.0F, 0.0F, false);
        trident.setTextureOffset(74, 9).addBox(-22.0F, -34.0F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -74.0F, -0.5F);
        body.addChild(neck);
        neck.setTextureOffset(113, 119).addBox(-7.0F, -3.0F, -6.5F, 14.0F, 4.0F, 13.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(-0.0551F, -2.5377F, 0.8417F);
        neck.addChild(head);
        head.setTextureOffset(50, 205).addBox(-4.9449F, -8.4623F, -17.3417F, 10.0F, 6.0F, 7.0F, 0.0F, false);
        head.setTextureOffset(0, 140).addBox(-7.9449F, -13.4623F, -10.3417F, 16.0F, 13.0F, 17.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(0.0551F, 1.2002F, -0.4037F);
        head.addChild(cube_r27);
        setRotationAngle(cube_r27, -0.582F, -0.1975F, -0.2898F);
        cube_r27.setTextureOffset(140, 140).addBox(-0.7161F, -26.5704F, -3.9918F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(0.0551F, 1.2002F, -0.4037F);
        head.addChild(cube_r28);
        setRotationAngle(cube_r28, -0.5196F, -0.0749F, -0.1074F);
        cube_r28.setTextureOffset(184, 213).addBox(-1.307F, -28.966F, -4.1442F, 4.0F, 15.0F, 5.0F, 0.0F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.0551F, 1.2002F, -0.4037F);
        head.addChild(cube_r29);
        setRotationAngle(cube_r29, -0.6068F, 0.0749F, 0.1074F);
        cube_r29.setTextureOffset(166, 212).addBox(-2.693F, -28.3488F, -5.9918F, 4.0F, 15.0F, 5.0F, 0.0F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(0.0551F, 1.2002F, -0.4037F);
        head.addChild(cube_r30);
        setRotationAngle(cube_r30, -0.582F, 0.1975F, 0.2898F);
        cube_r30.setTextureOffset(49, 140).addBox(-3.2839F, -26.5704F, -3.9918F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.0551F, 1.2002F, -0.4037F);
        head.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.4766F, -0.3979F, -0.6439F);
        cube_r31.setTextureOffset(74, 50).addBox(-2.9768F, -20.3104F, -3.9918F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(0.0551F, 1.2002F, -0.4037F);
        head.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.5208F, -0.3352F, -0.5208F);
        cube_r32.setTextureOffset(0, 140).addBox(-0.2054F, -23.6917F, -3.9918F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(0.0551F, 1.2002F, -0.4037F);
        head.addChild(cube_r33);
        setRotationAngle(cube_r33, -0.4766F, 0.3979F, 0.6439F);
        cube_r33.setTextureOffset(74, 17).addBox(-1.0232F, -20.3104F, -3.9918F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.0551F, 1.2002F, -0.4037F);
        head.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.5208F, 0.3352F, 0.5208F);
        cube_r34.setTextureOffset(0, 33).addBox(-3.7946F, -23.6917F, -3.9918F, 4.0F, 13.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX =  MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX = -Math.abs(MathHelper.cos(limbSwing * 0.40F) * 1.4F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 1.4F * limbSwingAmount;
        this.rightLowerArm.rotateAngleX = -Math.abs(MathHelper.sin(limbSwing * 0.3F) * 0.7F * limbSwingAmount);
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