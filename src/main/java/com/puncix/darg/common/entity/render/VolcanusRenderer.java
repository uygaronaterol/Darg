package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.VarzakEntity;
import com.puncix.darg.common.entity.entities.VolcanusEntity;
import com.puncix.darg.common.entity.entities.WolfyreEntity;
import com.puncix.darg.common.entity.entities.ZorbigEntity;
import com.puncix.darg.common.entity.model.VarzakModel;
import com.puncix.darg.common.entity.model.VolcanusModel;
import com.puncix.darg.common.entity.model.WolfyreModel;
import com.puncix.darg.common.entity.model.ZorbigModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class VolcanusRenderer extends MobRenderer<VolcanusEntity, VolcanusModel<VolcanusEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/volcanus.png");

    public VolcanusRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new VolcanusModel<>(), 1.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(VolcanusEntity entity) {
        return TEXTURE;
    }
}