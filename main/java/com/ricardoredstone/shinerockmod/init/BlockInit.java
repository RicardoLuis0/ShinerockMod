package com.ricardoredstone.shinerockmod.init;

import net.minecraft.block.material.Material;
import com.ricardoredstone.shinerockmod.init.blocks.*;

public class BlockInit {
	public static CustomBlock shinerock_ore,shinerock_lamp,ettroite_ore;
	public static CustomRFProvider passiveGenerator;
	public static void init() {
		shinerock_ore=new CustomBlock("shinerock_ore",3.0F,15.0F,Material.ROCK,2,"pickaxe",ItemInit.shinerock_dust,0,6,9);
		ettroite_ore=new CustomBlock("ettroite_ore",3.0F,4.0F,Material.ROCK,2,"pickaxe");
		shinerock_lamp=new CustomBlock("shinerock_lamp",0.3F,1.5F,Material.GLASS,0,"pickaxe");
		passiveGenerator=new CustomRFProvider("passive_generator", 1000, 10, true);
	}
	public static void register() {
		shinerock_ore.register().registerOredictionary("oreShinerock");
		ettroite_ore.register().registerOredictionary("oreEttroite");
		shinerock_lamp.setLightValue(15).register();//.registerOredictionary("blockShinerock");
		passiveGenerator.register();
	}
}