package com.puncix.darg.common.world.structure;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.puncix.darg.Darg;
import com.puncix.darg.common.items.VolcanusBodyEnchantmentKit;
import com.puncix.darg.common.world.structure.structures.*;

import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.DimensionSettings;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModStructures {

    public static final DeferredRegister<Structure<?>> STRUCTURES =
            DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, Darg.MOD_ID);

    public static final RegistryObject<Structure<NoFeatureConfig>> CORRUPTED_HOUSE =
            STRUCTURES.register("corrupted_house", CorruptedHouseStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> EXHERISTAFF_STRUCTURE =
            STRUCTURES.register("exheristaff_structure", ExheristaffStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> CORRUPTED_FOSSIL_SITE =
            STRUCTURES.register("corrupted_fossil_site", CorruptedFossilSiteStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> MOGLING_VILLAGE =
            STRUCTURES.register("mogling_village", MoglingVillageStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> MEDUSA_TEMPLE =
            STRUCTURES.register("medusa_temple", MedusaTempleStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> VARZAK_LAIR =
            STRUCTURES.register("varzak_lair", VarzakLairStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> KATSU_DOJO =
            STRUCTURES.register("katsu_dojo", KatsuDojoStrcuture::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> WOLFYRE_DEN =
            STRUCTURES.register("wolfyre_den", WolfyreDenStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> MANATONE_ALTAR =
            STRUCTURES.register("manatone_altar", ManatoneAltarStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> CINNER_LAMB =
            STRUCTURES.register("cinner_lamb", CinnerLambStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> GOBLIN_DUNGEON =
            STRUCTURES.register("goblin_dungeon", GoblinDungeonStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> BLACK_BEARD_SHIP =
            STRUCTURES.register("black_beard_ship", BlackBeardShipStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> ZELOTH_POST =
            STRUCTURES.register("zeloth_post", ZelothPostStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> DORANZER_ARENA =
            STRUCTURES.register("doranzer_arena", DoranzerArenaStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> VOLCANUS_LAKE =
            STRUCTURES.register("volcanus_lake", VolcanusLakeStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> TEENAGE_DRAGON_DEN =
            STRUCTURES.register("teenage_dragon_den", TeenageDragonDenStructure::new);
    public static final RegistryObject<Structure<NoFeatureConfig>> JUVENILE_DRAGON_DEN =
            STRUCTURES.register("juvenile_dragon_den", JuvenileDragonDenStructure::new);
    /* average distance apart in chunks between spawn attempts */
    /* minimum distance apart in chunks between spawn attempts. MUST BE LESS THAN ABOVE VALUE*/
    /* this modifies the seed of the structure so no two structures always spawn over each-other.
    Make this large and unique. */
    public static void setupStructures() {
        setupMapSpacingAndLand(CORRUPTED_HOUSE.get(),
                new StructureSeparationSettings(100,50, 1234567890),
                true);
        setupMapSpacingAndLand(EXHERISTAFF_STRUCTURE.get(),
                new StructureSeparationSettings(270,265, 1234567890),
                true);
        setupMapSpacingAndLand(CORRUPTED_FOSSIL_SITE.get(),
                new StructureSeparationSettings(200,80, 1234567890),
                true);
        setupMapSpacingAndLand(MOGLING_VILLAGE.get(),
                new StructureSeparationSettings(350,250, 1234567890),
                true);
        setupMapSpacingAndLand(MEDUSA_TEMPLE.get(),
                new StructureSeparationSettings(100,80, 1234567890),
                true);
        setupMapSpacingAndLand(VARZAK_LAIR.get(),
                new StructureSeparationSettings(120,110, 1234567890),
                true);
        setupMapSpacingAndLand(KATSU_DOJO.get(),
                new StructureSeparationSettings(130,100, 1234567890),
                true);
        setupMapSpacingAndLand(WOLFYRE_DEN.get(),
                new StructureSeparationSettings(180,150, 1234567890),
                true);
        setupMapSpacingAndLand(MANATONE_ALTAR.get(),
                new StructureSeparationSettings(35,30, 1234567890),
                true);
        setupMapSpacingAndLand(CINNER_LAMB.get(),
                new StructureSeparationSettings(10,5, 1234567890),
                true);
        setupMapSpacingAndLand(GOBLIN_DUNGEON.get(),
                new StructureSeparationSettings(300,280, 1234567890),
                true);
        setupMapSpacingAndLand(BLACK_BEARD_SHIP.get(),
                new StructureSeparationSettings(300,280, 1234567890),
                false);
        setupMapSpacingAndLand(ZELOTH_POST.get(),
                new StructureSeparationSettings(200,160, 1234567890),
                true);
        setupMapSpacingAndLand(DORANZER_ARENA.get(),
                new StructureSeparationSettings(300,260, 1234567890),
                true);
        setupMapSpacingAndLand(VOLCANUS_LAKE.get(),
                new StructureSeparationSettings(80,60, 1234567890),
                true);
        setupMapSpacingAndLand(TEENAGE_DRAGON_DEN.get(),
                new StructureSeparationSettings(200,170, 1234567890),
                true);
        setupMapSpacingAndLand(JUVENILE_DRAGON_DEN.get(),
                new StructureSeparationSettings(101,91, 1234567890),
                true);
    }

    /**
     * Adds the provided structure to the registry, and adds the separation settings.
     * The rarity of the structure is determined based on the values passed into
     * this method in the structureSeparationSettings argument.
     * This method is called by setupStructures above.
     **/
    public static <F extends Structure<?>> void setupMapSpacingAndLand(F structure, StructureSeparationSettings structureSeparationSettings,
                                                                       boolean transformSurroundingLand) {
        //add our structures into the map in Structure class
        Structure.NAME_STRUCTURE_BIMAP.put(structure.getRegistryName().toString(), structure);

        /*
         * Whether surrounding land will be modified automatically to conform to the bottom of the structure.
         * Basically, it adds land at the base of the structure like it does for Villages and Outposts.
         * Doesn't work well on structure that have pieces stacked vertically or change in heights.
         *
         */
        if (transformSurroundingLand) {
            Structure.field_236384_t_ = ImmutableList.<Structure<?>>builder()
                    .addAll(Structure.field_236384_t_)
                    .add(structure)
                    .build();
        }

        /*
         * This is the map that holds the default spacing of all structures.
         * Always add your structure to here so that other mods can utilize it if needed.
         *
         * However, while it does propagate the spacing to some correct dimensions from this map,
         * it seems it doesn't always work for code made dimensions as they read from this list beforehand.
         *
         * Instead, we will use the WorldEvent.Load event in ModWorldEvents to add the structure
         * spacing from this list into that dimension or to do dimension blacklisting properly.
         * We also use our entry in DimensionStructuresSettings.DEFAULTS in WorldEvent.Load as well.
         *
         * DEFAULTS requires AccessTransformer  (See resources/META-INF/accesstransformer.cfg)
         */
        DimensionStructuresSettings.field_236191_b_ =
                ImmutableMap.<Structure<?>, StructureSeparationSettings>builder()
                        .putAll(DimensionStructuresSettings.field_236191_b_)
                        .put(structure, structureSeparationSettings)
                        .build();

        /*
         * There are very few mods that relies on seeing your structure in the
         * noise settings registry before the world is made.
         *
         * You may see some mods add their spacings to DimensionSettings.BUILTIN_OVERWORLD instead of the
         * NOISE_GENERATOR_SETTINGS loop below but that field only applies for the default overworld and
         * won't add to other worldtypes or dimensions (like amplified or Nether).
         * So yeah, don't do DimensionSettings.BUILTIN_OVERWORLD. Use the NOISE_GENERATOR_SETTINGS loop
         * below instead if you must.
         */
        WorldGenRegistries.NOISE_SETTINGS.getEntries().forEach(settings -> {
            Map<Structure<?>, StructureSeparationSettings> structureMap =
                    settings.getValue().getStructures().func_236195_a_();
            /*
             * Pre-caution in case a mod makes the structure map immutable like datapacks do.
             * I take no chances myself. You never know what another mods does...
             *
             * structureConfig requires AccessTransformer  (See resources/META-INF/accesstransformer.cfg)
             */
            if (structureMap instanceof ImmutableMap) {
                Map<Structure<?>, StructureSeparationSettings> tempMap = new HashMap<>(structureMap);
                tempMap.put(structure, structureSeparationSettings);
                settings.getValue().getStructures().func_236195_a_();

            } else {
                structureMap.put(structure, structureSeparationSettings);
            }
        });
    }

    public static void register(IEventBus bus) {
        STRUCTURES.register(bus);
    }
}
