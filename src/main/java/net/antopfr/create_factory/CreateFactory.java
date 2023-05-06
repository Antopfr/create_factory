package net.antopfr.create_factory;

import com.mojang.logging.LogUtils;
import net.antopfr.create_factory.block.ModBlocks;
import net.antopfr.create_factory.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateFactory.MOD_ID)
public class CreateFactory {
    public static final String MOD_ID = "create_factory";
    private static final Logger LOGGER = LogUtils.getLogger();
    public CreateFactory() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
          //  ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SPREAD.get(), RenderType.translucent());
          //  ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SPREAD.get(), RenderType.translucent());
        }
    }
}
