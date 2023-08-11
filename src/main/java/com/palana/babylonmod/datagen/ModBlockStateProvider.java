package com.palana.babylonmod.datagen;

import com.palana.babylonmod.BabylonMod;
import com.palana.babylonmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BabylonMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // blockWithItem(ModBlocks.ALEXANDRITE_BLOCK);
        // blockWithItem(ModBlocks.RAW_ALEXANDRITE_BLOCK);

        // blockWithItem(ModBlocks.ALEXANDRITE_ORE);
        // blockWithItem(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE);
        // blockWithItem(ModBlocks.END_STONE_ALEXANDRITE_ORE);
        // blockWithItem(ModBlocks.NETHER_ALEXANDRITE_ORE);

        // stairsBlock((StairBlock) ModBlocks.LAPIS_BRICK_STAIRS.get(), blockTexture(ModBlocks.LAPIS_BRICK.get()));
        slabBlock((SlabBlock) ModBlocks.LAPIS_BRICK_SLAB.get(), blockTexture(ModBlocks.LAPIS_BRICK.get()),
                blockTexture(ModBlocks.LAPIS_BRICK.get()));

        //blockItem(ModBlocks.LAPIS_BRICK_STAIRS);
        blockItem(ModBlocks.LAPIS_BRICK_SLAB);

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(
                "babylonmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
