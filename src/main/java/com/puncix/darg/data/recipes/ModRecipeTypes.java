package com.puncix.darg.data.recipes;

import com.puncix.darg.Darg;
import com.puncix.darg.client.util.DargTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeTypes {
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER =
        DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Darg.MOD_ID);

    public static final RegistryObject<CorruptedCraftingTableRecipe.Serializer> CORRUPTED_SERIALIZER =
            RECIPE_SERIALIZER.register("corruption", CorruptedCraftingTableRecipe.Serializer::new);

    public static IRecipeType<CorruptedCraftingTableRecipe> CORRUPTED_RECIPE =
            new CorruptedCraftingTableRecipe.CorruptedCraftingTableRecipeType();

    public static final RegistryObject<CraftingHandRecipe.Serializer> HAND_SERIALIZER =
            RECIPE_SERIALIZER.register("corruption2", CraftingHandRecipe.Serializer::new);

    public static IRecipeType<CraftingHandRecipe> HAND_RECIPE =
            new CraftingHandRecipe.CraftingHandRecipeType();

    public static void register(IEventBus bus){
        RECIPE_SERIALIZER.register(bus);

        Registry.register(Registry.RECIPE_TYPE, CorruptedCraftingTableRecipe.TYPE_ID, CORRUPTED_RECIPE);
        Registry.register(Registry.RECIPE_TYPE, CraftingHandRecipe.TYPE_ID, HAND_RECIPE);

    }
}
