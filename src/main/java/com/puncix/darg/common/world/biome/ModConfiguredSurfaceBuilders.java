package com.puncix.darg.common.world.biome;

import com.puncix.darg.Darg;
import com.puncix.darg.core.init.BlockInit;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ModConfiguredSurfaceBuilders {
    public static ConfiguredSurfaceBuilder<?> CORRUPTED_PLAINS_SURFACE = register("corrupted_plains",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    BlockInit.CORRUPTED_GRASS.get().getDefaultState(),
                    BlockInit.CORRUPTED_STONE.get().getDefaultState(),
                    BlockInit.CORRUPTED_STONE.get().getDefaultState()
            )));


    private static <SC extends ISurfaceBuilderConfig>ConfiguredSurfaceBuilder<SC> register(String name,
                                                                                           ConfiguredSurfaceBuilder<SC> csb){
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER,
                new ResourceLocation(Darg.MOD_ID, name), csb);
    }
}
