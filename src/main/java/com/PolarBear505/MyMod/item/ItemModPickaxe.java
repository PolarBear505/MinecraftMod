package com.PolarBear505.MyMod.item;

import com.PolarBear505.MyMod.Main;
import net.minecraft.item.ItemPickaxe;

public class ItemModPickaxe extends ItemPickaxe {

    public ItemModPickaxe(ToolMaterial material) {
        super(material);
    }

    public ItemModPickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
    }
}
