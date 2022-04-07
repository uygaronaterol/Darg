package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedCowEntity;
import com.puncix.darg.common.entity.model.CorruptedCowModel;
import net.minecraft.client.renderer.entity.CowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.util.ResourceLocation;

public class CorruptedCowRenderer extends MobRenderer<CorruptedCowEntity, CorruptedCowModel<CorruptedCowEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/corrupted_cow.png");

    public CorruptedCowRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CorruptedCowModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(CorruptedCowEntity entity) {
        return TEXTURE;
    }
}
