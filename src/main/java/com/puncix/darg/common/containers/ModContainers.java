package com.puncix.darg.common.containers;

import com.puncix.darg.Darg;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {
	public static DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister
			.create( ForgeRegistries.CONTAINERS, Darg.MOD_ID);
	
	public static final RegistryObject<ContainerType<CorruptedCraftingTableContainer>> CORRUPTED_CRAFTING_TABLE_CONTAINER
	= CONTAINERS.register("corrupted_crafting_table_container", 
			() -> IForgeContainerType.create(((windowId, inv, data) -> {
				BlockPos pos = data.readBlockPos();
				World world = inv.player.getEntityWorld();
				return new CorruptedCraftingTableContainer(windowId, world, pos, inv, inv.player);
			})));
	public static final RegistryObject<ContainerType<CraftingHandContainer>> CRAFTING_HAND_CONTAINER
			= CONTAINERS.register("crafting_hand_container",
			() -> IForgeContainerType.create(((windowId, inv, data) -> {
				BlockPos pos = data.readBlockPos();
				World world = inv.player.getEntityWorld();
				return new CraftingHandContainer(windowId, world, pos, inv, inv.player);
			})));
	public static final RegistryObject<ContainerType<GoldProducingChaliceContainer>> GOLD_PRODUCING_CHALICE_CONTAINER
			= CONTAINERS.register("gold_producing_chalice_container",
			() -> IForgeContainerType.create(((windowId, inv, data) -> {
				BlockPos pos = data.readBlockPos();
				World world = inv.player.getEntityWorld();
				return new GoldProducingChaliceContainer(windowId, world, pos, inv, inv.player);
			})));
			
			
	
	
	
	public static void register(IEventBus eventBus) {
		CONTAINERS.register(eventBus);
	}
}
