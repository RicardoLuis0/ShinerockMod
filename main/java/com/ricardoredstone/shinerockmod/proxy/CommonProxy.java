package com.ricardoredstone.shinerockmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ricardoredstone.shinerockmod.handlers.RegistryHandler;
import com.ricardoredstone.shinerockmod.world.ModWorldGen;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event){
		RegistryHandler.Common();
		GameRegistry.registerWorldGenerator(new ModWorldGen(),3);
	}
	public void init(FMLInitializationEvent event){
		
	}
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
