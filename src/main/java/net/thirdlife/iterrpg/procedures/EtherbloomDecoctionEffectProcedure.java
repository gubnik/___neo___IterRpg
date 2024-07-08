package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;

import net.minecraft.world.entity.Entity;

public class EtherbloomDecoctionEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).Mana + 5
					+ (entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).MaxMana * 0.05;
			entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Mana = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
