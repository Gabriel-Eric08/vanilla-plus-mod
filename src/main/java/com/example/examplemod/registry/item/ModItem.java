package com.example.examplemod.registry.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.commom.item.foods.UnobtaniumApple;
import com.example.examplemod.commom.item.materials.UnobtaniumIngot;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> UNOBTANIUM_INGOT = ITEMS.register("unobtanium_ingot",
            () -> new UnobtaniumIngot());

    public static final RegistryObject<Item> UNOBTANIUM_APPLE = ITEMS.register("unobtanium_apple",
            () -> new Item(new Item.Properties().food(UnobtaniumApple.UNOBTANIUM_APPLE)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
