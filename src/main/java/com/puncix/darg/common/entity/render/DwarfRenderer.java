package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.DarbigEntity;
import com.puncix.darg.common.entity.entities.DwarfEntity;
import com.puncix.darg.common.entity.model.DarbigModel;
import com.puncix.darg.common.entity.model.DwarfModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfRenderer extends MobRenderer<DwarfEntity, DwarfModel<DwarfEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/dwarf.png");

    public DwarfRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(DwarfEntity entity) {
        return TEXTURE;
    }
}
