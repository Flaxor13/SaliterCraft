
package net.flaxor.sc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.flaxor.sc.init.ScModFluids;

public class SaliterFluidItem extends BucketItem {
	public SaliterFluidItem() {
		super(ScModFluids.SALITER_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
