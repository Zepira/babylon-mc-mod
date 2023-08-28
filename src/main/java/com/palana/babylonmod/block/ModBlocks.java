package com.palana.babylonmod.block;

import com.palana.babylonmod.BabylonMod;
import com.palana.babylonmod.block.custom.DirectionalPalmLeaves;
import com.palana.babylonmod.block.custom.ModDirectionalBlock;
import com.palana.babylonmod.block.custom.ModFlammableRotatedPillarBlock;
import com.palana.babylonmod.block.custom.ModSaplingBlock;
import com.palana.babylonmod.item.ModItems;
import com.palana.babylonmod.worldgen.tree.PalmTreeGrower;
//import com.palana.babylonmod.worldgen.tree.WalnutTreeGrower;
import com.palana.babylonmod.worldgen.tree.WalnutTreeGrower;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.Direction;

import java.util.function.Supplier;

public class ModBlocks {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        BabylonMod.MOD_ID);

        public static final RegistryObject<Block> LAPIS_BRICK = registerBlock("lapis_brick",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));

        public static final RegistryObject<Block> LAPIS_BRICK_STAIRS = registerBlock("lapis_brick_stairs",
                        () -> new StairBlock(() -> ModBlocks.LAPIS_BRICK.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.SANDSTONE_STAIRS)));

        public static final RegistryObject<Block> LAPIS_BRICK_SLAB = registerBlock("lapis_brick_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_SLAB)));

        public static final RegistryObject<Block> PALM_CORE_BOTTOM = registerBlock("palm_core_bottom",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.FERN)));

        public static final RegistryObject<Block> PALM_CORE_TOP = registerBlock("palm_core_top",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.FERN)));

        public static final RegistryObject<Block> PALM_LEAVES = registerBlock("palm_leaves",
                        () -> new DirectionalPalmLeaves(
                                        BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noLootTable()));

        public static final RegistryObject<Block> PALM_CORE_FROND = registerBlock("palm_core_frond",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.FERN)));

        // Straight tower shit
        public static final RegistryObject<Block> SANDSTONE_PEAK = registerBlock("sandstone_peak",
                        () -> new ModDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_PEAK_CORNER = registerBlock("sandstone_peak_corner",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_STEPPED_BLOCK_BOTTOM = registerBlock(
                        "sandstone_stepped_block_bottom",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

        public static final RegistryObject<Block> SANDSTONE_EXTENDED_BLOCK = registerBlock(
                        "sandstone_extended_block",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_STEPPED_BOTTOM_CORNER = registerBlock(
                        "sandstone_stepped_bottom_corner",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_EXTENDED_BLOCK_CORNER = registerBlock(
                        "sandstone_extended_block_corner",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        // Diagonal tower shit
        public static final RegistryObject<Block> SANDSTONE_DIAGONAL_WALL = registerBlock(
                        "sandstone_diagonal_wall",
                        () -> new ModDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                                        .noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_PEAK_DIAGONAL = registerBlock("sandstone_peak_diagonal",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> GRASS_TWO = registerBlock("grass_two",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.PODZOL)));

        public static final RegistryObject<Block> SANDSTONE_PEAK_CORNER_DIAGONAL = registerBlock(
                        "sandstone_peak_corner_diagonal",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_STEPPED_BLOCK_BOTTOM_DIAGONAL = registerBlock(
                        "sandstone_stepped_block_bottom_diagonal",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_EXTENDED_BLOCK_DIAGONAL = registerBlock(
                        "sandstone_extended_block_diagonal",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_STEPPED_BOTTOM_CORNER_DIAGONAL = registerBlock(
                        "sandstone_stepped_bottom_corner_diagonal",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> SANDSTONE_EXTENDED_BLOCK_CORNER_DIAGONAL = registerBlock(
                        "sandstone_extended_block_corner_diagonal",
                        () -> new ModDirectionalBlock(
                                        BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

        public static final RegistryObject<Block> PALM_LOG = registerBlock("palm_log",
                        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

        public static final RegistryObject<Block> WALNUT_LOG = registerBlock("walnut_log",
                        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

        public static final RegistryObject<Block> WALNUT_LEAVES = registerBlock("walnut_leaves",
                        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                                @Override
                                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return true;
                                }

                                @Override
                                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 60;
                                }

                                @Override
                                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos,
                                                Direction direction) {
                                        return 30;
                                }
                        });

        public static final RegistryObject<Block> WALNUT_SAPLING = registerBlock("walnut_sapling",
                        () -> new ModSaplingBlock(new WalnutTreeGrower(),
                                        BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

        public static final RegistryObject<Block> PALM_SAPLING = registerBlock("palm_sapling",
                        () -> new SaplingBlock(new PalmTreeGrower(),
                                        BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
        // public static final RegistryObject<Block> ALEXANDRITE_BLOCK =
        // registerBlock("alexandrite_block",
        // () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL)
        // .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
        // .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        // public static final RegistryObject<Block> RAW_ALEXANDRITE_BLOCK =
        // registerBlock("raw_alexandrite_block",
        // () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL)
        // .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
        // .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

        // public static final RegistryObject<Block> ALEXANDRITE_ORE =
        // registerBlock("alexandrite_ore",
        // () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
        // .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
        // public static final RegistryObject<Block> DEEPSLATE_ALEXANDRITE_ORE =
        // registerBlock("deepslate_alexandrite_ore",
        // () -> new
        // DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
        // .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
        // public static final RegistryObject<Block> END_STONE_ALEXANDRITE_ORE =
        // registerBlock("end_stone_alexandrite_ore",
        // () -> new
        // DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
        // .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(5, 8)));
        // public static final RegistryObject<Block> NETHER_ALEXANDRITE_ORE =
        // registerBlock("nether_alexandrite_ore",
        // () -> new
        // DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
        // .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

        // public static final RegistryObject<Block> ALEXANDRITE_STAIRS =
        // registerBlock("alexandrite_stairs",
        // () -> new StairBlock(() ->
        // ModBlocks.ALEXANDRITE_BLOCK.get().defaultBlockState(),
        // BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL)));
        // public static final RegistryObject<Block> ALEXANDRITE_SLAB =
        // registerBlock("alexandrite_slab",
        // () -> new SlabBlock(
        // BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

        // public static final RegistryObject<Block> ALEXANDRITE_PRESSURE_PLATE =
        // registerBlock(
        // "alexandrite_pressure_plate",
        // () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
        // BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL),
        // BlockSetType.IRON));
        // public static final RegistryObject<Block> ALEXANDRITE_BUTTON =
        // registerBlock("alexandrite_button",
        // () -> new ButtonBlock(
        // BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL),
        // BlockSetType.IRON, 10, true));

        // public static final RegistryObject<Block> ALEXANDRITE_FENCE =
        // registerBlock("alexandrite_fence",
        // () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
        // public static final RegistryObject<Block> ALEXANDRITE_FENCE_GATE =
        // registerBlock("alexandrite_fence_gate",
        // () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK),
        // SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
        // public static final RegistryObject<Block> ALEXANDRITE_WALL =
        // registerBlock("alexandrite_wall",
        // () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

        // public static final RegistryObject<Block> ALEXANDRITE_DOOR =
        // registerBlock("alexandrite_door",
        // () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK),
        // BlockSetType.IRON));
        // public static final RegistryObject<Block> ALEXANDRITE_TRAPDOOR =
        // registerBlock("alexandrite_trapdoor",
        // () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK),
        // BlockSetType.IRON));

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
