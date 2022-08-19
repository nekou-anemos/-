package com.ANEMOS.fantasyplayersmod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class FantasyplayersmodTab extends CreativeModeTab {

    public FantasyplayersmodTab() {
        super("fantasyplayersmod_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.DIAMOND);
    }
}
