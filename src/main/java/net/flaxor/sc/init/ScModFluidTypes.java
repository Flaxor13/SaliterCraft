
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.flaxor.sc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.flaxor.sc.fluid.types.SaliterFluidFluidType;
import net.flaxor.sc.ScMod;

public class ScModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ScMod.MODID);
	public static final RegistryObject<FluidType> SALITER_FLUID_TYPE = REGISTRY.register("saliter_fluid", () -> new SaliterFluidFluidType());
}
