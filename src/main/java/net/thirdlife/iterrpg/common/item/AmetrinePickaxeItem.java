
package net.thirdlife.iterrpg.common.item;

import net.thirdlife.iterrpg.init.ItemRegistry;
import net.thirdlife.iterrpg.procedures.AmetrineMendProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class AmetrinePickaxeItem extends PickaxeItem {
	public AmetrinePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 152;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ItemRegistry.AMETRINE_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		AmetrineMendProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
