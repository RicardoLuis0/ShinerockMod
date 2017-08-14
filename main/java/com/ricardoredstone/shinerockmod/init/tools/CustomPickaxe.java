package com.ricardoredstone.shinerockmod.init.tools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import com.ricardoredstone.shinerockmod.ShinerockMod;

public class CustomPickaxe extends ItemPickaxe{
	public CustomPickaxe(String name, ToolMaterial material, CreativeTabs tab){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
	public CustomPickaxe(String name, ToolMaterial material) {
		this(name,material,ShinerockMod.shinerocktab);
	}
	public CustomPickaxe register() {
		ForgeRegistries.ITEMS.register(this);
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(),"inventory"));
		return this;
	}
}
