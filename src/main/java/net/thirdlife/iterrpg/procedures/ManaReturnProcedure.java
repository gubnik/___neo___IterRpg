package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;

import net.minecraft.world.entity.Entity;

public class ManaReturnProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String mana = "";
		double percentage = 0;
		double iter = 0;
		return Math.round((entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).Mana) + "/"
				+ Math.round((entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).MaxMana);
	}
}
