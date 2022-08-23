package com.ANEMOS.fantasyplayersmod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class FantasyplayersmodTab extends CreativeModeTab {

    public FantasyplayersmodTab() {
        super("fantasyplayersmod_tab");
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(Items.DIAMOND);
    }
}
