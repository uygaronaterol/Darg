package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.MoglingEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import com.puncix.darg.common.entity.model.MoglingModel;
import com.puncix.darg.common.entity.model.ZorbigModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ZorbigRenderer extends MobRenderer<ZorbigEntity, ZorbigModel<ZorbigEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/zorbig.png");

    public ZorbigRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ZorbigModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(ZorbigEntity entity) {
        return TEXTURE;
    }
}