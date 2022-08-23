package com.ANEMOS.fantasyplayersmod.regi;

import com.ANEMOS.fantasyplayersmod.item.Itemyakusou;
import com.ANEMOS.fantasyplayersmod.main.Fantasyplayersmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Fantasyplayersmod.MOD_ID)
public class FantasyPlayersModItems {

    public static final Itemyakusou YAKUSOU = new Itemyakusou();

    @EventBusSubscriber(modid = Fantasyplayersmod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] items = {
                    YAKUSOU
            };
            event.getRegistry().registerAll(items);
        }
    }
}
