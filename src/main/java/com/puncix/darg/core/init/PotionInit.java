package com.puncix.darg.core.init;

import com.puncix.darg.Darg;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PotionInit {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, Darg.MOD_ID);
    public static final RegistryObject<Potion> BLEED_POTION = POTIONS.register("bleed_potion", () -> new Potion(
            new EffectInstance(EffectInit.BLEED.get(), 200,0))

    );
    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
