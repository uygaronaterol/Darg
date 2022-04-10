package com.puncix.darg.common.entity.entities;


import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinAction;
import net.minecraft.entity.monster.piglin.PiglinTasks;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class ZorbigEntity extends CreatureEntity {
    public ZorbigEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void updateAITasks() {
        super.updateAITasks();
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 5D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.4D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 0.5D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 40.0D);
    }

    @Override
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
    }

    @Override
    public ResourceLocation getLootTable() {
        return this.getType().getLootTable();
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(4, new FollowMobGoal(this,0.6D,0F,1F));
    }
    public ActionResultType getEntityInteractionResult(PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        if (itemstack.getItem() == Items.LEAD && this.canBeLeashedTo(player)) {
            this.setLeashHolder(player, true);
            itemstack.shrink(1);
            return ActionResultType.func_233537_a_(this.world.isRemote);
        } else {
            if (itemstack.getItem() == Items.NAME_TAG) {
                ActionResultType actionresulttype = itemstack.interactWithEntity(player, this, hand);
                if (actionresulttype.isSuccessOrConsume()) {
                    return actionresulttype;
                }
            }

            if (itemstack.getItem() instanceof SpawnEggItem) {
                if (this.world instanceof ServerWorld) {
                    SpawnEggItem spawneggitem = (SpawnEggItem)itemstack.getItem();
                    Optional<MobEntity> optional = spawneggitem.getChildToSpawn(player, this, (EntityType)this.getType(), (ServerWorld)this.world, this.getPositionVec(), itemstack);
                    optional.ifPresent((p_233658_2_) -> {
                        this.onChildSpawnFromEgg(player, p_233658_2_);
                    });
                    return optional.isPresent() ? ActionResultType.SUCCESS : ActionResultType.PASS;
                } else {
                    return ActionResultType.CONSUME;
                }
            } else if(itemstack.getItem() == ItemInit.BETTER_MOGLING_FOOD.get()) {
                double rand = Math.random();
                itemstack.shrink(1);
                if(rand <= 0.3) {
                    this.entityDropItem(Items.BLAZE_POWDER.asItem());
                }
                else if( 0.3 < rand && rand <= 0.5){
                    this.entityDropItem(Items.IRON_INGOT.asItem());
                }
                else if( 0.5 < rand && rand <= 0.7){
                    this.entityDropItem(Items.BEE_SPAWN_EGG.asItem());
                }
                else if( 0.7 < rand && rand <= 0.9){
                    this.entityDropItem(Items.NETHER_WART.asItem());
                }
                else if( 0.9 < rand && rand <= 0.99){
                    this.entityDropItem(Items.GOLD_INGOT.asItem());

                }else {
                    this.entityDropItem(ItemInit.GOLD_LAYING_CHICKEN_SPAWN_EGG.get());

                }
                return ActionResultType.CONSUME;
            }
            return ActionResultType.CONSUME;

        }
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player)
    {
        return 1 ;
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        return ModSoundEvents.MOGLING_AMBIENT.get();
    }


    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSoundEvents.MOGLING_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return ModSoundEvents.MOGLING_HIT.get();
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
        this.playSound(ModSoundEvents.CORRUPTED_COW_STEP.get(), 0.10F, 0.5F);
    }




}
