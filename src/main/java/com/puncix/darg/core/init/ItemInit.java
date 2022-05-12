package com.puncix.darg.core.init;

import com.puncix.darg.Darg;
import com.puncix.darg.common.items.*;

import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create( ForgeRegistries.ITEMS, Darg.MOD_ID);
	//stick
	public static final RegistryObject<Item> CORRUPTED_STICK = ITEMS.register("corrupted_stick", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	//boss items
	public static final RegistryObject<CorruptedEyeOfExheristaff> CORRUPTED_EYE_OF_EXHERISTAFF = ITEMS.register("corrupted_eye_of_exheristaff", () -> new CorruptedEyeOfExheristaff(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<CorruptedEyeOfMedusa> CORRUPTED_EYE_OF_MEDUSA = ITEMS.register("corrupted_eye_of_medusa", () -> new CorruptedEyeOfMedusa(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<CorruptedEyeOfVarzak> CORRUPTED_EYE_OF_VARZAK = ITEMS.register("corrupted_eye_of_varzak", () -> new CorruptedEyeOfVarzak(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<CorruptedEyeOfKatsu> CORRUPTED_EYE_OF_KATSU = ITEMS.register("corrupted_eye_of_katsu", () -> new CorruptedEyeOfKatsu(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Shuriken> SHURIKEN = ITEMS.register("shuriken", () -> new Shuriken(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<CorruptedEyeOfWolfyre> CORRUPTED_EYE_OF_WOLFYRE = ITEMS.register("corrupted_eye_of_wolfyre", () -> new CorruptedEyeOfWolfyre(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> WOLFYRE_SKIN = ITEMS.register("wolfyre_skin", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> MANATONE_HEAD_PIECE = ITEMS.register("manatone_head_piece", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> CORRUPTED_EYE_OF_MANATONE = ITEMS.register("corrupted_eye_of_manatone", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> CORRUPTED_EYE_OF_CINNER = ITEMS.register("corrupted_eye_of_cinner", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	//complex items
	public static final RegistryObject<Item> STAFF_OF_EXHERISTAFF = ITEMS.register("staff_of_exheristaff", () -> new StaffOfExheristaff(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	public static final RegistryObject<Item> CORRUPTED_BASIC_STAFF_OF_NIGHT_VISION = ITEMS.register("corrupted_basic_staff_of_night_vision", () -> new CorruptedBasicStaffOfNightVision(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).maxDamage(30)));
	public static final RegistryObject<Item> CORRUPTED_STAFF_OF_NIGHT_VISION = ITEMS.register("corrupted_staff_of_night_vision", () -> new CorruptedStaffOfNightVision(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).maxDamage(300)));
	public static final RegistryObject<Item> CORRUPTED_ADVANCED_STAFF_OF_NIGHT_VISION = ITEMS.register("corrupted_advanced_staff_of_night_vision", () -> new CorruptedAdvancedStaffOfNightVision(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	public static final RegistryObject<Item> CORRUPTED_BASIC_STAFF_OF_RESISTANCE = ITEMS.register("corrupted_basic_staff_of_resistance", () -> new CorruptedBasicStaffOfResistance(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).maxDamage(30)));
	public static final RegistryObject<Item> CORRUPTED_STAFF_OF_RESISTANCE = ITEMS.register("corrupted_staff_of_resistance", () -> new CorruptedStaffOfResistance(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).maxDamage(300)));
	public static final RegistryObject<Item> CORRUPTED_ADVANCED_STAFF_OF_RESISTANCE = ITEMS.register("corrupted_advanced_staff_of_resistance", () -> new CorruptedAdvancedStaffOfResistance(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	public static final RegistryObject<Item> CORRUPTED_BASIC_STAFF_OF_SPEED = ITEMS.register("corrupted_basic_staff_of_speed", () -> new CorruptedBasicStaffOfSpeed(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).maxDamage(30)));
	public static final RegistryObject<Item> CORRUPTED_STAFF_OF_SPEED = ITEMS.register("corrupted_staff_of_speed", () -> new CorruptedStaffOfSpeed(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).maxDamage(300)));
	public static final RegistryObject<Item> CORRUPTED_ADVANCED_STAFF_OF_SPEED = ITEMS.register("corrupted_advanced_staff_of_speed", () -> new CorruptedAdvancedStaffOfSpeed(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	public static final RegistryObject<Item> CORRUPTED_BASIC_STAFF_OF_REGENERATION = ITEMS.register("corrupted_basic_staff_of_regeneration", () -> new CorruptedBasicStaffOfRegeneration(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).maxDamage(30)));
	public static final RegistryObject<Item> CORRUPTED_STAFF_OF_REGENERATION = ITEMS.register("corrupted_staff_of_regeneration", () -> new CorruptedStaffOfRegeneration(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).maxDamage(300)));
	public static final RegistryObject<Item> CORRUPTED_ADVANCED_STAFF_OF_REGENERATION = ITEMS.register("corrupted_advanced_staff_of_regeneration", () -> new CorruptedAdvancedStaffOfRegeneration(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	public static final RegistryObject<Item> VARZAKS_CROWN = ITEMS.register("varzaks_crown", () -> new VarzaksCrown(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));


	//enchantment kits
	public static final RegistryObject<Item> MANATONE_PARALYSIS_ENCHANTMENT_KIT = ITEMS.register("manatone_paralysis_enchantment_kit", () -> new ManatoneParalysisEnchantmentKit(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	public static final RegistryObject<Item> BLEED_ENCHANTMENT_KIT = ITEMS.register("bleed_enchantment_kit", () -> new BleedEnchantmentKit(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	public static final RegistryObject<Item> DJINNI_ENCHANTMENT_KIT = ITEMS.register("djinni_enchantment_kit", () -> new DjinniEnchantmentKit(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));


	//mogling trade
	public static final RegistryObject<Item> MOGLING_FOOD = ITEMS.register("mogling_food", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> BETTER_MOGLING_FOOD = ITEMS.register("better_mogling_food", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<BlockItem> NUTRITIOUS_MOGLING_FOOD = ITEMS.register("nutritious_mogling_food", () -> new BlockItem(BlockInit.NUTRITIOUS_MOGLING_FOOD.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	//coin
	public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));


	//ores
	public static final RegistryObject<Item> CORRUPTED_FOSSIL_CHUNK = ITEMS.register("corrupted_fossil_chunk", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> CORRUPTION = ITEMS.register("corruption", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	//material
	public static final RegistryObject<Item> CORRUPTED_BONE = ITEMS.register("corrupted_bone", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> CORRUPTED_BALL = ITEMS.register("corrupted_ball", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> CORRUPTED_BASIC_STAFF = ITEMS.register("corrupted_basic_staff", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));


	//SPAWN eggs
	public static final RegistryObject<ModSpawnEggItem> CORRUPTED_COW_SPAWN_EGG = ITEMS.register("corrupted_cow_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.CORRUPTED_COW,0x800080,0x000000,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> CORRUPTED_PIG_SPAWN_EGG = ITEMS.register("corrupted_pig_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.CORRUPTED_PIG,0x800080,0x00008B,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> CORRUPTED_CHICKEN_SPAWN_EGG = ITEMS.register("corrupted_chicken_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.CORRUPTED_CHICKEN,0x800080,0xFFFF00,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> CORRUPTED_HORSE_SPAWN_EGG = ITEMS.register("corrupted_horse_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.CORRUPTED_HORSE,0x800080,0xD7BBD7,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> CORRUPTED_SHEEP_SPAWN_EGG = ITEMS.register("corrupted_sheep_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.CORRUPTED_SHEEP,0x800080,0xED2B0D,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> CORRUPTED_DONKEY_SPAWN_EGG = ITEMS.register("corrupted_donkey_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.CORRUPTED_DONKEY,0x800080,0x524E4D,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> EXHERISTAFF_SPAWN_EGG = ITEMS.register("exheristaff_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.EXHERISTAFF,0x000000,0x800080,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> CORRUPTED_ZOMBIE_SPAWN_EGG = ITEMS.register("corrupted_zombie_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.CORRUPTED_ZOMBIE,0x0000FF,0x00F060,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> MOGLING_SPAWN_EGG = ITEMS.register("mogling_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.MOGLING,0x800000,0x808000,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> GOLD_LAYING_CHICKEN_SPAWN_EGG = ITEMS.register("gold_laying_chicken_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.GOLD_LAYING_CHICKEN,0xFFD700,0xD4AF37,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> ZORBIG_SPAWN_EGG = ITEMS.register("zorbig_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.ZORBIG,0x4660A2,0xbd8b38,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> PALEONTOLOGIST_MOGLING_SPAWN_EGG = ITEMS.register("paleontologist_mogling_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.PALEONTOLOGIST_MOGLING,0x37ab5d,0xa7df1c,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> MEDUSA_SPAWN_EGG = ITEMS.register("medusa_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.MEDUSA,0x087608,0x075a07,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> DARBIG_SPAWN_EGG = ITEMS.register("darbig_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.DARBIG,0x000000,0xFFFFFF,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> MEDUSA_SNAKE_SPAWN_EGG = ITEMS.register("medusa_snake_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.MEDUSA_SNAKE,0x087608,0x0c4a0c,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> EATER_SPAWN_EGG = ITEMS.register("eater_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.EATER,0x5d066a,0xe60e0e,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> VARZAK_SPAWN_EGG = ITEMS.register("varzak_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.VARZAK,0xffffff,0x35d7f6,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> DWARF_SPAWN_EGG = ITEMS.register("dwarf_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.DWARF,0xcd7e5b,0xf8b398,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> KATSU_SPAWN_EGG = ITEMS.register("katsu_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.KATSU,0x786d00,0x3e306b,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> NINJA_SPAWN_EGG = ITEMS.register("ninja_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.NINJA,0x332525,0xc5d9d0,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> WOLFYRE_SPAWN_EGG = ITEMS.register("wolfyre_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.WOLFYRE,0x5e3c57,0xd8bfd9,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> MANATONE_SPAWN_EGG = ITEMS.register("manatone_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.MANATONE,0xffc4ff,0x0032fd,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> GOLEM_SPAWN_EGG = ITEMS.register("golem_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.GOLEM,0xffc4ff,0xff00ff,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> CINNER_SPAWN_EGG = ITEMS.register("cinner_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.CINNER,0x4f7942,0xfddb1d,new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<ModSpawnEggItem> GOBLIN_SPAWN_EGG = ITEMS.register("goblin_spawn_egg", () -> new ModSpawnEggItem(EntityTypeInit.GOBLIN,0x679f1a,0x56811a,new Item.Properties().group(ItemGroup.MISC)));

	//Wool
	public static final RegistryObject<BlockItem> CORRUPTED_WOOL = ITEMS.register("corrupted_wool", () -> new BlockItem(BlockInit.CORRUPTED_WOOL.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));


	//essences include essence blocks
	public static final RegistryObject<Item> ESSENCE = ITEMS.register("essence", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> CORRUPTED_ESSENCE_PIECE = ITEMS.register("corrupted_essence_piece", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<BlockItem> CORRUPTED_ESSENCE_BLOCK = ITEMS.register("corrupted_essence_block", () -> new BlockItem(BlockInit.CORRUPTED_ESSENCE_BLOCK.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	//boss item
	public static final RegistryObject<Item> PILLAR_OF_STAFF_OF_EXHERISTAFF = ITEMS.register("pillar_of_staff_of_exheristaff", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	//mob drops
	public static final RegistryObject<Item> CORRUPTED_LEATHER = ITEMS.register("corrupted_leather", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> CORRUPTED_EYE = ITEMS.register("corrupted_eye", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> EATER_TOOTH = ITEMS.register("eater_tooth", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> DWARF_BLOOD = ITEMS.register("dwarf_blood", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> NINJA_METAL = ITEMS.register("ninja_metal", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> GOLEM_ESSENCE = ITEMS.register("golem_essence", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));


	//Special items
	public static final RegistryObject<CorruptedFire> CORRUPTED_FIRE = ITEMS.register("corrupted_fire", () -> new CorruptedFire(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<BucketOfCorruptedFire> BUCKET_OF_CORRUPTED_FIRE = ITEMS.register("bucket_of_corrupted_fire", () -> new BucketOfCorruptedFire(new Item.Properties().group(ItemGroup.MISC)));


	//Tools
	public static final RegistryObject<Item> CORRUPTED_STONE_SWORD = ITEMS.register("corrupted_stone_sword", () -> new SwordItem(ModItemTier.CORRUPTED_STONE, -2,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTED_STONE_PICKAXE = ITEMS.register("corrupted_stone_pickaxe", () -> new PickaxeItem(ModItemTier.CORRUPTED_STONE, -3,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<CorruptedStoneAxe> CORRUPTED_STONE_AXE = ITEMS.register("corrupted_stone_axe", () -> new CorruptedStoneAxe(ModItemTier.CORRUPTED_STONE, 1,-3F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTED_STONE_HOE = ITEMS.register("corrupted_stone_hoe", () -> new HoeItem(ModItemTier.CORRUPTED_STONE, -3,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTED_STONE_SHOVEL = ITEMS.register("corrupted_stone_shovel", () -> new ShovelItem(ModItemTier.CORRUPTED_STONE, -3,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTED_BONE_SWORD = ITEMS.register("corrupted_bone_sword", () -> new SwordItem(ModItemTier.CORRUPTED_BONE, -2,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTED_BONE_PICKAXE = ITEMS.register("corrupted_bone_pickaxe", () -> new PickaxeItem(ModItemTier.CORRUPTED_BONE, -3,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTED_BONE_AXE = ITEMS.register("corrupted_bone_axe", () -> new AxeItem(ModItemTier.CORRUPTED_BONE, 1,-3F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTED_BONE_HOE = ITEMS.register("corrupted_bone_hoe", () -> new HoeItem(ModItemTier.CORRUPTED_BONE, -3,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTED_BONE_SHOVEL = ITEMS.register("corrupted_bone_shovel", () -> new ShovelItem(ModItemTier.CORRUPTED_BONE, -3,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTION_SWORD = ITEMS.register("corruption_sword", () -> new SwordItem(ModItemTier.CORRUPTION, -1,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTION_PICKAXE = ITEMS.register("corruption_pickaxe", () -> new PickaxeItem(ModItemTier.CORRUPTION, -3,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTION_AXE = ITEMS.register("corruption_axe", () -> new AxeItem(ModItemTier.CORRUPTION, 2,-3F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Item> CORRUPTION_SHOVEL = ITEMS.register("corruption_shovel", () -> new ShovelItem(ModItemTier.CORRUPTION, -3,-2.4F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<Kizutsu> KIZUTSU = ITEMS.register("kizutsu", () -> new Kizutsu(ModItemTier.CORRUPTION, 7,-2.0F, new Item.Properties().group(ItemGroup.TOOLS)));
	public static final RegistryObject<WolfyreHand> WOLFYRE_HAND = ITEMS.register("wolfyre_hand", () -> new WolfyreHand(ModItemTier.CORRUPTION, 7,-2.0F, new Item.Properties().group(ItemGroup.TOOLS)));


	//Armors
	public static final RegistryObject<Item> CORRUPTED_LEATHER_BOOTS = ITEMS.register("corrupted_leather_boots", () -> new ArmorItem(ModArmorMaterial.CORRUPTED_LEATHER, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> CORRUPTED_LEATHER_LEGGINGS = ITEMS.register("corrupted_leather_leggings", () -> new ArmorItem(ModArmorMaterial.CORRUPTED_LEATHER, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> CORRUPTED_LEATHER_CHESTPLATE = ITEMS.register("corrupted_leather_chestplate", () -> new ArmorItem(ModArmorMaterial.CORRUPTED_LEATHER, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> CORRUPTED_LEATHER_HELMET = ITEMS.register("corrupted_leather_helmet", () -> new ArmorItem(ModArmorMaterial.CORRUPTED_LEATHER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> CORRUPTED_BONE_BOOTS = ITEMS.register("corrupted_bone_boots", () -> new ArmorItem(ModArmorMaterial.CORRUPTED_BONE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> CORRUPTED_BONE_LEGGINGS = ITEMS.register("corrupted_bone_leggings", () -> new ArmorItem(ModArmorMaterial.CORRUPTED_BONE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> CORRUPTED_BONE_CHESTPLATE = ITEMS.register("corrupted_bone_chestplate", () -> new ArmorItem(ModArmorMaterial.CORRUPTED_BONE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> CORRUPTED_BONE_HELMET = ITEMS.register("corrupted_bone_helmet", () -> new ArmorItem(ModArmorMaterial.CORRUPTED_BONE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));



	//Block items
	public static final RegistryObject<BlockItem> CORRUPTED_GRASS = ITEMS.register("corrupted_grass", () -> new BlockItem(BlockInit.CORRUPTED_GRASS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_DIRT = ITEMS.register("corrupted_dirt", () -> new BlockItem(BlockInit.CORRUPTED_DIRT.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_CRAFTING_TABLE = ITEMS.register("corrupted_crafting_table", () -> new BlockItem(BlockInit.CORRUPTED_CRAFTING_TABLE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRAFTING_HAND = ITEMS.register("crafting_hand", () -> new BlockItem(BlockInit.CRAFTING_HAND.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CONDENSED_CORRUPTED_STONE = ITEMS.register("condensed_corrupted_stone", () -> new BlockItem(BlockInit.CONDENSED_CORRUPTED_STONE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_FOSSIL_ORE = ITEMS.register("corrupted_fossil_ore", () -> new BlockItem(BlockInit.CORRUPTED_FOSSIL_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_BONE_BLOCK = ITEMS.register("corrupted_bone_block", () -> new BlockItem(BlockInit.CORRUPTED_BONE_BLOCK.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTION_ORE = ITEMS.register("corruption_ore", () -> new BlockItem(BlockInit.CORRUPTION_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> NINJA_METAL_BLOCK = ITEMS.register("ninja_metal_block", () -> new BlockItem(BlockInit.NINJA_METAL_BLOCK.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> MANA_BLOCK = ITEMS.register("mana_block", () -> new BlockItem(BlockInit.MANA_BLOCK.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	public static final RegistryObject<BlockItem> CORRUPTED_STONE = ITEMS.register("corrupted_stone", () -> new BlockItem(BlockInit.CORRUPTED_STONE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE = ITEMS.register("corrupted_cobblestone", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_STAIRS = ITEMS.register("corrupted_cobblestone_stairs", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_STAIRS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_STAIRS = ITEMS.register("corrupted_stone_stairs", () -> new BlockItem(BlockInit.CORRUPTED_STONE_STAIRS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_WALL = ITEMS.register("corrupted_stone_wall", () -> new BlockItem(BlockInit.CORRUPTED_STONE_WALL.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_WALL = ITEMS.register("corrupted_cobblestone_wall", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_WALL.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_SLAB = ITEMS.register("corrupted_cobblestone_slab", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_SLAB.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_SLAB = ITEMS.register("corrupted_stone_slab", () -> new BlockItem(BlockInit.CORRUPTED_STONE_SLAB.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_BUTTON = ITEMS.register("corrupted_cobblestone_button", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_BUTTON.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_BUTTON = ITEMS.register("corrupted_stone_button", () -> new BlockItem(BlockInit.CORRUPTED_STONE_BUTTON.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_PRESSURE_PLATE = ITEMS.register("corrupted_cobblestone_pressure_plate", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_PRESSURE_PLATE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_PRESSURE_PLATE = ITEMS.register("corrupted_stone_pressure_plate", () -> new BlockItem(BlockInit.CORRUPTED_STONE_PRESSURE_PLATE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_BRICKS = ITEMS.register("corrupted_stone_bricks", () -> new BlockItem(BlockInit.CORRUPTED_STONE_BRICKS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_BRICKS = ITEMS.register("corrupted_cobblestone_bricks", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_BRICKS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_BRICKS_STAIRS = ITEMS.register("corrupted_cobblestone_bricks_stairs", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_BRICKS_STAIRS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_BRICKS_STAIRS = ITEMS.register("corrupted_stone_bricks_stairs", () -> new BlockItem(BlockInit.CORRUPTED_STONE_BRICKS_STAIRS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_BRICKS_WALL = ITEMS.register("corrupted_stone_bricks_wall", () -> new BlockItem(BlockInit.CORRUPTED_STONE_BRICKS_WALL.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_BRICKS_WALL = ITEMS.register("corrupted_cobblestone_bricks_wall", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_BRICKS_WALL.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_COBBLESTONE_BRICKS_SLAB = ITEMS.register("corrupted_cobblestone_bricks_slab", () -> new BlockItem(BlockInit.CORRUPTED_COBBLESTONE_BRICKS_SLAB.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_STONE_BRICKS_SLAB = ITEMS.register("corrupted_stone_bricks_slab", () -> new BlockItem(BlockInit.CORRUPTED_STONE_BRICKS_SLAB.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_WOOD = ITEMS.register("corrupted_oak_wood", () -> new BlockItem(BlockInit.CORRUPTED_OAK_WOOD.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> STRIPPED_CORRUPTED_OAK_LOG = ITEMS.register("stripped_corrupted_oak_log", () -> new BlockItem(BlockInit.STRIPPED_CORRUPTED_OAK_LOG.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> STRIPPED_CORRUPTED_OAK_WOOD = ITEMS.register("stripped_corrupted_oak_wood", () -> new BlockItem(BlockInit.STRIPPED_CORRUPTED_OAK_WOOD.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_LOG = ITEMS.register("corrupted_oak_log", () -> new BlockItem(BlockInit.CORRUPTED_OAK_LOG.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_PLANKS = ITEMS.register("corrupted_oak_planks", () -> new BlockItem(BlockInit.CORRUPTED_OAK_PLANKS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_SAPLING = ITEMS.register("corrupted_oak_sapling", () -> new BlockItem(BlockInit.CORRUPTED_OAK_SAPLING.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_LEAVES = ITEMS.register("corrupted_oak_leaves", () -> new BlockItem(BlockInit.CORRUPTED_OAK_LEAVES.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_BUTTON = ITEMS.register("corrupted_oak_button", () -> new BlockItem(BlockInit.CORRUPTED_OAK_BUTTON.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_STAIRS = ITEMS.register("corrupted_oak_stairs", () -> new BlockItem(BlockInit.CORRUPTED_OAK_STAIRS.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_FENCE = ITEMS.register("corrupted_oak_fence", () -> new BlockItem(BlockInit.CORRUPTED_OAK_FENCE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_FENCE_GATE = ITEMS.register("corrupted_oak_fence_gate", () -> new BlockItem(BlockInit.CORRUPTED_OAK_FENCE_GATE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_SLAB = ITEMS.register("corrupted_oak_slab", () -> new BlockItem(BlockInit.CORRUPTED_OAK_SLAB.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_DOOR = ITEMS.register("corrupted_oak_door", () -> new BlockItem(BlockInit.CORRUPTED_OAK_DOOR.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CORRUPTED_TORCH = ITEMS.register("corrupted_torch", () -> new WallOrFloorItem(BlockInit.CORRUPTED_TORCH.get(), BlockInit.CORRUPTED_WALL_TORCH.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CORRUPTED_OAK_TRAPDOOR = ITEMS.register("corrupted_oak_trapdoor", () -> new BlockItem(BlockInit.CORRUPTED_OAK_TRAPDOOR.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

}
