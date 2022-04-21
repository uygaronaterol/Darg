package com.puncix.darg.common.enchantments;

import com.puncix.darg.Darg;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class MedusaPoisonEnchantment extends Enchantment {
    public MedusaPoisonEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
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
    protected boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench);
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        if( target.isAlive()){
            LivingEntity entity = (LivingEntity) target;

            entity.addPotionEffect( new EffectInstance(Effects.POISON.getEffect(), 100 , 3, true, false));
        }
        super.onEntityDamaged(user, target, level);
    }

    @Override
    public boolean canApply(ItemStack stack) {
        return stack == ItemInit.CORRUPTED_EYE_OF_MEDUSA.get().getDefaultInstance();
    }


}
