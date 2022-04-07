package com.puncix.darg.common.entity.entities;

import com.puncix.darg.core.init.EntityTypeInit;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class ExheristaffProjectileEntity extends ProjectileItemEntity {
    public ExheristaffProjectileEntity(EntityType<ExheristaffProjectileEntity> type, World worldIn) {
        super(type, worldIn);
    }
    public ExheristaffProjectileEntity(LivingEntity type, World worldIn) {
        super(EntityTypeInit.EXHERISTAFF_PROJECTILE_ENTITY.get(), type, worldIn);
    }
    public ExheristaffProjectileEntity(World worldIn, LivingEntity shooter, double accelX, double accelY, double accelZ) {
        super(EntityTypeInit.EXHERISTAFF_PROJECTILE_ENTITY.get(), accelX, accelY, accelZ, worldIn);
    }
    public ExheristaffProjectileEntity(double x, double y, double z, World world) {
        super(EntityTypeInit.EXHERISTAFF_PROJECTILE_ENTITY.get(), x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ItemInit.CORRUPTED_EYE_OF_EXHERISTAFF.get().asItem();
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void onImpact(RayTraceResult result) {
        if(result.getType() == RayTraceResult.Type.ENTITY) {
            Entity entity = ((EntityRayTraceResult)result).getEntity();
            int damage = 15;
            entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getShooter()), (float)damage);
        }
        if(!world.isRemote){
            this.remove();
        }
    }
}
