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

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, BabylonMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BABYLON_TAB = CREATIVE_MODE_TABS.register("babylon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LAPIS_BRICK.get()))
                    .title(Component.translatable("creativetab.babylon_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModBlocks.LAPIS_BRICK.get());
                        output.accept(ModBlocks.LAPIS_BRICK_STAIRS.get());
                        output.accept(ModBlocks.LAPIS_BRICK_SLAB.get());
                        output.accept(ModBlocks.WALNUT_SAPLING.get());
                        output.accept(ModBlocks.PALM_SAPLING.get());
                        // output.accept(ModItems.ALEXANDRITE.get());
                        // output.accept(ModItems.RAW_ALEXANDRITE.get());

                        // output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        // output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

                        // output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        // output.accept(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());
                        // output.accept(ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
                        // output.accept(ModBlocks.NETHER_ALEXANDRITE_ORE.get());

                        // output.accept(ModBlocks.ALEXANDRITE_STAIRS.get());
                        // output.accept(ModBlocks.ALEXANDRITE_SLAB.get());
                        // output.accept(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get());
                        // output.accept(ModBlocks.ALEXANDRITE_BUTTON.get());
                        // output.accept(ModBlocks.ALEXANDRITE_FENCE.get());
                        // output.accept(ModBlocks.ALEXANDRITE_FENCE_GATE.get());
                        // output.accept(ModBlocks.ALEXANDRITE_WALL.get());
                        // output.accept(ModBlocks.ALEXANDRITE_DOOR.get());
                        // output.accept(ModBlocks.ALEXANDRITE_TRAPDOOR.get());

                        // output.accept(Blocks.NETHER_BRICKS);
                        // output.accept(Blocks.CRACKED_NETHER_BRICKS);
                        // output.accept(Blocks.NETHER_BRICK_STAIRS);
                        // output.accept(Blocks.NETHER_BRICK_SLAB);
                        // output.accept(Blocks.NETHER_BRICK_WALL);
                        // output.accept(Blocks.CHISELED_NETHER_BRICKS);
                        // output.accept(Blocks.RED_NETHER_BRICKS);
                        // output.accept(Blocks.RED_NETHER_BRICK_STAIRS);
                        // output.accept(Blocks.RED_NETHER_BRICK_SLAB);
                        // output.accept(Blocks.RED_NETHER_BRICK_WALL);
                        // output.accept(Blocks.POLISHED_BLACKSTONE_BRICKS);
                        // output.accept(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
                        // output.accept(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
                        // output.accept(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
                        // output.accept(Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
                        // output.accept(Blocks.WHITE_WOOL);
                        // output.accept(Blocks.LIGHT_GRAY_WOOL);
                        // output.accept(Blocks.WHITE_CARPET);
                        // output.accept(Blocks.LIGHT_GRAY_CARPET);
                        // output.accept(Blocks.MAGENTA_GLAZED_TERRACOTTA);
                        // output.accept(Blocks.PINK_GLAZED_TERRACOTTA);

                        // output.accept(Blocks.CRACKED_DEEPSLATE_TILES);
                        // output.accept(Blocks.DEEPSLATE_BRICKS);
                        // output.accept(Blocks.CRACKED_DEEPSLATE_BRICKS);
                        // output.accept(Blocks.DEEPSLATE_BRICK_STAIRS);
                        // output.accept(Blocks.DEEPSLATE_BRICK_SLAB);
                        // output.accept(Blocks.DEEPSLATE_BRICK_WALL);
                        // output.accept(Blocks.POLISHED_BLACKSTONE);
                        // output.accept(Blocks.POLISHED_BLACKSTONE_STAIRS);
                        // output.accept(Blocks.POLISHED_BLACKSTONE_SLAB);
                        // output.accept(Blocks.POLISHED_BLACKSTONE_WALL);
                        // output.accept(Blocks.ORANGE_CONCRETE);
                        // output.accept(Blocks.YELLOW_CONCRETE);
                        // output.accept(Blocks.LIME_CONCRETE);
                        // output.accept(Blocks.GREEN_CONCRETE);
                        // output.accept(Blocks.CYAN_CONCRETE);
                        // output.accept(Blocks.LIGHT_BLUE_CONCRETE);
                        // output.accept(Blocks.BLUE_CONCRETE);
                        // output.accept(Blocks.PURPLE_CONCRETE);
                        // output.accept(Blocks.MAGENTA_CONCRETE);
                        // output.accept(Blocks.PINK_CONCRETE);
                        // output.accept(Blocks.LIME_CONCRETE_POWDER);
                        // output.accept(Blocks.GREEN_CONCRETE_POWDER);
                        // output.accept(Blocks.CYAN_CONCRETE_POWDER);
                        // output.accept(Blocks.LIGHT_BLUE_CONCRETE_POWDER);
                        // output.accept(Blocks.BLUE_CONCRETE_POWDER);
                        // output.accept(Blocks.PURPLE_CONCRETE_POWDER);
                        // output.accept(Blocks.MAGENTA_CONCRETE_POWDER);
                        // output.accept(Blocks.PINK_CONCRETE_POWDER);

                        // output.accept(Blocks.ANVIL);
                        // output.accept(Blocks.CHIPPED_ANVIL);
                        // output.accept(Blocks.DAMAGED_ANVIL);
                        // output.accept(Blocks.LECTERN);
                        // output.accept(Blocks.HOPPER);

                        output.accept(ModBlocks.PALM_CORE_BOTTOM.get());
                        output.accept(ModBlocks.PALM_CORE_TOP.get());
                        output.accept(ModBlocks.PALM_CORE_FROND.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
