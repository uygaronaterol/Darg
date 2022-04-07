package com.puncix.darg.common.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.CorruptedCowEntity;
import com.puncix.darg.common.entity.entities.CorruptedHorseEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class CorruptedHorseModel <T extends CorruptedHorseEntity> extends EntityModel<T> {
    private final ModelRenderer neck;
    private final ModelRenderer mane;
    private final ModelRenderer body;
    private final ModelRenderer eye5_r1;
    private final ModelRenderer eye5_r2;
    private final ModelRenderer eye4_r1;
    private final ModelRenderer eye3_r1;
    private final ModelRenderer eye1_r1;
    private final ModelRenderer tail;
    private final ModelRenderer front_left_leg;
    private final ModelRenderer front_right_leg;
    private final ModelRenderer back_left_leg;
    private final ModelRenderer back_right_leg;
    private final ModelRenderer headpiece;

    public CorruptedHorseModel() {
        textureWidth = 64;
        textureHeight = 64;

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, 2.0F, -8.9F);
        neck.setTextureOffset(0, 35).addBox(-2.0F, -6.0F, -2.1F, 4.0F, 12.0F, 7.0F, 0.0F, false);

        mane = new ModelRenderer(this);
        mane.setRotationPoint(0.0F, 2.0F, -9.0F);
        mane.setTextureOffset(56, 36).addBox(-1.0F, -11.0F, 5.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 11.0F, 6.0F);
        body.setTextureOffset(0, 32).addBox(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, 0.05F, false);
        body.setTextureOffset(56, 0).addBox(2.0F, -20.0F, -4.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(56, 0).addBox(2.0F, -16.0F, 0.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(56, 0).addBox(2.0F, -12.0F, 3.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        eye5_r1 = new ModelRenderer(this);
        eye5_r1.setRotationPoint(11.0F, 10.0F, 4.0F);
        body.addChild(eye5_r1);
        setRotationAngle(eye5_r1, 1.5708F, 0.0F, 0.0F);
        eye5_r1.setTextureOffset(22, 39).addBox(-6.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        eye5_r2 = new ModelRenderer(this);
        eye5_r2.setRotationPoint(11.0F, 11.0F, 4.0F);
        body.addChild(eye5_r2);
        setRotationAngle(eye5_r2, 1.5708F, 0.0F, 0.0F);
        eye5_r2.setTextureOffset(26, 39).addBox(-6.0F, -9.0F, 10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        eye5_r2.setTextureOffset(22, 38).addBox(-6.0F, -11.0F, 15.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        eye4_r1 = new ModelRenderer(this);
        eye4_r1.setRotationPoint(11.0F, 12.0F, 6.0F);
        body.addChild(eye4_r1);
        setRotationAngle(eye4_r1, 1.5708F, 0.0F, 0.0F);
        eye4_r1.setTextureOffset(22, 38).addBox(-6.0F, -13.0F, 12.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        eye4_r1.setTextureOffset(23, 36).addBox(-6.0F, -15.0F, 15.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        eye3_r1 = new ModelRenderer(this);
        eye3_r1.setRotationPoint(11.0F, 14.0F, 6.0F);
        body.addChild(eye3_r1);
        setRotationAngle(eye3_r1, 1.5708F, 0.0F, 0.0F);
        eye3_r1.setTextureOffset(23, 36).addBox(-6.0F, -15.0F, 15.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        eye1_r1 = new ModelRenderer(this);
        eye1_r1.setRotationPoint(11.0F, 13.0F, 7.0F);
        body.addChild(eye1_r1);
        setRotationAngle(eye1_r1, 1.5708F, 0.0F, 0.0F);
        eye1_r1.setTextureOffset(24, 35).addBox(-6.0F, -17.0F, 15.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 3.0F, 11.0F);
        tail.setTextureOffset(42, 36).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);

        front_left_leg = new ModelRenderer(this);
        front_left_leg.setRotationPoint(-4.0F, 14.0F, -9.1F);
        front_left_leg.setTextureOffset(48, 21).addBox(5.0F, -1.0F, -1.9F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        front_right_leg = new ModelRenderer(this);
        front_right_leg.setRotationPoint(4.0F, 14.0F, -9.1F);
        front_right_leg.setTextureOffset(48, 21).addBox(-9.0F, -1.0F, -1.9F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        back_left_leg = new ModelRenderer(this);
        back_left_leg.setRotationPoint(-4.0F, 14.0F, 8.0F);
        back_left_leg.setTextureOffset(48, 21).addBox(5.0F, -1.0F, -1.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        back_right_leg = new ModelRenderer(this);
        back_right_leg.setRotationPoint(4.0F, 14.0F, 8.0F);
        back_right_leg.setTextureOffset(48, 21).addBox(-9.0F, -1.0F, -1.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        headpiece = new ModelRenderer(this);
        headpiece.setRotationPoint(0.0F, 2.0F, -9.0F);
        headpiece.setTextureOffset(0, 13).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, 0.25F, false);
        headpiece.setTextureOffset(0, 25).addBox(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
        headpiece.setTextureOffset(19, 16).addBox(-2.5F, -14.0F, 3.99F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        headpiece.setTextureOffset(19, 16).addBox(0.5F, -14.0F, 3.99F, 2.0F, 3.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.headpiece.rotateAngleX = headPitch * ((float) Math.PI / 180F);
        this.headpiece.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
        this.back_left_leg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.back_right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.front_left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.front_right_leg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.neck.rotateAngleX = headPitch * ((float) Math.PI / 720F);
        this.neck.rotateAngleY = netHeadYaw * ((float) Math.PI / 720F);
        this.mane.rotateAngleX = headPitch * ((float) Math.PI / 720F);
        this.mane.rotateAngleY = netHeadYaw * ((float) Math.PI / 720F);
        this.tail.rotateAngleZ = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        neck.render(matrixStack, buffer, packedLight, packedOverlay);
        mane.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
        front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        headpiece.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }



}
