package com.puncix.darg.common.world.biome;

import com.puncix.darg.Darg;
import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.common.world.gen.ModConfiguredFeatures;
import com.puncix.darg.common.world.structure.ModStructures;
import com.puncix.darg.core.init.EntityTypeInit;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBiomes {
    public static final DeferredRegister<Biome> BIOMES =
            DeferredRegister.create(ForgeRegistries.BIOMES, Darg.MOD_ID);

    public static final RegistryObject<Biome> CORRUPTED_PLAINS = BIOMES.register("corrupted_plains",
            () -> makeCorruptedPlainsBiome(() -> ModConfiguredSurfaceBuilders.CORRUPTED_PLAINS_SURFACE, 0.125f,0.05f));

    private static Biome makeCorruptedPlainsBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder,float depth, float scale){

        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();

        BiomeGenerationSettings.Builder biomegenerationsettings$builder =   (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityTypeInit.CORRUPTED_COW.get(), 10, 3, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityTypeInit.CORRUPTED_PIG.get(), 10, 3, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityTypeInit.CORRUPTED_CHICKEN.get(), 10, 3, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityTypeInit.CORRUPTED_HORSE.get(), 3, 3, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityTypeInit.CORRUPTED_SHEEP.get(), 10, 3, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityTypeInit.CORRUPTED_ZOMBIE.get(), 3, 1, 3));
        mobspawninfo$builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityTypeInit.EATER.get(), 1, 1, 3));

        //biomegenerationsettings$builder.withStructure();

        DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
        biomegenerationsettings$builder.withStructure(StructureFeatures.NETHER_FOSSIL);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.CORRUPTED_OAK);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);
        DefaultBiomeFeatures.withWarmFlowers(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNoiseTallGrass(biomegenerationsettings$builder);
        //BiomeDictionary.addTypes(CORRUPTED_PLAINS, BiomeDictionary.Type.PLAINS);

        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN)
                .category(Biome.Category.PLAINS).depth(0.125F).scale(0.05F)
                .temperature(0.8F).downfall(0.4F).setEffects((new BiomeAmbience.Builder())
                        .setAmbientSound(ModSoundEvents.CORRUPTED_PLAINS_AMBIENT.get())

                        .setWaterColor(0x800080).setWaterFogColor(0x800080).setFogColor(0x800080)
                        .withSkyColor(getSkyColorWithTemperatureModifier(0.8F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE)
                        .build()).withMobSpawnSettings(mobspawninfo$builder.build()).
                        withGenerationSettings(biomegenerationsettings$builder.build()).build();

    }
    private static int getSkyColorWithTemperatureModifier(float temperature) {

        float lvt_1_1_ = temperature / 3.0F;
        lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0x800080 - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }

    public static void register(IEventBus bus) {
        BIOMES.register(bus);
    }
}
