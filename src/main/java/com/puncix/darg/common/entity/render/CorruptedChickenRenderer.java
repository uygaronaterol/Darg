package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedChickenEntity;
import com.puncix.darg.common.entity.entities.CorruptedCowEntity;
import com.puncix.darg.common.entity.model.CorruptedChickenModel;
import com.puncix.darg.common.entity.model.CorruptedCowModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CorruptedChickenRenderer extends MobRenderer<CorruptedChickenEntity, CorruptedChickenModel<CorruptedChickenEntity>> {

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/corrupted_chicken.png");

    public CorruptedChickenRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CorruptedChickenModel<>(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(CorruptedChickenEntity entity) {
        return TEXTURE;
    }
}
