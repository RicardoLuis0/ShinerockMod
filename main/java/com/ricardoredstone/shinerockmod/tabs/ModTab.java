package com.ricardoredstone.shinerockmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.ricardoredstone.shinerockmod.init.ItemInit;

public class ModTab extends CreativeTabs{
	public ModTab(String label) {
		super(label);
	}
	public ModTab(String label,String background) {
		super(label);
		this.setBackgroundImageName(background);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.shinerock_dust);
	}
}
