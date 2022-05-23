package com.puncix.darg.common.enchantments;

import com.puncix.darg.Darg;
import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.common.entity.entities.MedusaProjectileEntity;
import com.puncix.darg.common.entity.entities.StaffOfExheristaffProjectileEntity;
import com.puncix.darg.core.init.EffectInit;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class VolcanusBodyEnchantment extends Enchantment {
    public VolcanusBodyEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);
    }

    @Override
    public boolean canVillagerTrade() {
        return false;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return false;
    }

    @Override
    public void onUserHurt(LivingEntity user, Entity attacker, int level) {
        if(user.isAlive()){
            user.addPotionEffect( new EffectInstance(Effects.FIRE_RESISTANCE.getEffect(), 1000 , 3, true, false));
        }
        super.onUserHurt(user, attacker, level);
    }

    @Override
    protected boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench);
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        super.onEntityDamaged(user, target, level);
    }


    @Override
    public boolean canApply(ItemStack stack) {
        return stack == ItemInit.CORRUPTED_EYE_OF_ZELOTH.get().getDefaultInstance();
    }


}
