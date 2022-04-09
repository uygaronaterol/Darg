package com.puncix.darg.common.entity.entities;

import com.puncix.darg.client.util.ModSoundEvents;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GoldLayingChickenEntity extends ChickenEntity {
    public GoldLayingChickenEntity(EntityType<? extends ChickenEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.80D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 3.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 30.0D);
    }



    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
       }

    @Override
    protected int getExperiencePoints(PlayerEntity player)
    {
        return 1 ;
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        double rand = Math.random();
        if(rand <= 0.90) {
            return SoundEvents.ENTITY_CHICKEN_AMBIENT;
        }
        else if( 0.9 < rand && rand <= 0.99){
            this.entityDropItem(Items.GOLD_INGOT.asItem());
            return ModSoundEvents.EGG_LAYING_SOUND.get();

        }
        else{
            this.entityDropItem(Items.GOLD_BLOCK.asItem());
            return ModSoundEvents.EGG_LAYING_SOUND.get();
        }

    }


    @Override
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_CHICKEN_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.ENTITY_CHICKEN_HURT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
        this.playSound(SoundEvents.ENTITY_CHICKEN_STEP, 0.10F, 0.5F);
    }





}