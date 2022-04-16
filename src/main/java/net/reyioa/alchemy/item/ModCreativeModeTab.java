package net.reyioa.alchemy.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ALCHEMY_TAB = new CreativeModeTab("alchemytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ALCHEMITE_INGOT.get());
        }
    };

}
