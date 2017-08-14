package com.ricardoredstone.shinerockmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.ricardoredstone.shinerockmod.proxy.CommonProxy;
import com.ricardoredstone.shinerockmod.tabs.ModTab;

@Mod(modid = Reference.MODID,name = Reference.NAME,version= Reference.VERSION)
public class ShinerockMod {
	public static final CreativeTabs shinerocktab = new ModTab("Shinerock Mod");
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		proxy.preInit(event);
		System.out.println(Reference.NAME+" is loading!");
	}
	@EventHandler
	public static void init(FMLInitializationEvent event){
		proxy.init(event);
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
}
