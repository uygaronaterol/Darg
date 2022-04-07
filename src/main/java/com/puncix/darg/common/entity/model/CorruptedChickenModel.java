package com.puncix.darg.common.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.CorruptedChickenEntity;
import com.puncix.darg.common.entity.entities.CorruptedCowEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class CorruptedChickenModel<T extends CorruptedChickenEntity> extends EntityModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer bill;
    private final ModelRenderer chin;
    private final ModelRenderer body;
    private final ModelRenderer left_wing;
    private final ModelRenderer right_wing;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;

    public CorruptedChickenModel() {
        textureWidth = 64;
        textureHeight = 32;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 15.0F, -4.0F);
        head.setTextureOffset(0, 0).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

        bill = new ModelRenderer(this);
        bill.setRotationPoint(0.0F, 15.0F, -4.0F);
        bill.setTextureOffset(14, 0).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

        chin = new ModelRenderer(this);
        chin.setRotationPoint(0.0F, 15.0F, -4.0F);
        chin.setTextureOffset(14, 4).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 16.0F, 0.0F);
        setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
        body.setTextureOffset(0, 9).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

        left_wing = new ModelRenderer(this);
        left_wing.setRotationPoint(-4.0F, 13.0F, 0.0F);
        left_wing.setTextureOffset(24, 13).addBox(7.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        right_wing = new ModelRenderer(this);
        right_wing.setRotationPoint(4.0F, 13.0F, 0.0F);
        right_wing.setTextureOffset(24, 13).addBox(-8.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(-1.0F, 19.0F, 1.0F);
        left_leg.setTextureOffset(26, 0).addBox(1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(2.0F, 19.0F, 1.0F);
        right_leg.setTextureOffset(26, 0).addBox(-5.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.left_leg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left_wing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
        this.right_wing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
    }



    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        bill.render(matrixStack, buffer, packedLight, packedOverlay);
        chin.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
        right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
        left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
