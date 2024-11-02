
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.flaxor.sc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.flaxor.sc.ScMod;

public class ScModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScMod.MODID);
	public static final RegistryObject<CreativeModeTab> SALITER_TAB = REGISTRY.register("saliter_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sc.saliter_tab")).icon(() -> new ItemStack(ScModItems.SALITER_MECHANISM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ScModItems.BIGKAXE.get());
				tabData.accept(ScModItems.BACKPACK.get());
				tabData.accept(ScModItems.SALITER.get());
				tabData.accept(ScModItems.BIGKAXE_HEAD.get());
				tabData.accept(ScModItems.SALITER_BAR.get());
				tabData.accept(ScModItems.SALITER_MECHANISM.get());
				tabData.accept(ScModItems.SALITER_COMPOUND.get());
				tabData.accept(ScModItems.SALITER_SHEET.get());
				tabData.accept(ScModItems.UNFINISHED_SALITER_MECHANISM.get());
				tabData.accept(ScModItems.SALITER_FLUID_BUCKET.get());
			})

					.build());
}
