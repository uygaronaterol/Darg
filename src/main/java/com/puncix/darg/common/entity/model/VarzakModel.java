package com.puncix.darg.common.entity.model;

import com.puncix.darg.common.entity.entities.MoglingEntity;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.puncix.darg.common.entity.entities.CorruptedChickenEntity;
import com.puncix.darg.common.entity.entities.CorruptedCowEntity;
import com.puncix.darg.common.entity.entities.GoldLayingChickenEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
public class VarzakModel <T extends VarzakEntity> extends EntityModel<T> { // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

        private final ModelRenderer body;
        private final ModelRenderer cube_r1;
        private final ModelRenderer rightUpperLeg;
        private final ModelRenderer cube_r2;
        private final ModelRenderer rightLowerLeg;
        private final ModelRenderer cube_r3;
        private final ModelRenderer rightFoot;
        private final ModelRenderer leftUpperLeg;
        private final ModelRenderer cube_r4;
        private final ModelRenderer leftLowerLeg;
        private final ModelRenderer cube_r5;
        private final ModelRenderer leftFoot;
        private final ModelRenderer leftUpperArm;
        private final ModelRenderer leftLowerArm;
        private final ModelRenderer leftHand;
        private final ModelRenderer rightUpperArm;
        private final ModelRenderer rightLowerArm;
        private final ModelRenderer rightHand;
        private final ModelRenderer neck;
        private final ModelRenderer head;
        private final ModelRenderer cube_r6;
        private final ModelRenderer cape;
        private final ModelRenderer cube_r7;

