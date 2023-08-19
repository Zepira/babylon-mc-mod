package com.palana.babylonmod.block.custom;

import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
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

 
    // @Override
    // public boolean isOpaqueCube() {
    // return false;
    // }

    // @Override
    // public boolean isFullCube() {
    // return false;
    // }

}