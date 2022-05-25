package com.puncix.darg.common.entity.entities;

import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.core.init.EntityTypeInit;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.command.impl.data.EntityDataAccessor;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.passive.horse.HorseEntity;
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
import net.minecraft.potion.Effects;
import net.minecraft.scoreboard.Team;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
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

public class TeenageDragonEntity extends TameableEntity implements IAnimatable {
    private AnimationFactory Factory = new AnimationFactory(this);
    protected static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(BabyDragonEntity.class, DataSerializers.BOOLEAN);
    private static final Predicate<LivingEntity> TARGET_ENTITIES = (p_213440_0_) -> {
        EntityType<?> entitytype = p_213440_0_.getType();
        return entitytype == EntityType.PLAYER || entitytype == EntityType.VILLAGER || entitytype == EntityType.SHEEP || entitytype == EntityType.PIG ||entitytype == EntityType.COW ||entitytype == EntityType.SALMON ||
                entitytype == EntityType.HORSE ||entitytype == EntityType.DONKEY ||entitytype == EntityType.CHICKEN ||entitytype == EntityTypeInit.MOGLING.get() ||entitytype == EntityTypeInit.ZORBIG.get() ||entitytype == EntityTypeInit.DARBIG.get() ||entitytype == EntityType.CAT ;
    };
    private static boolean shouldFly = false;
    private int counter = 0;
    public TeenageDragonEntity(EntityType<? extends TameableEntity> type, World worldIn) {
        super(type, worldIn);
        shouldFly = false;
    }


