package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedPigEntity;
import com.puncix.darg.common.entity.entities.ExheristaffEntity;
import com.puncix.darg.common.entity.entities.GoblinEntity;
import com.puncix.darg.common.entity.model.CorruptedPigModel;
import com.puncix.darg.common.entity.model.ExheristaffModel;
import com.puncix.darg.common.entity.model.GoblinModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoblinRenderer extends MobRenderer<GoblinEntity, GoblinModel<GoblinEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/goblin.png");

    public GoblinRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GoblinModel<>(), 0.5F);
    }
    @Override
    public ResourceLocation getEntityTexture(GoblinEntity entity) {
        return TEXTURE;
    }
}
