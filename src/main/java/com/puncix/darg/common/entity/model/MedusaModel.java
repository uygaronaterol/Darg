package com.puncix.darg.common.entity.model;

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.puncix.darg.common.entity.entities.MedusaEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class MedusaModel<T extends MedusaEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftHand;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftHandPinky;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftHandPoint;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftHandMiddle;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftHandLeft2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftHandThumb;
    private final ModelRenderer cube_r12;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer cube_r13;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer cube_r14;
    private final ModelRenderer rightHand;
    private final ModelRenderer cube_r15;
    private final ModelRenderer rightHandPinky;
    private final ModelRenderer cube_r16;
    private final ModelRenderer rightHandPoint;
    private final ModelRenderer cube_r17;
    private final ModelRenderer rightHandMiddle;
    private final ModelRenderer cube_r18;
    private final ModelRenderer rightHandLeft3;
    private final ModelRenderer cube_r19;
    private final ModelRenderer rightHandThumb;
    private final ModelRenderer cube_r20;
    private final ModelRenderer tail;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r21;
    private final ModelRenderer head;
    private final ModelRenderer cube_r22;
    private final ModelRenderer hair;
    private final ModelRenderer cube_r23;
    private final ModelRenderer hair2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer hair3;
    private final ModelRenderer cube_r25;
    private final ModelRenderer hair4;
    private final ModelRenderer cube_r26;
    private final ModelRenderer hair5;
    private final ModelRenderer cube_r27;

    public MedusaModel() {
        textureWidth = 256;
        textureHeight = 256;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -34.9302F, -24.9277F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, -1.3963F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 17).addBox(-10.0F, 7.5F, -13.0F, 8.0F, 1.0F, 5.0F, 0.0F, false);
        cube_r1.setTextureOffset(53, 39).addBox(2.0F, 7.5F, -13.0F, 8.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -34.9302F, -23.9277F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, -1.3963F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(88, 49).addBox(-11.0F, 6.5F, -14.0F, 10.0F, 2.0F, 7.0F, 0.0F, false);
        cube_r2.setTextureOffset(118, 0).addBox(1.0F, 6.5F, -14.0F, 10.0F, 2.0F, 7.0F, 0.0F, false);
        cube_r2.setTextureOffset(67, 131).addBox(0.0F, 5.5F, -11.0F, 11.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r2.setTextureOffset(110, 141).addBox(-11.0F, 5.5F, -11.0F, 11.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r2.setTextureOffset(53, 47).addBox(-7.0F, 5.5F, -7.0F, 14.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r2.setTextureOffset(128, 35).addBox(-6.0F, 5.5F, 1.0F, 12.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r2.setTextureOffset(0, 0).addBox(-11.0F, -7.5F, -18.0F, 22.0F, 13.0F, 26.0F, 0.0F, false);
        cube_r2.setTextureOffset(68, 88).addBox(-12.0F, -8.5F, -19.0F, 24.0F, 15.0F, 8.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -16.05F, -20.2484F);
        body.addChild(cube_r3);
        setRotationAngle(cube_r3, -1.2217F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(54, 59).addBox(-10.0F, -9.5F, -12.0F, 20.0F, 13.0F, 16.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -4.0F, -16.0F);
        body.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.6981F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(0, 75).addBox(-9.0F, -13.0F, -8.0F, 18.0F, 13.0F, 16.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(12.1667F, -51.0096F, -20.5351F);
        body.addChild(leftUpperArm);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-12.1667F, 16.0795F, -3.3926F);
        leftUpperArm.addChild(cube_r5);
        setRotationAngle(cube_r5, -1.3963F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(128, 11).addBox(12.0F, -6.5F, -6.0F, 7.0F, 11.0F, 13.0F, 0.0F, false);
        cube_r5.setTextureOffset(0, 126).addBox(12.0F, -8.5F, -19.0F, 8.0F, 15.0F, 13.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(2.8333F, 22.0096F, -2.4649F);
        leftUpperArm.addChild(leftLowerArm);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 1.1911F, 2.4014F);
        leftLowerArm.addChild(cube_r6);
        setRotationAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(131, 98).addBox(-3.0F, -2.4581F, -0.5912F, 6.0F, 7.0F, 13.0F, 0.0F, false);

        leftHand = new ModelRenderer(this);
        leftHand.setRotationPoint(0.0F, 13.2913F, 3.6254F);
        leftLowerArm.addChild(leftHand);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-15.0F, -19.2214F, -4.5531F);
        leftHand.addChild(cube_r7);
        setRotationAngle(cube_r7, -1.3963F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(135, 130).addBox(14.0F, -4.5F, 20.0F, 3.0F, 8.0F, 9.0F, 0.0F, false);

        leftHandPinky = new ModelRenderer(this);
        leftHandPinky.setRotationPoint(0.0F, 8.613F, 4.7692F);
        leftHand.addChild(leftHandPinky);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-15.0F, -27.8344F, -9.3223F);
        leftHandPinky.addChild(cube_r8);
        setRotationAngle(cube_r8, -1.3963F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(0, 85).addBox(14.0F, -4.5F, 29.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

        leftHandPoint = new ModelRenderer(this);
        leftHandPoint.setRotationPoint(0.0F, 10.3209F, -2.0376F);
        leftHand.addChild(leftHandPoint);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-15.0F, -29.5424F, -2.5155F);
        leftHandPoint.addChild(cube_r9);
        setRotationAngle(cube_r9, -1.3963F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(0, 154).addBox(14.0F, 2.5F, 29.0F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        leftHandMiddle = new ModelRenderer(this);
        leftHandMiddle.setRotationPoint(0.0F, 9.3792F, 0.5113F);
        leftHand.addChild(leftHandMiddle);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-15.0F, -28.6007F, -5.0644F);
        leftHandMiddle.addChild(cube_r10);
        setRotationAngle(cube_r10, -1.3963F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(152, 130).addBox(14.0F, 0.0F, 29.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);

        leftHandLeft2 = new ModelRenderer(this);
        leftHandLeft2.setRotationPoint(0.0F, 9.4527F, 2.8864F);
        leftHand.addChild(leftHandLeft2);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftHandLeft2.addChild(cube_r11);
        setRotationAngle(cube_r11, -1.3963F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(153, 74).addBox(-1.0F, -0.1527F, -0.5304F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        leftHandThumb = new ModelRenderer(this);
        leftHandThumb.setRotationPoint(0.0F, 2.4146F, -3.3229F);
        leftHand.addChild(leftHandThumb);


        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-15.0F, -21.636F, -1.2302F);
        leftHandThumb.addChild(cube_r12);
        setRotationAngle(cube_r12, -1.3963F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(0, 110).addBox(14.0F, 3.5F, 20.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-12.1667F, -51.0096F, -20.5351F);
        body.addChild(rightUpperArm);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(12.1667F, 16.0795F, -3.3926F);
        rightUpperArm.addChild(cube_r13);
        setRotationAngle(cube_r13, -1.3963F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(126, 68).addBox(-19.0F, -6.5F, -6.0F, 7.0F, 11.0F, 13.0F, 0.0F, false);
        cube_r13.setTextureOffset(102, 111).addBox(-20.0F, -8.5F, -19.0F, 8.0F, 15.0F, 13.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-2.8333F, 22.0096F, -2.4649F);
        rightUpperArm.addChild(rightLowerArm);


        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, 1.1911F, 2.4014F);
        rightLowerArm.addChild(cube_r14);
        setRotationAngle(cube_r14, -1.3963F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(42, 131).addBox(-3.0F, -2.4581F, -0.5912F, 6.0F, 7.0F, 13.0F, 0.0F, false);

        rightHand = new ModelRenderer(this);
        rightHand.setRotationPoint(0.0F, 13.2913F, 3.6254F);
        rightLowerArm.addChild(rightHand);


        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(15.0F, -19.2214F, -4.5531F);
        rightHand.addChild(cube_r15);
        setRotationAngle(cube_r15, -1.3963F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(0, 0).addBox(-17.0F, -4.5F, 20.0F, 3.0F, 8.0F, 9.0F, 0.0F, false);

        rightHandPinky = new ModelRenderer(this);
        rightHandPinky.setRotationPoint(0.0F, 8.613F, 4.7692F);
        rightHand.addChild(rightHandPinky);


        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(15.0F, -27.8344F, -9.3223F);
        rightHandPinky.addChild(cube_r16);
        setRotationAngle(cube_r16, -1.3963F, 0.0F, 0.0F);
        cube_r16.setTextureOffset(0, 80).addBox(-17.0F, -4.5F, 29.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

        rightHandPoint = new ModelRenderer(this);
        rightHandPoint.setRotationPoint(0.0F, 10.3209F, -2.0376F);
        rightHand.addChild(rightHandPoint);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(15.0F, -29.5424F, -2.5155F);
        rightHandPoint.addChild(cube_r17);
        setRotationAngle(cube_r17, -1.3963F, 0.0F, 0.0F);
        cube_r17.setTextureOffset(153, 68).addBox(-17.0F, 2.5F, 29.0F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        rightHandMiddle = new ModelRenderer(this);
        rightHandMiddle.setRotationPoint(0.0F, 9.3792F, 0.5113F);
        rightHand.addChild(rightHandMiddle);


        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(15.0F, -28.6007F, -5.0644F);
        rightHandMiddle.addChild(cube_r18);
        setRotationAngle(cube_r18, -1.3963F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(48, 104).addBox(-17.0F, 0.0F, 29.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);

        rightHandLeft3 = new ModelRenderer(this);
        rightHandLeft3.setRotationPoint(0.0F, 9.4527F, 2.8864F);
        rightHand.addChild(rightHandLeft3);


        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightHandLeft3.addChild(cube_r19);
        setRotationAngle(cube_r19, -1.3963F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(122, 148).addBox(-2.0F, -0.1527F, -0.5304F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        rightHandThumb = new ModelRenderer(this);
        rightHandThumb.setRotationPoint(0.0F, 2.4146F, -3.3229F);
        rightHand.addChild(rightHandThumb);


        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(15.0F, -21.636F, -1.2302F);
        rightHandThumb.addChild(cube_r20);
        setRotationAngle(cube_r20, -1.3963F, 0.0F, 0.0F);
        cube_r20.setTextureOffset(0, 104).addBox(-17.0F, 3.5F, 20.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(tail);
        tail.setTextureOffset(70, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F, 0.0F, false);

        tail1 = new ModelRenderer(this);
        tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail.addChild(tail1);
        tail1.setTextureOffset(80, 24).addBox(-8.0F, -7.0F, 8.0F, 16.0F, 7.0F, 16.0F, 0.0F, false);

        tail2 = new ModelRenderer(this);
        tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail1.addChild(tail2);
        tail2.setTextureOffset(0, 104).addBox(-8.0F, -6.0F, 24.0F, 16.0F, 6.0F, 16.0F, 0.0F, false);

        tail3 = new ModelRenderer(this);
        tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail2.addChild(tail3);
        tail3.setTextureOffset(110, 47).addBox(-7.0F, -5.0F, 40.0F, 14.0F, 5.0F, 16.0F, 0.0F, false);

        tail4 = new ModelRenderer(this);
        tail4.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail3.addChild(tail4);
        tail4.setTextureOffset(48, 111).addBox(-6.0F, -4.0F, 56.0F, 12.0F, 4.0F, 16.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -54.2924F, -26.5027F);
        body.addChild(neck);


        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(0.0F, 19.3622F, 2.575F);
        neck.addChild(cube_r21);
        setRotationAngle(cube_r21, -1.3963F, 0.0F, 0.0F);
        cube_r21.setTextureOffset(80, 139).addBox(-6.0F, -8.5F, -22.0F, 12.0F, 15.0F, 3.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -1.8481F, -1.7365F);
        neck.addChild(head);


        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(0.0F, 21.2103F, 4.3115F);
        head.addChild(cube_r22);
        setRotationAngle(cube_r22, -1.3963F, 0.0F, 0.0F);
        cube_r22.setTextureOffset(0, 39).addBox(-9.0F, -10.5F, -39.0F, 18.0F, 19.0F, 17.0F, 0.0F, false);

        hair = new ModelRenderer(this);
        hair.setRotationPoint(9.25F, -15.9227F, -5.5788F);
        head.addChild(hair);


        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-9.25F, 37.133F, 9.8903F);
        hair.addChild(cube_r23);
        setRotationAngle(cube_r23, -1.3963F, 0.0F, 0.0F);
        cube_r23.setTextureOffset(17, 3).addBox(16.0F, 20.5F, -46.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(48, 117).addBox(14.0F, 20.5F, -47.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(155, 14).addBox(12.0F, 20.5F, -48.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(151, 8).addBox(11.0F, 20.5F, -49.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(17, 6).addBox(16.0F, 20.5F, -54.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(99, 117).addBox(14.0F, 20.5F, -53.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(152, 92).addBox(11.0F, 20.5F, -51.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(155, 17).addBox(12.0F, 20.5F, -52.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(131, 121).addBox(10.0F, 20.5F, -50.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r23.setTextureOffset(153, 147).addBox(16.0F, 2.5F, -51.0F, 2.0F, 18.0F, 4.0F, 0.0F, false);
        cube_r23.setTextureOffset(131, 147).addBox(16.0F, 2.5F, -47.0F, 2.0F, 4.0F, 9.0F, 0.0F, false);
        cube_r23.setTextureOffset(0, 75).addBox(9.0F, 2.5F, -39.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        hair2 = new ModelRenderer(this);
        hair2.setRotationPoint(8.9167F, -7.8527F, -5.5689F);
        head.addChild(hair2);


        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-8.9167F, 29.063F, 9.8804F);
        hair2.addChild(cube_r24);
        setRotationAngle(cube_r24, -1.3963F, 0.0F, 0.0F);
        cube_r24.setTextureOffset(0, 17).addBox(26.0F, 20.5F, -27.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(99, 114).addBox(24.0F, 20.5F, -28.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(154, 58).addBox(22.0F, 20.5F, -29.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(144, 127).addBox(21.0F, 20.5F, -30.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(17, 0).addBox(26.0F, 20.5F, -35.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(0, 116).addBox(24.0F, 20.5F, -34.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(145, 0).addBox(21.0F, 20.5F, -32.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(155, 11).addBox(22.0F, 20.5F, -33.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(131, 118).addBox(20.0F, 20.5F, -31.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(62, 151).addBox(26.0F, 2.5F, -32.0F, 2.0F, 18.0F, 4.0F, 0.0F, false);
        cube_r24.setTextureOffset(152, 3).addBox(16.0F, 2.5F, -32.0F, 10.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r24.setTextureOffset(70, 10).addBox(9.0F, 2.5F, -32.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        hair3 = new ModelRenderer(this);
        hair3.setRotationPoint(-8.9167F, -7.8527F, -4.5689F);
        head.addChild(hair3);


        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(8.9167F, 29.063F, 8.8804F);
        hair3.addChild(cube_r25);
        setRotationAngle(cube_r25, -1.3963F, 0.0F, 0.0F);
        cube_r25.setTextureOffset(0, 6).addBox(-27.0F, 20.5F, -27.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(99, 111).addBox(-29.0F, 20.5F, -28.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(154, 52).addBox(-31.0F, 20.5F, -29.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(144, 43).addBox(-32.0F, 20.5F, -30.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(4, 6).addBox(-27.0F, 20.5F, -35.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(48, 114).addBox(-29.0F, 20.5F, -34.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(144, 124).addBox(-32.0F, 20.5F, -32.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(154, 55).addBox(-31.0F, 20.5F, -33.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(124, 92).addBox(-33.0F, 20.5F, -31.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(50, 151).addBox(-28.0F, 2.5F, -32.0F, 2.0F, 18.0F, 4.0F, 0.0F, false);
        cube_r25.setTextureOffset(118, 9).addBox(-26.0F, 2.5F, -32.0F, 10.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r25.setTextureOffset(70, 5).addBox(-16.0F, 2.5F, -32.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        hair4 = new ModelRenderer(this);
        hair4.setRotationPoint(-9.25F, -14.9227F, -4.5788F);
        head.addChild(hair4);


        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(9.25F, 36.133F, 8.8903F);
        hair4.addChild(cube_r26);
        setRotationAngle(cube_r26, -1.3963F, 0.0F, 0.0F);
        cube_r26.setTextureOffset(4, 0).addBox(-17.0F, 20.5F, -46.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(110, 58).addBox(-19.0F, 20.5F, -47.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(154, 46).addBox(-21.0F, 20.5F, -48.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(132, 95).addBox(-22.0F, 20.5F, -49.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(4, 3).addBox(-17.0F, 20.5F, -54.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(48, 111).addBox(-19.0F, 20.5F, -53.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(144, 40).addBox(-22.0F, 20.5F, -51.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(154, 49).addBox(-21.0F, 20.5F, -52.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(110, 71).addBox(-23.0F, 20.5F, -50.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r26.setTextureOffset(38, 151).addBox(-18.0F, 2.5F, -51.0F, 2.0F, 18.0F, 4.0F, 0.0F, false);
        cube_r26.setTextureOffset(29, 126).addBox(-18.0F, 2.5F, -47.0F, 2.0F, 4.0F, 9.0F, 0.0F, false);
        cube_r26.setTextureOffset(70, 0).addBox(-16.0F, 2.5F, -39.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        hair5 = new ModelRenderer(this);
        hair5.setRotationPoint(7.3462F, -16.0251F, -1.3599F);
        head.addChild(hair5);


        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(-7.3462F, 37.2354F, 5.6714F);
        hair5.addChild(cube_r27);
        setRotationAngle(cube_r27, -1.3963F, 0.0F, 0.0F);
        cube_r27.setTextureOffset(0, 39).addBox(6.0F, -2.5F, -44.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);
        cube_r27.setTextureOffset(0, 0).addBox(-2.0F, 15.5F, -51.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(0, 53).addBox(-4.0F, 15.5F, -52.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(13, 154).addBox(-6.0F, 15.5F, -53.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(0, 23).addBox(-7.0F, 15.5F, -54.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(0, 3).addBox(-2.0F, 15.5F, -59.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(70, 56).addBox(-4.0F, 15.5F, -58.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(52, 88).addBox(-7.0F, 15.5F, -56.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(154, 35).addBox(-6.0F, 15.5F, -57.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(110, 68).addBox(-8.0F, 15.5F, -55.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r27.setTextureOffset(110, 148).addBox(-3.0F, -2.5F, -56.0F, 2.0F, 18.0F, 4.0F, 0.0F, false);
        cube_r27.setTextureOffset(86, 111).addBox(-3.0F, -2.5F, -52.0F, 2.0F, 4.0F, 9.0F, 0.0F, false);
        cube_r27.setTextureOffset(0, 48).addBox(-1.0F, -2.5F, -44.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX =  MathHelper.sin(limbSwing * 0.4F) * 1.4F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX =  -Math.abs(MathHelper.cos(limbSwing * 0.3F) * 1.4F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX =  MathHelper.cos(limbSwing * 0.4F) * 1.4F * limbSwingAmount;
        this.rightHand.rotateAngleX = -Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.4F * limbSwingAmount);
        this.leftHand.rotateAngleX = -Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.4F * limbSwingAmount);

        this.rightLowerArm.rotateAngleY = -Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.4F * limbSwingAmount);
        this.leftHandThumb.rotateAngleY =  -Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.leftHandLeft2.rotateAngleY =  -Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.leftHandPoint.rotateAngleY =  -Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.leftHandMiddle.rotateAngleY =  -Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.leftHandPinky.rotateAngleY =  -Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.rightHandThumb.rotateAngleY =  Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.rightHandLeft3.rotateAngleY =  Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.rightHandMiddle.rotateAngleY =  Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.rightHandPoint.rotateAngleY =  Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.rightHandPinky.rotateAngleY =  Math.abs(MathHelper.cos(limbSwing * 0.8F) * 1.4F * limbSwingAmount);
        this.tail.rotateAngleY =  MathHelper.sin(limbSwing * 0.3662F) * 0.8F * limbSwingAmount;
        this.tail1.rotateAngleY =  MathHelper.cos(limbSwing * 0.1662F) * 0.6F * limbSwingAmount;
        this.tail2.rotateAngleY =  MathHelper.sin(limbSwing * 0.0662F) * 0.4F * limbSwingAmount;
        this.tail3.rotateAngleY =  MathHelper.cos(limbSwing * 0.0662F) * 0.2F * limbSwingAmount;
        this.tail4.rotateAngleY =  MathHelper.sin(limbSwing * 0.0662F) * 0.1F * limbSwingAmount;

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