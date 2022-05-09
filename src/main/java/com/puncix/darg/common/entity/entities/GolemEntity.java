package com.puncix.darg.common.entity.entities;

import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class GolemEntity extends CreatureEntity {
    public GolemEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 4.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 35.0D);
    }



    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal( 1, new NearestAttackableTargetGoal<>( this, PlayerEntity.class, true ) );
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 0.2D, false));
        this.goalSelector.addGoal(0, new SwimGoal(this));
        //this.goalSelector.addGoal(4, new FollowMobGoal(this,0.6D,0F,1F));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setCallsForHelp(ZombifiedPiglinEntity.class));

        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, TurtleEntity.class, 10, true, false, TurtleEntity.TARGET_DRY_BABY));
    }

    @Override
    public boolean attackable() {

        return super.attackable();
    }
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player)
    {
        return 3 ;
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        if(this.getAttackTarget() != null) {
            attackEntityWithRangedAttack(this.getAttackTarget());
            return ModSoundEvents.GOLEM_AMBIENT.get();
        }
        return ModSoundEvents.GOLEM_AMBIENT.get();

    }


    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSoundEvents.GOLEM_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return ModSoundEvents.GOLEM_HIT.get();
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        if (!super.attackEntityAsMob(entityIn)) {
            return false;
        } else {
            if (entityIn instanceof LivingEntity) {
                ((LivingEntity)entityIn).addPotionEffect(new EffectInstance(Effects.SLOWNESS, 35,3));
            }
            return true;
        }
    }
    public void attackEntityWithRangedAttack(LivingEntity target) {

        this.getEntity().setInvulnerable(true);

        double d0 = target.getPosX() - this.getPosX();
        double d1 = target.getPosYHeight(0.3333333333333333D) - this.getPosY() ;
        double d2 = target.getPosZ() - this.getPosZ();
        double d3 = (double) MathHelper.sqrt(d0 * d0 + d2 * d2);
        ExheristaffProjectileEntity soepe = new ExheristaffProjectileEntity(this, this.world);
        soepe.setItem(ItemInit.GOLEM_ESSENCE.get().getDefaultInstance());
        //soepe.shoot( playerIn.rotationPitch, playerIn.rotationYaw, playerIn.rotationYawHead, 1.5F, 1.0F);
        soepe.shoot( d0, d1 + d3 * (double)0.2F - 2, d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
        this.world.addEntity(soepe);
        double rand = Math.random();
        if( rand < 0.25){
            this.getEntity().setInvulnerable(true);
        }
    }
}