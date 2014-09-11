package com.igings.letsmodreboot.init;

import com.igings.letsmodreboot.block.*;
import com.igings.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();
    public static final BlockLMRB glassClear = new BlockGlassClear();
    public static final BlockLMRB glassFace = new BlockGlassFace();
    public static final BlockLMRB glassHex = new BlockGlassHex();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(glassClear, "glass");
        GameRegistry.registerBlock(glassFace, "glassFace");
        GameRegistry.registerBlock(glassHex, "glassHex");
    }

}