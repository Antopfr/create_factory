package net.antopfr.create_factory.block;

import net.antopfr.create_factory.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab CREATIVE_TAB_CF = new CreativeModeTab("create_factory_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHOCOLATE_APPLE.get());
        }
    };
}
