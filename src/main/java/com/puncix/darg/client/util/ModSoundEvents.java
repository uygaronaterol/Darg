package com.puncix.darg.client.util;

import com.puncix.darg.Darg;
import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Darg.MOD_ID);
    public static final RegistryObject<SoundEvent> CORRUPTED_HORSE_AMBIENT = registerSoundEvent("corrupted_horse_ambient");
    public static final RegistryObject<SoundEvent> CORRUPTED_HORSE_DEATH = registerSoundEvent("corrupted_horse_death");
    public static final RegistryObject<SoundEvent> CORRUPTED_HORSE_HIT = registerSoundEvent("corrupted_horse_hit");
    public static final RegistryObject<SoundEvent> CORRUPTED_CHICKEN_AMBIENT = registerSoundEvent("corrupted_chicken_ambient");
    public static final RegistryObject<SoundEvent> CORRUPTED_CHICKEN_DEATH = registerSoundEvent("corrupted_chicken_death");
    public static final RegistryObject<SoundEvent> CORRUPTED_CHICKEN_HIT = registerSoundEvent("corrupted_chicken_hit");
    public static final RegistryObject<SoundEvent> CORRUPTED_PIG_AMBIENT = registerSoundEvent("corrupted_pig_ambient");
    public static final RegistryObject<SoundEvent> CORRUPTED_PIG_DEATH = registerSoundEvent("corrupted_pig_death");
    public static final RegistryObject<SoundEvent> CORRUPTED_PIG_HIT = registerSoundEvent("corrupted_pig_hit");
    public static final RegistryObject<SoundEvent> CORRUPTED_DONKEY_AMBIENT = registerSoundEvent("corrupted_donkey_ambient");
    public static final RegistryObject<SoundEvent> CORRUPTED_DONKEY_DEATH = registerSoundEvent("corrupted_donkey_death");
    public static final RegistryObject<SoundEvent> CORRUPTED_DONKEY_HIT = registerSoundEvent("corrupted_donkey_hit");
    public static final RegistryObject<SoundEvent> CORRUPTED_SHEEP_AMBIENT = registerSoundEvent("corrupted_sheep_ambient");
    public static final RegistryObject<SoundEvent> CORRUPTED_SHEEP_DEATH = registerSoundEvent("corrupted_sheep_death");
    public static final RegistryObject<SoundEvent> CORRUPTED_SHEEP_HIT = registerSoundEvent("corrupted_sheep_hit");
    public static final RegistryObject<SoundEvent> CORRUPTED_COW_AMBIENT = registerSoundEvent("corrupted_cow_ambient");
    public static final RegistryObject<SoundEvent> CORRUPTED_COW_DEATH = registerSoundEvent("corrupted_cow_death");
    public static final RegistryObject<SoundEvent> CORRUPTED_COW_HIT = registerSoundEvent("corrupted_cow_hit");
    public static final RegistryObject<SoundEvent> CORRUPTED_ZOMBIE_HIT = registerSoundEvent("corrupted_zombie_hit");
    public static final RegistryObject<SoundEvent> CORRUPTED_ZOMBIE_AMBIENT = registerSoundEvent("corrupted_zombie_ambient");
    public static final RegistryObject<SoundEvent> CORRUPTED_ZOMBIE_DEATH = registerSoundEvent("corrupted_zombie_death");

    public static final RegistryObject<SoundEvent> CORRUPTED_COW_STEP = registerSoundEvent("corrupted_cow_step");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_AMBIENT1 = registerSoundEvent("exheristaff_ambient1");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_AMBIENT2 = registerSoundEvent("exheristaff_ambient2");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_AMBIENT3 = registerSoundEvent("exheristaff_ambient3");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_AMBIENT4 = registerSoundEvent("exheristaff_ambient4");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_HIT1 = registerSoundEvent("exheristaff_hit1");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_HIT2 = registerSoundEvent("exheristaff_hit2");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_DEATH = registerSoundEvent("exheristaff_death");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_ANIMATION= registerSoundEvent("exheristaff_animation");

    public static final RegistryObject<SoundEvent> CORRUPTED_PLAINS_AMBIENT = registerSoundEvent("corrupted_plains_ambient");



    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Darg.MOD_ID, name)));
    }

    public static void register(IEventBus bus){
        SOUND_EVENTS.register(bus);
    }
}
