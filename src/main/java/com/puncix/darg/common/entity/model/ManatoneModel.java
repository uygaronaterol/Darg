package com.puncix.darg.common.entity.model;

// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

import com.puncix.darg.common.entity.entities.*;
import net.minecraft.client.renderer.entity.model.EntityModel;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ManatoneModel <T extends ManatoneEntity> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer rightUpperArm;
    private final ModelRenderer rightLowerArm;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer leftLowerArm;

    public ManatoneModel() {
        textureWidth = 256;
        textureHeight = 256;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-21.0F, -2.0F, -20.0F, 40.0F, 2.0F, 40.0F, 0.0F, false);
        body.setTextureOffset(0, 42).addBox(-20.0F, -4.0F, -19.0F, 38.0F, 2.0F, 38.0F, 0.0F, false);
        body.setTextureOffset(0, 82).addBox(-18.0F, -6.0F, -17.0F, 34.0F, 2.0F, 34.0F, 0.0F, false);
        body.setTextureOffset(102, 82).addBox(-16.0F, -8.0F, -15.0F, 30.0F, 2.0F, 30.0F, 0.0F, false);
        body.setTextureOffset(114, 42).addBox(-14.0F, -10.0F, -13.0F, 26.0F, 2.0F, 26.0F, 0.0F, false);
        body.setTextureOffset(114, 114).addBox(-12.0F, -12.0F, -11.0F, 22.0F, 2.0F, 22.0F, 0.0F, false);
        body.setTextureOffset(62, 118).addBox(-9.0F, -14.0F, -8.0F, 16.0F, 2.0F, 16.0F, 0.0F, false);
        body.setTextureOffset(120, 0).addBox(-8.0F, -30.0F, -4.0F, 14.0F, 16.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(0, 118).addBox(-11.0F, -40.0F, -5.0F, 20.0F, 10.0F, 11.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(-1.0F, -51.0F, 0.5F);
        body.addChild(head);
        head.setTextureOffset(51, 136).addBox(-5.0F, -5.0F, -5.5F, 10.0F, 10.0F, 11.0F, 0.0F, false);

        rightUpperArm = new ModelRenderer(this);
        rightUpperArm.setRotationPoint(-15.0F, -40.0F, 1.0F);
        body.addChild(rightUpperArm);
        rightUpperArm.setTextureOffset(16, 14).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 14.0F, 8.0F, 0.0F, false);

        rightLowerArm = new ModelRenderer(this);
        rightLowerArm.setRotationPoint(0.0F, 14.0F, 0.5F);
        rightUpperArm.addChild(rightLowerArm);
        rightLowerArm.setTextureOffset(18, 42).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 14.0F, 5.0F, 0.0F, false);

        leftUpperArm = new ModelRenderer(this);
        leftUpperArm.setRotationPoint(13.0F, -40.0F, 1.0F);
        body.addChild(leftUpperArm);
        leftUpperArm.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 14.0F, 8.0F, 0.0F, false);

        leftLowerArm = new ModelRenderer(this);
        leftLowerArm.setRotationPoint(0.0F, 14.0F, 0.5F);
        leftUpperArm.addChild(leftLowerArm);
        leftLowerArm.setTextureOffset(0, 42).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 14.0F, 5.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX =  MathHelper.sin(limbSwing * 0.4F) * 1.4F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX =  -Math.abs(MathHelper.cos(limbSwing * 0.3F) * 1.4F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX =  MathHelper.cos(limbSwing * 0.4F) * 1.4F * limbSwingAmount;
        this.rightLowerArm.rotateAngleY = -Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.4F * limbSwingAmount);


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
