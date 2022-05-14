package com.puncix.darg;


import com.google.common.collect.ImmutableMap;
import com.puncix.darg.client.util.ModSoundEvents;
import com.puncix.darg.common.entity.entities.CinnerEntity;
import com.puncix.darg.common.entity.entities.PaleontologistMoglingEntity;
import com.puncix.darg.common.entity.render.*;
import com.puncix.darg.common.screens.CraftingHandScreen;
import com.puncix.darg.common.world.biome.ModBiomes;
import com.puncix.darg.common.world.gen.ModBiomeGeneration;
import com.puncix.darg.common.world.gen.ModConfiguredFeatures;
import com.puncix.darg.core.init.*;
import com.puncix.darg.data.recipes.ModRecipeTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.item.AxeItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.puncix.darg.common.containers.ModContainers;
import com.puncix.darg.common.screens.CorruptedCraftingTableScreen;
import com.puncix.darg.common.tileentities.ModTileEntities;
import com.puncix.darg.common.world.structure.ModStructures;

import java.util.function.Supplier;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("darg")
public class Darg
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "darg";
    public Darg() {
        // Register the setup method for modloading

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        ParticleInit.PARTICLES.register(bus);
        EnchantmentInit.ENCHANTMENTS.register(bus);
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        ModTileEntities.TILE_ENTITIES.register(bus);
        ModContainers.register(bus);
        ModStructures.register(bus);
        ModRecipeTypes.register(bus);
        ModSoundEvents.register(bus);
        EffectInit.register(bus);
        PotionInit.register(bus);
        EntityTypeInit.register(bus);
        ModBiomes.register(bus);
        // Register the enqueueIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

        event.enqueueWork(() -> {

            AxeItem.BLOCK_STRIPPING_MAP = new ImmutableMap.Builder<net.minecraft.block.Block, net.minecraft.block.Block>().putAll(AxeItem.BLOCK_STRIPPING_MAP)
                    .put(BlockInit.CORRUPTED_OAK_WOOD.get(),BlockInit.STRIPPED_CORRUPTED_OAK_WOOD.get()).
                            put(BlockInit.CORRUPTED_OAK_LOG.get(),BlockInit.STRIPPED_CORRUPTED_OAK_LOG.get()).build();
            ModStructures.setupStructures();

            ModBiomeGeneration.generateBiomes();
        });
        // some preinit code
        //LOGGER.info("HELLO FROM PREINIT");
        //LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    private void doClientStuff(final FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(BlockInit.CORRUPTED_WALL_TORCH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockInit.CORRUPTED_OAK_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockInit.CORRUPTED_TORCH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockInit.CORRUPTED_OAK_TRAPDOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockInit.CORRUPTED_OAK_LEAVES.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockInit.CORRUPTED_OAK_SAPLING.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockInit.CRAFTING_HAND.get(), RenderType.getCutout());

            ScreenManager.registerFactory(ModContainers.CORRUPTED_CRAFTING_TABLE_CONTAINER.get(), CorruptedCraftingTableScreen::new);
            ScreenManager.registerFactory(ModContainers.CRAFTING_HAND_CONTAINER.get(), CraftingHandScreen::new);

        });
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.CORRUPTED_COW.get(), CorruptedCowRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.CORRUPTED_PIG.get(), CorruptedPigRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.CORRUPTED_CHICKEN.get(), CorruptedChickenRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.CORRUPTED_HORSE.get(), CorruptedHorseRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.CORRUPTED_SHEEP.get(), CorruptedSheepRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.CORRUPTED_DONKEY.get(), CorruptedDonkeyRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.CORRUPTED_ZOMBIE.get(), CorruptedZombieRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.MOGLING.get(), MoglingRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.GOLD_LAYING_CHICKEN.get(), GoldLayingChickenRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.ZORBIG.get(), ZorbigRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.PALEONTOLOGIST_MOGLING.get(), PaleontologistMoglingRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.MEDUSA.get(), MedusaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.DARBIG.get(), DarbigRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.MEDUSA_SNAKE.get(), MedusaSnakeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.EATER.get(), EaterRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.VARZAK.get(), VarzakRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.DWARF.get(), DwarfRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.KATSU.get(), KatsuRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.NINJA.get(), NinjaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.WOLFYRE.get(), WolfyreRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.MANATONE.get(), ManatoneRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.GOLEM.get(), GolemRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.CINNER.get(), CinnerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.GOBLIN.get(), GoblinRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.TROLL.get(), TrollRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.EXHERISTAFF.get(), ExheristaffRenderer::new);
        registerProjectileEntityModels(event.getMinecraftSupplier());


    }
    private void registerProjectileEntityModels(Supplier<Minecraft> minecraft){
        ItemRenderer renderer = minecraft.get().getItemRenderer();
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.STAFF_OF_EXHERISTAFF_PROJECTILE_ENTITY.get(),
                (rendererManager) -> new SpriteRenderer<>(rendererManager, renderer));
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.EXHERISTAFF_PROJECTILE_ENTITY.get(),
                (rendererManager) -> new SpriteRenderer<>(rendererManager, renderer));
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.MEDUSA_PROJECTILE_ENTITY.get(),
                (rendererManager) -> new SpriteRenderer<>(rendererManager, renderer));
    }
}
