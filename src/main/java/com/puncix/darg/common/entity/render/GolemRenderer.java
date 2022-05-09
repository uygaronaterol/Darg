package com.puncix.darg.common.entity.render;
import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.*;
import com.puncix.darg.common.entity.model.*;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
public class GolemRenderer  extends MobRenderer<GolemEntity, GolemModel<GolemEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Darg.MOD_ID, "textures/entity/golem.png");

    public GolemRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GolemModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(GolemEntity entity) {
        return TEXTURE;
    }
}