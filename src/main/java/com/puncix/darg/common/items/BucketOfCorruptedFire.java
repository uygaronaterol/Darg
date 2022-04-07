package com.puncix.darg.common.items;




import com.puncix.darg.Darg;
import com.puncix.darg.common.blocks.CorruptedCraftingTable;
import com.puncix.darg.core.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.blockplacer.BlockPlacer;
import net.minecraft.world.gen.blockplacer.BlockPlacerType;
import net.minecraft.world.server.ServerWorld;
public class BucketOfCorruptedFire extends Item{
	public BucketOfCorruptedFire(Properties p_i48487_1_) {
		super(p_i48487_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
		// TODO Auto-generated method stub
		return super.onLeftClickEntity(stack, player, entity);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public int getBurnTime(ItemStack stack) {
		// TODO Auto-generated method stub
		return super.getBurnTime(stack);
	}



	@Override
	public ActionResultType onItemUse(ItemUseContext p_195939_1_) {
		// TODO Auto-generated method stub
		
		World world = p_195939_1_.getWorld();
	    BlockPos blockpos = p_195939_1_.getPos();
	    BlockState blockstate = world.getBlockState(blockpos);
	    
	    if(blockstate.matchesBlock(Blocks.CRAFTING_TABLE)) {
			world.setBlockState(blockpos, BlockInit.CORRUPTED_CRAFTING_TABLE.get().getDefaultState(), 2);
			p_195939_1_.getItem().shrink(1);
			p_195939_1_.getPlayer().addItemStackToInventory(Items.BUCKET.getDefaultInstance());
			
	    	return ActionResultType.CONSUME;
	    }
	    
	    return ActionResultType.FAIL;
	    
	    
	}
}
