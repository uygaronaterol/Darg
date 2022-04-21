package com.puncix.darg.common.items;

import com.puncix.darg.core.init.BlockInit;
import com.puncix.darg.core.init.EnchantmentInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.data.loot.ChestLootTables;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CorruptedEyeOfMedusa extends Item{
    public CorruptedEyeOfMedusa(Item.Properties properties) {
        super(properties);
    }
    @Override
    public ActionResultType onItemUse(ItemUseContext p_195939_1_) {
        // TODO Auto-generated method stub

        World world = p_195939_1_.getWorld();
        BlockPos blockpos = p_195939_1_.getPos();
        BlockState blockstate = world.getBlockState(blockpos);

        if(blockstate.matchesBlock(BlockInit.CORRUPTED_CRAFTING_TABLE.get())) {
            p_195939_1_.getItem().shrink(1);
            ItemStack itemstack = EnchantedBookItem.getEnchantedItemStack(new EnchantmentData(EnchantmentInit.MEDUSA_POISON.get(),
                    1));
            p_195939_1_.getPlayer().addItemStackToInventory(itemstack);
            return ActionResultType.CONSUME;
        }
        else if(blockstate.matchesBlock(BlockInit.CRAFTING_HAND.get())){
            p_195939_1_.getItem().shrink(1);
            ItemStack itemstack = EnchantedBookItem.getEnchantedItemStack(new EnchantmentData(EnchantmentInit.MEDUSA_TURN_STONE.get(),
                    1));
            p_195939_1_.getPlayer().addItemStackToInventory(itemstack);
            return ActionResultType.CONSUME;
        }

        return ActionResultType.FAIL;


    }
}
