
package net.flaxor.sc.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.flaxor.sc.init.ScModItems;
import net.flaxor.sc.init.ScModFluids;
import net.flaxor.sc.init.ScModFluidTypes;
import net.flaxor.sc.init.ScModBlocks;

public abstract class SaliterFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ScModFluidTypes.SALITER_FLUID_TYPE.get(), () -> ScModFluids.SALITER_FLUID.get(), () -> ScModFluids.FLOWING_SALITER_FLUID.get())
			.explosionResistance(100f).bucket(() -> ScModItems.SALITER_FLUID_BUCKET.get()).block(() -> (LiquidBlock) ScModBlocks.SALITER_FLUID.get());

	private SaliterFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SaliterFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SaliterFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
