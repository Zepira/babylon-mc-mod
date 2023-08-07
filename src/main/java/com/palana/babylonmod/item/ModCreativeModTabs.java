package com.palana.babylonmod.item;

import com.palana.babylonmod.BabylonMod;
import com.palana.babylonmod.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, BabylonMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BABYLON_TAB = CREATIVE_MODE_TABS.register("babylon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LAPIS_BRICK.get()))
                    .title(Component.translatable("creativetab.babylon_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(Blocks.NETHER_BRICKS);
                        pOutput.accept(Blocks.CRACKED_NETHER_BRICKS);
                        pOutput.accept(Blocks.NETHER_BRICK_STAIRS);
                        pOutput.accept(Blocks.NETHER_BRICK_SLAB);
                        pOutput.accept(Blocks.NETHER_BRICK_WALL);
                        pOutput.accept(Blocks.CHISELED_NETHER_BRICKS);
                        pOutput.accept(Blocks.RED_NETHER_BRICKS);
                        pOutput.accept(Blocks.RED_NETHER_BRICK_STAIRS);
                        pOutput.accept(Blocks.RED_NETHER_BRICK_SLAB);
                        pOutput.accept(Blocks.RED_NETHER_BRICK_WALL);
                        pOutput.accept(Blocks.POLISHED_BLACKSTONE_BRICKS);
                        pOutput.accept(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
                        pOutput.accept(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
                        pOutput.accept(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
                        pOutput.accept(Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
                        pOutput.accept(Blocks.WHITE_WOOL);
                        pOutput.accept(Blocks.LIGHT_GRAY_WOOL);
                        pOutput.accept(Blocks.WHITE_CARPET);
                        pOutput.accept(Blocks.LIGHT_GRAY_CARPET);
                        pOutput.accept(Blocks.MAGENTA_GLAZED_TERRACOTTA);
                        pOutput.accept(Blocks.PINK_GLAZED_TERRACOTTA);

                        pOutput.accept(Blocks.CRACKED_DEEPSLATE_TILES);
                        pOutput.accept(Blocks.DEEPSLATE_BRICKS);
                        pOutput.accept(Blocks.CRACKED_DEEPSLATE_BRICKS);
                        pOutput.accept(Blocks.DEEPSLATE_BRICK_STAIRS);
                        pOutput.accept(Blocks.DEEPSLATE_BRICK_SLAB);
                        pOutput.accept(Blocks.DEEPSLATE_BRICK_WALL);
                        pOutput.accept(Blocks.POLISHED_BLACKSTONE);
                        pOutput.accept(Blocks.POLISHED_BLACKSTONE_STAIRS);
                        pOutput.accept(Blocks.POLISHED_BLACKSTONE_SLAB);
                        pOutput.accept(Blocks.POLISHED_BLACKSTONE_WALL);
                        pOutput.accept(Blocks.ORANGE_CONCRETE);
                        pOutput.accept(Blocks.YELLOW_CONCRETE);
                        pOutput.accept(Blocks.LIME_CONCRETE);
                        pOutput.accept(Blocks.GREEN_CONCRETE);
                        pOutput.accept(Blocks.CYAN_CONCRETE);
                        pOutput.accept(Blocks.LIGHT_BLUE_CONCRETE);
                        pOutput.accept(Blocks.BLUE_CONCRETE);
                        pOutput.accept(Blocks.PURPLE_CONCRETE);
                        pOutput.accept(Blocks.MAGENTA_CONCRETE);
                        pOutput.accept(Blocks.PINK_CONCRETE);
                        pOutput.accept(Blocks.LIME_CONCRETE_POWDER);
                        pOutput.accept(Blocks.GREEN_CONCRETE_POWDER);
                        pOutput.accept(Blocks.CYAN_CONCRETE_POWDER);
                        pOutput.accept(Blocks.LIGHT_BLUE_CONCRETE_POWDER);
                        pOutput.accept(Blocks.BLUE_CONCRETE_POWDER);
                        pOutput.accept(Blocks.PURPLE_CONCRETE_POWDER);
                        pOutput.accept(Blocks.MAGENTA_CONCRETE_POWDER);
                        pOutput.accept(Blocks.PINK_CONCRETE_POWDER);

                        pOutput.accept(Blocks.ANVIL);
                        pOutput.accept(Blocks.CHIPPED_ANVIL);
                        pOutput.accept(Blocks.DAMAGED_ANVIL);
                        pOutput.accept(Blocks.LECTERN);
                        pOutput.accept(Blocks.HOPPER);

                        pOutput.accept(ModBlocks.PALM_CORE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PALM_CORE_TOP.get());
                        pOutput.accept(ModBlocks.PALM_CORE_FROND.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
