package com.igings.letsmodreboot.block;

import com.igings.letsmodreboot.handler.BlockGlassHandler;

public class BlockGlassClear extends BlockGlassHandler
{
        public BlockGlassClear()
        {
            super();
            this.setBlockName("glassClear");
            //this.setStepSound(soundTypeGlass);
            //this.setResistance(100.0F);
            //this.setHardness(2.8F);
            //this.setHarvestLevel("sword",0);
            //this.setLightOpacity(0);
        }
/*
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
*/
}
