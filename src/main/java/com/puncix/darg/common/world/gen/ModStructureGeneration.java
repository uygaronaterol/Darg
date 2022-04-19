package com.puncix.darg.common.world.gen;

import com.puncix.darg.common.world.structure.ModStructures;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ModStructureGeneration {

    public static void generateStructures(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.PLAINS) ) {

            List<Supplier<StructureFeature<?, ?>>> structures = event.getGeneration().getStructures();

            structures.add(() -> ModStructures.CORRUPTED_HOUSE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            structures.add(() -> ModStructures.EXHERISTAFF_STRUCTURE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            structures.add(() -> ModStructures.CORRUPTED_FOSSIL_SITE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            structures.add(() -> ModStructures.MOGLING_VILLAGE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));

        }
    }

}
