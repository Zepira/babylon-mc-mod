package com.palana.babylonmod.worldgen;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import com.palana.babylonmod.BabylonMod;
import com.palana.babylonmod.block.ModBlocks;
import com.palana.babylonmod.worldgen.tree.custom.PalmFoliagePlacer;
import com.palana.babylonmod.worldgen.tree.custom.PalmTrunkPlacer;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WALNUT_KEY = registerKey("walnut");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM_KEY = registerKey("palm");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, WALNUT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WALNUT_LOG.get()),
                new PalmTrunkPlacer(2, 1, 1),
                BlockStateProvider.simple(ModBlocks.PALM_LEAVES.get()),
                new PalmFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        Block leavesBlock = ModBlocks.PALM_LEAVES.get();
        // leavesBlock.getStateForPlacement(new
        // BlockPlaceContext(HorizontalDirectionalBlock))
        register(context, PALM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PALM_LOG.get()),
                new PalmTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.PALM_LEAVES.get()),
                new PalmFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(BabylonMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
            BootstapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}