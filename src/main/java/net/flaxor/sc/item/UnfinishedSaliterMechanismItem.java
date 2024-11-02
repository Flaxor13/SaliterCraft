
package net.flaxor.sc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UnfinishedSaliterMechanismItem extends Item {
	public UnfinishedSaliterMechanismItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
