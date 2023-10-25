package com.palana.babylonmod.worldgen;

import com.palana.babylonmod.BabylonMod;
import com.palana.babylonmod.block.ModBlocks;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class ModPlacedFeatures {
        public static final ResourceKey<PlacedFeature> PALM_PLACED_KEY = registerKey("palm_placed");
        public static final ResourceKey<PlacedFeature> DYNAMIC_SAND_PLACED_KEY = registerKey("dynamic_sand_placed");

        public static void bootstrap(BootstapContext<PlacedFeature> context) {
                HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context
                                .lookup(Registries.CONFIGURED_FEATURE);

                register(context, PALM_PLACED_KEY,
                                configuredFeatures.getOrThrow(ModConfiguredFeatures.PALM_KEY),
                                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                                                ModBlocks.PALM_SAPLING.get()));

                // register(context, DYNAMIC_SAND_PLACED_KEY,
                // configuredFeatures.getOrThrow(ModConfiguredFeatures.DYNAMIC_SAND_KEY),
                // ModOrePlacement.commonOrePlacement(120,
                // HeightRangePlacement.uniform(VerticalAnchor.absolute(-100),
                // VerticalAnchor.absolute(100))));

                register(context, DYNAMIC_SAND_PLACED_KEY,
                                configuredFeatures.getOrThrow(ModConfiguredFeatures.DYNAMIC_SAND_KEY),
                                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(),
                                                PlacementUtils.HEIGHTMAP,
                                                BiomeFilter.biome()));

        }

        private static ResourceKey<PlacedFeature> registerKey(String name) {
                return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(BabylonMod.MOD_ID, name));
        }

        private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                        Holder<ConfiguredFeature<?, ?>> configuration,
                        List<PlacementModifier> modifiers) {
                context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
        }
}
