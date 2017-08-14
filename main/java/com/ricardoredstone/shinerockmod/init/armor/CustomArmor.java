package com.ricardoredstone.shinerockmod.init.armor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import com.ricardoredstone.shinerockmod.ShinerockMod;

public class CustomArmor extends ItemArmor{
	public CustomArmor(String name, ArmorMaterial material, int renderIndexIn,EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab){
		super(material,renderIndexIn,equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
	public CustomArmor(String name, ArmorMaterial material, int renderIndexIn,EntityEquipmentSlot equipmentSlotIn) {
		this(name,material,renderIndexIn,equipmentSlotIn,ShinerockMod.shinerocktab);
	}
	public CustomArmor register() {
		ForgeRegistries.ITEMS.register(this);
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(),"inventory"));
		return this;
	}
}
