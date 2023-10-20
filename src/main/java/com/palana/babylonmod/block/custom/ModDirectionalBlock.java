package com.palana.babylonmod.block.custom;

import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import org.jetbrains.annotations.Nullable;

public class ModDirectionalBlock extends DirectionalBlock {
    public static DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public ModDirectionalBlock(Properties pProperties) {

        super(pProperties);

    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext placeContext) {
        System.out.println("HELLOE THIS IS THE DIRECTIONAL BLCOK!" + placeContext.getHorizontalDirection());
        return this.defaultBlockState().setValue(FACING, placeContext.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

}