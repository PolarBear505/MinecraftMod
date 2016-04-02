package com.PolarBear505.MyMod;

import com.PolarBear505.MyMod.block.ModBlocks;
import com.PolarBear505.MyMod.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class Recipies {

    public static final void init() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[] {"##", "##", '#', ModItems.testItem});
        GameRegistry.addRecipe(new ItemStack(ModItems.testItem, 4), new Object[] {"#", '#', ModBlocks.tutorialBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.testItem), new Object[] {Items.redstone, new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.testItem), 1.0F);
    }
}
