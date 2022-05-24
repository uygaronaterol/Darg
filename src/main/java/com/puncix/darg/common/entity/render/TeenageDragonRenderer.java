package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.BabyDragonEntity;
import com.puncix.darg.common.entity.entities.TeenageDragonEntity;
import com.puncix.darg.common.entity.model.BabyDragonModel;
import com.puncix.darg.common.entity.model.TeenageDragonModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TeenageDragonRenderer extends GeoEntityRenderer<TeenageDragonEntity> {
    public TeenageDragonRenderer(EntityRendererManager renderManager) {
        super(renderManager, new TeenageDragonModel());
        this.shadowSize = 0.2f;
    }

    @Override
    public ResourceLocation getEntityTexture(TeenageDragonEntity entity) {
        return new ResourceLocation(Darg.MOD_ID, "textures/entity/teenage_dragon.png");
    }


}
