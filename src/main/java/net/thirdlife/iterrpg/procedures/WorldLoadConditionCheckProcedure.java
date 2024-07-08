package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;
import net.thirdlife.iterrpg.IterConfigConfiguration;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import java.io.File;

@Mod.EventBusSubscriber
public class WorldLoadConditionCheckProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		File configfile = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		com.google.gson.JsonObject goblins = new com.google.gson.JsonObject();
		com.google.gson.JsonObject magic = new com.google.gson.JsonObject();
		com.google.gson.JsonObject mobs = new com.google.gson.JsonObject();
		com.google.gson.JsonObject generation = new com.google.gson.JsonObject();
		com.google.gson.JsonObject functions = new com.google.gson.JsonObject();
		com.google.gson.JsonObject checkfor = new com.google.gson.JsonObject();
		boolean flag = false;
		GlobalVariables.MapVariables.get(world).config_abyss_quartz = IterConfigConfiguration.ABYSSQUARTZ.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_vases = IterConfigConfiguration.VASES.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_spider_eggs = IterConfigConfiguration.SPIDER_EGGS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_geodes = IterConfigConfiguration.GEODITES.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_geodes_drop = IterConfigConfiguration.GEODE_DROP.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_spider_catacombs = IterConfigConfiguration.ARTHROPOD_CATACOMBS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_generic_dungeons = IterConfigConfiguration.GENERIC_DUNGEONS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_goblin_camps = IterConfigConfiguration.GOBLIN_CAMPS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_goblin_patrols = IterConfigConfiguration.GOBLIN_PATROLS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_sorrow_spire = IterConfigConfiguration.SORROW_SPIRE.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_elementals = IterConfigConfiguration.ELEMENTALS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_demons = IterConfigConfiguration.DEMONS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_demon_hive = IterConfigConfiguration.DEMON_HIVE.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_spiderlings = IterConfigConfiguration.SPIDERS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_giant_spiders = IterConfigConfiguration.SPIDERS.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_geodrill_time = (double) IterConfigConfiguration.GEODRILL_TIME.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_goblinspawner_time = (double) IterConfigConfiguration.GOBLIN_SPAWNER_CYCLE.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_event_rate = (double) IterConfigConfiguration.EVENT_RATE.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_coins_drop = IterConfigConfiguration.COIN_DROP.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_skies_of_ruin = IterConfigConfiguration.SKIES_OF_RUIN.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
		GlobalVariables.MapVariables.get(world).config_skies_of_ruin_repeatable = IterConfigConfiguration.SKIES_OF_RUIN_REPEATABLE.get();
		GlobalVariables.MapVariables.get(world).syncData(world);
	}
}
