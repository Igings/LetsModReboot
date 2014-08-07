package com.igings.letsmodreboot.item;

import com.igings.letsmodreboot.creativetab.CreativeTabLMRB;
import com.igings.letsmodreboot.utility.NBTHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMapleLeaf extends ItemLMRB
{
    String blockName;

    public ItemMapleLeaf()
    {
        super();
        this.setUnlocalizedName("mapleLeaf");
        this.setMaxStackSize(16);
    }

}
