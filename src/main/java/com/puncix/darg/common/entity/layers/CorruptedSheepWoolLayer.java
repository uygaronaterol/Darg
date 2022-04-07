package com.puncix.darg.common.entity.layers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedSheepEntity;
import com.puncix.darg.common.entity.model.CorruptedSheepModel;
import com.puncix.darg.common.entity.model.CorruptedSheepWoolModel;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.SheepModel;
import net.minecraft.client.renderer.entity.model.SheepWoolModel;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CorruptedSheepWoolLayer extends LayerRenderer<CorruptedSheepEntity, CorruptedSheepModel<CorruptedSheepEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Darg.MOD_ID,"textures/entity/corrupted_sheep_fur.png");
    private final CorruptedSheepWoolModel<CorruptedSheepEntity> sheepModel = new CorruptedSheepWoolModel<>();

    public CorruptedSheepWoolLayer(IEntityRenderer<CorruptedSheepEntity, CorruptedSheepModel<CorruptedSheepEntity>> rendererIn) {
        super(rendererIn);
    }

    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, CorruptedSheepEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entitylivingbaseIn.getSheared() && !entitylivingbaseIn.isInvisible()) {
            float f;
            float f1;
            float f2;
            if (entitylivingbaseIn.hasCustomName() && "jeb_".equals(entitylivingbaseIn.getName().getUnformattedComponentText())) {
                int i1 = 25;
                int i = entitylivingbaseIn.ticksExisted / 25 + entitylivingbaseIn.getEntityId();
                int j = DyeColor.values().length;
                int k = i % j;
                int l = (i + 1) % j;
                float f3 = ((float)(entitylivingbaseIn.ticksExisted % 25) + partialTicks) / 25.0F;
                float[] afloat1 = SheepEntity.getDyeRgb(DyeColor.byId(k));
                float[] afloat2 = SheepEntity.getDyeRgb(DyeColor.byId(l));
                f = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
                f1 = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
                f2 = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
            } else {
                float[] afloat = SheepEntity.getDyeRgb(entitylivingbaseIn.getFleeceColor());
                f = afloat[0];
                f1 = afloat[1];
                f2 = afloat[2];
            }

            renderCopyCutoutModel(this.getEntityModel(), this.sheepModel, TEXTURE, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, f, f1, f2);
        }
    }
}

