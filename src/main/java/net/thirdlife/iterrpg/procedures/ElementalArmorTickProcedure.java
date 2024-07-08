package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.init.ItemRegistry;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

public class ElementalArmorTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ItemRegistry.ELEMENTAL_ARMOR_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ItemRegistry.ELEMENTAL_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ItemRegistry.ELEMENTAL_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ItemRegistry.ELEMENTAL_ARMOR_HELMET.get()) {
			if (itemstack.getOrCreateTag().getDouble("element") == 0) {
				EarthArmorSetBonusProcedure.execute(world, x, y, z, entity);
			} else if (itemstack.getOrCreateTag().getDouble("element") == 1) {
				OceanArmorSetBonusProcedure.execute(world, x, y, z, entity);
			} else if (itemstack.getOrCreateTag().getDouble("element") == 2) {
				SkyArmorSetBonusProcedure.execute(entity);
			} else if (itemstack.getOrCreateTag().getDouble("element") == 3) {
				HellArmorSetBonusProcedure.execute(world, x, y, z, entity);
			} else if (itemstack.getOrCreateTag().getDouble("element") == 4) {
				EndArmorSetBonusProcedure.execute(world, x, y, z, entity, itemstack);
			}
			if (itemstack.getOrCreateTag().getDouble("switchcooldown") > 0) {
				itemstack.getOrCreateTag().putDouble("switchcooldown", (itemstack.getOrCreateTag().getDouble("switchcooldown") - 1));
			}
		}
	}
}
