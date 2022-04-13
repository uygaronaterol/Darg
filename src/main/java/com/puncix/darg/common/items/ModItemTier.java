package com.puncix.darg.common.items;


import java.util.function.Supplier;

import com.puncix.darg.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTier implements IItemTier{
	CORRUPTED_STONE(2, 150, 4f, 6, 10, () -> Ingredient.fromItems(ItemInit.CORRUPTED_STONE.get())),
	CORRUPTED_COBBLESTONE(2, 150, 4f, 6, 10, () -> Ingredient.fromItems(ItemInit.CORRUPTED_COBBLESTONE.get())),
	CORRUPTED_BONE(3, 750, 4f, 7, 12, () -> Ingredient.fromItems(ItemInit.CORRUPTED_BONE.get())),
	CORRUPTION(6, 15000, 15f, 12, 22, () -> Ingredient.fromItems(ItemInit.CORRUPTION.get()));
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantablity;
	private final LazyValue<Ingredient> repairMaterial;
	

	ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, 
			Supplier<Ingredient> repairMaterial ){
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantablity = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public float getAttackDamage() {
		return attackDamage;
	}

	@Override
	public float getEfficiency() {
		return efficiency;
	}



	@Override
	public int getMaxUses() {
		return maxUses;
	}

	@Override
	public int getEnchantability() {
		return 0;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return repairMaterial.getValue();
	}

	@Override
	public int getHarvestLevel() {
		return harvestLevel;
	}



}
