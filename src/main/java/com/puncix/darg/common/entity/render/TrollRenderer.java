package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.TrollEntity;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import com.puncix.darg.common.entity.model.TrollModel;
import com.puncix.darg.common.entity.model.VarzakModel;
import com.puncix.darg.common.entity.model.ZorbigModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TrollRenderer extends MobRenderer<TrollEntity, TrollModel<TrollEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/troll.png");

    public TrollRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TrollModel<>(), 0.8F);
    }
    @Override
    public ResourceLocation getEntityTexture(TrollEntity entity) {
        return TEXTURE;
    }
}