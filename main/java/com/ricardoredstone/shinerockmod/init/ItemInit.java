package com.ricardoredstone.shinerockmod.init;

import com.ricardoredstone.shinerockmod.init.items.*;

public class ItemInit {
	public static CustomItem ettroite_ingot, ettroite_gem, ettroite_dust, shinerock_dust,shinerock_shard;
	public static void init() {
		ettroite_ingot = new CustomItem("ettroite_ingot");
		//ettroite_gem = new CustomItem("ettroite_gem");
		ettroite_dust = new CustomItem("ettroite_dust");
		shinerock_dust = new CustomItem("shinerock_dust");
		shinerock_shard = new CustomItem("shinerock_shard");
	}
	public static void register() {
		ettroite_ingot.register().registerOredictionary("ingotEttroite");
		//ettroite_gem.register().registerOredictionary("gemEttroite");
		ettroite_dust.register().registerOredictionary("dustEttroite");
		shinerock_dust.register().registerOredictionary("dustShinerock");
		shinerock_shard.register().registerOredictionary("shardShinerock");
	}
}