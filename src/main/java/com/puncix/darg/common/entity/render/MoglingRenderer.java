package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.MoglingEntity;
import com.puncix.darg.common.entity.model.MoglingModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MoglingRenderer extends MobRenderer<MoglingEntity, MoglingModel<MoglingEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/mogling.png");

    public MoglingRenderer(EntityRendererManager renderManagerIn) {
            super(renderManagerIn, new MoglingModel<>(), 0.2F);
            }
    @Override
    public ResourceLocation getEntityTexture(MoglingEntity entity) {
            return TEXTURE;
    }
}
