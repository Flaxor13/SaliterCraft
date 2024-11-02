
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.flaxor.sc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.flaxor.sc.fluid.SaliterFluidFluid;
import net.flaxor.sc.ScMod;

public class ScModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ScMod.MODID);
	public static final RegistryObject<FlowingFluid> SALITER_FLUID = REGISTRY.register("saliter_fluid", () -> new SaliterFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SALITER_FLUID = REGISTRY.register("flowing_saliter_fluid", () -> new SaliterFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SALITER_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SALITER_FLUID.get(), RenderType.translucent());
		}
	}
}
