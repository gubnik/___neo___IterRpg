package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.init.BlockRegistry;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class RandomCaveEncounterActivateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double decide = 0;
		double chance = 0;
		decide = Mth.nextInt(RandomSource.create(), 1, 6);
		if (decide <= 4 && decide >= 1) {
			chance = Mth.nextDouble(RandomSource.create(), 1, 12);
			if (chance <= 12 && chance >= 9) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.BIG_VASE.get().defaultBlockState(), 3);
			} else if (chance <= 9 && chance >= 5) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.VASE.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.SMALL_VASE.get().defaultBlockState(), 3);
			}
		} else if (decide == 5) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.SPIDER_EGG.get().defaultBlockState(), 3);
		} else if (decide == 6) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.GUNPOWDER_BARREL.get().defaultBlockState(), 3);
		}
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
	}
}
