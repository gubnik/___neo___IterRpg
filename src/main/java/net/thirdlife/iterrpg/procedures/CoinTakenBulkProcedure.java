package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;
import net.thirdlife.iterrpg.init.ItemRegistry;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CoinTakenBulkProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double amount = 0;
		for (int index0 = 0; index0 < 63; index0++) {
			if ((entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).PlayerCoinAmount > 1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ItemRegistry.COIN.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				{
					double _setval = (entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).PlayerCoinAmount - 1;
					entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerCoinAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
