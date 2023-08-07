package com.palana.babylonmod.block;

import java.util.function.Supplier;

import com.palana.babylonmod.BabylonMod;
import com.palana.babylonmod.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            BabylonMod.MOD_ID);

    public static final RegistryObject<Block> LAPIS_BRICK = registerBlock("lapis_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));

    public static final RegistryObject<Block> PALM_CORE_BOTTOM = registerBlock("palm_core_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.FERN)));

    public static final RegistryObject<Block> PALM_CORE_TOP = registerBlock("palm_core_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.FERN)));

    public static final RegistryObject<Block> PALM_CORE_FROND = registerBlock("palm_core_frond",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.FERN)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
