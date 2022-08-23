package com.anemos.fantasyplayersmod.regi;

import com.anemos.fantasyplayersmod.block.BlockRenkingama;
import com.anemos.fantasyplayersmod.main.FantasyPlayersMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(FantasyPlayersMod.MOD_ID)

public class FantasyPlayersModBlocks {

    public static BlockRenkingama HF_RENKINGAMA = null;

    @Mod.EventBusSubscriber(modid = FantasyPlayersMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register {
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            HF_RENKINGAMA = new BlockRenkingama();

            final Block[] blocks = {
                    HF_RENKINGAMA
            };

            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registrBlockItems(final RegistryEvent.Register<Item> event) {
            final BlockItem[] blockItems = {
                    new BlockItem(HF_RENKINGAMA, new Item.Properties().tab(FantasyPlayersMod.FANTASYPLAYERSMOD_TAB))
            };
            for (BlockItem item : blockItems) {
                final Block block = item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}
