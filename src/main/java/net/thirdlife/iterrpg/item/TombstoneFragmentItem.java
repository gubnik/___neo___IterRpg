
package net.thirdlife.iterrpg.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TombstoneFragmentItem extends Item {
	public TombstoneFragmentItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
