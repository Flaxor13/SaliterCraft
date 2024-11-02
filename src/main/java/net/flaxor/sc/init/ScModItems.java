
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.flaxor.sc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.flaxor.sc.item.UnfinishedSaliterMechanismItem;
import net.flaxor.sc.item.SaliterSheetItem;
import net.flaxor.sc.item.SaliterMechanismItem;
import net.flaxor.sc.item.SaliterItem;
import net.flaxor.sc.item.SaliterFluidItem;
import net.flaxor.sc.item.SaliterCompoundItem;
import net.flaxor.sc.item.SaliterBarItem;
import net.flaxor.sc.item.BigkaxeItem;
import net.flaxor.sc.item.BigkaxeHeadItem;
import net.flaxor.sc.item.BackpackItem;
import net.flaxor.sc.ScMod;

public class ScModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ScMod.MODID);
	public static final RegistryObject<Item> BIGKAXE = REGISTRY.register("bigkaxe", () -> new BigkaxeItem());
	public static final RegistryObject<Item> BACKPACK = REGISTRY.register("backpack", () -> new BackpackItem());
	public static final RegistryObject<Item> SALITER_ORE = block(ScModBlocks.SALITER_ORE);
	public static final RegistryObject<Item> SALITER = REGISTRY.register("saliter", () -> new SaliterItem());
	public static final RegistryObject<Item> BIGKAXE_HEAD = REGISTRY.register("bigkaxe_head", () -> new BigkaxeHeadItem());
	public static final RegistryObject<Item> SALITER_BAR = REGISTRY.register("saliter_bar", () -> new SaliterBarItem());
	public static final RegistryObject<Item> SALITER_MECHANISM = REGISTRY.register("saliter_mechanism", () -> new SaliterMechanismItem());
	public static final RegistryObject<Item> SALITER_COMPOUND = REGISTRY.register("saliter_compound", () -> new SaliterCompoundItem());
	public static final RegistryObject<Item> SALITER_SHEET = REGISTRY.register("saliter_sheet", () -> new SaliterSheetItem());
	public static final RegistryObject<Item> UNFINISHED_SALITER_MECHANISM = REGISTRY.register("unfinished_saliter_mechanism", () -> new UnfinishedSaliterMechanismItem());
	public static final RegistryObject<Item> SALITER_FLUID_BUCKET = REGISTRY.register("saliter_fluid_bucket", () -> new SaliterFluidItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
