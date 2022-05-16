package com.puncix.darg.common.items;

import com.puncix.darg.core.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.EndPortalBlock;
import net.minecraft.block.EndPortalFrameBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TNTPlacer extends Item {


    public TNTPlacer(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        BlockPos pos = context.getPos();

        if(!context.getWorld().getBlockState(pos).matchesBlock(Blocks.BEDROCK) && !context.getWorld().getBlockState(pos).matchesBlock(Blocks.OBSIDIAN)&&
        !context.getWorld().getBlockState(pos).matchesBlock(BlockInit.CRAFTING_HAND.get())&&!context.getWorld().getBlockState(pos).matchesBlock(BlockInit.GOLD_PRODUCING_CHALICE.get())
        && !context.getWorld().getBlockState(pos).matchesBlock(Blocks.TNT)){
            context.getWorld().setBlockState(pos, Blocks.TNT.getDefaultState());
            context.getItem().damageItem(1,context.getPlayer(),player -> player.sendBreakAnimation(context.getHand()));

        }
        else if(context.getWorld().getBlockState(pos).matchesBlock(Blocks.TNT)){
            context.getWorld().getBlockState(pos).catchFire(context.getWorld(),pos,context.getFace(),context.getPlayer());

        }
        return super.onItemUse(context);
    }


}
