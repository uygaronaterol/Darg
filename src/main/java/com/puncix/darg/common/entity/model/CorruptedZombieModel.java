package com.puncix.darg.common.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.CorruptedZombieEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class CorruptedZombieModel <T extends CorruptedZombieEntity> extends EntityModel<T> {
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


    private final ModelRenderer zombie;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;
    private final ModelRenderer right_arm;
    private final ModelRenderer left_arm;
    private final ModelRenderer body;
    private final ModelRenderer headwear;
    private final ModelRenderer bb_main;

    public CorruptedZombieModel() {
        textureWidth = 64;
        textureHeight = 64;

        zombie = new ModelRenderer(this);
        zombie.setRotationPoint(0.0F, 24.0F, 0.0F);


        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(-1.9F, -12.0F, 0.0F);
        zombie.addChild(left_leg);
        left_leg.setTextureOffset(0, 16).addBox(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(1.9F, -12.0F, 0.0F);
        zombie.addChild(right_leg);
        right_leg.setTextureOffset(0, 48).addBox(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(5.0F, -22.0F, 0.0F);
        zombie.addChild(right_arm);
        right_arm.setTextureOffset(40, 16).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(-5.0F, -22.0F, 0.0F);
        zombie.addChild(left_arm);
        left_arm.setTextureOffset(48, 48).addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, -24.0F, 0.0F);
        zombie.addChild(body);
        body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

        headwear = new ModelRenderer(this);
        headwear.setRotationPoint(0.0F, -24.0F, 0.0F);
        zombie.addChild(headwear);
        headwear.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(24, 51).addBox(0.0F, -24.0F, 2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
        bb_main.setTextureOffset(16, 35).addBox(0.0F, -24.0F, 6.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.headwear.rotateAngleX = headPitch * ((float) Math.PI / 180F);
        this.headwear.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
        this.left_arm.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
        this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
        this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.right_leg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }



    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        zombie.render(matrixStack, buffer, packedLight, packedOverlay);
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
