package com.puncix.darg.core.init;

import com.puncix.darg.Darg;
import com.puncix.darg.common.effects.BleedEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.tools.StandardLocation;
import javax.xml.stream.Location;

public class EffectInit {
    public static final DeferredRegister<Effect> MOD_EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Darg.MOD_ID);
    public static final RegistryObject<Effect> BLEED = MOD_EFFECTS.register("bleed",
            () -> new BleedEffect(EffectType.HARMFUL, 0x808080));
    public static void register(IEventBus bus){
        MOD_EFFECTS.register(bus);
    }
}
