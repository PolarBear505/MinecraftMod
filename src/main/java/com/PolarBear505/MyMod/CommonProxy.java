package com.PolarBear505.MyMod;


import com.PolarBear505.MyMod.block.ModBlocks;
import com.PolarBear505.MyMod.item.ModItems;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModBlocks.init();
        Recipies.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
