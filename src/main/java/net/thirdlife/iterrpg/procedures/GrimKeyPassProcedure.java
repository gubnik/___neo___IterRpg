package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.init.IterRpgModParticleTypes;
import net.thirdlife.iterrpg.init.BlockRegistry;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

public class GrimKeyPassProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BlockRegistry.GRIM_KEYHOLE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.VOID_AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (IterRpgModParticleTypes.WEEPER_TEAR_PARTICLE.get()), (x + 0.5), (y + 0.5), (z + 0.5), 32, 0.25, 0.25, 0.25, 0.025);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BlockRegistry.CHARGED_GRIMSTONE_BRICKS.get()) {
			world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.GRIMSTONE_BRICKS.get().defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (IterRpgModParticleTypes.WEEPER_TEAR_PARTICLE.get()), (x + 0.5), (y + 0.5), (z + 0.5), 32, 0.25, 0.25, 0.25, 0.025);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BlockRegistry.GRIM_SOULTRAP.get()) {
			world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.POLISHED_GRIMSTONE.get().defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (IterRpgModParticleTypes.WEEPER_TEAR_PARTICLE.get()), (x + 0.5), (y + 0.5), (z + 0.5), 32, 0.25, 0.25, 0.25, 0.025);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BlockRegistry.BARRIER_PROJECTOR.get()) {
			world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.POLISHED_GRIMSTONE.get().defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (IterRpgModParticleTypes.WEEPER_TEAR_PARTICLE.get()), (x + 0.5), (y + 0.5), (z + 0.5), 32, 0.25, 0.25, 0.25, 0.025);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BlockRegistry.RUNIC_GRIMSTONE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BlockRegistry.GRIMACE_TRAP.get()) {
			world.setBlock(BlockPos.containing(x, y, z), BlockRegistry.POLISHED_GRIMSTONE.get().defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (IterRpgModParticleTypes.WEEPER_TEAR_PARTICLE.get()), (x + 0.5), (y + 0.5), (z + 0.5), 32, 0.25, 0.25, 0.25, 0.025);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BlockRegistry.SPIRE_SPAWNER.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BlockRegistry.GRAND_SPIRE_SPAWNER.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (IterRpgModParticleTypes.WEEPER_TEAR_PARTICLE.get()), (x + 0.5), (y + 0.5), (z + 0.5), 32, 0.25, 0.25, 0.25, 0.025);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_eye.death")), SoundSource.BLOCKS, 1, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		}
	}
}
