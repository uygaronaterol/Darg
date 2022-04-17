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



    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
