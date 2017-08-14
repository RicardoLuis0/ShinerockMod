package com.ricardoredstone.shinerockmod.recipes;

import com.ricardoredstone.shinerockmod.init.BlockInit;
import com.ricardoredstone.shinerockmod.init.ItemInit;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		//GameRegistry.addSmelting(ItemInit.ettroite_gem,new ItemStack(ItemInit.ettroite_ingot),0.7F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockInit.ettroite_ore),new ItemStack(ItemInit.ettroite_ingot),0.7F);
		GameRegistry.addSmelting(ItemInit.ettroite_dust,new ItemStack(ItemInit.ettroite_ingot),0.7F);
	}
}
