package com.puncix.darg.common.entity.model;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports




import com.puncix.darg.common.entity.entities.*;
import net.minecraft.client.renderer.entity.model.EntityModel;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
public class BlackBeardModel <T extends BlackBeardEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer cube_r7_r1;
    private final ModelRenderer cube_r7_r2;
    private final ModelRenderer cube_r7_r3;
    private final ModelRenderer cube_r6_r1;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer cube_r5;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer cube_r1;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer cube_r2;
    private final ModelRenderer sword;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer rightLowerLeg;
    private final ModelRenderer rightFoot;

    public BlackBeardModel() {
        textureWidth = 256;
        textureHeight = 256;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(60, 63).addBox(-12.0F, -52.0F, -2.0F, 24.0F, 7.0F, 8.0F, 0.0F, false);
        body.setTextureOffset(0, 36).addBox(-13.0F, -45.0F, -4.0F, 26.0F, 7.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(0, 16).addBox(-14.0F, -38.0F, -5.0F, 28.0F, 7.0F, 13.0F, 0.0F, false);
        body.setTextureOffset(0, 54).addBox(-12.0F, -31.0F, -3.0F, 24.0F, 7.0F, 10.0F, 0.0F, false);
        body.setTextureOffset(67, 47).addBox(-11.0F, -24.0F, -1.0F, 22.0F, 7.0F, 7.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.2333F, -51.8915F, 2.2875F);
        body.addChild(head);
        head.setTextureOffset(0, 71).addBox(-6.2333F, -10.1085F, -6.2875F, 12.0F, 10.0F, 11.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(-16.2333F, -13.1085F, -7.2875F, 32.0F, 3.0F, 13.0F, 0.0F, false);
        head.setTextureOffset(50, 110).addBox(-16.2333F, -16.1085F, -7.2875F, 2.0F, 3.0F, 13.0F, 0.0F, false);
        head.setTextureOffset(108, 12).addBox(13.7667F, -16.1085F, -7.2875F, 2.0F, 3.0F, 13.0F, 0.0F, false);
        head.setTextureOffset(46, 83).addBox(-14.2333F, -16.1085F, 3.7125F, 28.0F, 3.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(46, 78).addBox(-14.2333F, -16.1085F, -7.2875F, 28.0F, 3.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(96, 0).addBox(-6.2333F, -16.1085F, -5.2875F, 12.0F, 3.0F, 9.0F, 0.0F, false);
        head.setTextureOffset(69, 23).addBox(-6.2333F, -27.1085F, -7.2875F, 12.0F, 11.0F, 13.0F, 0.0F, false);
        head.setTextureOffset(0, 92).addBox(-5.2333F, -28.1085F, -6.2875F, 10.0F, 1.0F, 11.0F, 0.0F, false);
        head.setTextureOffset(108, 28).addBox(-3.2333F, -30.1085F, -4.2875F, 6.0F, 1.0F, 7.0F, 0.0F, false);
        head.setTextureOffset(0, 104).addBox(-4.2333F, -29.1085F, -5.2875F, 8.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r7_r1 = new ModelRenderer(this);
        cube_r7_r1.setRotationPoint(4.7667F, -1.6085F, -10.7875F);
        head.addChild(cube_r7_r1);
        setRotationAngle(cube_r7_r1, 0.7289F, -0.2651F, -0.2298F);
        cube_r7_r1.setTextureOffset(113, 67).addBox(-2.0F, 1.5F, -5.5F, 4.0F, 3.0F, 11.0F, 0.0F, false);

        cube_r7_r2 = new ModelRenderer(this);
        cube_r7_r2.setRotationPoint(-5.2333F, -1.6085F, -10.7875F);
        head.addChild(cube_r7_r2);
        setRotationAngle(cube_r7_r2, 0.7289F, 0.2651F, 0.2298F);
        cube_r7_r2.setTextureOffset(0, 114).addBox(-2.0F, 1.5F, -5.5F, 4.0F, 3.0F, 11.0F, 0.0F, false);

        cube_r7_r3 = new ModelRenderer(this);
        cube_r7_r3.setRotationPoint(-1.2333F, -1.6085F, -10.7875F);
        head.addChild(cube_r7_r3);
        setRotationAngle(cube_r7_r3, 0.6545F, 0.0F, 0.0F);
        cube_r7_r3.setTextureOffset(80, 110).addBox(-2.0F, 0.5F, -5.5F, 4.0F, 4.0F, 11.0F, 0.0F, false);

        cube_r6_r1 = new ModelRenderer(this);
        cube_r6_r1.setRotationPoint(0.7667F, -1.6085F, -10.7875F);
        head.addChild(cube_r6_r1);
        setRotationAngle(cube_r6_r1, 0.6109F, 0.0F, 0.0F);
        cube_r6_r1.setTextureOffset(110, 110).addBox(-1.0F, 0.5F, -5.5F, 4.0F, 4.0F, 11.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(11.0939F, -47.7731F, 2.0F);
        body.addChild(leftUpperArm);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(9.4061F, -1.2269F, 0.5F);
        leftUpperArm.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, 0.9599F);
        cube_r4.setTextureOffset(40, 88).addBox(-6.5F, 5.0F, -3.5F, 17.0F, 6.0F, 6.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(8.7676F, 12.3932F, 0.5F);
        leftUpperArm.addChild(leftLowerArm);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.6384F, -13.6201F, 0.0F);
        leftLowerArm.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.9599F);
        cube_r5.setTextureOffset(46, 100).addBox(10.5F, 6.0F, -2.5F, 15.0F, 5.0F, 5.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-11.0939F, -47.7731F, 2.0F);
        body.addChild(rightUpperArm);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-9.4061F, -1.2269F, 0.5F);
        rightUpperArm.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.9599F);
        cube_r1.setTextureOffset(86, 88).addBox(-10.5F, 5.0F, -3.5F, 17.0F, 6.0F, 6.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(-8.7676F, 12.3932F, 0.5F);
        rightUpperArm.addChild(rightLowerArm);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-0.6384F, -13.6201F, 0.0F);
        rightLowerArm.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.9599F);
        cube_r2.setTextureOffset(86, 100).addBox(-25.5F, 6.0F, -2.5F, 15.0F, 5.0F, 5.0F, 0.0F, false);

        sword = new ModelRenderer(this);
        sword.setRotationPoint(19.8616F, 35.3799F, -2.5F);
        rightLowerArm.addChild(sword);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-20.5F, -49.0F, 2.5F);
        sword.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -0.9599F);
        cube_r3.setTextureOffset(0, 20).addBox(-21.5F, 7.0F, -23.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r3.setTextureOffset(0, 16).addBox(-21.5F, 7.0F, -25.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r3.setTextureOffset(0, 0).addBox(-27.5F, 7.0F, -19.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
        cube_r3.setTextureOffset(19, 119).addBox(-26.5F, 7.0F, -22.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
        cube_r3.setTextureOffset(27, 100).addBox(-25.5F, 7.0F, -25.5F, 1.0F, 2.0F, 17.0F, 0.0F, false);
        cube_r3.setTextureOffset(69, 0).addBox(-24.5F, 7.0F, -25.5F, 3.0F, 2.0F, 21.0F, 0.0F, false);
        cube_r3.setTextureOffset(0, 7).addBox(-24.5F, 7.0F, -4.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r3.setTextureOffset(96, 12).addBox(-24.5F, 7.0F, -3.5F, 3.0F, 2.0F, 7.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(7.5F, -17.5F, 2.5F);
        body.addChild(leftUpperLeg);
        leftUpperLeg.setTextureOffset(125, 12).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(-0.5F, 8.0F, -0.5F);
        leftUpperLeg.addChild(leftLowerLeg);
        leftLowerLeg.setTextureOffset(67, 110).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);

        leftFoot = new ModelRenderer(this);
        leftFoot.setRotationPoint(0.0F, 7.0F, -0.5F);
        leftLowerLeg.addChild(leftFoot);
        leftFoot.setTextureOffset(116, 52).addBox(-2.0F, -0.5F, -6.5F, 4.0F, 3.0F, 9.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(-7.5F, -17.5F, 2.5F);
        body.addChild(rightUpperLeg);
        rightUpperLeg.setTextureOffset(75, 125).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(0.5F, 8.0F, -0.5F);
        rightUpperLeg.addChild(rightLowerLeg);
        rightLowerLeg.setTextureOffset(99, 110).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);

        rightFoot = new ModelRenderer(this);
        rightFoot.setRotationPoint(0.0F, 7.0F, -0.5F);
        rightLowerLeg.addChild(rightFoot);
        rightFoot.setTextureOffset(118, 38).addBox(-2.0F, -0.5F, -6.5F, 4.0F, 3.0F, 9.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX =  MathHelper.sin(limbSwing * 0.6662F) * 0.4F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX = -Math.abs(MathHelper.cos(limbSwing * 0.40F) * 0.4F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 0.4F * limbSwingAmount;
        this.rightLowerArm.rotateAngleX = -Math.abs(MathHelper.sin(limbSwing * 0.3F) * 0.4F * limbSwingAmount);
        this.leftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.4F * limbSwingAmount;
        this.leftLowerLeg.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.40F) * 0.4F * limbSwingAmount);
        this.rightUpperLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 0.4F * limbSwingAmount;
        this.rightLowerLeg.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.40F) * 0.4F * limbSwingAmount);
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