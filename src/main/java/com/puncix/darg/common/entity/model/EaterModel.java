package com.puncix.darg.common.entity.model;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.DarbigEntity;
import com.puncix.darg.common.entity.entities.EaterEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
// Made with Blockbench 4.2.2
// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports
public class EaterModel <T extends EaterEntity> extends EntityModel<T> {
    // Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports
        private final ModelRenderer body;
        private final ModelRenderer leg1;
        private final ModelRenderer leg2;
        private final ModelRenderer leg3;
        private final ModelRenderer leg4;
        private final ModelRenderer head;
        private final ModelRenderer upperMouth;
        private final ModelRenderer lowerMouth;

        public EaterModel() {
            textureWidth = 256;
            textureHeight = 256;

            body = new ModelRenderer(this);
            body.setRotationPoint(0.0F, 24.0F, 0.0F);
            body.setTextureOffset(0, 0).addBox(-14.0F, -28.0F, -14.0F, 28.0F, 14.0F, 7.0F, 0.0F, false);
            body.setTextureOffset(0, 21).addBox(-13.0F, -27.0F, -7.0F, 26.0F, 13.0F, 7.0F, 0.0F, false);
            body.setTextureOffset(0, 62).addBox(-12.0F, -26.0F, 0.0F, 24.0F, 12.0F, 7.0F, 0.0F, false);
            body.setTextureOffset(0, 41).addBox(-11.0F, -26.0F, 7.0F, 22.0F, 12.0F, 9.0F, 0.0F, false);
            body.setTextureOffset(83, 85).addBox(-12.0F, -38.0F, 0.0F, 7.0F, 12.0F, 7.0F, 0.0F, false);
            body.setTextureOffset(55, 85).addBox(-12.0F, -40.0F, -7.0F, 7.0F, 14.0F, 7.0F, 0.0F, false);

            leg1 = new ModelRenderer(this);
            leg1.setRotationPoint(-11.0F, -14.0F, -11.0F);
            body.addChild(leg1);
            leg1.setTextureOffset(79, 104).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

            leg2 = new ModelRenderer(this);
            leg2.setRotationPoint(11.0F, -14.0F, -12.0F);
            body.addChild(leg2);
            leg2.setTextureOffset(32, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

            leg3 = new ModelRenderer(this);
            leg3.setRotationPoint(9.0F, -14.0F, 14.0F);
            body.addChild(leg3);
            leg3.setTextureOffset(16, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

            leg4 = new ModelRenderer(this);
            leg4.setRotationPoint(-9.0F, -14.0F, 14.0F);
            body.addChild(leg4);
            leg4.setTextureOffset(0, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

            head = new ModelRenderer(this);
            head.setRotationPoint(0.0F, -21.0F, -13.0F);
            body.addChild(head);


            upperMouth = new ModelRenderer(this);
            upperMouth.setRotationPoint(0.0F, -3.2857F, 1.5357F);
            head.addChild(upperMouth);
            upperMouth.setTextureOffset(70, 0).addBox(-14.0F, -4.7143F, -5.5357F, 28.0F, 7.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(0, 81).addBox(-14.0F, -4.7143F, -8.5357F, 28.0F, 6.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(66, 17).addBox(-14.0F, -4.7143F, -12.5357F, 28.0F, 5.0F, 4.0F, 0.0F, false);
            upperMouth.setTextureOffset(30, 108).addBox(-14.0F, -0.7143F, -15.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(59, 34).addBox(-14.0F, -4.7143F, -19.5357F, 28.0F, 4.0F, 7.0F, 0.0F, false);
            upperMouth.setTextureOffset(20, 108).addBox(12.0F, -0.7143F, -19.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(10, 108).addBox(-14.0F, -0.7143F, -19.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(0, 108).addBox(12.0F, -0.7143F, -15.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(55, 106).addBox(-6.0F, -0.7143F, -19.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(65, 106).addBox(-10.0F, -0.7143F, -19.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(106, 26).addBox(1.0F, -0.7143F, -19.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(105, 104).addBox(4.0F, -0.7143F, -19.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(95, 104).addBox(8.0F, -0.7143F, -19.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            upperMouth.setTextureOffset(104, 85).addBox(-3.0F, -0.7143F, -19.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            lowerMouth = new ModelRenderer(this);
            lowerMouth.setRotationPoint(0.0F, 2.2857F, -1.4643F);
            head.addChild(lowerMouth);
            lowerMouth.setTextureOffset(62, 66).addBox(-14.0F, -2.2857F, -2.5357F, 28.0F, 7.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(62, 76).addBox(-14.0F, -1.2857F, -5.5357F, 28.0F, 6.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(62, 45).addBox(-14.0F, -0.2857F, -9.5357F, 28.0F, 5.0F, 4.0F, 0.0F, false);
            lowerMouth.setTextureOffset(48, 103).addBox(-14.0F, -2.2857F, -12.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(55, 55).addBox(-14.0F, 0.7143F, -16.5357F, 28.0F, 4.0F, 7.0F, 0.0F, false);
            lowerMouth.setTextureOffset(100, 10).addBox(12.0F, -2.2857F, -16.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(96, 26).addBox(-14.0F, -2.2857F, -16.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(90, 10).addBox(12.0F, -2.2857F, -12.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(86, 26).addBox(-6.0F, -2.2857F, -16.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(76, 85).addBox(-10.0F, -2.2857F, -16.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(80, 10).addBox(1.0F, -2.2857F, -16.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(76, 26).addBox(4.0F, -2.2857F, -16.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(70, 10).addBox(8.0F, -2.2857F, -16.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            lowerMouth.setTextureOffset(66, 26).addBox(-3.0F, -2.2857F, -16.5357F, 2.0F, 3.0F, 3.0F, 0.0F, false);
        }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leg1.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 0.7F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.7F * limbSwingAmount;
        this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.7F * limbSwingAmount;
        this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.7F * limbSwingAmount;
        this.upperMouth.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.3662F) * 0.4F * limbSwingAmount);
        this.lowerMouth.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.3662F) * 0.4F * limbSwingAmount);

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
