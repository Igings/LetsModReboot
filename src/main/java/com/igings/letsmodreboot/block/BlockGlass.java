package com.igings.letsmodreboot.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;

public class BlockGlass extends BlockLMRB
{
        public BlockGlass()
        {

            super();

            this.setBlockName("glass");
            this.setStepSound(soundTypeGlass);
            this.setResistance(100.0F);
            this.setHardness(2.8F);
            this.setHarvestLevel("sword",0);
            this.setLightOpacity(0);


        }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered (IBlockAccess iBlockAccess, int x, int y, int z, int side)
    {
        return super.shouldSideBeRendered(iBlockAccess, x, y, z, side);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

}
