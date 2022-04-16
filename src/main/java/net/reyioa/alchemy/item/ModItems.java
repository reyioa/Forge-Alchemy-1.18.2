package net.reyioa.alchemy.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reyioa.alchemy.AlchemyMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlchemyMod.MOD_ID);

    public static final RegistryObject<Item> FIRE_GOLD  = ITEMS.register("fire_gold",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALCHEMY_TAB)));

    public static final RegistryObject<Item> ALCHEMITE_INGOT  = ITEMS.register("alchemite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALCHEMY_TAB)));

    public static final RegistryObject<Item> FROZEN_AQUAMARINE  = ITEMS.register("frozen_aquamarine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALCHEMY_TAB)));

    public static final RegistryObject<Item> BURNT_GOLD  = ITEMS.register("burnt_gold",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALCHEMY_TAB)));

    public static final RegistryObject<Item> RAW_ALCHEMITE  = ITEMS.register("raw_alchemite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALCHEMY_TAB)));

    public static final RegistryObject<Item> FIERY_GOLDEN_PEPPER = ITEMS.register("fiery_golden_pepper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALCHEMY_TAB).food(ModFoods.FIERY_GOLDEN_PEPPER)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
