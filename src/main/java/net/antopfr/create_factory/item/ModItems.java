package net.antopfr.create_factory.item;

import com.mojang.blaze3d.shaders.Effect;
import net.antopfr.create_factory.CreateFactory;
import net.antopfr.create_factory.block.CreativeTab;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateFactory.MOD_ID);

public static final RegistryObject<Item> CHOCOLATE_ROLL = ITEMS.register("chocolate_roll",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6f).build())));

// chocolate rolls from create confectionery
public static final RegistryObject<Item> DARK_CHOCOLATE_ROLL = ITEMS.register("dark_chocolate_roll",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build())));
public static final RegistryObject<Item> WHITE_CHOCOLATE_ROLL = ITEMS.register("white_chocolate_roll",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(7).saturationMod(0.8f).build())));
public static final RegistryObject<Item> RUBY_CHOCOLATE_ROLL = ITEMS.register("ruby_chocolate_roll",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(8).saturationMod(0.7f).build())));
public static final RegistryObject<Item> CARAMEL_ROLL = ITEMS.register("caramel_roll",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.5f).build())));

public static final RegistryObject<Item> HONEY_ROLL = ITEMS.register("honey_roll",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.7f).build())));

public static final RegistryObject<Item> CHOCOLATE_APPLE = ITEMS.register("chocolate_apple",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(9).saturationMod(0.8f).build())));

public static final RegistryObject<Item> HONEY_GLAZED_BERRIES = ITEMS.register("honey_glazed_berries",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8f).build())));


//Chocolate Apples
public static final RegistryObject<Item> DARK_CHOCOLATE_APPLE = ITEMS.register("dark_chocolate_apple",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(9).saturationMod(0.9f).build())));

public static final RegistryObject<Item> WHITE_CHOCOLATE_APPLE = ITEMS.register("white_chocolate_apple",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(9).saturationMod(0.9f).build())));

public static final RegistryObject<Item> RUBY_CHOCOLATE_APPLE = ITEMS.register("ruby_chocolate_apple",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(10).saturationMod(0.8f).build())));

public static final RegistryObject<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple",
        () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB_CF).food(new FoodProperties.Builder().nutrition(9).saturationMod(0.6f).build())));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
