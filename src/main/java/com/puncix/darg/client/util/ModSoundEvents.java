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
    public static final RegistryObject<SoundEvent> EGG_LAYING_SOUND = registerSoundEvent("egg_laying_sound");
    public static final RegistryObject<SoundEvent> MOGLING_HIT = registerSoundEvent("mogling_hit");
    public static final RegistryObject<SoundEvent> MOGLING_DEATH = registerSoundEvent("mogling_death");
    public static final RegistryObject<SoundEvent> MOGLING_AMBIENT = registerSoundEvent("mogling_ambient");
    public static final RegistryObject<SoundEvent> SNAKE1 = registerSoundEvent("snake1");
    public static final RegistryObject<SoundEvent> SNAKE2 = registerSoundEvent("snake2");
    public static final RegistryObject<SoundEvent> MEDUSA_ANIMATION = registerSoundEvent("medusa_animation");
    public static final RegistryObject<SoundEvent> EATER_HIT = registerSoundEvent("eater_hit");
    public static final RegistryObject<SoundEvent> EATER_DEATH = registerSoundEvent("eater_death");
    public static final RegistryObject<SoundEvent> EATER_AMBIENT = registerSoundEvent("eater_ambient");
    public static final RegistryObject<SoundEvent> CORRUPTED_COW_STEP = registerSoundEvent("corrupted_cow_step");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_AMBIENT1 = registerSoundEvent("exheristaff_ambient1");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_AMBIENT2 = registerSoundEvent("exheristaff_ambient2");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_AMBIENT3 = registerSoundEvent("exheristaff_ambient3");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_AMBIENT4 = registerSoundEvent("exheristaff_ambient4");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_HIT1 = registerSoundEvent("exheristaff_hit1");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_HIT2 = registerSoundEvent("exheristaff_hit2");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_DEATH = registerSoundEvent("exheristaff_death");
    public static final RegistryObject<SoundEvent> EXHERISTAFF_ANIMATION= registerSoundEvent("exheristaff_animation");
    public static final RegistryObject<SoundEvent> SILENCE = registerSoundEvent("silence");
    public static final RegistryObject<SoundEvent> VARZAK_AMBIENT1 = registerSoundEvent("varzak_ambient1");
    public static final RegistryObject<SoundEvent> VARZAK_AMBIENT2 = registerSoundEvent("varzak_ambient2");
    public static final RegistryObject<SoundEvent> VARZAK_AMBIENT3 = registerSoundEvent("varzak_ambient3");
    public static final RegistryObject<SoundEvent> VARZAK_AMBIENT4 = registerSoundEvent("varzak_ambient4");
    public static final RegistryObject<SoundEvent> VARZAK_AMBIENT5 = registerSoundEvent("varzak_ambient5");
    public static final RegistryObject<SoundEvent> VARZAK_HIT1 = registerSoundEvent("varzak_hit1");
    public static final RegistryObject<SoundEvent> VARZAK_HIT2 = registerSoundEvent("varzak_hit2");
    public static final RegistryObject<SoundEvent> VARZAK_ANIMATION = registerSoundEvent("varzak_animation");
    public static final RegistryObject<SoundEvent> VARZAK_DEATH = registerSoundEvent("varzak_death");
    public static final RegistryObject<SoundEvent> DWARF_DEATH = registerSoundEvent("dwarf_death");
    public static final RegistryObject<SoundEvent> DWARF_AMBIENT = registerSoundEvent("dwarf_ambient");
    public static final RegistryObject<SoundEvent> DWARF_HIT = registerSoundEvent("dwarf_hit");
    public static final RegistryObject<SoundEvent> KATSU_AMBIENT1 = registerSoundEvent("katsu_ambient1");
    public static final RegistryObject<SoundEvent> KATSU_AMBIENT2 = registerSoundEvent("katsu_ambient2");
    public static final RegistryObject<SoundEvent> KATSU_AMBIENT3 = registerSoundEvent("katsu_ambient3");
    public static final RegistryObject<SoundEvent> KATSU_AMBIENT4 = registerSoundEvent("katsu_ambient4");
    public static final RegistryObject<SoundEvent> KATSU_AMBIENT5 = registerSoundEvent("katsu_ambient5");
    public static final RegistryObject<SoundEvent> KATSU_HIT1 = registerSoundEvent("katsu_hit1");
    public static final RegistryObject<SoundEvent> KATSU_HIT2 = registerSoundEvent("katsu_hit2");
    public static final RegistryObject<SoundEvent> KATSU_ANIMATION = registerSoundEvent("katsu_animation");
    public static final RegistryObject<SoundEvent> KATSU_DEATH = registerSoundEvent("katsu_death");
    public static final RegistryObject<SoundEvent> WOLFYRE_AMBIENT1 = registerSoundEvent("wolfyre_ambient1");
    public static final RegistryObject<SoundEvent> WOLFYRE_AMBIENT2 = registerSoundEvent("wolfyre_ambient2");
    public static final RegistryObject<SoundEvent> WOLFYRE_AMBIENT3 = registerSoundEvent("wolfyre_ambient3");
    public static final RegistryObject<SoundEvent> WOLFYRE_AMBIENT4 = registerSoundEvent("wolfyre_ambient4");
    public static final RegistryObject<SoundEvent> WOLFYRE_HIT1 = registerSoundEvent("wolfyre_hit1");
    public static final RegistryObject<SoundEvent> WOLFYRE_HIT2 = registerSoundEvent("wolfyre_hit2");
    public static final RegistryObject<SoundEvent> WOLFYRE_DEATH = registerSoundEvent("wolfyre_death");
    public static final RegistryObject<SoundEvent> WOLFYRE_ANIMATION = registerSoundEvent("wolfyre_animation");
    public static final RegistryObject<SoundEvent> MANATONE_ANIMATION = registerSoundEvent("manatone_animation");
    public static final RegistryObject<SoundEvent> MANATONE_AMBIENT1 = registerSoundEvent("manatone_ambient1");
    public static final RegistryObject<SoundEvent> MANATONE_AMBIENT2 = registerSoundEvent("manatone_ambient2");
    public static final RegistryObject<SoundEvent> MANATONE_HIT = registerSoundEvent("manatone_hit");
    public static final RegistryObject<SoundEvent> MANATONE_DEATH = registerSoundEvent("manatone_death");
    public static final RegistryObject<SoundEvent> GOLEM_DEATH = registerSoundEvent("golem_death");
    public static final RegistryObject<SoundEvent> GOLEM_HIT = registerSoundEvent("golem_hit");
    public static final RegistryObject<SoundEvent> GOLEM_AMBIENT = registerSoundEvent("golem_ambient");
    public static final RegistryObject<SoundEvent> GOBLIN_AMBIENT = registerSoundEvent("goblin_ambient");
    public static final RegistryObject<SoundEvent> GOBLIN_DEATH = registerSoundEvent("goblin_death");
    public static final RegistryObject<SoundEvent> GOBLIN_HIT = registerSoundEvent("goblin_hit");
    public static final RegistryObject<SoundEvent> TROLL_HIT = registerSoundEvent("troll_hit");
    public static final RegistryObject<SoundEvent> TROLL_AMBIENT = registerSoundEvent("troll_ambient");
    public static final RegistryObject<SoundEvent> TROLL_DEATH = registerSoundEvent("troll_death");
    public static final RegistryObject<SoundEvent> CINNER_AMBIENT1 = registerSoundEvent("cinner_ambient1");
    public static final RegistryObject<SoundEvent> CINNER_AMBIENT2 = registerSoundEvent("cinner_ambient2");
    public static final RegistryObject<SoundEvent> CINNER_AMBIENT3 = registerSoundEvent("cinner_ambient3");
    public static final RegistryObject<SoundEvent> CINNER_AMBIENT4 = registerSoundEvent("cinner_ambient4");
    public static final RegistryObject<SoundEvent> CINNER_ANIMATION = registerSoundEvent("cinner_animation");
    public static final RegistryObject<SoundEvent> CINNER_HIT1 = registerSoundEvent("cinner_hit1");
    public static final RegistryObject<SoundEvent> CINNER_HIT2 = registerSoundEvent("cinner_hit2");
    public static final RegistryObject<SoundEvent> CINNER_DEATH = registerSoundEvent("cinner_death");
    public static final RegistryObject<SoundEvent> BLACK_BEARD_ANIMATION = registerSoundEvent("black_beard_animation");
    public static final RegistryObject<SoundEvent> BABY_DRAGON_AMBIENT1 = registerSoundEvent("baby_dragon_ambient1");
    public static final RegistryObject<SoundEvent> BABY_DRAGON_AMBIENT2 = registerSoundEvent("baby_dragon_ambient2");
    public static final RegistryObject<SoundEvent> BABY_DRAGON_HIT = registerSoundEvent("baby_dragon_hit");
    public static final RegistryObject<SoundEvent> JUVENILE_DRAGON_HIT = registerSoundEvent("juvenile_dragon_hit");
    public static final RegistryObject<SoundEvent> JUVENILE_DRAGON_AMBIENT1 = registerSoundEvent("juvenile_dragon_ambient1");
    public static final RegistryObject<SoundEvent> JUVENILE_DRAGON_AMBIENT2 = registerSoundEvent("juvenile_dragon_ambient2");
    public static final RegistryObject<SoundEvent> TEENAGE_DRAGON_AMBIENT2 = registerSoundEvent("teenage_dragon_ambient2");
    public static final RegistryObject<SoundEvent> TEENAGE_DRAGON_AMBIENT1 = registerSoundEvent("teenage_dragon_ambient1");
    public static final RegistryObject<SoundEvent> TEENAGE_DRAGON_HIT = registerSoundEvent("teenage_dragon_hit");




    public static final RegistryObject<SoundEvent> CORRUPTED_PLAINS_AMBIENT = registerSoundEvent("corrupted_plains_ambient");



    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Darg.MOD_ID, name)));
    }

    public static void register(IEventBus bus){
        SOUND_EVENTS.register(bus);
    }
}
