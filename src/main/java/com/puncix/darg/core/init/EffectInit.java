package com.puncix.darg.core.init;

import com.puncix.darg.Darg;
import com.puncix.darg.common.effects.BleedEffect;
import com.puncix.darg.common.effects.ManatoneParalysisEffect;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
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
    public static final RegistryObject<Effect> MANATONE_PARALYSIS = MOD_EFFECTS.register("manatone_paralysis",
            () -> new ManatoneParalysisEffect(EffectType.HARMFUL, 0xFFCCFF).addAttributesModifier(Attributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", (double)-0.55F, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static void register(IEventBus bus){
        MOD_EFFECTS.register(bus);
    }
}
