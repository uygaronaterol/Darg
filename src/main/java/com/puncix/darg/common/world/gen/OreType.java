package com.puncix.darg.common.world.gen;

import com.puncix.darg.core.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
	CORRUPTED_FOSSIL(Lazy.of(BlockInit.CORRUPTED_FOSSIL_ORE),10, 8,60),
	CORRUPTION(Lazy.of(BlockInit.CORRUPTION_ORE),1, 0,10);



	private final Lazy<Block> block;
	private final int maxVeinSize;
	private final int minHeight;
	private final int maxHeight;

	OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
		this.block = block;
		this.maxVeinSize = maxVeinSize;
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
	}

	public Lazy<Block> getBlock() {
		return block;
	}

	public int getMaxVeinSize() {
		return maxVeinSize;
	}

	public int getMinHeight() {
		return minHeight;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public static OreType get(Block block) {
		for (OreType ore : values()) {
			if(block == ore.block) {
				return ore;
			}
		}
		return null;
	}
	
}
