package com.igings.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
       // GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf)," s ", "sss", " s ", 's',new ItemStack(Items.stick));
       // GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.glassClear),new ItemStack(Blocks.sand),new ItemStack(Blocks.glass));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf)," s ", "sss", " s ", 's', "stickWood"));//stickWood is the ore-dictionaried name for sticks
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.glassClear),new ItemStack(Blocks.sand),new ItemStack(Blocks.glass)));
    }
}
