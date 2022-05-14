package com.puncix.darg.common.blocks;

import com.puncix.darg.common.entity.entities.GoldLayingChickenEntity;
import com.puncix.darg.core.init.EntityTypeInit;
import com.puncix.darg.core.init.ParticleInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
        if( rand.nextFloat() < 0.02f){
            GoldLayingChickenEntity entity = new GoldLayingChickenEntity(EntityTypeInit.GOLD_LAYING_CHICKEN.get(),worldIn);
            entity.setPosition(pos.getX(),pos.getY()+1,pos.getZ());
            worldIn.addEntity(entity);

        }
        super.animateTick(stateIn, worldIn, pos, rand);
    }
}
