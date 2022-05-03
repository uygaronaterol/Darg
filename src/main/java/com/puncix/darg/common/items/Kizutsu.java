package com.puncix.darg.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class Kizutsu extends SwordItem {
    public Kizutsu(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if( Math.random() > 0.6) {
            attacker.setHealth((float) (attacker.getHealth() + Math.random()));
        }
        return super.hitEntity(stack, target, attacker);
    }

}
