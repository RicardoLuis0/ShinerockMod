package com.ricardoredstone.shinerockmod.init.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import com.ricardoredstone.shinerockmod.ShinerockMod;

public class CustomItem extends Item {
	public CustomItem(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
	public CustomItem(String name) {
		this(name,ShinerockMod.shinerocktab);
	}
	public CustomItem registerOredictionary(String orename) {
		OreDictionary.registerOre(orename, this);
		return this;
	}
	public CustomItem register() {
		ForgeRegistries.ITEMS.register(this);
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(),"inventory"));
		return this;
	}
}
