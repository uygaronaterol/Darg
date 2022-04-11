package com.puncix.darg.common.world.gen;

import com.puncix.darg.common.world.biome.ModBiomes;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

import java.util.Objects;

public class ModBiomeGeneration {
    public static void generateBiomes() {
        addBiome(ModBiomes.CORRUPTED_PLAINS.get(), BiomeManager.BiomeType.WARM, 5);
    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }
}
