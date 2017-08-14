package com.ricardoredstone.shinerockmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.ricardoredstone.shinerockmod.init.ItemInit;

public class ModTab extends CreativeTabs{
	public ModTab(String label) {
		super("tutorialtab");
		//this.setBackgroundImageName("tutorial.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.shinerock_dust);
	}
}
