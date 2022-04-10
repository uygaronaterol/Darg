package com.puncix.darg.common.entity.render;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.MoglingEntity;
import com.puncix.darg.common.entity.entities.PaleontologistMoglingEntity;
import com.puncix.darg.common.entity.model.MoglingModel;
import com.puncix.darg.common.entity.model.PaleontologistMoglingModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PaleontologistMoglingRenderer extends MobRenderer<PaleontologistMoglingEntity, PaleontologistMoglingModel<PaleontologistMoglingEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/paleontologist_mogling.png");

    public PaleontologistMoglingRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PaleontologistMoglingModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getEntityTexture(PaleontologistMoglingEntity entity) {
        return TEXTURE;
    }
}
