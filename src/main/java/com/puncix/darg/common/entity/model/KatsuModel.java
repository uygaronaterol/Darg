package com.puncix.darg.common.entity.model;

// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.puncix.darg.common.entity.entities.KatsuEntity;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import com.puncix.darg.common.entity.entities.MoglingEntity;
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

public class KatsuModel <T extends KatsuEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer cube_r12;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer rightFoot;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer cube_r15;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer cube_r16;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer cube_r17;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer cube_r18;
    private final ModelRenderer rightHand;

    public KatsuModel() {
        textureWidth = 16;
        textureHeight = 16;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(105, 76).addBox(-10.0F, -41.0F, -2.0F, 20.0F, 9.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(70, 18).addBox(-11.0F, -49.0F, -3.0F, 22.0F, 8.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(41, 35).addBox(-12.0F, -56.0F, -4.0F, 24.0F, 7.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(41, 0).addBox(-15.0F, -63.0F, -5.0F, 30.0F, 7.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(0, 70).addBox(7.0F, -66.0F, -6.0F, 14.0F, 12.0F, 13.0F, 0.0F, false);
        body.setTextureOffset(57, 57).addBox(-21.0F, -66.0F, -6.0F, 14.0F, 12.0F, 13.0F, 0.0F, false);
        body.setTextureOffset(122, 153).addBox(-8.0F, -40.0F, 4.0F, 16.0F, 7.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(41, 18).addBox(-8.0F, -41.0F, -3.0F, 16.0F, 5.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(151, 96).addBox(-9.0F, -49.0F, -4.0F, 18.0F, 8.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(151, 73).addBox(-9.0F, -56.0F, -5.0F, 18.0F, 8.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(159, 15).addBox(-7.0F, -63.0F, -6.0F, 14.0F, 8.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(174, 49).addBox(-7.0F, -36.0F, -3.0F, 14.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(15.0F, -66.0F, 0.0F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.48F);
        cube_r1.setTextureOffset(0, 0).addBox(5.0F, -5.0F, -2.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        cube_r1.setTextureOffset(47, 0).addBox(16.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(41, 8).addBox(15.0F, -7.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(45, 24).addBox(14.0F, -8.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(25, 0).addBox(13.0F, -9.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(8, 45).addBox(-4.0F, -7.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(56, 27).addBox(-5.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(48, 7).addBox(-3.0F, -8.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(25, 5).addBox(-2.0F, -9.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(41, 51).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
        cube_r1.setTextureOffset(165, 7).addBox(0.0F, -9.0F, -2.0F, 12.0F, 4.0F, 3.0F, 0.0F, false);
        cube_r1.setTextureOffset(18, 121).addBox(1.0F, -8.0F, -3.0F, 10.0F, 3.0F, 5.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-6.0F, -52.0F, 19.5F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.1309F, -0.3054F, 0.0F);
        cube_r2.setTextureOffset(0, 0).addBox(-7.0F, -3.0F, -18.5F, 6.0F, 6.0F, 29.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-21.8259F, -83.0387F, 13.788F);
        body.addChild(cube_r3);
        setRotationAngle(cube_r3, 1.5047F, -0.1887F, -0.4035F);
        cube_r3.setTextureOffset(15, 35).addBox(-2.0F, -17.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
        cube_r3.setTextureOffset(7, 0).addBox(-1.0F, -18.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r3.setTextureOffset(34, 129).addBox(-3.0F, -16.0F, -2.5F, 6.0F, 32.0F, 5.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(21.8259F, -83.0387F, 13.788F);
        body.addChild(cube_r4);
        setRotationAngle(cube_r4, 1.5047F, 0.1887F, 0.4035F);
        cube_r4.setTextureOffset(23, 27).addBox(-1.0F, -18.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r4.setTextureOffset(15, 39).addBox(-2.0F, -17.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
        cube_r4.setTextureOffset(78, 131).addBox(-3.0F, -16.0F, -2.5F, 6.0F, 32.0F, 5.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-13.1803F, -66.5856F, 28.9711F);
        body.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.2387F, -0.2323F, -0.4005F);
        cube_r5.setTextureOffset(56, 129).addBox(-8.0F, -16.0F, -2.5F, 6.0F, 32.0F, 5.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(13.1803F, -66.5856F, 28.9711F);
        body.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.2387F, 0.2323F, 0.4005F);
        cube_r6.setTextureOffset(100, 141).addBox(2.0F, -16.0F, -2.5F, 6.0F, 32.0F, 5.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(6.0F, -52.0F, 19.5F);
        body.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.1309F, 0.3054F, 0.0F);
        cube_r7.setTextureOffset(0, 35).addBox(1.0F, -3.0F, -18.5F, 6.0F, 6.0F, 29.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-15.0F, -66.0F, 0.0F);
        body.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, -0.48F);
        cube_r8.setTextureOffset(8, 35).addBox(1.0F, -9.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(49, 24).addBox(2.0F, -8.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(57, 24).addBox(3.0F, -7.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(59, 57).addBox(-17.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(41, 57).addBox(-16.0F, -7.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(53, 24).addBox(-15.0F, -8.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(8, 40).addBox(-14.0F, -9.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(15, 0).addBox(-7.0F, -5.0F, -2.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        cube_r8.setTextureOffset(0, 163).addBox(-11.0F, -8.0F, -3.0F, 10.0F, 3.0F, 5.0F, 0.0F, false);
        cube_r8.setTextureOffset(165, 105).addBox(-12.0F, -9.0F, -2.0F, 12.0F, 4.0F, 3.0F, 0.0F, false);
        cube_r8.setTextureOffset(174, 43).addBox(-13.0F, -10.0F, -1.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
        cube_r8.setTextureOffset(59, 59).addBox(4.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -63.0F, -0.5F);
        body.addChild(neck);
        neck.setTextureOffset(123, 0).addBox(-6.0F, -6.0F, -4.5F, 12.0F, 6.0F, 9.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -5.2353F, 0.1471F);
        neck.addChild(head);
        head.setTextureOffset(54, 82).addBox(-7.0F, -12.7647F, -5.6471F, 14.0F, 12.0F, 11.0F, 0.0F, false);
        head.setTextureOffset(91, 92).addBox(-8.0F, -13.7647F, -6.6471F, 16.0F, 1.0F, 13.0F, 0.0F, false);
        head.setTextureOffset(0, 35).addBox(7.0F, -12.7647F, -6.6471F, 1.0F, 13.0F, 13.0F, 0.0F, false);
        head.setTextureOffset(135, 92).addBox(8.0F, -11.7647F, -6.6471F, 1.0F, 12.0F, 14.0F, 0.0F, false);
        head.setTextureOffset(0, 117).addBox(9.0F, -9.7647F, -7.6471F, 1.0F, 10.0F, 16.0F, 0.0F, false);
        head.setTextureOffset(110, 15).addBox(10.0F, -6.7647F, -8.6471F, 1.0F, 7.0F, 18.0F, 0.0F, false);
        head.setTextureOffset(48, 105).addBox(11.0F, -3.7647F, -9.6471F, 1.0F, 4.0F, 20.0F, 0.0F, false);
        head.setTextureOffset(26, 97).addBox(-12.0F, -3.7647F, -9.6471F, 1.0F, 4.0F, 20.0F, 0.0F, false);
        head.setTextureOffset(90, 106).addBox(-11.0F, -6.7647F, -8.6471F, 1.0F, 7.0F, 18.0F, 0.0F, false);
        head.setTextureOffset(112, 115).addBox(-10.0F, -9.7647F, -7.6471F, 1.0F, 10.0F, 16.0F, 0.0F, false);
        head.setTextureOffset(132, 127).addBox(-9.0F, -11.7647F, -6.6471F, 1.0F, 12.0F, 14.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(-8.0F, -12.7647F, -6.6471F, 1.0F, 13.0F, 13.0F, 0.0F, false);
        head.setTextureOffset(149, 64).addBox(-9.0F, -6.7647F, -7.6471F, 18.0F, 7.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(111, 62).addBox(-7.0F, -14.7647F, -5.6471F, 14.0F, 1.0F, 10.0F, 0.0F, false);
        head.setTextureOffset(130, 118).addBox(-6.0F, -15.7647F, -4.6471F, 12.0F, 1.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(156, 0).addBox(-5.0F, -16.7647F, -3.6471F, 10.0F, 1.0F, 6.0F, 0.0F, false);
        head.setTextureOffset(148, 127).addBox(-8.0F, -12.7647F, 6.3529F, 16.0F, 13.0F, 1.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(5.0F, -32.0F, 2.0F);
        body.addChild(leftUpperLeg);
        leftUpperLeg.setTextureOffset(151, 156).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 15.0F, 5.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(4.0F, 3.0F, -1.0F);
        leftUpperLeg.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.6981F);
        cube_r9.setTextureOffset(0, 35).addBox(-7.0F, 3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
        cube_r9.setTextureOffset(41, 0).addBox(-4.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
        cube_r9.setTextureOffset(41, 35).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(0.6901F, 15.2382F, -2.375F);
        leftUpperLeg.addChild(leftLowerLeg);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-0.6285F, 1.7618F, -2.0634F);
        leftLowerLeg.addChild(cube_r10);
        setRotationAngle(cube_r10, -1.5708F, 0.6981F, -1.5708F);
        cube_r10.setTextureOffset(41, 24).addBox(-3.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r10.setTextureOffset(0, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r10.setTextureOffset(4, 43).addBox(-6.5F, 2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.6215F, -0.4206F, 0.125F);
        leftLowerLeg.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 1.5708F, 0.0F);
        cube_r11.setTextureOffset(25, 166).addBox(-2.3116F, 0.1823F, -3.75F, 4.0F, 15.0F, 5.0F, 0.0F, false);

        leftFoot = new ModelRenderer(this);
        leftFoot.setRotationPoint(-0.1901F, 15.0951F, 0.375F);
        leftLowerLeg.addChild(leftFoot);
        setRotationAngle(leftFoot, 0.0F, 1.5708F, 0.0F);
        leftFoot.setTextureOffset(244, 4).addBox(-0.5F, 0.6667F, -4.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        leftFoot.setTextureOffset(0, 11).addBox(-0.5F, 0.6667F, 2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        leftFoot.setTextureOffset(232, 139).addBox(-1.5F, -0.3333F, -3.0F, 7.0F, 2.0F, 5.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(-5.0F, -32.0F, 2.0F);
        body.addChild(rightUpperLeg);
        rightUpperLeg.setTextureOffset(122, 161).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 15.0F, 5.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-4.0F, 3.0F, -1.0F);
        rightUpperLeg.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.6981F);
        cube_r12.setTextureOffset(0, 70).addBox(5.0F, 3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
        cube_r12.setTextureOffset(41, 70).addBox(2.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
        cube_r12.setTextureOffset(49, 70).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(-0.6901F, 15.2382F, -2.375F);
        rightUpperLeg.addChild(rightLowerLeg);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(0.6285F, 1.7618F, -2.0634F);
        rightLowerLeg.addChild(cube_r13);
        setRotationAngle(cube_r13, -1.5708F, -0.6981F, 1.5708F);
        cube_r13.setTextureOffset(19, 43).addBox(2.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r13.setTextureOffset(23, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r13.setTextureOffset(15, 43).addBox(5.5F, 2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-0.6215F, -0.4206F, 0.125F);
        rightLowerLeg.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, -1.5708F, 0.0F);
        cube_r14.setTextureOffset(43, 166).addBox(-1.6884F, 0.1823F, -3.75F, 4.0F, 15.0F, 5.0F, 0.0F, false);

        rightFoot = new ModelRenderer(this);
        rightFoot.setRotationPoint(0.1901F, 15.0951F, 0.375F);
        rightLowerLeg.addChild(rightFoot);
        setRotationAngle(rightFoot, 0.0F, -1.5708F, 0.0F);
        rightFoot.setTextureOffset(12, 26).addBox(-4.5F, 0.6667F, -4.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        rightFoot.setTextureOffset(0, 26).addBox(-4.5F, 0.6667F, 2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        rightFoot.setTextureOffset(232, 155).addBox(-5.5F, -0.3333F, -3.0F, 7.0F, 2.0F, 5.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(18.0F, -58.75F, 0.5F);
        body.addChild(leftUpperArm);
        leftUpperArm.setTextureOffset(98, 40).addBox(-4.0F, -4.25F, -5.5F, 12.0F, 11.0F, 11.0F, 0.0F, false);
        leftUpperArm.setTextureOffset(130, 15).addBox(-3.0F, 6.75F, -4.5F, 10.0F, 8.0F, 9.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(10.0F, -0.75F, 0.0F);
        leftUpperArm.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, 0.5672F);
        cube_r15.setTextureOffset(174, 35).addBox(1.0F, 9.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.0F, false);
        cube_r15.setTextureOffset(151, 85).addBox(-4.0F, -1.5F, -3.5F, 12.0F, 5.0F, 6.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(2.0F, 15.25F, 0.0F);
        leftUpperArm.addChild(leftLowerArm);
        leftLowerArm.setTextureOffset(144, 33).addBox(-4.0F, -0.5F, -3.5F, 8.0F, 13.0F, 7.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(8.0F, -16.0F, 0.0F);
        leftLowerArm.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.5672F);
        cube_r16.setTextureOffset(173, 155).addBox(7.0F, 21.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.0F, false);
        cube_r16.setTextureOffset(173, 163).addBox(3.0F, 16.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.0F, false);

        leftHand = new ModelRenderer(this);
        leftHand.setRotationPoint(0.0F, 12.5F, 0.5F);
        leftLowerArm.addChild(leftHand);
        leftHand.setTextureOffset(162, 141).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-16.0F, -58.75F, 0.5F);
        body.addChild(rightUpperArm);
        rightUpperArm.setTextureOffset(0, 95).addBox(-10.0F, -4.25F, -5.5F, 12.0F, 11.0F, 11.0F, 0.0F, false);
        rightUpperArm.setTextureOffset(70, 106).addBox(-9.0F, 6.75F, -4.5F, 10.0F, 8.0F, 9.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(-12.0F, -0.75F, 0.0F);
        rightUpperArm.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, -0.5672F);
        cube_r17.setTextureOffset(167, 27).addBox(-10.0F, 9.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.0F, false);
        cube_r17.setTextureOffset(149, 53).addBox(-8.0F, -1.5F, -3.5F, 12.0F, 5.0F, 6.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-5.0F, 15.25F, 0.0F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(0, 143).addBox(-3.0F, -0.5F, -3.5F, 8.0F, 13.0F, 7.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(-7.0F, -16.0F, 0.0F);
        rightLowerArm.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, -0.5672F);
        cube_r18.setTextureOffset(61, 168).addBox(-16.0F, 21.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.0F, false);
        cube_r18.setTextureOffset(168, 171).addBox(-12.0F, 16.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.0F, false);

        rightHand = new ModelRenderer(this);
        rightHand.setRotationPoint(0.0F, 12.5F, 0.5F);
        rightLowerArm.addChild(rightHand);
        rightHand.setTextureOffset(162, 112).addBox(-2.0F, 0.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
        rightHand.setTextureOffset(0, 249).addBox(-1.0F, 2.0F, -7.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
        rightHand.setTextureOffset(250, 203).addBox(0.0F, 3.0F, -55.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        rightHand.setTextureOffset(242, 224).addBox(0.0F, 3.0F, -54.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        rightHand.setTextureOffset(160, 207).addBox(0.0F, 3.0F, -5.0F, 2.0F, 3.0F, 10.0F, 0.0F, false);
        rightHand.setTextureOffset(160, 207).addBox(0.0F, 3.0F, -53.0F, 2.0F, 3.0F, 46.0F, 0.0F, false);
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