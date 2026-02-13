package com.example.examplemod.commom.item.foods;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class UnobtaniumApple {
    public static final FoodProperties UNOBTANIUM_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .fast()
            .saturationMod(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 600), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600), 1f)
            .build();
}
