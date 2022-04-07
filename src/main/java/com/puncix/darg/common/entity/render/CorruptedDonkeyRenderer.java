package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedDonkeyEntity;
import com.puncix.darg.common.entity.entities.CorruptedHorseEntity;
import com.puncix.darg.common.entity.model.CorruptedDonkeyModel;
import com.puncix.darg.common.entity.model.CorruptedHorseModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CorruptedDonkeyRenderer extends MobRenderer<CorruptedDonkeyEntity, CorruptedDonkeyModel<CorruptedDonkeyEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/corrupted_donkey.png");

    public CorruptedDonkeyRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CorruptedDonkeyModel<>(), 0.9F);
    }

    @Override
    public ResourceLocation getEntityTexture(CorruptedDonkeyEntity entity) {
        return TEXTURE;
    }
}
