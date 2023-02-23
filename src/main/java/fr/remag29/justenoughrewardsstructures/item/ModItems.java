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
    public static final RegistryObject<Item> ANCIENT_RUBY = ITEMS.register("ancient_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARGON_CRYSTAL = ITEMS.register("argon_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATANIC_GRIMOIRE = ITEMS.register("satanic_grimoire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_RUM = ITEMS.register("suspicious_rum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRIBAL_NECKLACE = ITEMS.register("tribal_necklace", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THE_GRAAL = ITEMS.register("the_graal", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
