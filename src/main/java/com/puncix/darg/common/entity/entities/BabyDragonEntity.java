package com.puncix.darg.common.entity.entities;

import com.puncix.darg.core.init.EntityTypeInit;
import net.minecraft.command.impl.data.EntityDataAccessor;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.datasync.DataSerializers;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.FlyingMovementController;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.ForgeEventFactory;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.Random;
import java.util.function.Predicate;

public class BabyDragonEntity extends TameableEntity implements IAnimatable {
    private AnimationFactory Factory = new AnimationFactory(this);
    protected static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(BabyDragonEntity.class, DataSerializers.BOOLEAN);
    public static final Predicate<LivingEntity> TARGET_ENTITIES = (p_213440_0_) -> {
        EntityType<?> entitytype = p_213440_0_.getType();
        return entitytype == EntityType.PLAYER || entitytype == EntityType.VILLAGER || entitytype == EntityType.SHEEP || entitytype == EntityType.PIG ||entitytype == EntityType.COW ||entitytype == EntityType.SALMON ||
                entitytype == EntityType.HORSE ||entitytype == EntityType.DONKEY ||entitytype == EntityType.CHICKEN ||entitytype == EntityTypeInit.MOGLING.get() ||entitytype == EntityTypeInit.ZORBIG.get() ||entitytype == EntityTypeInit.DARBIG.get() ||entitytype == EntityType.CAT ;
    };
    public BabyDragonEntity(EntityType<? extends TameableEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected boolean canBeRidden(Entity entityIn) {
        return false;
    }

    @Override
    public boolean canBeLeashedTo(PlayerEntity player) {
        return false;
    }



    @Override
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
    }
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal( 2, new MeleeAttackGoal(this, 0.6, true));
        this.goalSelector.addGoal( 1, new SitGoal(this));
        this.goalSelector.addGoal( 2, new FollowOwnerGoal(this, 0.7,2,100,false));

        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 50F));
        this.goalSelector.addGoal(10,new BabyDragonEntity.RandomFlyGoal(this));
        //this.goalSelector.addGoal(4, new FollowMobGoal(this,0.6D,0F,1F));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setCallsForHelp(ZombifiedPiglinEntity.class));
        this.targetSelector.addGoal(2, new NonTamedTargetGoal<>(this, PlayerEntity.class, true,TARGET_ENTITIES));
        this.targetSelector.addGoal(3, new NonTamedTargetGoal<>(this, AbstractVillagerEntity.class, false,TARGET_ENTITIES));
        this.targetSelector.addGoal(3, new NonTamedTargetGoal<>(this, IronGolemEntity.class, true,TARGET_ENTITIES));
        this.targetSelector.addGoal(5, new NonTamedTargetGoal<>(this, TurtleEntity.class, true,TARGET_ENTITIES));
    }
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 40.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.6D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 3.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 80.0D)
                .createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS)
                .createMutableAttribute(Attributes.ARMOR, 5D )
                .createMutableAttribute(Attributes.FLYING_SPEED, 0.8F)
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0D)
                ;
    }
    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }



    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()&& this.isOnGround() && !this.isQueuedToSit()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
            return PlayState.CONTINUE;
        }
        else if (event.isMoving()&& !this.isOnGround() && !this.isQueuedToSit()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("fly", true));
            return PlayState.CONTINUE;
        }
        else if( this.isQueuedToSit()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("sit", true));
            return PlayState.CONTINUE;

        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("sit", true));

        return PlayState.CONTINUE;
    }

    @Override
    public boolean onLivingFall(float distance, float damageMultiplier) {
        return false;
    }

    @Override
    protected int calculateFallDamage(float distance, float damageMultiplier) {
        return 0;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.Factory;
    }

    @Nullable
    @Override
    public AgeableEntity createChild(ServerWorld world, AgeableEntity mate) {
        return null;
    }

    static class RandomFlyGoal extends Goal {
        private final BabyDragonEntity parentEntity;

        public RandomFlyGoal(BabyDragonEntity ghast) {
            this.parentEntity = ghast;
            this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */

        public boolean shouldExecute() {
            MovementController movementcontroller = this.parentEntity.getMoveHelper();
            if (!movementcontroller.isUpdating()) {
                return true;
            } else {
                double d0 = movementcontroller.getX() - this.parentEntity.getPosX();
                double d1 = movementcontroller.getY() - this.parentEntity.getPosY();
                double d2 = movementcontroller.getZ() - this.parentEntity.getPosZ();
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                return d3 < 1.0D || d3 > 3600.0D;
            }
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean shouldContinueExecuting() {
            return false;
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void startExecuting() {
            Random random = this.parentEntity.getRNG();
            double d0 = this.parentEntity.getPosX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d1 = this.parentEntity.getPosY() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d2 = this.parentEntity.getPosZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            this.parentEntity.getMoveHelper().setMoveTo(d0, d1, d2, 0.7D);
        }
    }

    @Override
    protected void registerData() {
        super.registerData();
        this.dataManager.register(SITTING,false);
    }

//    @Override
//    public boolean isQueuedToSit() {
//        //return this.dataManager.get(SITTING);
//        return super.isQueuedToSit();
//    }
//
//    @Override
//    public void setSitting(boolean p_233687_1_) {
//        this.dataManager.register(SITTING,p_233687_1_);
//        this.setQueuedToSit(p_233687_1_);
//    }

    @Override
    public Team getTeam() {
        return super.getTeam();
    }



    @Override
    public void tick() {
        super.tick();
        if(this.getAttackTarget() == null){
        }
        else{
            this.setNoGravity(false);
        }
    }

    @Override
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        setSitting(compound.getBoolean("isSitting"));
    }

    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        compound.putBoolean("isSitting",this.isQueuedToSit());
    }

    @Override
    public boolean isTamed() {
        return super.isTamed();
    }

    @Override
    public ActionResultType getEntityInteractionResult(PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        Item item = itemstack.getItem();

        Item itemForTaming = Items.APPLE;

        if (item == itemForTaming && !isTamed()) {
            if (this.world.isRemote) {

                return ActionResultType.CONSUME;
            } else {
                if (!player.abilities.isCreativeMode) {
                    itemstack.shrink(1);
                }
                if (!ForgeEventFactory.onAnimalTame(this, player)) {
                    super.setTamedBy(player);
                    this.navigator.clearPath();
                    this.setAttackTarget(null);
                    this.world.setEntityState(this, (byte)7);
                    this.setSitting(!isQueuedToSit());
                }

                return ActionResultType.SUCCESS;
            }
        }

        if(isTamed() && !this.world.isRemote && hand == Hand.MAIN_HAND) {
            ActionResultType actionresulttype = super.getEntityInteractionResult(player, hand);

            if ((!actionresulttype.isSuccessOrConsume() || this.isOwner(player))) {
                this.setNoGravity(false);
                this.setSitting(!isQueuedToSit());
                this.isJumping = false;
                this.navigator.clearPath();
                this.setAttackTarget((LivingEntity)null);
                return ActionResultType.SUCCESS;
            }
        }

        if (itemstack.getItem() == itemForTaming) {
            return ActionResultType.PASS;
        }

        return super.getEntityInteractionResult(player, hand);
    }
}
