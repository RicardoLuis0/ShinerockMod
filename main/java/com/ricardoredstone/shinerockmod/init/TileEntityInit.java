package com.ricardoredstone.shinerockmod.init;

import com.ricardoredstone.shinerockmod.init.tileEntity.*;

public class TileEntityInit {
	public static TileEntityCustomRFProvider passiveGenerator;
	public static void init() {
		passiveGenerator= new TileEntityCustomRFProvider("passiveGenerator", 1000, 1, true);
	}
	public static void register() {
		passiveGenerator.register();
	}
}
