package com.igings.letsmodreboot;

import com.igings.letsmodreboot.handler.ConfigurationHandler;
import com.igings.letsmodreboot.init.ModBlocks;
import com.igings.letsmodreboot.init.ModItems;
import com.igings.letsmodreboot.init.Recipes;
import com.igings.letsmodreboot.proxy.IProxy;
import com.igings.letsmodreboot.reference.Reference;
import com.igings.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;


@Mod(modid= Reference.MOD_ID,name=Reference.MOD_NAME, version=Reference.VERSION,guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {//Initialisation for items, blocks, key-binds, network, etc

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info ("Pre-Initialisation complete");

        ModItems.init();
        ModBlocks.init();
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {//Initialisation for GUI, TE, crafting, other event handlers
        Recipes.init();

        LogHelper.info ("Initialisation complete");
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {//Used for anything after other mods are loaded
        LogHelper.info ("Post-Initialisation complete");

        //Returns all ore-dictionaried items
        for (String oreName: OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
        }
    }
}
