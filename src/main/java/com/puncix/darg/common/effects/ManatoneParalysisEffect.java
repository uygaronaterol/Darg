package com.puncix.darg.common.effects;

import com.puncix.darg.core.init.ParticleInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ManatoneParalysisEffect extends Effect {
    public ManatoneParalysisEffect(EffectType typeIn, int liquidColorIn) {
        super(typeIn, liquidColorIn);
    }

    @Override
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        if (entityLivingBaseIn.getHealth() >= 1.0F) {
            entityLivingBaseIn.attackEntityFrom(DamageSource.MAGIC, 1.0F);

            World worldIn = entityLivingBaseIn.world;
            float chance = 0.25f;
            double rand = Math.random();
            if(chance < rand) {
                worldIn.addParticle(ParticleInit.MANA_PARTICLE.get(), entityLivingBaseIn.getPosX() + rand, entityLivingBaseIn.getPosY() + rand, entityLivingBaseIn.getPosZ() + rand, 0d, -0.05d, 0d);
                worldIn.addParticle(ParticleInit.MANA_PARTICLE.get(), entityLivingBaseIn.getPosX() + rand, entityLivingBaseIn.getPosY() + rand, entityLivingBaseIn.getPosZ() + rand, 0d, -0.05d, 0d);
                worldIn.addParticle(ParticleInit.MANA_PARTICLE.get(), entityLivingBaseIn.getPosX() + rand, entityLivingBaseIn.getPosY() + rand, entityLivingBaseIn.getPosZ() + rand, 0d, -0.05d, 0d);
            }
        }
    }

    @Override
    public void affectEntity(@Nullable Entity source, @Nullable Entity indirectSource, LivingEntity entityLivingBaseIn, int amplifier, double health) {
        if (entityLivingBaseIn.getHealth() > 1.0F) {
            performEffect(entityLivingBaseIn, amplifier);
        }
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        int j = 25 >> amplifier;
        if (j > 0) {
            return duration % j == 0;
        } else {
            return true;
        }
    }

    @Override
    public boolean isInstant() {
        return false;
    }
}
