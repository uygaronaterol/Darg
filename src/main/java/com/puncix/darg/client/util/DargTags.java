package com.puncix.darg.client.util;

import com.puncix.darg.Darg;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class DargTags {
	public static class Blocks{
		
		public static final Tags.IOptionalNamedTag<Block> CORRUPTED_CRAFTING_TABLE = createTag("elnomnom");
		private static Tags.IOptionalNamedTag<Block> createTag(String name){
			return BlockTags.createOptional(new ResourceLocation(Darg.MOD_ID, name));
		}
		private static Tags.IOptionalNamedTag<Block> createForgeTag(String name){
			return BlockTags.createOptional(new ResourceLocation("forge", name));
		}
	}
	public static class Items{

		private static Tags.IOptionalNamedTag<Item> createTag(String name){
			return ItemTags.createOptional(new ResourceLocation(Darg.MOD_ID, name));
		}
		private static Tags.IOptionalNamedTag<Item> createForgeTag(String name){
			return ItemTags.createOptional(new ResourceLocation("forge", name));
		}
	}
}
