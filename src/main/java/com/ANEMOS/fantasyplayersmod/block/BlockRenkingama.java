package com.anemos.fantasyplayersmod.block;

import com.anemos.fantasyplayersmod.main.FantasyPlayersMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockRenkingama extends Block {
    public BlockRenkingama() {
        super(Properties.of(Material.METAL)
                .strength(7.0F, 20F)
                .sound(SoundType.ANVIL)
                .lightLevel(value -> 10)
                .requiresCorrectToolForDrops());
        setRegistryName(FantasyPlayersMod.MOD_ID, "renkingama");
    }
}
