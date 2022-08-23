package com.ANEMOS.fantasyplayersmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockRennseigama extends Block {
    public BlockRennseigama() {
        super(Properties.of(Material.METAL)
                .strength(7.0F,20F)
                .sound(SoundType.ANVIL)
                .lightLevel(value -> 10)
                .requiresCorrectToolForDrops());
    }
}
