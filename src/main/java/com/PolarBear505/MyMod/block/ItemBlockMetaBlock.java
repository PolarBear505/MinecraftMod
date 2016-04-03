package com.PolarBear505.MyMod.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

/**
 * Created by Adam on 3/04/2016.
 */
public class ItemBlockMetaBlock extends ItemBlockWithMetadata {

    public ItemBlockMetaBlock(Block block) {
        super(block, block);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }
}