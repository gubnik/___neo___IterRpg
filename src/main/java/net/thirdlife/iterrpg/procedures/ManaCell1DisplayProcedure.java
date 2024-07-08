package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;

import net.minecraft.world.entity.Entity;

public class ManaCell1DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		String mana = "";
		double percentage = 0;
		double iter = 0;
		percentage = ((entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).Mana
				/ (entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).MaxMana) * 10;
		iter = 1;
		if (percentage >= iter) {
			return true;
		}
		return false;
	}
}
