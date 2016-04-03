package com.PolarBear505.MyMod.item;


import com.PolarBear505.MyMod.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {

    public static Item testItem;
    public static Item metaitem;
    public static Item.ToolMaterial VIBRANIUM = EnumHelper.addToolMaterial("VIBRANIUM", 3, 10000, 15.0F, 20.0F, 40);
    public static ItemArmor.ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("ARMOR", 50, new int[]{3, 8, 6, 3}, 40);
    public static Item tutorialSword;
    public static Item tutorialPickaxe;
    public static Item tutorialMultitool;
    public static Item tutorialHelmet;
    public static Item tutorialChestplate;
    public static Item tutorialLeggings;
    public static Item tutorialBoots;

    public static final void init() {
        testItem = new Item().setUnlocalizedName("testItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":testItem");
        GameRegistry.registerItem(testItem, "testItem");
        GameRegistry.registerItem(metaitem = new MetaItem("metaitem"), "metaitem");
        GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", VIBRANIUM), "tutorial_sword");
        GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", VIBRANIUM), "tutorial_pickaxe");
        GameRegistry.registerItem(tutorialMultitool = new ItemModPickaxe("tutorial_multitool", VIBRANIUM), "tutorial_multitool");
        GameRegistry.registerItem(tutorialHelmet = new ItemModArmor("tutorial_helmet", ARMOR, "tutorial", 0), "tutorial_helmet"); //0 for helmet
        GameRegistry.registerItem(tutorialChestplate = new ItemModArmor("tutorial_chestplate", ARMOR, "tutorial", 1), "tutorial_chestplate"); // 1 for chestplate
        GameRegistry.registerItem(tutorialLeggings = new ItemModArmor("tutorial_leggings", ARMOR, "tutorial", 2), "tutorial_leggings"); // 2 for leggings
        GameRegistry.registerItem(tutorialBoots = new ItemModArmor("tutorial_boots", ARMOR, "tutorial", 3), "tutorial_boots"); // 3 for boots
    }

}
