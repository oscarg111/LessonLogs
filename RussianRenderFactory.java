package com.idtech.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RussianRenderFactory implements EntityRendererProvider<RussianEntity> {

    public static RussianRenderFactory INSTANCE = new RussianRenderFactory();

    @Override
    public EntityRenderer<RussianEntity> create(Context manager) {
        return new RussianRenderer(manager);
    }
}