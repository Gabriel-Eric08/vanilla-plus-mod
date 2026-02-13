package com.example.examplemod.registry.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.registry.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanilaPlusModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MODID);

    public static final RegistryObject<CreativeModeTab> VANILAPLUS_TAB = CREATIVE_MODE_TAB.register("vanilaplus", () ->
            CreativeModeTab.builder().icon( () -> new ItemStack(ModItem.UNOBTANIUM_INGOT.get()))
                    .title(Component.translatable("vanilaplus"))
                    .displayItems((pParamters, pOutput)-> {
                        pOutput.accept(ModItem.UNOBTANIUM_INGOT.get());
                        pOutput.accept((ModBlock.UNOBTANIUM_ORE.get()));
                        pOutput.accept(ModItem.UNOBTANIUM_APPLE.get());
                    })
                    .build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TAB.register(bus);
    }
}
