package com.puncix.darg.common.items;

import com.puncix.darg.core.init.BlockInit;
import com.puncix.darg.core.init.EnchantmentInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.data.loot.ChestLootTables;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TimeFreezeEnchantmentKit extends Item{
    public TimeFreezeEnchantmentKit(Item.Properties properties) {
        super(properties);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.getHeldItem(handIn).shrink(1);
        ItemStack itemstack = EnchantedBookItem.getEnchantedItemStack(new EnchantmentData(EnchantmentInit.TIME_FREEZE.get(),
                1));
        playerIn.addItemStackToInventory(itemstack);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
