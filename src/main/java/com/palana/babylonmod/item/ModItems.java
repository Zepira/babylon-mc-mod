package com.palana.babylonmod.item;

import com.palana.babylonmod.BabylonMod;
import com.palana.babylonmod.block.ModBlocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        BabylonMod.MOD_ID);

        // public static final RegistryObject<Item> ALEXANDRITE =
        // ITEMS.register("alexandrite",
        // () -> new Item(new Item.Properties()));
        // public static final RegistryObject<Item> RAW_ALEXANDRITE =
        // ITEMS.register("raw_alexandrite",
        // () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BABYLON_WHEAT_SEEDS = ITEMS.register("babylon_wheat_seeds",
                        () -> new ItemNameBlockItem(ModBlocks.BABYLON_WHEAT_CROP.get(), new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