        public VarzakModel() {
            textureWidth = 128;
            textureHeight = 128;

            body = new ModelRenderer(this);
            body.setRotationPoint(0.5625F, -6.5313F, -1.4375F);
            body.setTextureOffset(79, 0).addBox(-6.5625F, 6.5313F, -1.5625F, 12.0F, 6.0F, 5.0F, 0.0F, false);
            body.setTextureOffset(78, 44).addBox(-7.5625F, 3.5313F, -1.5625F, 14.0F, 3.0F, 5.0F, 0.0F, false);
            body.setTextureOffset(0, 71).addBox(-8.5625F, -2.4688F, -1.5625F, 16.0F, 6.0F, 6.0F, 0.0F, false);
            body.setTextureOffset(79, 23).addBox(-10.5625F, -11.4688F, -3.5625F, 7.0F, 3.0F, 9.0F, 0.0F, false);
            body.setTextureOffset(25, 56).addBox(-9.5625F, -5.4688F, -2.5625F, 18.0F, 3.0F, 7.0F, 0.0F, false);
            body.setTextureOffset(79, 11).addBox(2.4375F, -11.4688F, -3.5625F, 7.0F, 3.0F, 9.0F, 0.0F, false);
            body.setTextureOffset(25, 44).addBox(-9.5625F, -8.4688F, -3.5625F, 18.0F, 3.0F, 9.0F, 0.0F, false);
            body.setTextureOffset(83, 66).addBox(-5.5625F, 6.5313F, 3.4375F, 10.0F, 5.0F, 1.0F, 0.0F, false);
            body.setTextureOffset(48, 66).addBox(-6.5625F, 0.5313F, -2.5625F, 12.0F, 3.0F, 1.0F, 0.0F, false);
            body.setTextureOffset(0, 41).addBox(-5.5625F, 3.5313F, -2.5625F, 10.0F, 1.0F, 1.0F, 0.0F, false);
            body.setTextureOffset(24, 31).addBox(-3.5625F, 5.5313F, -2.5625F, 6.0F, 1.0F, 1.0F, 0.0F, false);
            body.setTextureOffset(24, 29).addBox(-4.5625F, 4.5313F, -2.5625F, 8.0F, 1.0F, 1.0F, 0.0F, false);
            body.setTextureOffset(0, 37).addBox(-8.5625F, -5.4688F, -3.5625F, 16.0F, 3.0F, 1.0F, 0.0F, false);
            body.setTextureOffset(0, 31).addBox(-3.5625F, 6.5313F, -2.5625F, 6.0F, 1.0F, 1.0F, 0.0F, false);
            body.setTextureOffset(79, 35).addBox(-7.5625F, -2.4688F, -2.5625F, 14.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r1 = new ModelRenderer(this);
            cube_r1.setRotationPoint(-9.5625F, -12.4688F, 4.4375F);
            body.addChild(cube_r1);
            setRotationAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
            cube_r1.setTextureOffset(0, 19).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 2.0F, 16.0F, 0.0F, false);
            cube_r1.setTextureOffset(59, 56).addBox(16.0F, -1.0F, -8.0F, 4.0F, 2.0F, 16.0F, 0.0F, false);

            rightUpperLeg = new ModelRenderer(this);
            rightUpperLeg.setRotationPoint(-5.6562F, 12.1086F, 1.4375F);
            body.addChild(rightUpperLeg);
            rightUpperLeg.setTextureOffset(71, 90).addBox(-0.9063F, 0.4226F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this);
            cube_r2.setRotationPoint(-2.9063F, 4.4226F, 0.0F);
            rightUpperLeg.addChild(cube_r2);
            setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
            cube_r2.setTextureOffset(47, 101).addBox(1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

            rightLowerLeg = new ModelRenderer(this);
            rightLowerLeg.setRotationPoint(-2.9212F, 8.2773F, 0.1667F);
            rightUpperLeg.addChild(rightLowerLeg);
            rightLowerLeg.setTextureOffset(84, 99).addBox(3.0149F, 0.1453F, -2.1667F, 3.0F, 8.0F, 3.0F, 0.0F, false);

            cube_r3 = new ModelRenderer(this);
            cube_r3.setRotationPoint(2.5149F, 2.1453F, 0.3333F);
            rightLowerLeg.addChild(cube_r3);
            setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
            cube_r3.setTextureOffset(25, 56).addBox(-2.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
            cube_r3.setTextureOffset(68, 56).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

            rightFoot = new ModelRenderer(this);
            rightFoot.setRotationPoint(0.0149F, 8.1453F, -1.0417F);
            rightLowerLeg.addChild(rightFoot);
            rightFoot.setTextureOffset(0, 33).addBox(3.0F, 1.0F, -3.125F, 3.0F, 1.0F, 1.0F, 0.0F, false);
            rightFoot.setTextureOffset(0, 56).addBox(3.0F, -1.0F, 1.875F, 3.0F, 3.0F, 1.0F, 0.0F, false);
            rightFoot.setTextureOffset(99, 95).addBox(3.0F, 0.0F, -2.125F, 3.0F, 2.0F, 4.0F, 0.0F, false);
            rightFoot.setTextureOffset(25, 44).addBox(2.0F, 0.0F, -1.125F, 1.0F, 2.0F, 3.0F, 0.0F, false);

            leftUpperLeg = new ModelRenderer(this);
            leftUpperLeg.setRotationPoint(3.5312F, 12.1086F, 1.4375F);
            body.addChild(leftUpperLeg);
            leftUpperLeg.setTextureOffset(0, 19).addBox(-2.0937F, 0.4226F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

            cube_r4 = new ModelRenderer(this);
            cube_r4.setRotationPoint(3.9063F, 4.4226F, 0.0F);
            leftUpperLeg.addChild(cube_r4);
            setRotationAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
            cube_r4.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

            leftLowerLeg = new ModelRenderer(this);
            leftLowerLeg.setRotationPoint(-1.0788F, 8.2773F, 0.1667F);
            leftUpperLeg.addChild(leftLowerLeg);
            leftLowerLeg.setTextureOffset(98, 83).addBox(-1.0149F, 0.1453F, -2.1667F, 3.0F, 8.0F, 3.0F, 0.0F, false);

            cube_r5 = new ModelRenderer(this);
            cube_r5.setRotationPoint(2.4851F, 2.1453F, 0.3333F);
            leftLowerLeg.addChild(cube_r5);
            setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
            cube_r5.setTextureOffset(39, 18).addBox(1.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
            cube_r5.setTextureOffset(0, 44).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

            leftFoot = new ModelRenderer(this);
            leftFoot.setRotationPoint(0.9851F, 8.1453F, -1.0417F);
            leftLowerLeg.addChild(leftFoot);
            leftFoot.setTextureOffset(30, 7).addBox(-2.0F, 1.0F, -3.125F, 3.0F, 1.0F, 1.0F, 0.0F, false);
            leftFoot.setTextureOffset(25, 49).addBox(-2.0F, -1.0F, 1.875F, 3.0F, 3.0F, 1.0F, 0.0F, false);
            leftFoot.setTextureOffset(99, 72).addBox(-2.0F, 0.0F, -2.125F, 3.0F, 2.0F, 4.0F, 0.0F, false);
            leftFoot.setTextureOffset(15, 44).addBox(1.0F, 0.0F, -1.125F, 1.0F, 2.0F, 3.0F, 0.0F, false);

            leftUpperArm = new ModelRenderer(this);
            leftUpperArm.setRotationPoint(8.1875F, -6.7188F, 0.6875F);
            body.addChild(leftUpperArm);
            leftUpperArm.setTextureOffset(66, 74).addBox(0.25F, -1.75F, -5.25F, 6.0F, 6.0F, 10.0F, 0.0F, false);
            leftUpperArm.setTextureOffset(21, 89).addBox(0.25F, 4.25F, -4.25F, 5.0F, 5.0F, 9.0F, 0.0F, false);

            leftLowerArm = new ModelRenderer(this);
            leftLowerArm.setRotationPoint(2.0F, 9.0F, 0.25F);
            leftUpperArm.addChild(leftLowerArm);
            leftLowerArm.setTextureOffset(49, 89).addBox(-1.75F, 0.25F, -3.5F, 4.0F, 5.0F, 7.0F, 0.0F, false);
            leftLowerArm.setTextureOffset(87, 90).addBox(-1.75F, 5.25F, -2.5F, 3.0F, 4.0F, 5.0F, 0.0F, false);

            leftHand = new ModelRenderer(this);
            leftHand.setRotationPoint(-0.25F, 9.25F, 0.0F);
            leftLowerArm.addChild(leftHand);
            leftHand.setTextureOffset(10, 56).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            rightUpperArm = new ModelRenderer(this);
            rightUpperArm.setRotationPoint(-9.3125F, -6.7188F, 0.6875F);
            body.addChild(rightUpperArm);
            rightUpperArm.setTextureOffset(34, 73).addBox(-6.25F, -1.75F, -5.25F, 6.0F, 6.0F, 10.0F, 0.0F, false);
            rightUpperArm.setTextureOffset(83, 52).addBox(-5.25F, 4.25F, -4.25F, 5.0F, 5.0F, 9.0F, 0.0F, false);

            rightLowerArm = new ModelRenderer(this);
            rightLowerArm.setRotationPoint(-2.0F, 9.0F, 0.25F);
            rightUpperArm.addChild(rightLowerArm);
            rightLowerArm.setTextureOffset(0, 44).addBox(-2.25F, 0.25F, -3.5F, 4.0F, 5.0F, 7.0F, 0.0F, false);
            rightLowerArm.setTextureOffset(88, 74).addBox(-1.25F, 5.25F, -2.5F, 3.0F, 4.0F, 5.0F, 0.0F, false);

            rightHand = new ModelRenderer(this);
            rightHand.setRotationPoint(0.25F, 9.25F, 0.0F);
            rightLowerArm.addChild(rightHand);
            rightHand.setTextureOffset(30, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            rightHand.setTextureOffset(0, 56).addBox(-0.5F, 1.0F, -4.5F, 1.0F, 2.0F, 8.0F, 0.0F, false);
            rightHand.setTextureOffset(24, 19).addBox(-1.5F, 0.0F, -8.5F, 3.0F, 4.0F, 6.0F, 0.0F, false);
            rightHand.setTextureOffset(0, 44).addBox(-0.5F, 0.0F, -31.5F, 1.0F, 4.0F, 23.0F, 0.0F, false);
            rightHand.setTextureOffset(56, 74).addBox(-0.5F, 0.0F, -39.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
            rightHand.setTextureOffset(0, 96).addBox(-0.5F, 1.0F, -38.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
            rightHand.setTextureOffset(40, 89).addBox(-0.5F, 2.0F, -37.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
            rightHand.setTextureOffset(29, 37).addBox(-0.5F, 3.0F, -36.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

            neck = new ModelRenderer(this);
            neck.setRotationPoint(-0.5625F, -8.4688F, 0.9375F);
            body.addChild(neck);
            neck.setTextureOffset(0, 83).addBox(-3.0F, -4.0F, -4.5F, 6.0F, 4.0F, 9.0F, 0.0F, false);

            head = new ModelRenderer(this);
            head.setRotationPoint(0.0F, -3.7398F, 0.42F);
            neck.addChild(head);
            head.setTextureOffset(0, 0).addBox(-5.0F, -9.2602F, -5.92F, 10.0F, 9.0F, 10.0F, 0.0F, false);
            head.setTextureOffset(86, 116).addBox(-5.0F, -10.2602F, -5.92F, 10.0F, 1.0F, 11.0F, 0.0F, false);
            head.setTextureOffset(0, 116).addBox(-5.0F, -9.2602F, 4.08F, 10.0F, 11.0F, 1.0F, 0.0F, false);
            head.setTextureOffset(26, 114).addBox(5.0F, -10.2602F, -5.92F, 1.0F, 13.0F, 1.0F, 0.0F, false);
            head.setTextureOffset(26, 114).addBox(-6.0F, -10.2602F, -5.92F, 1.0F, 13.0F, 1.0F, 0.0F, false);

            cube_r6 = new ModelRenderer(this);
            cube_r6.setRotationPoint(-5.5F, -6.7602F, -0.92F);
            head.addChild(cube_r6);
            setRotationAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
            cube_r6.setTextureOffset(24, 19).addBox(-0.5F, 2.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r6.setTextureOffset(24, 22).addBox(-0.5F, 1.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r6.setTextureOffset(66, 74).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
            cube_r6.setTextureOffset(36, 7).addBox(10.5F, 2.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r6.setTextureOffset(36, 31).addBox(10.5F, 1.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r6.setTextureOffset(21, 83).addBox(10.5F, 0.5F, -1.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cape = new ModelRenderer(this);
            cape.setRotationPoint(-0.5625F, -10.4688F, 5.4375F);
            body.addChild(cape);


            cube_r7 = new ModelRenderer(this);
            cube_r7.setRotationPoint(0.0F, -0.5F, -0.5F);
            cape.addChild(cube_r7);
            setRotationAngle(cube_r7, -1.1345F, 0.0F, 0.0F);
            cube_r7.setTextureOffset(0, 0).addBox(-9.0F, -0.5F, 0.5F, 18.0F, 1.0F, 43.0F, 0.0F, false);
        }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leftUpperArm.rotateAngleX =  MathHelper.sin(limbSwing * 0.6662F) * 1.1F * limbSwingAmount;
        this.leftLowerArm.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.40F) * 1.1F * limbSwingAmount);
        this.rightUpperArm.rotateAngleX = MathHelper.cos(limbSwing * 0.3F) * 1.1F * limbSwingAmount;
        this.rightLowerArm.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.3F) * 1.1F * limbSwingAmount);
        this.leftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
        this.leftLowerLeg.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.40F) * 0.8F * limbSwingAmount);
        this.rightUpperLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
        this.rightLowerLeg.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.40F) * 0.8F * limbSwingAmount);
        this.cape.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.10F) * 0.4F * limbSwingAmount);
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