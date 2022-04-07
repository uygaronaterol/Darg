package com.puncix.darg.common.world.gen;

import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import com.puncix.darg.common.blocks.trees.CorruptedOakTree;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModTreeGeneration {
	public static void generateTrees(final BiomeLoadingEvent event) {
		CorruptedOakTree corruptedOakTree = new CorruptedOakTree();
		Random random = new Random();
		
		
		RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
		
		if(types.contains(BiomeDictionary.Type.PLAINS)) {
			java.util.List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
			base.add(() -> ModConfiguredFeatures.CORRUPTED_OAK
					.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
					.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.0002f, 1))
					));
			
		}
		
	}
}
