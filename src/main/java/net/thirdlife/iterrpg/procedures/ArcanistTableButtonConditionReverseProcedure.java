package net.thirdlife.iterrpg.procedures;

import net.thirdlife.iterrpg.init.ItemRegistry;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;
import java.util.Map;

public class ArcanistTableButtonConditionReverseProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		ItemStack initial = ItemStack.EMPTY;
		ItemStack output = ItemStack.EMPTY;
		ItemStack resource1 = ItemStack.EMPTY;
		ItemStack resource2 = ItemStack.EMPTY;
		ItemStack resource3 = ItemStack.EMPTY;
		double chance = 0;
		initial = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY);
		output = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY);
		resource1 = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY);
		resource2 = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY);
		resource3 = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY);
		if (output.getItem() == ItemStack.EMPTY.getItem()) {
			if (initial.getItem() == ItemRegistry.UNIDENTIFIED_SPELL.get() && resource1.getItem() == Items.PAPER && resource2.getItem() == Items.INK_SAC && resource3.getItem() == ItemStack.EMPTY.getItem()) {
				if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5) {
					return false;
				}
			}
			if (initial.is(ItemTags.create(new ResourceLocation("iter_rpg:spell_scrolls"))) && resource1.getItem() == Items.PAPER && resource2.getItem() == Items.INK_SAC && resource3.getItem() == ItemRegistry.GIST.get()
					&& resource3.getCount() >= 5) {
				if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5) {
					return false;
				}
			}
		}
		return true;
	}
}
