package com.puncix.darg.common.world.gen;

import com.puncix.darg.Darg;
import com.puncix.darg.common.world.structure.ModStructures;
import com.puncix.darg.core.init.BlockInit;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.FlatGenerationSettings;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ModConfiguredFeatures {
	   public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CORRUPTED_OAK = 
	   register("corrupted_oak", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder
	   (new SimpleBlockStateProvider(BlockInit.CORRUPTED_OAK_LOG.get().getDefaultState()),
	   new SimpleBlockStateProvider(BlockInit.CORRUPTED_OAK_LEAVES.get().getDefaultState()),
	   new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3), new StraightTrunkPlacer(4, 2, 0),
	   new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
		      return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
		   }
}
