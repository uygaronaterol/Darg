package com.puncix.darg.common.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.DarbigEntity;
import com.puncix.darg.common.entity.entities.DwarfEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
public class DwarfModel <T extends DwarfEntity> extends EntityModel<T> {
        private final ModelRenderer body;
        private final ModelRenderer head;
        private final ModelRenderer leftLeg;
        private final ModelRenderer rightLeg;
        private final ModelRenderer rightArm;
        private final ModelRenderer leftArm;

        public DwarfModel() {
            textureWidth = 64;
            textureHeight = 64;

            body = new ModelRenderer(this);
            body.setRotationPoint(0.0F, 24.0F, 0.0F);
            body.setTextureOffset(0, 0).addBox(-4.0F, -13.0F, -1.0F, 8.0F, 9.0F, 3.0F, 0.0F, false);
            body.setTextureOffset(10, 25).addBox(-3.0F, -12.0F, -2.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
            body.setTextureOffset(16, 12).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
            body.setTextureOffset(0, 12).addBox(-3.0F, -12.0F, 1.0F, 6.0F, 7.0F, 2.0F, 0.0F, false);

            head = new ModelRenderer(this);
            head.setRotationPoint(0.0F, -13.0F, 0.0F);
            body.addChild(head);
            head.setTextureOffset(13, 18).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
            head.setTextureOffset(25, 23).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
            head.setTextureOffset(8, 29).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
            head.setTextureOffset(30, 7).addBox(1.0F, -2.0F, -4.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
            head.setTextureOffset(0, 30).addBox(-2.0F, -2.0F, -4.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            leftLeg = new ModelRenderer(this);
            leftLeg.setRotationPoint(3.0F, -4.25F, 1.0F);
            body.addChild(leftLeg);
            leftLeg.setTextureOffset(16, 29).addBox(-1.0F, 0.25F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
            leftLeg.setTextureOffset(24, 18).addBox(-1.0F, 3.25F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            rightLeg = new ModelRenderer(this);
            rightLeg.setRotationPoint(-3.0F, -4.25F, 1.0F);
            body.addChild(rightLeg);
            rightLeg.setTextureOffset(24, 29).addBox(-1.0F, 0.25F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
            rightLeg.setTextureOffset(22, 9).addBox(-1.0F, 3.25F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            rightArm = new ModelRenderer(this);
            rightArm.setRotationPoint(-4.0F, -12.0F, 0.5F);
            body.addChild(rightArm);
            rightArm.setTextureOffset(22, 0).addBox(-2.0F, -1.0F, -1.5F, 2.0F, 6.0F, 3.0F, 0.0F, false);

            leftArm = new ModelRenderer(this);
            leftArm.setRotationPoint(4.0F, -12.0F, 0.5F);
            body.addChild(leftArm);
            leftArm.setTextureOffset(0, 21).addBox(0.0F, -1.0F, -1.5F, 2.0F, 6.0F, 3.0F, 0.0F, false);
        }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.4F * limbSwingAmount;
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
