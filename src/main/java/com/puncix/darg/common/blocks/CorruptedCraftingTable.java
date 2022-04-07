package com.puncix.darg.common.blocks;



import com.puncix.darg.common.tileentities.CorruptedCraftingTableTile;
import com.puncix.darg.common.tileentities.ModTileEntities;

import javax.annotation.Nullable;

import com.puncix.darg.common.containers.CorruptedCraftingTableContainer;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.Random;


public class CorruptedCraftingTable extends HorizontalBlock {
	@Override
	public ActionResultType onBlockActivated(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_,
											 PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
		if(!p_225533_2_.isRemote()) {
			TileEntity tileEntity = p_225533_2_.getTileEntity(p_225533_3_);
				if(tileEntity instanceof CorruptedCraftingTableTile) {
					INamedContainerProvider containerProvider = createContainerProvider(p_225533_2_,p_225533_3_);
					NetworkHooks.openGui((ServerPlayerEntity) p_225533_4_, containerProvider, tileEntity.getPos());
				}else {
					throw new IllegalStateException("Our container provider is missing");
				}

		}
		return ActionResultType.SUCCESS;
	}

	@Override
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		float chance = 0.25f;
		if(chance < rand.nextFloat()){
			worldIn.addParticle(ParticleTypes.ASH,pos.getX()+rand.nextDouble(),pos.getY() + 0.6d,pos.getZ()+rand.nextDouble(),0d,0.05d,0d);
		}
		super.animateTick(stateIn, worldIn, pos, rand);
	}

	private INamedContainerProvider createContainerProvider(World worldIn, BlockPos pos) {
		return new INamedContainerProvider() {
			@Override
			public ITextComponent getDisplayName() {
				return new TranslationTextComponent("screen.darg.corrupted_crafting_table");
			}

			@Nullable
			@Override
			public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
				return new CorruptedCraftingTableContainer(i, worldIn, pos, playerInventory, playerEntity);
			}
		};
	}


	public CorruptedCraftingTable(Properties p_i48440_1_) {
		super(p_i48440_1_);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean hasTileEntity(BlockState state) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		// TODO Auto-generated method stub
		return ModTileEntities.CORRUPTED_CRAFTING_TABLE_TILE.get().create();
	}


}
