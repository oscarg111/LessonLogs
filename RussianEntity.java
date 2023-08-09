package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class RussianEntity extends Pillager {
    public static EntityType<RussianEntity> TYPE = (EntityType<RussianEntity>)
            EntityType.Builder.of(RussianEntity::new, MobCategory.MONSTER).sized(0.6F,   1.95F).clientTrackingRange(8).build("russian")
                    .setRegistryName(BaseMod.MODID, "russian");
    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE, 0xfef9f8,   0x383737);
    public RussianEntity(EntityType<? extends Pillager> p_33262_, Level p_33263_) {
        super(p_33262_, p_33263_);
    }

}
