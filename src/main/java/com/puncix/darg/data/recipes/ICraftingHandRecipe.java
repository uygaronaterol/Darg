package com.puncix.darg.data.recipes;

import com.puncix.darg.Darg;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public interface ICraftingHandRecipe extends IRecipe<IInventory> {
    ResourceLocation TYPE_ID = new ResourceLocation(Darg.MOD_ID, "corruption2");

    @Override
    default IRecipeType<?> getType(){
        return Registry.RECIPE_TYPE.getOptional(TYPE_ID).get();
    }

    @Override
    default boolean canFit(int width, int height) {
        return true;
    }

    @Override
    default boolean isDynamic(){
        return true;
    }
}
