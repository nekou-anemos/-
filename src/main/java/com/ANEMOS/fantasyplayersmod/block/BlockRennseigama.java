package com.ANEMOS.fantasyplayersmod.block;

import com.ANEMOS.fantasyplayersmod.main.Fantasyplayersmod;

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
        setRegistryName(Fantasyplayersmod.MOD_ID, "rennseigama");
    }
}
