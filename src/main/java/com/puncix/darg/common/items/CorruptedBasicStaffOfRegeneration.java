package com.puncix.darg.common.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CorruptedBasicStaffOfRegeneration extends Item {


    public CorruptedBasicStaffOfRegeneration(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack stack = playerIn.getHeldItem(handIn);
        if(!worldIn.isRemote){
            playerIn.addPotionEffect( new EffectInstance(Effects.REGENERATION, 600));
            stack.damageItem(1,playerIn,player -> player.sendBreakAnimation(handIn));
            playerIn.getCooldownTracker().setCooldown(this, 1200);
        }
        return ActionResult.resultSuccess(stack);
    }

}
