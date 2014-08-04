package com.igings.letsmodreboot.init;


import com.igings.letsmodreboot.item.ItemLMRB;
import com.igings.letsmodreboot.item.ItemMapleLeaf;
import com.igings.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf,"mapleLeaf");
    }


}
