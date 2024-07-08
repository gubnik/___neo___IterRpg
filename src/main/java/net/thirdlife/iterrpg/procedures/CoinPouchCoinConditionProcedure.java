package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.init.ItemRegistry;
import net.thirdlife.iterrpg.init.BlockRegistry;

import net.minecraft.world.item.ItemStack;

public class CoinPouchCoinConditionProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getItem() == ItemRegistry.COIN.get() || itemstack.getItem() == BlockRegistry.COIN_PILE.get().asItem() || itemstack.getItem() == BlockRegistry.COIN_BLOCK.get().asItem()) {
			return false;
		}
		return true;
	}
}
