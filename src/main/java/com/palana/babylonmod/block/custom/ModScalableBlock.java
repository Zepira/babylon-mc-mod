package com.palana.babylonmod.block.custom;

import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import org.jetbrains.annotations.Nullable;

public class ModScalableBlock extends DirectionalBlock {
    public static IntegerProperty SIZE = IntegerProperty.create("size", 0, 4);

    public ModScalableBlock(Properties pProperties) {

        super(pProperties);

    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext placeContext) {
        return this.defaultBlockState().setValue(SIZE, 0);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SIZE);
    }

}