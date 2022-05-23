package com.puncix.darg.common.entity.model;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.BabyDragonEntity;
import com.puncix.darg.common.entity.entities.JuvenileDragonEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JuvenileDragonModel extends AnimatedGeoModel<JuvenileDragonEntity> {
    @Override
    public ResourceLocation getModelLocation(JuvenileDragonEntity juvenileDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "geo/juvenile_dragon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(JuvenileDragonEntity juvenileDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "textures/entity/juvenile_dragon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(JuvenileDragonEntity juvenileDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "animations/juvenile_dragon.animation.json");
    }
}
