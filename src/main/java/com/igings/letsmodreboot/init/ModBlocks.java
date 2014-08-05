package com.igings.letsmodreboot.init;

import com.igings.letsmodreboot.block.BlockFlag;
import com.igings.letsmodreboot.block.BlockGlass;
import com.igings.letsmodreboot.block.BlockGlassFace;
import com.igings.letsmodreboot.block.BlockLMRB;
import com.igings.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();
    public static final BlockLMRB glass = new BlockGlass();
    public static final BlockLMRB glassFace = new BlockGlassFace();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(glass, "glass");
        GameRegistry.registerBlock(glassFace, "glassFace");
    }

}