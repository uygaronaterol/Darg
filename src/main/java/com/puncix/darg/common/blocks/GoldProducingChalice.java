package com.puncix.darg.common.blocks;

import com.puncix.darg.common.containers.CraftingHandContainer;
import com.puncix.darg.common.containers.GoldProducingChaliceContainer;
import com.puncix.darg.common.entity.entities.GoldLayingChickenEntity;
import com.puncix.darg.common.tileentities.CraftingHandTile;
import com.puncix.darg.common.tileentities.GoldProducingChaliceTile;
import com.puncix.darg.common.tileentities.ModTileEntities;
import com.puncix.darg.core.init.EntityTypeInit;
import com.puncix.darg.core.init.ParticleInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.Random;

public class GoldProducingChalice extends HorizontalBlock {
    public GoldProducingChalice(Properties properties) {
        super(properties);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        float chance = 0.25f;
        if(chance < rand.nextFloat()){
            worldIn.addParticle(ParticleInit.GOLD_PARTICLE.get(),pos.getX()+rand.nextDouble(),pos.getY() + 0.6d,pos.getZ()+rand.nextDouble(),0d,-0.05d,0d);
        }

        super.animateTick(stateIn, worldIn, pos, rand);
    }
    @Override
    public ActionResultType onBlockActivated(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_,
                                             PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if(!p_225533_2_.isRemote()) {
            TileEntity tileEntity = p_225533_2_.getTileEntity(p_225533_3_);
            if(tileEntity instanceof GoldProducingChaliceTile) {
                INamedContainerProvider containerProvider = createContainerProvider(p_225533_2_,p_225533_3_);
                NetworkHooks.openGui((ServerPlayerEntity) p_225533_4_, containerProvider, tileEntity.getPos());
            }else {
                throw new IllegalStateException("Our container provider is missing");
            }

        }
        return ActionResultType.SUCCESS;
    }

    private INamedContainerProvider createContainerProvider(World worldIn, BlockPos pos) {
        return new INamedContainerProvider() {
            @Override
            public ITextComponent getDisplayName() {
                return new TranslationTextComponent("screen.darg.gold_producing_chalice");
            }

            @Nullable
            @Override
            public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
                return new GoldProducingChaliceContainer(i, worldIn, pos, playerInventory, playerEntity);
            }
        };
    }
    @Override
    public boolean hasTileEntity(BlockState state) {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        // TODO Auto-generated method stub
        return ModTileEntities.GOLD_PRODUCING_CHALICE_TILE.get().create();
    }
}
