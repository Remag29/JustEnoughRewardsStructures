package fr.remag29.justenoughrewardsstructures.item;

import fr.remag29.justenoughrewardsstructures.JustEnoughRewardsStructures;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JustEnoughRewardsStructures.MOD_ID);

    public static final RegistryObject<Item> TREASURE_COINS = ITEMS.register("treasure_coins", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN_PURSE = ITEMS.register("coin_purse", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ANCIENT_EMERALD = ITEMS.register("ancient_emerald", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
