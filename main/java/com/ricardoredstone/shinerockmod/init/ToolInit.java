package com.ricardoredstone.shinerockmod.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import com.ricardoredstone.shinerockmod.init.tools.*;

public class ToolInit {
	public static CustomSword ettroite_sword;
	public static final ToolMaterial ETTROITE = EnumHelper.addToolMaterial("Ettroite", 2, 768, 4.0F, 7, 15);
	public static void init() {
		ettroite_sword = new CustomSword("ettroite_sword",ETTROITE);
	}
	public static void register() {
		ettroite_sword.register();
	}
}