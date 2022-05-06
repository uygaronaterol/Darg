package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import com.puncix.darg.common.entity.entities.WolfyreEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import com.puncix.darg.common.entity.model.VarzakModel;
import com.puncix.darg.common.entity.model.WolfyreModel;
import com.puncix.darg.common.entity.model.ZorbigModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WolfyreRenderer extends MobRenderer<WolfyreEntity, WolfyreModel<WolfyreEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/wolfyre.png");

    public WolfyreRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new WolfyreModel<>(), 1.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(WolfyreEntity entity) {
        return TEXTURE;
    }
}