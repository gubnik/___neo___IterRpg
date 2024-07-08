
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.thirdlife.iterrpg.init;

import net.thirdlife.iterrpg.common.block.entity.VoidMawBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.VaseDecoBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.TwiffleBlockBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.TearCatcherBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.SpireSpawnerBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.SmallVaseDecoBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.SacredSaplingBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.RunicGrimstoneBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.RunicGrimstoneActiveBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.GunpowderBarrelBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.GrimaceTrapBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.GrimSoultrapBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.GrimLockerBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.GrandSpireSpawnerBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.GoblinSpawnerBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.GiantPhantomChainBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.DrillBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.BigVaseDecoBlockEntity;
import net.thirdlife.iterrpg.common.block.entity.ArcaneFlowerSeedsBlockEntity;
import net.thirdlife.iterrpg.IterRpgMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class IterRpgModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, IterRpgMod.MOD_ID);
	public static final RegistryObject<BlockEntityType<?>> ARCANE_FLOWER_SEEDS = register("arcane_flower_seeds", BlockRegistry.ARCANE_FLOWER_SEEDS, ArcaneFlowerSeedsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TWIFFLE_BLOCK = register("twiffle_block", BlockRegistry.TWIFFLE_BLOCK, TwiffleBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMALL_VASE_DECO = register("small_vase_deco", BlockRegistry.SMALL_VASE_DECO, SmallVaseDecoBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VASE_DECO = register("vase_deco", BlockRegistry.VASE_DECO, VaseDecoBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIG_VASE_DECO = register("big_vase_deco", BlockRegistry.BIG_VASE_DECO, BigVaseDecoBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GUNPOWDER_BARREL = register("gunpowder_barrel", BlockRegistry.GUNPOWDER_BARREL, GunpowderBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DRILL = register("drill", BlockRegistry.DRILL, DrillBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SACRED_SAPLING = register("sacred_sapling", BlockRegistry.SACRED_SAPLING, SacredSaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOBLIN_SPAWNER = register("goblin_spawner", BlockRegistry.GOBLIN_SPAWNER, GoblinSpawnerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRIM_SOULTRAP = register("grim_soultrap", BlockRegistry.GRIM_SOULTRAP, GrimSoultrapBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RUNIC_GRIMSTONE = register("runic_grimstone", BlockRegistry.RUNIC_GRIMSTONE, RunicGrimstoneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RUNIC_GRIMSTONE_ACTIVE = register("runic_grimstone_active", BlockRegistry.RUNIC_GRIMSTONE_ACTIVE, RunicGrimstoneActiveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GIANT_PHANTOM_CHAIN = register("giant_phantom_chain", BlockRegistry.GIANT_PHANTOM_CHAIN, GiantPhantomChainBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPIRE_SPAWNER = register("spire_spawner", BlockRegistry.SPIRE_SPAWNER, SpireSpawnerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRAND_SPIRE_SPAWNER = register("grand_spire_spawner", BlockRegistry.GRAND_SPIRE_SPAWNER, GrandSpireSpawnerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRIMACE_TRAP = register("grimace_trap", BlockRegistry.GRIMACE_TRAP, GrimaceTrapBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEAR_CATCHER = register("tear_catcher", BlockRegistry.TEAR_CATCHER, TearCatcherBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRIM_LOCKER = register("grim_locker", BlockRegistry.GRIM_LOCKER, GrimLockerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VOID_MAW = register("void_maw", BlockRegistry.VOID_MAW, VoidMawBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
