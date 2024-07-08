package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.init.BlockRegistry;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GoblinDungeonPrepareProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.GOBLIN_DUNGEON_GEN.get().defaultBlockState(), 3);
		world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 20);
	}
}
