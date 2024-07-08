package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;

import net.minecraft.world.level.LevelAccessor;

public class FireElementalSpawnConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double count = 0;
		if (ElementalsSpawnConditionProcedure.execute(world, x, y, z) && GlobalVariables.MapVariables.get(world).unlocked_fire) {
			return true;
		}
		return false;
	}
}
