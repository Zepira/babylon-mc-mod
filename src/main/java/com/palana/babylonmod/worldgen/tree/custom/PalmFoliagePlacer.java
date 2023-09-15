package com.palana.babylonmod.worldgen.tree.custom;

import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;

import java.io.Console;
import java.lang.System.Logger;

import org.jline.utils.Log;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.palana.babylonmod.block.custom.DirectionalPalmLeaves;
import com.palana.babylonmod.worldgen.tree.ModFoliagePlacerTypes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class PalmFoliagePlacer extends FoliagePlacer {
    public static final Codec<PalmFoliagePlacer> FOLIAGE_CODEC = RecordCodecBuilder
            .create((instance) -> foliagePlacerParts(instance)
                    .and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height))
                    .apply(instance, PalmFoliagePlacer::new));
    protected final int height;

    public PalmFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.PALM_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter foliageSetter, RandomSource pRandom,
            TreeConfiguration pConfig, int maxFreeTreeHeight,
            FoliagePlacer.FoliageAttachment attachment, int foliageHeight, int foliageRadius, int offset) {
        // Creating the foliage
        // attachment.pos() is the first position ABOVE the last places log

        // tryPlaceLeaf() // places one leave at given position!
        // for (int i = 0; i < 4; i++) {
        // this.placeLeavesRow(pLevel, foliageSetter, pRandom, pConfig,
        // attachment.pos().above(0), 2, i + 1,
        // attachment.doubleTrunk());
        // }

        System.out.println("HELLOE!");

        BlockState blockstate = pConfig.foliageProvider.getState(pRandom,
                attachment.pos());
        DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

        // tryPlaceLeaf(pLevel, foliageSetter, pRandom, pConfig, attachment.pos());
        // blockstate = blockstate.setValue(FACING, Direction.WEST);
        // blockstate = DirectionalPalmLeaves.rotate(blockstate, Direction.WEST);

        // top block (no facing)
        foliageSetter.set(attachment.pos(), blockstate);

        blockstate = blockstate.setValue(FACING, Direction.EAST);
        foliageSetter.set(attachment.pos().below(1).east(1), blockstate);

        blockstate = blockstate.setValue(FACING, Direction.WEST);
        foliageSetter.set(attachment.pos().below(1).west(1), blockstate);

        blockstate = blockstate.setValue(FACING, Direction.NORTH);
        foliageSetter.set(attachment.pos().below(1).north(1), blockstate);

        blockstate = blockstate.setValue(FACING, Direction.SOUTH);
        foliageSetter.set(attachment.pos().below(1).south(1), blockstate);
        // System.out.println(blockstate.getValue(FACING));
        // tryPlaceLeaf(pLevel, foliageSetter, pRandom, pConfig,
        // attachment.pos().below(1).north(1));
        // tryPlaceLeaf(pLevel, foliageSetter, pRandom, pConfig,
        // attachment.pos().below(1).east(1));
        // tryPlaceLeaf(pLevel, foliageSetter, pRandom, pConfig,
        // attachment.pos().below(1).south(1));
        // customTryPlaceLeaf(pLevel, foliageSetter, pRandom, pConfig,
        // attachment.pos().below(1).west(1));

        // foliageSetter.set(attachment.pos().below(1).west(1),
        // pConfig.foliageProvider.getState(pRandom,
        // attachment.pos().below(1).west(1)));

    }

    protected static boolean customTryPlaceLeaf(LevelSimulatedReader p_273596_, FoliagePlacer.FoliageSetter p_273054_,
            RandomSource p_272977_, TreeConfiguration p_273040_, BlockPos p_273406_) {
        if (!TreeFeature.validTreePos(p_273596_, p_273406_)) {
            return false;
        } else {
            BlockState blockstate = p_273040_.foliageProvider.getState(p_272977_, p_273406_);
            blockstate = blockstate.setValue(BlockStateProperties.FACING, Direction.WEST);
            p_273054_.set(p_273406_, blockstate);
            return true;
        }

    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange,
            boolean pLarge) {
        return false;
    }
}