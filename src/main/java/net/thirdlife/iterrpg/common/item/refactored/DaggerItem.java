package net.thirdlife.iterrpg.common.item.refactored;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.thirdlife.iterrpg.init.AttributeRegistry;

import java.util.UUID;

public class DaggerItem extends SwordItem {

    public static final UUID BASE_BONUS_DAMAGE_UUID = UUID.fromString("400bf5a6-350f-4be8-a7bd-7c0e259b0318");

    public DaggerItem(Tier pTier, Properties pProperties) {
        super(pTier, 1, -2, pProperties);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers (EquipmentSlot slot, ItemStack itemStack)
    {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(this.getDefaultAttributeModifiers(slot));
        if (slot == EquipmentSlot.OFFHAND)
        {
            builder.put(AttributeRegistry.BONUS_DAMAGE.get(), new AttributeModifier(BASE_BONUS_DAMAGE_UUID, "Bonus damage modifier", this.getDamage(), AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }
}
