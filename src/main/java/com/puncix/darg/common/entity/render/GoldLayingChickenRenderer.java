package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.GoldLayingChickenEntity;
import com.puncix.darg.common.entity.model.GoldLayingChickenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoldLayingChickenRenderer extends MobRenderer<GoldLayingChickenEntity, GoldLayingChickenModel<GoldLayingChickenEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/gold_laying_chicken.png");

    public GoldLayingChickenRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GoldLayingChickenModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(GoldLayingChickenEntity entity) {
        return TEXTURE;
    }
}