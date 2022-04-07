package com.puncix.darg.common.blocks.trees;

import java.util.Random;

import com.puncix.darg.common.world.gen.ModConfiguredFeatures;

import net.minecraft.block.BlockState;
import net.minecraft.block.trees.Tree;

import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.server.ServerWorld;


public class CorruptedOakTree extends Tree{

	@Override
	public boolean attemptGrowTree(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random rand) {
		return super.attemptGrowTree(world, chunkGenerator, pos, state, rand);
	}

	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean b) {

		return ModConfiguredFeatures.CORRUPTED_OAK;
	}
}
