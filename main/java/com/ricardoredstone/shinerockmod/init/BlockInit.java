package com.ricardoredstone.shinerockmod.init;

import net.minecraft.block.material.Material;
import com.ricardoredstone.shinerockmod.init.blocks.CustomBlock;

public class BlockInit {
	public static CustomBlock shinerock_ore,shinerock_block,ettroite_ore;
	public static void init() {
		shinerock_ore=new CustomBlock("shinerock_ore",2.0F,4.0F,Material.ROCK,2,"pickaxe",ItemInit.shinerock_dust,0,6,9);
		ettroite_ore=new CustomBlock("ettroite_ore",2.0F,4.0F,Material.ROCK,2,"pickaxe",ItemInit.ettroite_gem,0,2,5);
		shinerock_block=new CustomBlock("shinerock_block",0.3F,1.5F,Material.GLASS,0,"pickaxe");
	}
	public static void register() {
		shinerock_ore.register().registerOredictionary("oreShinerock");
		ettroite_ore.register().registerOredictionary("oreEttroite");
		shinerock_block.register().registerOredictionary("blockShinerock");
	}
}