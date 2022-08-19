package com.ANEMOS.fantasyplayersmod.item;

import com.ANEMOS.fantasyplayersmod.main.Fantasyplayersmod;
import net.minecraft.world.item.Item;

public class Itemyakusou extends Item {
    public Itemyakusou() {
        super(new Properties().tab(Fantasyplayersmod.FANTASYPLAYERSMOD_TAB).stacksTo(16));
        this.setRegistryName("yakusou");
    }
}
