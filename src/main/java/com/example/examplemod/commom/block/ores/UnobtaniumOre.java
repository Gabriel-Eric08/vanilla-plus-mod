package com.example.examplemod.commom.block.ores;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class UnobtaniumOre extends Block {
    public UnobtaniumOre() {
        super(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(5.0f));
    }
}
