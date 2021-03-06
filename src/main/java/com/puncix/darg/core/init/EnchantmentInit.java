package com.puncix.darg.core.init;

import com.puncix.darg.Darg;
import com.puncix.darg.common.enchantments.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Darg.MOD_ID);
    public static final RegistryObject<Enchantment> MEDUSA_POISON
            = ENCHANTMENTS.register("medusa_poison", ()-> new MedusaPoisonEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
            new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> MEDUSA_TURN_STONE
            = ENCHANTMENTS.register("medusa_turn_stone", ()-> new MedusaTurnStoneEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
            new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> MANATONE_PARALYSIS
            = ENCHANTMENTS.register("manatone_paralysis", ()-> new ManatoneParalysisEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
            new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> BLEED
            = ENCHANTMENTS.register("bleed", ()-> new BleedEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
            new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> DJINNI
            = ENCHANTMENTS.register("djinni", ()-> new DjinniEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
            new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> TIME_FREEZE
            = ENCHANTMENTS.register("time_freeze", ()-> new DjinniEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
            new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> VOLCANUS_BODY
            = ENCHANTMENTS.register("volcanus_body", ()-> new VolcanusBodyEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST,
            new EquipmentSlotType[]{EquipmentSlotType.CHEST}));
}
