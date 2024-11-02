
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.flaxor.sc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.flaxor.sc.block.SaliterOreBlock;
import net.flaxor.sc.block.SaliterFluidBlock;
import net.flaxor.sc.ScMod;

public class ScModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ScMod.MODID);
	public static final RegistryObject<Block> SALITER_ORE = REGISTRY.register("saliter_ore", () -> new SaliterOreBlock());
	public static final RegistryObject<Block> SALITER_FLUID = REGISTRY.register("saliter_fluid", () -> new SaliterFluidBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
