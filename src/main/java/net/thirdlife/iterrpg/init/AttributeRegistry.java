/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.thirdlife.iterrpg.init;

import net.thirdlife.iterrpg.IterRpgMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AttributeRegistry {
	public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, IterRpgMod.MOD_ID);
	public static final RegistryObject<Attribute> BASE_MANA_REGENERATION = ATTRIBUTES.register("base_mana_regeneration",
			() -> (new RangedAttribute("attribute." + IterRpgMod.MOD_ID + ".base_mana_regeneration", 0.025, 0, Integer.MAX_VALUE)).setSyncable(true));
	public static final RegistryObject<Attribute> BASE_MANA_CAPACITY = ATTRIBUTES.register("base_mana_capacity",
			() -> (new RangedAttribute("attribute." + IterRpgMod.MOD_ID + ".base_mana_capacity", 50, 0, Integer.MAX_VALUE)).setSyncable(true));
	public static final RegistryObject<Attribute> BONUS_DAMAGE = ATTRIBUTES.register("bonus_damage",
			() -> (new RangedAttribute("attribute." + IterRpgMod.MOD_ID + ".bonus_damage", 0, 0, Integer.MAX_VALUE)).setSyncable(true));

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, BASE_MANA_REGENERATION.get());
		event.add(EntityType.PLAYER, BASE_MANA_CAPACITY.get());
		event.add(EntityType.PLAYER, BONUS_DAMAGE.get());
	}

	@Mod.EventBusSubscriber
	private class Utils {
		@SubscribeEvent
		public static void persistAttributes(PlayerEvent.Clone event) {
			Player oldP = event.getOriginal();
			Player newP = event.getEntity();
			newP.getAttribute(BASE_MANA_REGENERATION.get()).setBaseValue(oldP.getAttribute(BASE_MANA_REGENERATION.get()).getBaseValue());
			newP.getAttribute(BASE_MANA_CAPACITY.get()).setBaseValue(oldP.getAttribute(BASE_MANA_CAPACITY.get()).getBaseValue());
		}
	}
}
