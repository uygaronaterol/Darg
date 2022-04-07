package com.puncix.darg.client.integration.jei;

import com.puncix.darg.Darg;
import com.puncix.darg.core.init.BlockInit;
import com.puncix.darg.data.recipes.CorruptedCraftingTableRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.items.SlotItemHandler;

public class CorruptedCraftingTableRecipeCategory implements IRecipeCategory<CorruptedCraftingTableRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(Darg.MOD_ID, "corruption");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Darg.MOD_ID, "textures/gui/corrupted_crafting_table_gui.png");
    private final IDrawable background;
    private final IDrawable icon;

    public CorruptedCraftingTableRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(new ItemStack(BlockInit.CORRUPTED_CRAFTING_TABLE.get()));
    }


    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends CorruptedCraftingTableRecipe> getRecipeClass() {
        return CorruptedCraftingTableRecipe.class;
    }

    @Override
    public String getTitle() {
        return BlockInit.CORRUPTED_CRAFTING_TABLE.get().getTranslatedName().getString();
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setIngredients(CorruptedCraftingTableRecipe corruptedCraftingTableRecipe, IIngredients iIngredients) {
        iIngredients.setInputIngredients(corruptedCraftingTableRecipe.getIngredients());
        iIngredients.setOutput(VanillaTypes.ITEM, corruptedCraftingTableRecipe.getRecipeOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout iRecipeLayout, CorruptedCraftingTableRecipe corruptedCraftingTableRecipe, IIngredients iIngredients) {
        int z = 0;
        for( int x = 30; x < 70; x+=18 ) {
            for( int y = 19; y < 60; y+=18 ) {
                iRecipeLayout.getItemStacks().init(z, true, x, y);
                z++;
            }

        }
        iRecipeLayout.getItemStacks().init(9, true, 95, 33);
        iRecipeLayout.getItemStacks().init(10, false, 124, 37);
        iRecipeLayout.getItemStacks().set(iIngredients);
    }
}
