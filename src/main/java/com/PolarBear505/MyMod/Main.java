package com.PolarBear505.MyMod;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main {

    @SidedProxy(clientSide="com.PolarBear505.MyMod.ClientProxy", serverSide="com.PolarBear505.MyMod.ServerProxy")
    public static CommonProxy proxy;

    public static final String MODID = "firstmod";
    public static final String MODNAME = "My Mod";
    public static final String VERSION = "1.0.0";

    @Instance
    public static Main instance = new Main();


    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}