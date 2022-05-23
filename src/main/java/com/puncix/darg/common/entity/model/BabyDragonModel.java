package com.puncix.darg.common.entity.model;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.BabyDragonEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BabyDragonModel extends AnimatedGeoModel<BabyDragonEntity> {
    @Override
    public ResourceLocation getModelLocation(BabyDragonEntity babyDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "geo/baby_dragon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BabyDragonEntity babyDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "textures/entity/baby_dragon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BabyDragonEntity babyDragonEntity) {
        return new ResourceLocation(Darg.MOD_ID, "animations/baby_dragon.animation.json");
    }
}
