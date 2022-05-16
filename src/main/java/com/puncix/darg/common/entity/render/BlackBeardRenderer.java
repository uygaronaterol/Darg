package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.BlackBeardEntity;
import com.puncix.darg.common.entity.entities.CinnerEntity;
import com.puncix.darg.common.entity.entities.CorruptedChickenEntity;
import com.puncix.darg.common.entity.entities.CorruptedCowEntity;
import com.puncix.darg.common.entity.model.BlackBeardModel;
import com.puncix.darg.common.entity.model.CinnerModel;
import com.puncix.darg.common.entity.model.CorruptedChickenModel;
import com.puncix.darg.common.entity.model.CorruptedCowModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BlackBeardRenderer extends MobRenderer<BlackBeardEntity, BlackBeardModel<BlackBeardEntity>> {

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/black_beard.png");

    public BlackBeardRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BlackBeardModel<>(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(BlackBeardEntity entity) {
        return TEXTURE;
    }
}
