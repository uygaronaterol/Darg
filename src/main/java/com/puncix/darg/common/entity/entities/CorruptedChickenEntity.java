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
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CorruptedChickenEntity extends ChickenEntity {
    public CorruptedChickenEntity(EntityType<? extends ChickenEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.80D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 3.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 30.0D)
                .createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS);
    }



    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal( 1, new NearestAttackableTargetGoal<>( this, PlayerEntity.class, true ) );
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 0.5D, false));
        this.goalSelector.addGoal(0, new SwimGoal(this));
        //this.goalSelector.addGoal(4, new FollowMobGoal(this,0.6D,0F,1F));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setCallsForHelp(ZombifiedPiglinEntity.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, TurtleEntity.class, 10, true, false, TurtleEntity.TARGET_DRY_BABY));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player)
    {
        return 1 ;
    }
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        return ModSoundEvents.CORRUPTED_CHICKEN_AMBIENT.get();
    }


    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSoundEvents.CORRUPTED_CHICKEN_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return ModSoundEvents.CORRUPTED_CHICKEN_HIT.get();
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
        this.playSound(ModSoundEvents.CORRUPTED_COW_STEP.get(), 0.10F, 0.5F);
    }



    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        if (!super.attackEntityAsMob(entityIn)) {
            return false;
        } else {
            if (entityIn instanceof LivingEntity) {

            }
            return true;
        }
    }

}
