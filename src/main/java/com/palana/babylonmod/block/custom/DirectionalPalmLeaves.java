package com.palana.babylonmod.block.custom;

import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Tilt;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
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

public class DirectionalPalmLeaves extends Block {
    public static DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static BooleanProperty IS_CORNER = BlockStateProperties.CRACKED;

    public DirectionalPalmLeaves(Properties pProperties) {

        super(pProperties);
        System.out.println("HELLOE!");
        System.out.println(pProperties);

    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext placeContext) {
        System.out.println("HELLOE THIS IS THE LEAVES BLCOK!");
        return this.defaultBlockState().setValue(FACING, placeContext.getHorizontalDirection()).setValue(IS_CORNER,
                Boolean.valueOf(true));
    }

    public BlockState getRandomBlockState() {
        System.out.println("HELLOE Is corner:" + this.defaultBlockState().getValue(IS_CORNER));

        return this.defaultBlockState().setValue(FACING, Direction.EAST);
    }

    public static BlockState rotate(BlockState pState, Direction direction) {
        return pState.setValue(FACING, direction);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(IS_CORNER);
    }

}