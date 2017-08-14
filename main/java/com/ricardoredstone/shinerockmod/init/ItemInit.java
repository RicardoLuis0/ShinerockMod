package com.ricardoredstone.shinerockmod.init;

import com.ricardoredstone.shinerockmod.init.items.CustomItem;

public class ItemInit {
	public static CustomItem ettroite_ingot, ettroite_ingot_dust, ettroite_gem, ettroite_dust, shinerock_dust;
	public static void init() {
		ettroite_ingot = new CustomItem("ettroite_ingot");
		ettroite_ingot_dust = new CustomItem("ettroite_ingot_dust");
		ettroite_gem = new CustomItem("ettroite_gem");
		ettroite_dust = new CustomItem("ettroite_dust");
		shinerock_dust = new CustomItem("shinerock_dust");
	}
	public static void register() {
		ettroite_ingot.register().registerOredictionary("ingotEttroiteAlloy");
		ettroite_ingot_dust.register().registerOredictionary("dustEttroiteAlloy");
		ettroite_gem.register().registerOredictionary("gemEttroite");
		ettroite_dust.register().registerOredictionary("dustEttroite");
		shinerock_dust.register().registerOredictionary("dustShinerock");
	}
}