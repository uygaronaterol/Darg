package com.puncix.darg.common.tileentities;

import com.puncix.darg.core.init.ItemInit;
import com.puncix.darg.data.recipes.CorruptedCraftingTableRecipe;
import com.puncix.darg.data.recipes.CraftingHandRecipe;
import com.puncix.darg.data.recipes.ModRecipeTypes;
import net.minecraft.block.BlockState;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import java.util.Optional;

public class CraftingHandTile extends TileEntity implements ITickableTileEntity {
    private final ItemStackHandler itemHandler = createHandler();
    private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);
    private static boolean george = false;
    private static int itemCount = 0;
    @Override
    public CompoundNBT write(@Nonnull CompoundNBT p_189515_1_) {
        p_189515_1_.put("inv", itemHandler.serializeNBT());
        return super.write(p_189515_1_);
    }

    @Override
    public void read(BlockState p_230337_1_, @Nonnull CompoundNBT p_230337_2_) {
        itemHandler.deserializeNBT(p_230337_2_.getCompound("inv"));
        super.read(p_230337_1_, p_230337_2_);
    }


    public CraftingHandTile(TileEntityType<?> p_i48289_1_) {

        super(p_i48289_1_);
        // TODO Auto-generated constructor stub
    }
    public CraftingHandTile() {
        this(ModTileEntities.CRAFTING_HAND_TILE.get());
    }

    private ItemStackHandler createHandler() {
        return new ItemStackHandler(15) {
            @Override
            protected void onContentsChanged(int slot) {
                // TODO Auto-generated method stub
                markDirty();
            }

            @Override
            public boolean isItemValid(int slot, ItemStack stack) {
                if(slot == 14 && george ){
                    return true;
                }
                return super.isItemValid(slot, stack);
            }


            @Override
            public int getSlotLimit(int slot) {
                // TODO Auto-generated method stub
                return 64;
            }
            @Override
            public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
                if(george || slot != 14) {
                    if (!isItemValid(slot, stack))
                        return stack;
                    return super.insertItem(slot, stack, simulate);
                }else{
                    return stack;

                }
            }
        };
    }


    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        // TODO Auto-generated method stub
        if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return handler.cast();
        }
        return super.getCapability(cap, side);
    }

    public void craft(){
        Inventory inv = new Inventory(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inv.setInventorySlotContents(i, itemHandler.getStackInSlot(i));
        }

        Optional<CraftingHandRecipe> recipe = world.getRecipeManager()
                .getRecipe(ModRecipeTypes.HAND_RECIPE, inv, world);

        recipe.ifPresent(iRecipe -> {
            ItemStack output = iRecipe.getRecipeOutput();

            craftTheItem(output);


            markDirty();
        });
    }
    private void craftTheItem(ItemStack output) {
        if( itemHandler.getStackInSlot(14).isEmpty()) {
            itemHandler.extractItem(0, 1, false);
            itemHandler.extractItem(1, 1, false);
            itemHandler.extractItem(2, 1, false);
            itemHandler.extractItem(3, 1, false);
            itemHandler.extractItem(4, 1, false);
            itemHandler.extractItem(5, 1, false);
            itemHandler.extractItem(6, 1, false);
            itemHandler.extractItem(7, 1, false);
            itemHandler.extractItem(8, 1, false);
            itemHandler.extractItem(9, 1, false);
            itemHandler.extractItem(10, 1, false);
            itemHandler.extractItem(11, 1, false);
            itemHandler.extractItem(12, 1, false);
            itemHandler.extractItem(13, 1, false);
            george = true;
            itemHandler.insertItem(14, output, false);
            george = false;
        }
    }
    @Override
    public void tick() {
        if (world.isRemote) {
            return;
        }else{

            craft();
        }

    }
}
