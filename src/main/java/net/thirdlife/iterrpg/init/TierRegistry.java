package net.thirdlife.iterrpg.init;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum TierRegistry implements Tier {

    AMETRINE (152, 7f, 0.5f, 3, 32, ItemRegistry.AMETRINE_INGOT::get);

    private final int useCount;
    private final float speed;
    private final float attackDamageBonus;
    private final int level;
    private final int enchantmentValue;
    private final Supplier<ItemLike> ingredientSupplier;

    TierRegistry(int uses, float speed, float attackDamageBonus, int level, int enchantmentValue, Supplier<ItemLike> ingredientSupplier)
    {
        this.useCount = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.ingredientSupplier = ingredientSupplier;
    }

    @Override
    public int getUses() {
        return this.useCount;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(this.ingredientSupplier.get());
    }
}