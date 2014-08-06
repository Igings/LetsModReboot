package com.igings.letsmodreboot.creativetab;

import com.igings.letsmodreboot.block.BlockGlass;
import com.igings.letsmodreboot.init.ModItems;
import com.igings.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//Creative tab can be set in either the item/block declaration or the general block handler
public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Let's Mod Reboot";
        }

    };
}
