package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedPigEntity;
import com.puncix.darg.common.entity.entities.ExheristaffEntity;
import com.puncix.darg.common.entity.model.CorruptedPigModel;
import com.puncix.darg.common.entity.model.ExheristaffModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ExheristaffRenderer extends MobRenderer<ExheristaffEntity, ExheristaffModel<ExheristaffEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/exheristaff.png");

    public ExheristaffRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ExheristaffModel<>(), 2F);
    }
    @Override
    public ResourceLocation getEntityTexture(ExheristaffEntity entity) {
        return TEXTURE;
    }
}
