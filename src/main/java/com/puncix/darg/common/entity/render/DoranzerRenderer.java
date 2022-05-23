package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.*;
import com.puncix.darg.common.entity.model.*;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DoranzerRenderer extends MobRenderer<DoranzerEntity, DoranzerModel<DoranzerEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/doranzer.png");

    public DoranzerRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DoranzerModel<>(), 1.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(DoranzerEntity entity) {
        return TEXTURE;
    }
}