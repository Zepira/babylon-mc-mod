package com.palana.babylonmod.item;

import com.palana.babylonmod.BabylonMod;
//import com.palana.babylonmod.entity.ModEntities;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            BabylonMod.MOD_ID);

    // public static final RegistryObject<Item> PALM_TREE =
    // ITEMS.register("palm_tree",
    // () -> new ForgeSpawnEggItem(ModEntities.PALM_TREE, 0xD57E36, 0x1D0D00,
    // new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
