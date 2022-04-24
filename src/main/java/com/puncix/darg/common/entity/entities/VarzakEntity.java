package com.puncix.darg.common.entity.entities;

import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class VarzakEntity extends CreatureEntity {
    public VarzakEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }


    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 1000.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.8D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 35.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 55.0D)
                .createMutableAttribute(Attributes.ZOMBIE_SPAWN_REINFORCEMENTS)
                .createMutableAttribute(Attributes.ARMOR, 25D )
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 9999D);
    }

    @Override
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return super.getStandingEyeHeight(poseIn, sizeIn);
    }

    @Override
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
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
        return 50 ;
    }



    @Override
    protected SoundEvent getAmbientSound()
    {
        double rand = Math.random();
        if(rand <= 0.2) {
            if(this.getAttackTarget() != null) {
                this.destroyBlocksInAABB(this.getBoundingBox());
            }
            return ModSoundEvents.EXHERISTAFF_AMBIENT1.get();
        }
        else if( 0.2 < rand && rand <= 0.4){
            if(this.getAttackTarget() != null) {
                this.destroyBlocksInAABB(this.getBoundingBox());
            }
            return ModSoundEvents.EXHERISTAFF_AMBIENT2.get();

        }
        else if( 0.4 < rand && rand <= 0.6){
            if(this.getAttackTarget() != null) {
                this.destroyBlocksInAABB(this.getBoundingBox());
            }
            return ModSoundEvents.EXHERISTAFF_AMBIENT3.get();

        }
        else if( 0.8 < rand && rand <= 0.8){
            if(this.getAttackTarget() != null) {
                this.destroyBlocksInAABB(this.getBoundingBox());
            }
            return ModSoundEvents.EXHERISTAFF_AMBIENT4.get();

        }
        else{
            if(this.getAttackTarget() != null) {
                teleportAttack();
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());
                attackEntityWithRangedAttack(this.getAttackTarget());
                this.destroyBlocksInAABB(this.getBoundingBox());

            }
            return SoundEvents.WEATHER_RAIN_ABOVE;

        }
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
                ((LivingEntity)entityIn).addPotionEffect(new EffectInstance(Effects.WITHER, 50));
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
    protected boolean teleportAttack() {
        if (!this.world.isRemote() && this.isAlive() && this.getAttackTarget() != null) {
            double d0 = this.getAttackTarget().getPosX() + (this.rand.nextDouble() - 0.5D) * 4.0D;
            double d1 = this.getAttackTarget().getPosY() ;
            double d2 = this.getAttackTarget().getPosZ() + (this.rand.nextDouble() - 0.5D) * 4.0D;

            return this.teleportTo(d0, d1, d2);
        } else {
            return false;
        }
    }
    private boolean teleportTo(double x, double y, double z) {
        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable(x, y, z);

        while(blockpos$mutable.getY() > 0 && !this.world.getBlockState(blockpos$mutable).getMaterial().blocksMovement()) {
            blockpos$mutable.move(Direction.DOWN);
        }

        BlockState blockstate = this.world.getBlockState(blockpos$mutable);
        boolean flag = blockstate.getMaterial().blocksMovement();
        boolean flag1 = blockstate.getFluidState().isTagged(FluidTags.WATER);
        if (flag && !flag1) {
            net.minecraftforge.event.entity.living.EnderTeleportEvent event = new net.minecraftforge.event.entity.living.EnderTeleportEvent(this, x, y, z, 0);
            if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return false;
            boolean flag2 = this.attemptTeleport(event.getTargetX(), event.getTargetY(), event.getTargetZ(), true);
            if (flag2 && !this.isSilent()) {
                this.world.playSound((PlayerEntity)null, this.prevPosX, this.prevPosY, this.prevPosZ, SoundEvents.ENTITY_ENDERMAN_TELEPORT, this.getSoundCategory(), 1.0F, 1.0F);
                this.playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
            }

            return flag2;
        } else {
            return false;
        }
    }
}