package com.PolarBear505.MyMod.item;

import com.PolarBear505.MyMod.Main;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.Set;

/**
 * Created by Adam on 3/04/2016.
 */
public class ItemModMultitool extends ItemPickaxe {

    private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
            Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel,
            Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland,
            Blocks.soul_sand, Blocks.mycelium});

    protected ItemModMultitool(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe", "spade");
    }

    @Override
    public boolean func_150897_b(Block block) {
        return effectiveAgainst.contains(block) ? true : super.func_150897_b(block);
    }

    @Override
    public float func_150893_a(ItemStack stack, Block block) {
        return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
    }

}
