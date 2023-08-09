package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RussianRenderer extends MobRenderer<RussianEntity, RussianModel<RussianEntity>> {

    public RussianRenderer(EntityRendererProvider.Context provider) {
        super(provider, new RussianModel<>(provider.bakeLayer(RussianModel.RUSSIAN)), 0.3f);
    }

    @Override
    public ResourceLocation getTextureLocation(RussianEntity p_114482_) {
        return new ResourceLocation(BaseMod.MODID,"textures/entity/russian.png");
    }
}
