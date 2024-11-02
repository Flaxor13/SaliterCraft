
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.flaxor.sc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.flaxor.sc.world.inventory.BackpackguiMenu;
import net.flaxor.sc.ScMod;

public class ScModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ScMod.MODID);
	public static final RegistryObject<MenuType<BackpackguiMenu>> BACKPACKGUI = REGISTRY.register("backpackgui", () -> IForgeMenuType.create(BackpackguiMenu::new));
}
