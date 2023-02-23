package fr.remag29.justenoughrewardsstructures;

import com.mojang.logging.LogUtils;
import fr.remag29.justenoughrewardsstructures.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JustEnoughRewardsStructures.MOD_ID)
public class JustEnoughRewardsStructures {
    public static final String MOD_ID = "justenoughrewardsstructures";
    private static final Logger LOGGER = LogUtils.getLogger();

    public JustEnoughRewardsStructures() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add items to creative tab
    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.TREASURE_COINS);
            event.accept(ModItems.ANCIENT_EMERALD);
            event.accept(ModItems.ANCIENT_RUBY);
            event.accept(ModItems.ARGON_CRYSTAL);
            event.accept(ModItems.SATANIC_GRIMOIRE);
            event.accept(ModItems.SUSPICIOUS_RUM);
            event.accept(ModItems.TRIBAL_NECKLACE);
        }
        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.COIN_PURSE);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
