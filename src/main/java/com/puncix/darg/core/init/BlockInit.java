package com.puncix.darg.core.init;

import com.puncix.darg.Darg;
import com.puncix.darg.common.blocks.CorruptedCraftingTable;
import com.puncix.darg.common.blocks.CorruptedGrass;
import com.puncix.darg.common.blocks.CraftingHand;
import com.puncix.darg.common.blocks.GoldProducingChalice;
import com.puncix.darg.common.blocks.trees.CorruptedOakTree;

import net.minecraft.block.*;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.WallOrFloorItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	//Deferred register
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Darg.MOD_ID);

	//mogling food
	public static final RegistryObject<Block> NUTRITIOUS_MOGLING_FOOD = BLOCKS.register("nutritious_mogling_food", () -> new Block( AbstractBlock.Properties.create(Material.ORGANIC).hardnessAndResistance(2f,2f)
			.harvestLevel(0).sound(SoundType.SAND).setRequiresTool().harvestTool(ToolType.HOE)));


	//Essence blocks
	public static final RegistryObject<Block> CORRUPTED_ESSENCE_BLOCK = BLOCKS.register("corrupted_essence_block", () -> new Block( AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(6f,6f)
			.harvestLevel(4).sound(SoundType.ANCIENT_DEBRIS).setRequiresTool().harvestTool(ToolType.PICKAXE).setLightLevel((p_235470_0_) -> {
				return 10;
			})));
	//bone
	public static final RegistryObject<Block> CORRUPTED_BONE_BLOCK = BLOCKS.register("corrupted_bone_block", () -> new Block( AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f,3f)
			.harvestLevel(4).sound(SoundType.ANCIENT_DEBRIS).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	//Corrupted grass & dirt
	public static final RegistryObject<CorruptedGrass> CORRUPTED_GRASS = BLOCKS.register("corrupted_grass", () -> new CorruptedGrass(AbstractBlock.Properties.create(Material.ORGANIC).hardnessAndResistance(1f,1f)
			.harvestLevel(1).tickRandomly().sound(SoundType.HONEY).setLightLevel((p_235470_0_) -> {
			      return 1;
			   }).setRequiresTool().harvestTool(ToolType.SHOVEL)));
	public static final RegistryObject<Block> CORRUPTED_DIRT = BLOCKS.register("corrupted_dirt", () -> new Block(AbstractBlock.Properties.create(Material.ORGANIC).hardnessAndResistance(1f,1f)
			.harvestLevel(1).sound(SoundType.HONEY).setLightLevel((p_235470_0_) -> {
			      return 1;
			   }).setRequiresTool().harvestTool(ToolType.SHOVEL)));

	//wool
	public static final RegistryObject<Block> CORRUPTED_WOOL = BLOCKS.register("corrupted_wool", () -> new Block(AbstractBlock.Properties.create(Material.WOOL).hardnessAndResistance(1f,1f)
			.harvestLevel(1).sound(SoundType.CLOTH).setRequiresTool().harvestTool(ToolType.HOE)));

	//crafting stuff
	public static final RegistryObject<CorruptedCraftingTable> CORRUPTED_CRAFTING_TABLE = BLOCKS.register("corrupted_crafting_table", () -> new CorruptedCraftingTable(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3f,3f)
			.harvestLevel(1).sound(SoundType.CORAL).setLightLevel((p_235470_0_) -> {
			      return 1;
			   }).harvestTool(ToolType.AXE)));
	public static final RegistryObject<CraftingHand> CRAFTING_HAND = BLOCKS.register("crafting_hand", () -> new CraftingHand(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5f,5f)
			.harvestLevel(5).sound(SoundType.NYLIUM).setLightLevel((p_235470_0_) -> {
				return 5;
			}).harvestTool(ToolType.PICKAXE).notSolid()));

	//blockbench
	public static final RegistryObject<GoldProducingChalice> GOLD_PRODUCING_CHALICE = BLOCKS.register("gold_producing_chalice",
			() -> new GoldProducingChalice(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(500f,500f)
			.harvestLevel(5).sound(SoundType.NYLIUM).setLightLevel((p_235470_0_) -> {
				return 10;
			}).harvestTool(ToolType.PICKAXE).notSolid()));

	//Corrupted stone and corrupted cobblestone
	public static final RegistryObject<Block> CORRUPTED_STONE = BLOCKS.register("corrupted_stone", () -> new Block(AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setLightLevel((p_235470_0_) -> {
			      return 1;
			   }).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CONDENSED_CORRUPTED_STONE = BLOCKS.register("condensed_corrupted_stone", () -> new Block(AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(5).sound(SoundType.NYLIUM).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE = BLOCKS.register("corrupted_cobblestone", () -> new Block(AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setLightLevel((p_235470_0_) -> {
			      return 1;
			   }).setRequiresTool().harvestTool(ToolType.PICKAXE)));		
	public static final RegistryObject<Block> CORRUPTED_STONE_STAIRS = BLOCKS.register("corrupted_stone_stairs", () -> new StairsBlock(() -> CORRUPTED_STONE.get().getDefaultState(), AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
		.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_STAIRS = BLOCKS.register("corrupted_cobblestone_stairs", () -> new StairsBlock(() -> CORRUPTED_COBBLESTONE.get().getDefaultState(), AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_WALL = BLOCKS.register("corrupted_cobblestone_wall", () -> new WallBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_STONE_WALL = BLOCKS.register("corrupted_stone_wall", () -> new WallBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_STONE_SLAB = BLOCKS.register("corrupted_stone_slab", () -> new SlabBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_SLAB = BLOCKS.register("corrupted_cobblestone_slab", () -> new SlabBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("corrupted_cobblestone_pressure_plate", () -> new PressurePlateBlock(Sensitivity.MOBS, AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_STONE_PRESSURE_PLATE = BLOCKS.register("corrupted_stone_pressure_plate", () -> new PressurePlateBlock(Sensitivity.MOBS, AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_BUTTON = BLOCKS.register("corrupted_cobblestone_button", () -> new StoneButtonBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE).doesNotBlockMovement()));
	public static final RegistryObject<Block> CORRUPTED_STONE_BUTTON = BLOCKS.register("corrupted_stone_button", () -> new StoneButtonBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE).doesNotBlockMovement()));
	public static final RegistryObject<Block> CORRUPTED_STONE_BRICKS = BLOCKS.register("corrupted_stone_bricks", () -> new Block( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_BRICKS = BLOCKS.register("corrupted_cobblestone_bricks", () -> new Block( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_STONE_BRICKS_STAIRS = BLOCKS.register("corrupted_stone_bricks_stairs", () -> new StairsBlock(() -> CORRUPTED_STONE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_BRICKS_STAIRS = BLOCKS.register("corrupted_cobblestone_bricks_stairs", () -> new StairsBlock(() -> CORRUPTED_COBBLESTONE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_BRICKS_WALL = BLOCKS.register("corrupted_cobblestone_bricks_wall", () -> new WallBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_STONE_BRICKS_WALL = BLOCKS.register("corrupted_stone_bricks_wall", () -> new WallBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_STONE_BRICKS_SLAB = BLOCKS.register("corrupted_stone_bricks_slab", () -> new SlabBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_COBBLESTONE_BRICKS_SLAB = BLOCKS.register("corrupted_cobblestone_bricks_slab", () -> new SlabBlock( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(3f,3f)
			.harvestLevel(2).sound(SoundType.BONE).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	

	//ninja metal block
	public static final RegistryObject<Block> NINJA_METAL_BLOCK = BLOCKS.register("ninja_metal_block", () -> new Block( AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(10f,10f)
			.harvestLevel(2).sound(SoundType.METAL).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	
	//Wood
	public static final RegistryObject<Block> CORRUPTED_OAK_LOG = BLOCKS.register("corrupted_oak_log",
			() -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));
	public static final RegistryObject<Block> CORRUPTED_OAK_WOOD = BLOCKS.register("corrupted_oak_wood",
			() -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));
	public static final RegistryObject<Block> STRIPPED_CORRUPTED_OAK_LOG = BLOCKS.register("stripped_corrupted_oak_log",
			() -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));
	public static final RegistryObject<Block> STRIPPED_CORRUPTED_OAK_WOOD = BLOCKS.register("stripped_corrupted_oak_wood",
			() -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)));
	public static final RegistryObject<Block> CORRUPTED_OAK_PLANKS = BLOCKS.register("corrupted_oak_planks",
			() -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> CORRUPTED_OAK_LEAVES = BLOCKS.register("corrupted_oak_leaves",
			() -> new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f,0.2f).tickRandomly().notSolid().sound(SoundType.VINE)));

	public static final RegistryObject<Block> CORRUPTED_OAK_SAPLING = BLOCKS.register("corrupted_oak_sapling",
			() -> new SaplingBlock(new CorruptedOakTree(),AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
	public static final RegistryObject<Block> CORRUPTED_OAK_BUTTON = BLOCKS.register("corrupted_oak_button", () -> new StoneButtonBlock( AbstractBlock.Properties.create(Material.EARTH)
			.harvestLevel(1).sound(SoundType.PLANT).setRequiresTool().harvestTool(ToolType.AXE).doesNotBlockMovement()));
	public static final RegistryObject<Block> CORRUPTED_OAK_STAIRS = BLOCKS.register("corrupted_oak_stairs", () -> new StairsBlock(() -> CORRUPTED_OAK_PLANKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.EARTH)
			.harvestLevel(1).sound(SoundType.PLANT).setRequiresTool().harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> CORRUPTED_OAK_FENCE = BLOCKS.register("corrupted_oak_fence",
			() -> new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> CORRUPTED_OAK_FENCE_GATE = BLOCKS.register("corrupted_oak_fence_gate",
			() -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> CORRUPTED_OAK_SLAB = BLOCKS.register("corrupted_oak_slab",
			() -> new SlabBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> CORRUPTED_OAK_DOOR = BLOCKS.register("corrupted_oak_door",
			() -> new DoorBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(1f,1f).notSolid().sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CORRUPTED_OAK_TRAPDOOR = BLOCKS.register("corrupted_oak_trapdoor",
			() -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(1f,1f).notSolid().sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CORRUPTED_TORCH = BLOCKS.register("corrupted_torch",
			() -> new TorchBlock(AbstractBlock.Properties.from(Blocks.TORCH), ParticleTypes.ASH));
	public static final RegistryObject<Block> CORRUPTED_WALL_TORCH = BLOCKS.register("corrupted_wall_torch",
			() -> new WallTorchBlock(AbstractBlock.Properties.from(Blocks.WALL_TORCH), ParticleTypes.ASH));




	//Ores
	public static final RegistryObject<Block> CORRUPTED_IRON_ORE = BLOCKS.register("corrupted_iron_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5f,5f)
			.harvestLevel(2).sound(SoundType.BONE).setLightLevel((p_235470_0_) -> {
			      return 1;
			   }).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_GOLD_ORE = BLOCKS.register("corrupted_gold_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5f,5f)
			.harvestLevel(2).sound(SoundType.BONE).setLightLevel((p_235470_0_) -> {
			      return 2;
			   }).setRequiresTool().harvestTool(ToolType.PICKAXE)));

	public static final RegistryObject<Block> CORRUPTED_DIAMOND_ORE = BLOCKS.register("corrupted_diamond_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5f,5f)
			.harvestLevel(2).sound(SoundType.BONE).setLightLevel((p_235470_0_) -> {
			      return 4;
			   }).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_REDSTONE_ORE = BLOCKS.register("corrupted_redstone_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5f,5f)
			.harvestLevel(2).sound(SoundType.BONE).setLightLevel((p_235470_0_) -> {
			      return 1;
			   }).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_LAPIS_ORE = BLOCKS.register("corrupted_lapis_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5f,5f)
			.harvestLevel(2).sound(SoundType.BONE).setLightLevel((p_235470_0_) -> {
			      return 1;
			   }).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTED_FOSSIL_ORE = BLOCKS.register("corrupted_fossil_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5f,5f)
			.harvestLevel(2).sound(SoundType.BONE).setLightLevel((p_235470_0_) -> {
				return 12;
			}).setRequiresTool().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CORRUPTION_ORE = BLOCKS.register("corruption_ore", () -> new Block(AbstractBlock.Properties.create(Material.DRAGON_EGG).hardnessAndResistance(500f,1500f)
			.harvestLevel(4).sound(SoundType.ANCIENT_DEBRIS).setRequiresTool().harvestTool(ToolType.PICKAXE)));

	//manablock
	public static final RegistryObject<Block> MANA_BLOCK = BLOCKS.register("mana_block", () -> new Block(AbstractBlock.Properties.create(Material.EARTH).hardnessAndResistance(10f,10f)
			.harvestLevel(2).sound(SoundType.BASALT).setLightLevel((p_235470_0_) -> {
				return 12;
			}).setRequiresTool().harvestTool(ToolType.PICKAXE)));
}