    @Override
    protected boolean canBeRidden(Entity entityIn) {
        return this.isTamed();
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
        this.goalSelector.addGoal( 5, new MeleeAttackGoal(this, 0.6, true));
        this.goalSelector.addGoal( 1, new SitGoal(this));
        this.goalSelector.addGoal( 2, new FollowOwnerGoal(this, 0.7,2,100,false));
        this.goalSelector.addGoal(10, new LookAtGoal(this, PlayerEntity.class, 50F));

        //this.goalSelector.addGoal(4, new FollowMobGoal(this,0.6D,0F,1F));
        if(!this.isTamed()) {
            this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false));
            this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
            this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, false));
            this.targetSelector.addGoal(7, new NearestAttackableTargetGoal<>(this, AnimalEntity.class, false));

        }
        else{
            this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
            this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
            this.targetSelector.addGoal(3,new NearestAttackableTargetGoal<>(this, MonsterEntity.class,false));
            this.targetSelector.removeGoal( new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false));
            this.targetSelector.removeGoal( new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
            this.targetSelector.removeGoal( new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, false));
            this.targetSelector.removeGoal( new NearestAttackableTargetGoal<>(this, AnimalEntity.class, false));
        }
    }
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 300.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 1.1D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 30.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 10000.0D)
                .createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS)
                .createMutableAttribute(Attributes.ARMOR, 15D )
                .createMutableAttribute(Attributes.FLYING_SPEED, 1.3F)
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 60D)
                ;
    }
    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public boolean shouldRiderSit() {
        return true;
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
    public Entity getControllingPassenger() {
        return this.getPassengers().isEmpty() ? null : this.getPassengers().get(0);
    }
    @Override
    public void travel(Vector3d travelVector) {
        if (this.isAlive()) {
            if (this.isBeingRidden() && this.isTamed()&& this.getControllingPassenger() != null) {
                LivingEntity livingentity = (LivingEntity)this.getControllingPassenger();
                this.rotationYaw = livingentity.rotationYaw;
                this.prevRotationYaw = this.rotationYaw;
                this.rotationPitch = livingentity.rotationPitch * 0.5F;
                this.setRotation(this.rotationYaw, this.rotationPitch);
                this.renderYawOffset = this.rotationYaw;
                this.rotationYawHead = this.renderYawOffset;
                float f = livingentity.moveStrafing * 0.5F;
                float f1 = livingentity.moveForward;
                float f2 = MathHelper.sin(this.rotationYaw * ((float)Math.PI / 180F));
                float f3 = MathHelper.cos(this.rotationYaw * ((float)Math.PI / 180F));




                if (this.getControllingPassenger()!= null && !this.isOnGround()) {
                    this.setAIMoveSpeed((float)this.getAttributeValue(Attributes.MOVEMENT_SPEED)*30);
                    super.travel(new Vector3d((double)f, -this.getPassengers().get(0).rotationPitch % 1, (double)f1));
                }else if (this.getControllingPassenger()!= null && this.isOnGround()) {
                    this.setAIMoveSpeed((float)this.getAttributeValue(Attributes.MOVEMENT_SPEED));
                    super.travel(new Vector3d((double)f, -this.getPassengers().get(0).rotationPitch % 1, (double)f1));
                }
                else if (livingentity instanceof PlayerEntity) {
                    this.setMotion(Vector3d.ZERO);
                }

                this.func_233629_a_(this, false);
            } else {
                super.travel(travelVector);
            }
        }

    }

    @Override
    public void tick() {
        super.tick();
        if (counter >= 30){
            counter = 0;
        }
        if(this.getAttackTarget() != null && !this.isTamed()) {
            if (this.getAttackTarget().getPosY() > this.getPosY() + 1 ) {
                this.setNoGravity(true);
                this.navigator.clearPath();
                this.getMoveHelper().setMoveTo(this.getAttackTarget().getPosX(), this.getPosY()+ 20,
                        this.getAttackTarget().getPosZ(), 1);
                this.setMoveVertical(0.2f);
//                this.getMoveHelper().setMoveTo(this.getAttackTarget().getPosX(), this.getPosY()+1,
//                        this.getAttackTarget().getPosZ(), 1);
            } else if (!this.isOnGround()  &&  this.getAttackTarget().getPosY()+ 4 < this.getPosY() && this.getControllingPassenger() == null) {
                this.setNoGravity(false);
                this.navigator.clearPath();
                this.setMoveVertical(0);
                shouldFly = false;
            }
        }

        if(this.getAttackTarget() != null && !this.isTamed()){
            this.destroyBlocksInAABB(this.getBoundingBox());

        }
        else if(this.getAttackTarget() == null && !this.isTamed()){
            shouldFly = true;
            this.setNoGravity(true);
        }

        if (shouldFly && moveController.isUpdating() && counter == 0 && this.getAttackTarget() == null){
            Random random = this.getRNG();
            double d0 = this.getPosX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 5.0F);
            double d1;
            if(this.getPosY() < 100 ) {
                d1 = this.getPosY() + (double) ((random.nextFloat() * 3F - 1.0F) * 5.0F);
            }
            else{
                d1 = this.getPosY() + (double) ((random.nextFloat() * 1F - 1.0F) * 5.0F);
            }
            double d2 = this.getPosZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 5.0F);
            this.getMoveHelper().setMoveTo(d0, d1, d2, 1.0D);
            counter++;
        }
        else if(shouldFly && !moveController.isUpdating() && this.getAttackTarget() == null){

            Random random = this.getRNG();
            double d0 = this.getPosX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 5.0F);
            double d1;
            if(this.getPosY() < 100 ) {
                d1 = this.getPosY() + (double) ((random.nextFloat() * 3F - 1.0F) * 5.0F);
            }
            else{
                d1 = this.getPosY() + (double) ((random.nextFloat() * 1F - 1.0F) * 5.0F);
            }
            double d2 = this.getPosZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 5.0F);
            this.getMoveHelper().setMoveTo(d0, d1, d2, 1.0D);
            counter++;
        }
        counter++;

    }
    private boolean destroyBlocksInAABB(AxisAlignedBB area) {
        int i = MathHelper.floor(area.minX - 1);
        int j = MathHelper.floor(area.minY );
        int k = MathHelper.floor(area.minZ - 1);
        int l = MathHelper.floor(area.maxX + 1);
        int i1 = MathHelper.floor(area.maxY +1);
        int j1 = MathHelper.floor(area.maxZ + 1);
        boolean flag = false;
        boolean flag1 = false;

        for(int k1 = i; k1 <= l; ++k1) {
            for(int l1 = j; l1 <= i1; ++l1) {
                for(int i2 = k; i2 <= j1; ++i2) {
                    BlockPos blockpos = new BlockPos(k1, l1, i2);
                    BlockState blockstate = this.world.getBlockState(blockpos);
                    Block block = blockstate.getBlock();
                    if (!blockstate.isAir(this.world, blockpos) && blockstate.getMaterial() != Material.FIRE) {
                        if (net.minecraftforge.common.ForgeHooks.canEntityDestroy(this.world, blockpos, this) && !BlockTags.DRAGON_IMMUNE.contains(block)) {
                            flag1 = this.world.removeBlock(blockpos, false) || flag1;
                        } else {
                            flag = true;
                        }
                    }
                }
            }
        }

        if (flag1) {
            BlockPos blockpos1 = new BlockPos(i + this.rand.nextInt(l - i + 1), j + this.rand.nextInt(i1 - j + 1), k + this.rand.nextInt(j1 - k + 1));
            this.world.playEvent(2008, blockpos1, 0);
        }

        return flag;
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
    public ActionResultType tame(PlayerEntity player, Hand hand){
        if (this.world.isRemote) {

            return ActionResultType.CONSUME;
        } else {
            if (!player.abilities.isCreativeMode) {
            }
            if (!ForgeEventFactory.onAnimalTame(this, player)) {
                super.setTamedBy(player);
                this.navigator.clearPath();
                this.setAttackTarget(null);
                this.world.setEntityState(this, (byte)7);
                this.setSitting(!isQueuedToSit());
                this.registerGoals();

            }

            return ActionResultType.SUCCESS;
        }
    }
    @Override
    public ActionResultType getEntityInteractionResult(PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        Item item = itemstack.getItem();


        if(isTamed() && !this.world.isRemote && hand == Hand.MAIN_HAND && item == ItemInit.DRAGON_COMMANDER.get()) {
            ActionResultType actionresulttype = super.getEntityInteractionResult(player, hand);

            if ((!actionresulttype.isSuccessOrConsume() || this.isOwner(player) )&& shouldFly ) {
                shouldFly = false;
                this.setNoGravity(false);
                this.setSitting(!isQueuedToSit());
                this.isJumping = false;
                this.navigator.clearPath();
                this.setAttackTarget((LivingEntity)null);
                return ActionResultType.SUCCESS;
            }else if ((!actionresulttype.isSuccessOrConsume() || this.isOwner(player) )&& !shouldFly && !this.isQueuedToSit()) {
                this.setNoGravity(true);
                this.setSitting(false);
                this.isJumping = false;
                this.navigator.clearPath();
                this.setAttackTarget((LivingEntity)null);
                shouldFly = true;
                return ActionResultType.SUCCESS;
            }else if ((!actionresulttype.isSuccessOrConsume() || this.isOwner(player) )&& !shouldFly && this.isQueuedToSit()) {
                shouldFly = false;
                this.setNoGravity(false);
                this.setSitting(!isQueuedToSit());
                this.isJumping = false;
                this.navigator.clearPath();
                this.setAttackTarget((LivingEntity)null);
                return ActionResultType.SUCCESS;
            }
        }
        else if(item == Items.GOLDEN_APPLE && this.isTamed()){
            if (!player.abilities.isCreativeMode) {
                itemstack.shrink(1);
            }

            this.heal(20);
            return ActionResultType.SUCCESS;
        }
        else if(isTamed() && !this.world.isRemote && hand == Hand.MAIN_HAND && this.isOwner(player)){
            this.mountTo(player);

        }

//        if (itemstack.getItem() == itemForTaming) {
//            return ActionResultType.PASS;
//        }

        return super.getEntityInteractionResult(player, hand);
    }
    protected void mountTo(PlayerEntity player) {
        this.setNoGravity(true);
        this.setSitting(false);
        this.isJumping = false;
        this.navigator.clearPath();
        this.setAttackTarget((LivingEntity)null);
        shouldFly = false;
        if (!this.world.isRemote) {
            player.rotationYaw = this.rotationYaw;
            player.rotationPitch = this.rotationPitch;
            player.startRiding(this);

        }

    }

    public void attackEntityWithRangedAttack(LivingEntity target) {

        this.getEntity().setInvulnerable(true);

        double d0 = target.getPosX() - this.getPosX();
        double d1 = target.getPosYHeight(0.3333333333333333D) - this.getPosY() ;
        double d2 = target.getPosZ() - this.getPosZ();
        double d3 = (double)MathHelper.sqrt(d0 * d0 + d2 * d2);
        MedusaProjectileEntity soepe = new MedusaProjectileEntity(this, this.world);
        soepe.setItem(ItemInit.TEENAGE_DRAGON_PROJECTILE.get().getDefaultInstance());
        //soepe.shoot( playerIn.rotationPitch, playerIn.rotationYaw, playerIn.rotationYawHead, 1.5F, 1.0F);
        soepe.shoot( d0, d1 + d3 * (double)0.2F , d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
        this.world.addEntity(soepe);
        double rand = Math.random();
        if( rand < 0.25){
            this.getEntity().setInvulnerable(true);
        }
    }
    @Override
    protected SoundEvent getAmbientSound() {
        double rand = Math.random();
        if (rand <= 0.3) {
            playSound(ModSoundEvents.TEENAGE_DRAGON_AMBIENT1.get(), 1, 1);
            return ModSoundEvents.SILENCE.get();
        }
        else {
            if(this.getAttackTarget() != null) {
                playSound(ModSoundEvents.TEENAGE_DRAGON_AMBIENT2.get(), 1, 1);
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());

            }
            else{
                playSound(ModSoundEvents.SILENCE.get(), 2, 1);
                return ModSoundEvents.SILENCE.get();
            }
        }
        return ModSoundEvents.SILENCE.get();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        playSound(ModSoundEvents.TEENAGE_DRAGON_HIT.get(), 1, 1);

        return super.getHurtSound(damageSourceIn);
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        playSound(ModSoundEvents.TEENAGE_DRAGON_HIT.get(), 2, 1);
        return super.getDeathSound();
    }


}
