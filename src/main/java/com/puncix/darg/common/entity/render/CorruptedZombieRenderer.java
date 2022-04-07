package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedZombieEntity;
import com.puncix.darg.common.entity.model.CorruptedZombieModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CorruptedZombieRenderer extends MobRenderer<CorruptedZombieEntity, CorruptedZombieModel<CorruptedZombieEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/corrupted_zombie.png");

    public CorruptedZombieRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CorruptedZombieModel<>(), 0.6F);
    }
    @Override
    public ResourceLocation getEntityTexture(CorruptedZombieEntity entity) {
        return TEXTURE;
    }
}
