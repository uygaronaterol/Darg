package com.puncix.darg.common.entity.model;
import com.puncix.darg.common.entity.entities.MedusaEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.MedusaSnakeEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
public class MedusaSnakeModel <T extends MedusaSnakeEntity> extends EntityModel<T>{
    private final ModelRenderer medusaSnake;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer head;

    public MedusaSnakeModel() {
        textureWidth = 32;
        textureHeight = 32;

        medusaSnake = new ModelRenderer(this);
        medusaSnake.setRotationPoint(0.0F, 24.0F, 0.0F);


        tail1 = new ModelRenderer(this);
        tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
        medusaSnake.addChild(tail1);
        tail1.setTextureOffset(0, 11).addBox(-1.5F, -1.0F, 6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        tail2 = new ModelRenderer(this);
        tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        medusaSnake.addChild(tail2);
        tail2.setTextureOffset(0, 5).addBox(-2.0F, -1.0F, 4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        tail2.setTextureOffset(10, 3).addBox(-2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        tail3 = new ModelRenderer(this);
        tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        medusaSnake.addChild(tail3);
        tail3.setTextureOffset(6, 9).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        tail3.setTextureOffset(9, 0).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        tail4 = new ModelRenderer(this);
        tail4.setRotationPoint(0.0F, 0.0F, 0.0F);
        medusaSnake.addChild(tail4);
        tail4.setTextureOffset(0, 8).addBox(-2.0F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        tail4.setTextureOffset(6, 6).addBox(-2.0F, -1.0F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        medusaSnake.addChild(head);
        head.setTextureOffset(0, 0).addBox(-2.5F, -2.0F, -9.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
    }


    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.tail1.rotateAngleX =  MathHelper.sin(limbSwing * 0.5F) * 0.7F * limbSwingAmount;
        this.tail2.rotateAngleX =  MathHelper.sin(limbSwing * 0.3F) * 0.5F * limbSwingAmount;
        this.tail3.rotateAngleX =  MathHelper.sin(limbSwing * 0.2F) * 0.3F * limbSwingAmount;
        this.tail4.rotateAngleX =  MathHelper.sin(limbSwing * 0.2F) * 0.2F * limbSwingAmount;

    }
    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        medusaSnake.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}