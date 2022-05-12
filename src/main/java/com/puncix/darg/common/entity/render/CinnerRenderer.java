package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CinnerEntity;
import com.puncix.darg.common.entity.entities.CorruptedChickenEntity;
import com.puncix.darg.common.entity.entities.CorruptedCowEntity;
import com.puncix.darg.common.entity.model.CinnerModel;
import com.puncix.darg.common.entity.model.CorruptedChickenModel;
import com.puncix.darg.common.entity.model.CorruptedCowModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CinnerRenderer extends MobRenderer<CinnerEntity, CinnerModel<CinnerEntity>> {

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/cinner.png");

    public CinnerRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CinnerModel<>(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(CinnerEntity entity) {
        return TEXTURE;
    }
}
