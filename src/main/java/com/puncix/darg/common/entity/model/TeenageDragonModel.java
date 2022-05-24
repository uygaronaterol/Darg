package com.puncix.darg.common.entity.model;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.BabyDragonEntity;
import com.puncix.darg.common.entity.entities.JuvenileDragonEntity;
import com.puncix.darg.common.entity.entities.TeenageDragonEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TeenageDragonModel extends AnimatedGeoModel<TeenageDragonEntity> {
    @Override
    public ResourceLocation getModelLocation(TeenageDragonEntity teenageDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "geo/teenage_dragon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TeenageDragonEntity teenageDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "textures/entity/teenage_dragon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TeenageDragonEntity teenageDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "animations/teenage_dragon.animation.json");
    }
}
