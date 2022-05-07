package com.puncix.darg.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class WolfyreHand extends Item {


    public WolfyreHand(Properties properties) {
        super(properties);
    }


    @Override
    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
        if( entity.isAlive()) {
            entity.attackEntityFrom(DamageSource.causeIndirectDamage(player, (LivingEntity)entity), 20);
        }
        player.getCooldownTracker().setCooldown(this, 100);

        return false;
    }

}
