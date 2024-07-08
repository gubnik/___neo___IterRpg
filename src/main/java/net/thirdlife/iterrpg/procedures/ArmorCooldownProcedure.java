package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.common.network.GlobalVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ArmorCooldownProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).ElementalArmorCooldown > 0) {
			{
				double _setval = (entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).ElementalArmorCooldown - 1;
				entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ElementalArmorCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).ElementalArmorPassiveCooldown > 0) {
			{
				double _setval = (entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlobalVariables.PlayerVariables())).ElementalArmorPassiveCooldown - 1;
				entity.getCapability(GlobalVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ElementalArmorPassiveCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
