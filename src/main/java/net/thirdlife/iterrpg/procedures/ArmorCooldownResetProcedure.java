package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;

import net.minecraft.world.entity.Entity;

public class ArmorCooldownResetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ElementalArmorCooldown = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ElementalArmorPassiveCooldown = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
