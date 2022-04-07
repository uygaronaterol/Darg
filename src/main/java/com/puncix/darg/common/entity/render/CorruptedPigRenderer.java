package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedPigEntity;
import com.puncix.darg.common.entity.model.CorruptedPigModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CorruptedPigRenderer extends MobRenderer<CorruptedPigEntity, CorruptedPigModel<CorruptedPigEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/corrupted_pig.png");

    public CorruptedPigRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CorruptedPigModel<>(), 0.5F);
    }
    @Override
    public ResourceLocation getEntityTexture(CorruptedPigEntity entity) {
        return TEXTURE;
    }

}
