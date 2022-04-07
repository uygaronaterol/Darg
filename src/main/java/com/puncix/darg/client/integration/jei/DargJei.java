package com.puncix.darg.client.integration.jei;

import com.puncix.darg.Darg;
import com.puncix.darg.core.init.BlockInit;
import com.puncix.darg.data.recipes.CorruptedCraftingTableRecipe;
import com.puncix.darg.data.recipes.CraftingHandRecipe;
import com.puncix.darg.data.recipes.ModRecipeTypes;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;

import java.util.Objects;
import java.util.stream.Collectors;
@JeiPlugin
public class DargJei implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Darg.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(
                new CorruptedCraftingTableRecipeCategory(registration.getJeiHelpers().getGuiHelper())
        );
        registration.addRecipeCategories(
                new CraftingHandRecipeCategory(registration.getJeiHelpers().getGuiHelper())
        );
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().world).getRecipeManager();
        registration.addRecipes(rm.getRecipesForType(ModRecipeTypes.CORRUPTED_RECIPE).stream()
                        .filter(r -> r instanceof CorruptedCraftingTableRecipe).collect(Collectors.toList()),
                CorruptedCraftingTableRecipeCategory.UID);
        registration.addRecipes(rm.getRecipesForType(ModRecipeTypes.HAND_RECIPE).stream()
                        .filter(r -> r instanceof CraftingHandRecipe).collect(Collectors.toList()),
                CraftingHandRecipeCategory.UID);
    }
}
