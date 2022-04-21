package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.DarbigEntity;
import com.puncix.darg.common.entity.entities.EaterEntity;
import com.puncix.darg.common.entity.entities.MoglingEntity;
import com.puncix.darg.common.entity.model.DarbigModel;
import com.puncix.darg.common.entity.model.EaterModel;
import com.puncix.darg.common.entity.model.MoglingModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EaterRenderer extends MobRenderer<EaterEntity, EaterModel<EaterEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/eater.png");

    public EaterRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new EaterModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(EaterEntity entity) {
        return TEXTURE;
    }
}