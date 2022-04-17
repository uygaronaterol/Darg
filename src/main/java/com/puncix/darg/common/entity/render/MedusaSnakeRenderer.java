package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.MedusaEntity;
import com.puncix.darg.common.entity.entities.MedusaSnakeEntity;
import com.puncix.darg.common.entity.model.MedusaModel;
import com.puncix.darg.common.entity.model.MedusaSnakeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MedusaSnakeRenderer extends MobRenderer<MedusaSnakeEntity, MedusaSnakeModel<MedusaSnakeEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/medusa_snake.png");

    public MedusaSnakeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MedusaSnakeModel(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(MedusaSnakeEntity entity) {
        return TEXTURE;
    }
}