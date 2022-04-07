package com.puncix.darg.common.tileentities;

import com.puncix.darg.Darg;
import com.puncix.darg.common.blocks.CraftingHand;
import com.puncix.darg.core.init.BlockInit;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModTileEntities {
	public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
			DeferredRegister.create(ForgeRegistries.TILE_ENTITIES,Darg.MOD_ID);
	
	public static RegistryObject<TileEntityType<CorruptedCraftingTableTile>> CORRUPTED_CRAFTING_TABLE_TILE =
			TILE_ENTITIES.register("corrupted_crafting_table_tile", () -> TileEntityType.Builder.create(
					CorruptedCraftingTableTile::new, BlockInit.CORRUPTED_CRAFTING_TABLE.get()).build(null));
	public static RegistryObject<TileEntityType<CraftingHandTile>> CRAFTING_HAND_TILE =
			TILE_ENTITIES.register("crafting_hand_tile", () -> TileEntityType.Builder.create(
					CraftingHandTile::new, BlockInit.CRAFTING_HAND.get()).build(null));
	public static void register(IEventBus bus) {
		TILE_ENTITIES.register(bus);
	}
}
