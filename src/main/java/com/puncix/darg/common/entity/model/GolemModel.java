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

public class GolemModel <T extends GolemEntity> extends EntityModel<T> {
    private final ModelRenderer golem;
    private final ModelRenderer head;
    private final ModelRenderer body;

    public GolemModel() {
        textureWidth = 64;
        textureHeight = 64;

        golem = new ModelRenderer(this);
        golem.setRotationPoint(0.5F, 12.0F, 3.5F);


        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -3.5F, 0.0F);
        golem.addChild(head);
        head.setTextureOffset(0, 14).addBox(-3.5F, -7.5F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 1.5F, 0.0F);
        golem.addChild(body);
        body.setTextureOffset(0, 0).addBox(-6.5F, -3.5F, -3.5F, 13.0F, 7.0F, 7.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.body.rotateAngleX =  MathHelper.sin(limbSwing * 0.4F) * 0.4F * limbSwingAmount;



    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        golem.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}