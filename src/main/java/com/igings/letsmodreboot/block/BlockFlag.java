package com.igings.letsmodreboot.block;


public class BlockFlag extends BlockLMRB
{
    public BlockFlag()
    {
        super();
        this.setBlockName("flag");
        this.setStepSound(soundTypeCloth);
        this.setResistance(100.0F);
        this.setHardness(2.8F);
        this.setHarvestLevel("shears",0);
        this.setLightLevel(1);
    }
}
