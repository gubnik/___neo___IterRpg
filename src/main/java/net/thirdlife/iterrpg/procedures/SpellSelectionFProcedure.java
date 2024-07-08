package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;

import net.minecraft.world.entity.Entity;

public class SpellSelectionFProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).SelectedSpell < 6) {
			{
				double _setval = (entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).SelectedSpell + 1;
				entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSpell = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = 1;
				entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSpell = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
