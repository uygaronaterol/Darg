package com.puncix.darg.common.entity.entities;

import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;


public class ExheristaffEntity extends CreatureEntity{
    public ExheristaffEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }



    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 1000.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.4D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 20.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 55.0D)
                .createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS)
                .createMutableAttribute(Attributes.ARMOR, 20D )
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 9999D);
    }



    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal( 1, new MeleeAttackGoal(this, 0.6, true));

        this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 50F));
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
        return 3 ;
    }



    @Override
    protected SoundEvent getAmbientSound()
    {
        double rand = Math.random();
        if(rand <= 0.2) {
            return ModSoundEvents.EXHERISTAFF_AMBIENT1.get();
        }
        else if( 0.2 < rand && rand <= 0.4){
            return ModSoundEvents.EXHERISTAFF_AMBIENT2.get();

        }
        else if( 0.4 < rand && rand <= 0.6){
            return ModSoundEvents.EXHERISTAFF_AMBIENT3.get();

        }
        else if( 0.8 < rand && rand <= 0.8){
            return ModSoundEvents.EXHERISTAFF_AMBIENT4.get();

        }
        else{
            if(this.getAttackTarget() != null) {
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());

            }
            return SoundEvents.WEATHER_RAIN_ABOVE;

        }
    }


    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSoundEvents.EXHERISTAFF_DEATH.get();

    }



    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        double rand = Math.random();
        if(rand <= 0.5) {
            return ModSoundEvents.EXHERISTAFF_HIT1.get();
        }
        else {
            return ModSoundEvents.EXHERISTAFF_HIT2.get();

        }
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
                ((LivingEntity)entityIn).addPotionEffect(new EffectInstance(Effects.SLOWNESS, 50,3));
                ((LivingEntity)entityIn).addPotionEffect(new EffectInstance(Effects.NAUSEA, 50));
            }
            return true;
        }
    }
    public void attackEntityWithRangedAttack(LivingEntity target) {

        this.getEntity().setInvulnerable(true);

        double d0 = target.getPosX() - this.getPosX();
        double d1 = target.getPosYHeight(0.3333333333333333D) - this.getPosY() ;
        double d2 = target.getPosZ() - this.getPosZ();
        double d3 = (double)MathHelper.sqrt(d0 * d0 + d2 * d2);
        ExheristaffProjectileEntity soepe = new ExheristaffProjectileEntity(this, this.world);
        soepe.setItem(ItemInit.CORRUPTED_EYE_OF_EXHERISTAFF.get().getDefaultInstance());
        //soepe.shoot( playerIn.rotationPitch, playerIn.rotationYaw, playerIn.rotationYawHead, 1.5F, 1.0F);
        soepe.shoot( d0, d1 + d3 * (double)0.2F - 2, d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
        this.playSound(ModSoundEvents.EXHERISTAFF_ANIMATION.get(), 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.world.addEntity(soepe);
        double rand = Math.random();
        if( rand < 0.25){
            this.getEntity().setInvulnerable(true);
        }
    }


}
