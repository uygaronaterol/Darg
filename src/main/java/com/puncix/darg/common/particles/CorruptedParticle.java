package com.puncix.darg.common.particles;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class CorruptedParticle extends SpriteTexturedParticle {

    protected CorruptedParticle(ClientWorld world, double x, double y, double z, double motionX, double motionY, double motionZ) {
        super(world, x, y, z, motionX, motionY, motionZ);
        this.particleRed = 0;
        this.particleBlue = 0;
        this.particleGreen = 0;
        this.setSize(0.05f, 0.05f);
        this.particleScale *= this.rand.nextFloat() * 1.1f;
        this.motionX *= (double)0.02f;
        this.motionY *= (double)0.02f;
        this.motionZ *= (double)0.02f;
        this.maxAge = (int)(20/(Math.random()*1D));
    }

    @Override
    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if(this.maxAge-- <= 0){
            this.setExpired();
        }else{
            this.move(this.motionX, this.motionY,this.motionZ);
            this.motionX *= 1.0D;
            this.motionY *= 1.0D;
            this.motionZ *= 1.0D;
        }

    }
    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType>{
        private IAnimatedSprite spriteSet;
        public Factory(IAnimatedSprite sprite){
            this.spriteSet = sprite;
        }
        @Nullable
        @Override
        public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            BlackParticle blackParticle = new BlackParticle(worldIn,x,y,z,xSpeed,ySpeed,zSpeed);
            blackParticle.setColor(1.0f,1.0f,1.0f);
            blackParticle.selectSpriteRandomly(this.spriteSet);
            return blackParticle;
        }
    }
}
