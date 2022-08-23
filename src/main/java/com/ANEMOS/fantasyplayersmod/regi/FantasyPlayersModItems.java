package com.anemos.fantasyplayersmod.regi;

import com.anemos.fantasyplayersmod.item.ItemYakusou;
import com.anemos.fantasyplayersmod.main.FantasyPlayersMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(FantasyPlayersMod.MOD_ID)
public class FantasyPlayersModItems {

    public static final ItemYakusou YAKUSOU = new ItemYakusou();

    @EventBusSubscriber(modid = FantasyPlayersMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
    public static class Register {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {

            final Item[] items = {
                    YAKUSOU
            };
            event.getRegistry().registerAll(items);
        }
    }
}
