package com.puncix.darg.common.items;


import com.puncix.darg.core.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CorruptedStoneAxe extends AxeItem{
	
	


	public CorruptedStoneAxe(IItemTier p_i48530_1_, float p_i48530_2_, float p_i48530_3_, Properties p_i48530_4_) {
		super(p_i48530_1_, p_i48530_2_, p_i48530_3_, p_i48530_4_);
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionResultType onItemUse(ItemUseContext p_195939_1_) {
		// TODO Auto-generated method stub
		
		World world = p_195939_1_.getWorld();
	    BlockPos blockpos = p_195939_1_.getPos();
	    BlockState blockstate = world.getBlockState(blockpos);
	    
	    if(blockstate.equals(BlockInit.CORRUPTED_OAK_WOOD.get())) {
			world.setBlockState(blockpos, BlockInit.STRIPPED_CORRUPTED_OAK_WOOD.get().getDefaultState(), 2);
	    	return ActionResultType.SUCCESS;
	    }
	    else if(blockstate.equals(BlockInit.CORRUPTED_OAK_LOG.get())) {
			world.setBlockState(blockpos, BlockInit.STRIPPED_CORRUPTED_OAK_LOG.get().getDefaultState(), 2);
	    	return ActionResultType.SUCCESS;
	    }
	    
	    return ActionResultType.FAIL;   
	}
	
}
