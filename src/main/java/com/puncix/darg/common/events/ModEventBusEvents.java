package com.puncix.darg.common.events;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.*;
import com.puncix.darg.common.entity.render.MedusaRenderer;
import com.puncix.darg.common.items.ModSpawnEggItem;
import com.puncix.darg.core.init.EntityTypeInit;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Darg.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityTypeInit.CORRUPTED_COW.get(), CorruptedCowEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.CORRUPTED_PIG.get(), CorruptedPigEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.CORRUPTED_CHICKEN.get(), CorruptedChickenEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.CORRUPTED_HORSE.get(), CorruptedHorseEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.CORRUPTED_SHEEP.get(), CorruptedSheepEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.CORRUPTED_DONKEY.get(), CorruptedDonkeyEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.EXHERISTAFF.get(), ExheristaffEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.CORRUPTED_ZOMBIE.get(), CorruptedZombieEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.GOLD_LAYING_CHICKEN.get(), GoldLayingChickenEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.MOGLING.get(), MoglingEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.ZORBIG.get(), ZorbigEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.PALEONTOLOGIST_MOGLING.get(), PaleontologistMoglingEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.MEDUSA.get(), MedusaEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.DARBIG.get(), DarbigEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.MEDUSA_SNAKE.get(), MedusaSnakeEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.EATER.get(), EaterEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.VARZAK.get(), VarzakEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.DWARF.get(), DwarfEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.KATSU.get(), KatsuEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.NINJA.get(), NinjaEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.WOLFYRE.get(), WolfyreEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.MANATONE.get(), ManatoneEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.GOLEM.get(), GolemEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.CINNER.get(), CinnerEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.GOBLIN.get(), GoblinEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.TROLL.get(), TrollEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.BLACK_BEARD.get(), BlackBeardEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.ZELOTH.get(), ZelothEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.DORANZER.get(), DoranzerEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.VOLCANUS.get(), VolcanusEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.JUVENILE_DRAGON.get(), JuvenileDragonEntity.setCustomAttributes().create());
        event.put(EntityTypeInit.TEENAGE_DRAGON.get(), TeenageDragonEntity.setCustomAttributes().create());

        event.put(EntityTypeInit.BABY_DRAGON.get(), BabyDragonEntity.setCustomAttributes().create());


    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
