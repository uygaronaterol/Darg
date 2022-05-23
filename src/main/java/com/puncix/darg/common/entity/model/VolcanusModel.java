package com.puncix.darg.common.entity.model;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
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
import com.puncix.darg.common.entity.entities.VolcanusEntity;
import com.puncix.darg.common.entity.entities.ZelothEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class VolcanusModel <T extends VolcanusEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer head;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer leftLowerArm;
    private final ModelRenderer leftUpperLeg;
    private final ModelRenderer leftLowerLeg;
    private final ModelRenderer rightUpperLeg;
    private final ModelRenderer rightLowerLeg;

    public VolcanusModel() {
        textureWidth = 256;
        textureHeight = 256;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(74, 100).addBox(-15.0F, -32.0F, -3.0F, 30.0F, 8.0F, 13.0F, 0.0F, false);
        body.setTextureOffset(0, 63).addBox(-17.0F, -40.0F, -4.0F, 34.0F, 8.0F, 16.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-20.0F, -50.0F, -5.0F, 40.0F, 10.0F, 20.0F, 0.0F, false);
        body.setTextureOffset(0, 87).addBox(-29.0F, -52.0F, -7.0F, 13.0F, 13.0F, 24.0F, 0.0F, false);
        body.setTextureOffset(76, 63).addBox(16.0F, -52.0F, -7.0F, 13.0F, 13.0F, 24.0F, 0.0F, false);
        body.setTextureOffset(100, 0).addBox(-14.0F, -24.0F, -2.0F, 28.0F, 8.0F, 11.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -55.0F, 12.0F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 153).addBox(-6.0F, -39.0F, -4.0F, 13.0F, 17.0F, 8.0F, 0.0F, false);
        cube_r1.setTextureOffset(104, 30).addBox(-11.0F, -22.0F, -6.0F, 22.0F, 17.0F, 12.0F, 0.0F, false);
        cube_r1.setTextureOffset(0, 30).addBox(-18.0F, -5.0F, -8.0F, 36.0F, 17.0F, 16.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -45.0F, -4.0F);
        body.addChild(head);
        head.setTextureOffset(126, 59).addBox(-6.0F, -7.0F, -12.0F, 12.0F, 12.0F, 11.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-23.0F, -39.5F, 10.0F);
        body.addChild(rightUpperArm);
        rightUpperArm.setTextureOffset(114, 121).addBox(-5.0F, -1.5F, -15.0F, 10.0F, 13.0F, 20.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(0.0F, 12.0F, -5.0F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(147, 84).addBox(-5.0F, -0.5F, -8.0F, 10.0F, 13.0F, 16.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(23.0F, -39.5F, 10.0F);
        body.addChild(leftUpperArm);
        leftUpperArm.setTextureOffset(54, 121).addBox(-5.0F, -1.5F, -15.0F, 10.0F, 13.0F, 20.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(0.0F, 12.0F, -5.0F);
        leftUpperArm.addChild(leftLowerArm);
        leftLowerArm.setTextureOffset(0, 124).addBox(-5.0F, -0.5F, -8.0F, 10.0F, 13.0F, 16.0F, 0.0F, false);

        leftUpperLeg = new ModelRenderer(this);
        leftUpperLeg.setRotationPoint(8.5F, -16.0F, 3.5F);
        body.addChild(leftUpperLeg);
        leftUpperLeg.setTextureOffset(50, 93).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 8.0F, 7.0F, 0.0F, false);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setRotationPoint(0.5F, 8.0F, -0.5F);
        leftUpperLeg.addChild(leftLowerLeg);
        leftLowerLeg.setTextureOffset(0, 87).addBox(-4.0F, 0.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

        rightUpperLeg = new ModelRenderer(this);
        rightUpperLeg.setRotationPoint(-8.5F, -16.0F, 3.5F);
        body.addChild(rightUpperLeg);
        rightUpperLeg.setTextureOffset(94, 121).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 8.0F, 7.0F, 0.0F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setRotationPoint(0.5F, 8.0F, -0.5F);
        rightUpperLeg.addChild(rightLowerLeg);
        rightLowerLeg.setTextureOffset(36, 124).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
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
