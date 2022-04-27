package com.puncix.darg.common.entity.entities;


import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;

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

public class DwarfEntity extends CreatureEntity {
    public DwarfEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }
    public boolean thisHasCorruptedStonePickaxe = false;
    public boolean thisHasCorruptedBonePickaxe = false;
    public boolean thisHasCorruptionPickaxe = false;

    public int counter = 0;
    @Override
    protected void updateAITasks() {
        super.updateAITasks();
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 20D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.4D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 1.5D)
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
            }else if ( this.counter == 0) {
                if (itemstack.getItem() == ItemInit.CORRUPTED_STONE_PICKAXE.get()) {
                    itemstack.shrink(1);
                    thisHasCorruptedStonePickaxe = true;
                    counter++;
                    return ActionResultType.CONSUME;
                } else if (itemstack.getItem() == ItemInit.CORRUPTED_BONE_PICKAXE.get()) {
                    itemstack.shrink(1);
                    thisHasCorruptedBonePickaxe = true;
                    counter++;
                    return ActionResultType.CONSUME;
                }else if (itemstack.getItem() == ItemInit.CORRUPTION_PICKAXE.get()) {
                    itemstack.shrink(1);
                    thisHasCorruptionPickaxe = true;
                    counter++;
                    return ActionResultType.CONSUME;
                }
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
        if(this.thisHasCorruptedStonePickaxe){
            counter++;
            double rand = Math.random();
            if(rand <= 0.9) {
                this.entityDropItem(Items.STONE.asItem());
            }
            else if( 0.9 < rand && rand <= 0.98){
                this.entityDropItem(Items.IRON_INGOT.asItem());
            }
            else if( 0.98 < rand && rand <= 0.99){
                this.entityDropItem(Items.GOLD_INGOT.asItem());
            } else{
                this.entityDropItem(Items.DIAMOND.asItem());

            }
            if(counter == 151){
                this.thisHasCorruptedStonePickaxe = false;
                counter = 0;
                return SoundEvents.ENTITY_ITEM_BREAK;
            }
            return SoundEvents.BLOCK_ANVIL_BREAK;
        }else if(this.thisHasCorruptedBonePickaxe){
            counter++;
            double rand = Math.random();
            if(rand <= 0.89) {
                this.entityDropItem(Items.STONE.asItem());
            }
            else if( 0.89 < rand && rand <= 0.975){
                this.entityDropItem(Items.IRON_INGOT.asItem());
            }
            else if( 0.975 < rand && rand <= 0.985){
                this.entityDropItem(Items.GOLD_INGOT.asItem());
            } else if( 0.985 < rand && rand <= 0.995){
                this.entityDropItem(Items.DIAMOND.asItem());

            }else{
                this.entityDropItem(Items.ANCIENT_DEBRIS.asItem());
            }
            if(counter == 751){
                this.thisHasCorruptedBonePickaxe = false;
                counter = 0;
                return SoundEvents.ENTITY_ITEM_BREAK;
            }
            return SoundEvents.BLOCK_ANVIL_BREAK;

        }else if(this.thisHasCorruptionPickaxe){
            counter++;
            double rand = Math.random();
            if(rand <= 0.89) {
                this.entityDropItem(Items.STONE.asItem());
            }
            else if( 0.8 < rand && rand <= 0.9){
                this.entityDropItem(Items.IRON_INGOT.asItem());
            }
            else if( 0.9 < rand && rand <= 0.95){
                this.entityDropItem(Items.GOLD_INGOT.asItem());
            } else if( 0.95 < rand && rand <= 0.985){
                this.entityDropItem(Items.DIAMOND.asItem());

            }else if( 0.985 < rand && rand <= 0.995){
                this.entityDropItem(Items.ANCIENT_DEBRIS.asItem());
            }else{
                this.entityDropItem(ItemInit.CORRUPTION.get());

            }
            if(counter == 751){
                this.thisHasCorruptionPickaxe = false;
                counter = 0;
                return SoundEvents.ENTITY_ITEM_BREAK;
            }
            return SoundEvents.BLOCK_ANVIL_BREAK;
        }
        return ModSoundEvents.DWARF_AMBIENT.get();
    }


    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSoundEvents.DWARF_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return ModSoundEvents.DWARF_HIT.get();
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
        this.playSound(ModSoundEvents.CORRUPTED_COW_STEP.get(), 0.10F, 0.5F);
    }




}
