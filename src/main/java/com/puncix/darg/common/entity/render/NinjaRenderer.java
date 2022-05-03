package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.MoglingEntity;
import com.puncix.darg.common.entity.entities.NinjaEntity;
import com.puncix.darg.common.entity.model.MoglingModel;
import com.puncix.darg.common.entity.model.NinjaModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NinjaRenderer extends MobRenderer<NinjaEntity, NinjaModel<NinjaEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/ninja.png");

    public NinjaRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new NinjaModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(NinjaEntity entity) {
        return TEXTURE;
    }
}
