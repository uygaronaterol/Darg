package com.puncix.darg.client.util;

import com.puncix.darg.Darg;
import com.puncix.darg.common.particles.BlackParticle;
import com.puncix.darg.common.particles.CorruptedParticle;
import com.puncix.darg.core.init.ParticleInit;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Darg.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ParticleUtil {
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerParticles(ParticleFactoryRegisterEvent event){
        Minecraft.getInstance().particles.registerFactory(ParticleInit.BLACK_PARTICLE.get(), BlackParticle.Factory::new);
        Minecraft.getInstance().particles.registerFactory(ParticleInit.CORRUPTED_PARTICLE.get(), CorruptedParticle.Factory::new);

    }
}
