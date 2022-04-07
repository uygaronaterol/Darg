package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.CorruptedPigEntity;
import com.puncix.darg.common.entity.entities.CorruptedSheepEntity;
import com.puncix.darg.common.entity.layers.CorruptedSheepWoolLayer;
import com.puncix.darg.common.entity.model.CorruptedPigModel;
import com.puncix.darg.common.entity.model.CorruptedSheepModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.SheepRenderer;
import net.minecraft.client.renderer.entity.layers.SheepWoolLayer;
import net.minecraft.util.ResourceLocation;

public class CorruptedSheepRenderer extends MobRenderer<CorruptedSheepEntity, CorruptedSheepModel<CorruptedSheepEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/corrupted_sheep.png");

    public CorruptedSheepRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CorruptedSheepModel<>(), 0.5F);
        this.addLayer(new CorruptedSheepWoolLayer(this));
    }
    @Override
    public ResourceLocation getEntityTexture(CorruptedSheepEntity entity) {
        return TEXTURE;
    }

}
