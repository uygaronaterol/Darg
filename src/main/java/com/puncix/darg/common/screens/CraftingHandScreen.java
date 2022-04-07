package com.puncix.darg.common.screens;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.puncix.darg.Darg;
import com.puncix.darg.common.blocks.CraftingHand;
import com.puncix.darg.common.containers.CorruptedCraftingTableContainer;
import com.puncix.darg.common.containers.CraftingHandContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class CraftingHandScreen extends ContainerScreen<CraftingHandContainer> {
    private final ResourceLocation GUI = new ResourceLocation(Darg.MOD_ID, "textures/gui/crafting_hand_gui.png");
    public CraftingHandScreen(CraftingHandContainer p_i51105_1_, PlayerInventory p_i51105_2_,
                              ITextComponent p_i51105_3_) {
        super(p_i51105_1_, p_i51105_2_, p_i51105_3_);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void render(MatrixStack p_230450_1_, int p_230450_2_, int p_230450_3_, float p_230450_4_) {
        // TODO Auto-generated method stub
        this.renderBackground(p_230450_1_);
        super.render(p_230450_1_, p_230450_2_, p_230450_3_, p_230450_4_);
        this.renderHoveredTooltip(p_230450_1_, p_230450_2_, p_230450_3_);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float v, int i, int i1) {
        RenderSystem.color4f(1f, 1f, 1f, 1f);
        this.minecraft.getTextureManager().bindTexture(GUI);
        this.guiLeft = 128;
        this.guiTop = 0;

        this.blit(matrixStack, 128,0, 0, 0, 256, 256);
    }

}
