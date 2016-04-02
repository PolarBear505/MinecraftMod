package com.PolarBear505.MyMod.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block tutorialBlock;
    public static Block multitexture;

    public static final void init() {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock("blueGlowstone", Material.iron), "blueGlowstone");
        GameRegistry.registerBlock(multitexture = new MultiTextureBlock("face", Material.cloth), "face");
    }
}
