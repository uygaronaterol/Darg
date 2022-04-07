package com.puncix.darg.data.recipes;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.puncix.darg.core.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class CraftingHandRecipe implements ICraftingHandRecipe{
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public CraftingHandRecipe(ResourceLocation id, ItemStack output, NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(IInventory inv, World worldIn) {
        if(recipeItems.get(0).test(inv.getStackInSlot(0))&&
                recipeItems.get(1).test(inv.getStackInSlot(1))&&
                recipeItems.get(2).test(inv.getStackInSlot(2))&&
                recipeItems.get(3).test(inv.getStackInSlot(3))&&
                recipeItems.get(4).test(inv.getStackInSlot(4))&&
                recipeItems.get(5).test(inv.getStackInSlot(5))&&
                recipeItems.get(6).test(inv.getStackInSlot(6))&&
                recipeItems.get(7).test(inv.getStackInSlot(7))&&
                recipeItems.get(8).test(inv.getStackInSlot(8))&&
                recipeItems.get(9).test(inv.getStackInSlot(9))&&
                recipeItems.get(10).test(inv.getStackInSlot(10))&&
                recipeItems.get(11).test(inv.getStackInSlot(11))&&
                recipeItems.get(12).test(inv.getStackInSlot(12))){
            return recipeItems.get(13).test(inv.getStackInSlot(13));
        }
        return false;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    @Override
    public ItemStack getIcon() {
        return new ItemStack(BlockInit.CRAFTING_HAND.get());
    }

    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        return output;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {

        return ModRecipeTypes.HAND_SERIALIZER.get();
    }

    public static class CraftingHandRecipeType implements IRecipeType<CraftingHandRecipe> {
        @Override
        public String toString() {
            return CraftingHandRecipe.TYPE_ID.toString();
        }
    }
    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>>
            implements IRecipeSerializer<CraftingHandRecipe> {

        @Override
        public CraftingHandRecipe read(ResourceLocation recipeId, JsonObject json) {
            ItemStack output = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "output"));
            JsonArray ingredients = JSONUtils.getJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(14, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                if(!Ingredient.deserialize(ingredients.get(i)).test(Blocks.AIR.asItem().getDefaultInstance())) {
                    inputs.set(i, Ingredient.deserialize(ingredients.get(i)));
                }
            }

            //int z = 0;
            //for( int j = 0; j < inputs.size(); j++){
            //for( int k = 0; k < inputs.size(); k++){
            //if(thaIngredients.charAt(j) == keys.get(k).getAsCharacter()){
            //ingredients = JSONUtils.getJsonArray(json, keys.get(k).toString());
            // inputs.set(z, Ingredient.deserialize(ingredients.get(0)));
            // k+=10;
            //}
            //}
            //z++;
            //}

            return new CraftingHandRecipe(recipeId, output,
                    inputs);
        }

        @Override
        public CraftingHandRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(14, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.read(buffer));
            }

            ItemStack output = buffer.readItemStack();
            return new CraftingHandRecipe(recipeId, output,
                    inputs);
        }

        @Override
        public void write(PacketBuffer buffer, CraftingHandRecipe recipe) {
            buffer.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buffer);
            }
            buffer.writeItemStack(recipe.getRecipeOutput(), false);
        }
    }
}
