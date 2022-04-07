package com.puncix.darg.client.integration.jei;

import com.puncix.darg.Darg;
import com.puncix.darg.core.init.BlockInit;
import com.puncix.darg.data.recipes.CorruptedCraftingTableRecipe;
import com.puncix.darg.data.recipes.CraftingHandRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class CraftingHandRecipeCategory implements IRecipeCategory<CraftingHandRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(Darg.MOD_ID, "corruption2");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Darg.MOD_ID, "textures/gui/crafting_hand_gui.png");
    private final IDrawable background;
    private final IDrawable icon;

    public CraftingHandRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 256, 140);
        this.icon = helper.createDrawableIngredient(new ItemStack(BlockInit.CRAFTING_HAND.get()));
    }


    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends CraftingHandRecipe> getRecipeClass() {
        return CraftingHandRecipe.class;
    }

    @Override
    public String getTitle() {
        return BlockInit.CRAFTING_HAND.get().getTranslatedName().getString();
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
    public void setIngredients(CraftingHandRecipe corruptedCraftingTableRecipe, IIngredients iIngredients) {
        iIngredients.setInputIngredients(corruptedCraftingTableRecipe.getIngredients());
        iIngredients.setOutput(VanillaTypes.ITEM, corruptedCraftingTableRecipe.getRecipeOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout iRecipeLayout, CraftingHandRecipe craftingHandRecipe, IIngredients iIngredients) {
        int z = 0;
        for( int x = 73; x < 110; x+=18 ) {
            for( int y = 68; y < 110; y+=18 ) {
                iRecipeLayout.getItemStacks().init(z, true, x, y);
                z++;
            }

        }

        iRecipeLayout.getItemStacks().init(9, true, 54, 30);
        iRecipeLayout.getItemStacks().init(10, true, 79, 26);
        iRecipeLayout.getItemStacks().init(11, true, 103, 24);
        iRecipeLayout.getItemStacks().init(12, true, 123, 30);
        iRecipeLayout.getItemStacks().init(13, true, 142, 79);

        iRecipeLayout.getItemStacks().init(14, false, 193, 80);
        iRecipeLayout.getItemStacks().set(iIngredients);
    }
}
