package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.DarbigEntity;
import com.puncix.darg.common.entity.entities.MoglingEntity;
import com.puncix.darg.common.entity.model.DarbigModel;
import com.puncix.darg.common.entity.model.MoglingModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DarbigRenderer extends MobRenderer<DarbigEntity, DarbigModel<DarbigEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/darbig.png");

    public DarbigRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DarbigModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(DarbigEntity entity) {
        return TEXTURE;
    }
}
