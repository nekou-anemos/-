package com.ANEMOS.fantasyplayersmod.item;

import com.ANEMOS.fantasyplayersmod.main.FantasyPlayersMod;
import net.minecraft.world.item.Item;

public class ItemYakusou extends Item {
    public ItemYakusou() {
        super(new Properties().tab(FantasyPlayersMod.FANTASYPLAYERSMOD_TAB).stacksTo(16));
        this.setRegistryName("yakusou");
    }
}
