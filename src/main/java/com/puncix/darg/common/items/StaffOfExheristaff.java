package com.puncix.darg.common.items;

import com.puncix.darg.common.entity.entities.StaffOfExheristaffProjectileEntity;
import com.puncix.darg.core.init.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class StaffOfExheristaff extends Item {


    public StaffOfExheristaff(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack stack = playerIn.getHeldItem(handIn);
        ItemStack stack1 = ItemInit.CORRUPTED_EYE_OF_EXHERISTAFF.get().getDefaultInstance();
        if(!worldIn.isRemote){
            StaffOfExheristaffProjectileEntity soepe = new StaffOfExheristaffProjectileEntity(playerIn, worldIn);
            soepe.setItem(stack1);
            //soepe.shoot( playerIn.rotationPitch, playerIn.rotationYaw, playerIn.rotationYawHead, 1.5F, 1.0F);
            soepe.setDirectionAndMovement( playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0F, 1.5F, 1.0F);

            worldIn.addEntity(soepe);
        }
        return ActionResult.resultSuccess(stack);
    }
}
