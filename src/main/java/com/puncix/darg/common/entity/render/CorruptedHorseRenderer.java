package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedHorseEntity;
import com.puncix.darg.common.entity.model.CorruptedHorseModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CorruptedHorseRenderer extends MobRenderer<CorruptedHorseEntity, CorruptedHorseModel<CorruptedHorseEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/corrupted_horse.png");

    public CorruptedHorseRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CorruptedHorseModel<>(), 0.9F);
    }

    @Override
    public ResourceLocation getEntityTexture(CorruptedHorseEntity entity) {
        return TEXTURE;
    }
}

