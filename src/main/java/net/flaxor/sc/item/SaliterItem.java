
package net.flaxor.sc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SaliterItem extends Item {
	public SaliterItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
