package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import com.puncix.darg.common.entity.model.VarzakModel;
import com.puncix.darg.common.entity.model.ZorbigModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class VarzakRenderer extends MobRenderer<VarzakEntity, VarzakModel<VarzakEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/varzak.png");

    public VarzakRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new VarzakModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(VarzakEntity entity) {
        return TEXTURE;
    }
}