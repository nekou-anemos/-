package com.ANEMOS.fantasyplayersmod.regi;

import com.ANEMOS.fantasyplayersmod.block.BlockRennseigama;
import com.ANEMOS.fantasyplayersmod.main.Fantasyplayersmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Fantasyplayersmod.MOD_ID)

public class FantasyplayersmodBlocks {

    public static BlockRennseigama HF_RENKINGAMA = null;

    @Mod.EventBusSubscriber(modid = Fantasyplayersmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static  class Register{
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event){
            HF_RENKINGAMA = new BlockRennseigama();

            final Block[] blocks ={
                   HF_RENKINGAMA
            };
                    event.getRegistry().registerAll(blocks);
        }
        @SubscribeEvent
        public static void registrBlockItems(final RegistryEvent.Register<Item> event){
            final BlockItem[] blockItems = {
                    new BlockItem(HF_RENKINGAMA,new Item.Properties().tab(Fantasyplayersmod.FANTASYPLAYERSMOD_TAB))
            };
            for (BlockItem item : blockItems){
                final Block block = item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}
