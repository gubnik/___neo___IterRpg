package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.init.ItemRegistry;

import net.minecraft.world.item.ItemStack;

public class GrimLockerFuelProcedure {
	public static boolean execute(ItemStack itemstack) {
		ItemStack item = ItemStack.EMPTY;
		ItemStack fuel = ItemStack.EMPTY;
		ItemStack bottle = ItemStack.EMPTY;
		if (itemstack.getItem() == ItemRegistry.BOTTLE_OF_OBSIDIAN_TEARS.get()) {
			return false;
		}
		return true;
	}
}
