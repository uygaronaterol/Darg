package com.puncix.darg.common.entity.render;
import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.GoldLayingChickenEntity;
import com.puncix.darg.common.entity.entities.MedusaEntity;
import com.puncix.darg.common.entity.model.GoldLayingChickenModel;
import com.puncix.darg.common.entity.model.MedusaModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
public class MedusaRenderer  extends MobRenderer<MedusaEntity, MedusaModel<MedusaEntity>> {
protected static final ResourceLocation TEXTURE =
        new ResourceLocation(Darg.MOD_ID, "textures/entity/medusa.png");

public MedusaRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MedusaModel<>(), 0.2F);
        }

@Override
public ResourceLocation getEntityTexture(MedusaEntity entity) {
        return TEXTURE;
        }
}