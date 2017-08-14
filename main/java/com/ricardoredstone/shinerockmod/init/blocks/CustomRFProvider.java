package com.ricardoredstone.shinerockmod.init.blocks;

import com.ricardoredstone.shinerockmod.init.tileEntity.TileEntityCustomRFProvider;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CustomRFProvider extends CustomBlock implements ITileEntityProvider{
	private final int maxRF,tickRF;
	private final boolean passive;
	private final String name;
	private TileEntityCustomRFProvider tileEntity;
	public CustomRFProvider(String name, int maxRF,int tickRF,boolean passive) {
		super(name, 5F, 30F, Material.IRON, 0, "pickaxe");
		this.name=name;
		this.maxRF=maxRF;
		this.tickRF=tickRF;
		this.passive=passive;
		tileEntity=new TileEntityCustomRFProvider(name, maxRF, tickRF, passive);
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return tileEntity;
	}
	@Override
	public CustomRFProvider register() {
		super.register();
		tileEntity.register();
		return this;
		
	}

}
