package com.igings.letsmodreboot.handler;

import com.igings.letsmodreboot.block.BlockLMRB;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

public class BlockGlassHandler extends BlockLMRB
{

    public BlockGlassHandler()
    {
        super();
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGlass);
        this.setResistance(10.0F);
        this.setHardness(1);
        this.setHarvestLevel("pickaxe",0);
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
        return 1;
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
