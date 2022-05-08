package com.puncix.darg.common.entity.render;
import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.GoldLayingChickenEntity;
import com.puncix.darg.common.entity.entities.KatsuEntity;
import com.puncix.darg.common.entity.entities.ManatoneEntity;
import com.puncix.darg.common.entity.entities.MedusaEntity;
import com.puncix.darg.common.entity.model.GoldLayingChickenModel;
import com.puncix.darg.common.entity.model.KatsuModel;
import com.puncix.darg.common.entity.model.ManatoneModel;
import com.puncix.darg.common.entity.model.MedusaModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
public class ManatoneRenderer  extends MobRenderer<ManatoneEntity, ManatoneModel<ManatoneEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/manatone.png");

    public ManatoneRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ManatoneModel<>(), 1.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(ManatoneEntity entity) {
        return TEXTURE;
    }
}