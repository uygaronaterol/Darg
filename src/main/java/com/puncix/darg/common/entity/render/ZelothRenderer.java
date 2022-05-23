package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import com.puncix.darg.common.entity.entities.WolfyreEntity;
import com.puncix.darg.common.entity.entities.ZelothEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import com.puncix.darg.common.entity.model.VarzakModel;
import com.puncix.darg.common.entity.model.WolfyreModel;
import com.puncix.darg.common.entity.model.ZelothModel;
import com.puncix.darg.common.entity.model.ZorbigModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ZelothRenderer extends MobRenderer<ZelothEntity, ZelothModel<ZelothEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/zeloth.png");

    public ZelothRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ZelothModel<>(), 0.6F);
    }
    @Override
    public ResourceLocation getEntityTexture(ZelothEntity entity) {
        return TEXTURE;
    }
}