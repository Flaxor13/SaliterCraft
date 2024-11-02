
package net.flaxor.sc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SaliterSheetItem extends Item {
	public SaliterSheetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
