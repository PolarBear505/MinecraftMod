package com.PolarBear505.MyMod.item;

import com.PolarBear505.MyMod.Main;
import net.minecraft.item.ItemSword;

/**
 * Created by Adam on 3/04/2016.
 */
public class ItemModSword extends ItemSword {

    public ItemModSword(ToolMaterial material) {
        super(material);
    }

    public ItemModSword(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
    }
}