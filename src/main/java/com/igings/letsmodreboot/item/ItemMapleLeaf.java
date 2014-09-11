package com.igings.letsmodreboot.item;

import com.igings.letsmodreboot.creativetab.CreativeTabLMRB;
import com.igings.letsmodreboot.utility.NBTHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemMapleLeaf extends ItemLMRB
{

    public ItemMapleLeaf()
    {
        super();
        this.setUnlocalizedName("mapleLeaf");
        this.setMaxStackSize(16);
    }
}
