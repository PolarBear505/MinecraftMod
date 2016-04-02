package com.PolarBear505.MyMod.item;


import com.PolarBear505.MyMod.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {

    public static Item testItem;

    public static final void init() {
        testItem = new Item().setUnlocalizedName("testItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":testItem");
        GameRegistry.registerItem(testItem, "testItem");
    }

}
