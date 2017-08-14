package com.ricardoredstone.shinerockmod.handlers;

import com.ricardoredstone.shinerockmod.init.ItemInit;
import com.ricardoredstone.shinerockmod.init.BlockInit;
import com.ricardoredstone.shinerockmod.init.ToolInit;
import com.ricardoredstone.shinerockmod.init.ArmorInit;

public class RegistryHandler {
	public static void Client() {
	}
	public static void Common() {
		ItemInit.init();
		BlockInit.init();
		ToolInit.init();
		ArmorInit.init();
		ItemInit.register();
		BlockInit.register();
		ToolInit.register();
		ArmorInit.register();
	}
}