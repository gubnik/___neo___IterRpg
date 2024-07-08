package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;

import net.minecraft.world.level.LevelAccessor;

public class SealsResetProcedure {
	public static void execute(LevelAccessor world) {
		double distance = 0;
		double xof = 0;
		double yof = 0;
		double zof = 0;
		GlobalVariables.MapVariables.get(world).unlocked_earth = false;
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).unlocked_water = false;
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).unlocked_air = false;
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).unlocked_fire = false;
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).unlocked_void = false;
		GlobalVariables.MapVariables.get(world).syncData(world);
	}
}
