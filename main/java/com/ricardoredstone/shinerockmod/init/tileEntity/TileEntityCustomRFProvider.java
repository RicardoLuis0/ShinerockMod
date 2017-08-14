package com.ricardoredstone.shinerockmod.init.tileEntity;

import com.ricardoredstone.shinerockmod.Reference;
import com.ricardoredstone.shinerockmod.ShinerockMod;

import cofh.redstoneflux.api.IEnergyProvider;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.capabilities.CapabilityDispatcher;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityCustomRFProvider extends TileEntity implements IInventory, IEnergyProvider, ITickable{
	private String name,customName=null;
	private final int maxRF;
	private int currentRF,tickRF,burnTime;
	private boolean passive;
	public TileEntityCustomRFProvider(String name, int maxRF,int tickRF,boolean passive) {
		this.name=name;
		this.maxRF=maxRF;
		this.tickRF=tickRF;
		this.passive=passive;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean hasCustomName() {
		return (customName!=null)?true:false;
	}
	public void setCustomName(String name) {
		customName=name;
	}
	public String getCustomName() {
		return customName;
	}
	@Override
	public int getSizeInventory() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		return null;
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		return null;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return null;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
	}

	@Override
	public int getInventoryStackLimit() {
		return 0;
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer player) {
		return false;
	}

	@Override
	public void openInventory(EntityPlayer player) {
	}

	@Override
	public void closeInventory(EntityPlayer player) {
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return false;
	}

	@Override
	public int getField(int id) {
		switch(id) {
		case 0:
			return this.currentRF;
		case 1:
			return this.maxRF;
		}
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		switch(id) {
		case 0:
			this.currentRF=(value>maxRF)?maxRF:value;
			break;
		}
	}

	@Override
	public int getFieldCount() {
		return 2;
	}

	@Override
	public void clear() {
	}
	@Override
	public int getEnergyStored(EnumFacing from) {
		return currentRF;
	}
	@Override
	public int getMaxEnergyStored(EnumFacing from) {
		return maxRF;
	}
	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		return true;
	}
	@Override
	public int extractEnergy(EnumFacing from, int maxExtract, boolean simulate) {
		int extract=(maxExtract>currentRF)?maxExtract:currentRF;
		currentRF-=extract;
		System.out.println("Extracting Energy, Extracted: "+extract+", Current Storage: "+currentRF);
		return extract;
	}
	@Override
	public void readFromNBT(NBTTagCompound nbt){
        currentRF=nbt.getInteger("currentRF");
        if(currentRF>maxRF)currentRF=maxRF;
        super.readFromNBT(nbt);
    }
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt){
		if(currentRF<0)currentRF=0;
		nbt.setInteger("currentRF",currentRF);
		return super.writeToNBT(nbt);
    }
	@Override
	public void update() {
		int lastRF;
		lastRF=currentRF;
		if(passive) {
			currentRF+=tickRF;
			if(currentRF>maxRF)currentRF=maxRF;
		}else if(burnTime>0){
			currentRF=(currentRF+tickRF>maxRF)?maxRF:currentRF+tickRF;
			burnTime--;
		}
		if(lastRF!=currentRF) {
			System.out.println("Energy Updated :"+currentRF);
		}
	}
	public TileEntityCustomRFProvider register() {
		GameRegistry.registerTileEntity(TileEntityCustomRFProvider.class, Reference.MODID+":"+name);
		return this;
	}

}
