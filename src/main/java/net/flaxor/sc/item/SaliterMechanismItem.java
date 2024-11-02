
package net.flaxor.sc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SaliterMechanismItem extends Item {
	public SaliterMechanismItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
