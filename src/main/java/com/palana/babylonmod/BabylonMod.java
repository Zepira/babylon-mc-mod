package com.palana.babylonmod;

import com.mojang.logging.LogUtils;
import com.palana.babylonmod.block.ModBlocks;
// import com.palana.babylonmod.entity.ModEntities;
// import com.palana.babylonmod.entity.client.PalmTreeRenderer;
import com.palana.babylonmod.item.ModCreativeModTabs;
import com.palana.babylonmod.item.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BabylonMod.MOD_ID)
public class BabylonMod {

    public static final String MOD_ID = "babylonmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BabylonMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        // ModEntities.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        // event.accept(EXAMPLE_BLOCK_ITEM);

        // if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        // event.accept(ModItems.SAPPHIRE);
        // event.accept(ModItems.RAW_SAPPHIRE);
        // event.accept(ModBlocks.LAPIS_BRICK);
        // }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());

            // EntityRenderers.register(ModEntities.PALM_TREE.get(), PalmTreeRenderer::new);
        }
    }
}
