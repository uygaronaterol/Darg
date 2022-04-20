package com.puncix.darg.common.world;

import com.mojang.serialization.Codec;
import com.puncix.darg.Darg;
import com.puncix.darg.common.world.gen.ModEntityGeneration;
import com.puncix.darg.common.world.gen.ModOreGeneration;
import com.puncix.darg.common.world.gen.ModStructureGeneration;
import com.puncix.darg.common.world.gen.ModTreeGeneration;

import com.puncix.darg.common.world.structure.ModStructures;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.FlatChunkGenerator;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.apache.logging.log4j.LogManager;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Darg.MOD_ID)
public class ModWorldEvents {
	@SubscribeEvent
	public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
		ModStructureGeneration.generateStructures(event);
		ModTreeGeneration.generateTrees(event);
		ModEntityGeneration.onEntitySpawn(event);
		ModOreGeneration.generateOres(event);
	}


	@SubscribeEvent
	public static void addDimensionalSpacing(final WorldEvent.Load event) {
		if(event.getWorld() instanceof ServerWorld) {
			ServerWorld serverWorld = (ServerWorld) event.getWorld();

			try {
				Method GETCODEC_METHOD =
						ObfuscationReflectionHelper.findMethod(ChunkGenerator.class, "func_230347_a_");
				ResourceLocation cgRL = Registry.CHUNK_GENERATOR_CODEC.getKey(
						(Codec<? extends ChunkGenerator>)GETCODEC_METHOD.invoke(serverWorld.getChunkProvider().generator));

				if (cgRL != null && cgRL.getNamespace().equals("terraforged")) {
					return;
				}
			} catch (Exception e) {
				LogManager.getLogger().error("Was unable to check if " + serverWorld.getDimensionKey().getLocation()
						+ " is using Terraforged's ChunkGenerator.");
			}

			// Prevent spawning our structure in Vanilla's superflat world
			if (serverWorld.getChunkProvider().generator instanceof FlatChunkGenerator &&
					serverWorld.getDimensionKey().equals(World.OVERWORLD)) {
				return;
			}

			// Adding our Structure to the Map
			Map<Structure<?>, StructureSeparationSettings> tempMap =
					new HashMap<>(serverWorld.getChunkProvider().generator.func_235957_b_().func_236195_a_());
			((HashMap) tempMap).putIfAbsent(ModStructures.CORRUPTED_HOUSE.get(),
					DimensionStructuresSettings.field_236191_b_.get(ModStructures.CORRUPTED_HOUSE.get()));
			((HashMap) tempMap).putIfAbsent(ModStructures.EXHERISTAFF_STRUCTURE.get(),
					DimensionStructuresSettings.field_236191_b_.get(ModStructures.EXHERISTAFF_STRUCTURE.get()));
			((HashMap) tempMap).putIfAbsent(ModStructures.CORRUPTED_FOSSIL_SITE.get(),
					DimensionStructuresSettings.field_236191_b_.get(ModStructures.CORRUPTED_FOSSIL_SITE.get()));
			((HashMap) tempMap).putIfAbsent(ModStructures.MOGLING_VILLAGE.get(),
					DimensionStructuresSettings.field_236191_b_.get(ModStructures.MOGLING_VILLAGE.get()));
			((HashMap) tempMap).putIfAbsent(ModStructures.MEDUSA_TEMPLE.get(),
					DimensionStructuresSettings.field_236191_b_.get(ModStructures.MEDUSA_TEMPLE.get()));
			serverWorld.getChunkProvider().generator.func_235957_b_().field_236193_d_ = tempMap;

		}
	}
}
