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


	//complex items
	public static final RegistryObject<Item> STAFF_OF_EXHERISTAFF = ITEMS.register("staff_of_exheristaff", () -> new StaffOfExheristaff(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));

	//mogling trade
	public static final RegistryObject<Item> MOGLING_FOOD = ITEMS.register("mogling_food", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> BETTER_MOGLING_FOOD = ITEMS.register("better_mogling_food", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	//ores
	public static final RegistryObject<Item> CORRUPTED_FOSSIL_CHUNK = ITEMS.register("corrupted_fossil_chunk", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	//material
	public static final RegistryObject<Item> CORRUPTED_BONE = ITEMS.register("corrupted_bone", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));


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

	//Wool
	public static final RegistryObject<BlockItem> CORRUPTED_WOOL = ITEMS.register("corrupted_wool", () -> new BlockItem(BlockInit.CORRUPTED_WOOL.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));


	//essences include essence blocks
	public static final RegistryObject<Item> ESSENCE = ITEMS.register("essence", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> CORRUPTED_ESSENCE_PIECE = ITEMS.register("corrupted_essence_piece", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<BlockItem> CORRUPTED_ESSENCE_BLOCK = ITEMS.register("corrupted_essence_block", () -> new BlockItem(BlockInit.CORRUPTED_ESSENCE_BLOCK.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	public static final RegistryObject<Item> PILLAR_OF_STAFF_OF_EXHERISTAFF = ITEMS.register("pillar_of_staff_of_exheristaff", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	//mob drops
	public static final RegistryObject<Item> CORRUPTED_LEATHER = ITEMS.register("corrupted_leather", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

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
