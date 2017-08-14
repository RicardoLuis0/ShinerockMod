package com.ricardoredstone.shinerockmod.init.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import com.ricardoredstone.shinerockmod.ShinerockMod;

public class CustomBlock extends Block {
	protected Item drop;
	protected int metadata,min,max;
	public CustomBlock(String name, float hardness, float resistance, Material material, int harvestlevel, String toolclass,Item drop,int metadata,int min, int max){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(toolclass, harvestlevel);
		this.drop=drop;
		this.metadata=metadata;
		this.min=min;
		this.max=(min>max)?min:max;
	}
	public CustomBlock(String name, float hardness, float resistance, Material material, int harvestlevel, String toolclass,Item drop,int metadata, int amt) {
		this(name,hardness,resistance,material,harvestlevel,toolclass,drop,metadata,amt,amt);
	}
	public CustomBlock(String name, float hardness, float resistance, Material material, int harvestlevel, String toolclass,Item drop,int metadata) {
		this(name,hardness,resistance,material,harvestlevel,toolclass,drop,metadata,1,1);
	}
	public CustomBlock(String name, float hardness, float resistance, Material material, int harvestlevel, String toolclass,Item drop) {
		this(name,hardness,resistance,material,harvestlevel,toolclass,drop,0,1,1);
	}
	public CustomBlock(String name, float hardness, float resistance, Material material, int harvestlevel, String toolclass) {
		this(name,hardness,resistance,material,harvestlevel,toolclass,null,0,1,1);
	}
	public CustomBlock registerOredictionary(String orename) {
		OreDictionary.registerOre(orename, this);
		return this;
	}
	public CustomBlock register() {
		ForgeRegistries.BLOCKS.register(this);
		this.setCreativeTab(ShinerockMod.shinerocktab);
		ItemBlock item = new ItemBlock(this);
		item.setRegistryName(this.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(this.getRegistryName(),"inventory"));
		return this;
	}
	public CustomBlock setLightValue(int value){
        this.lightValue = value;
        return this;
    }
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune) {
	    if(drop!=null) {
	    	return this.drop;
		}else {
			return Item.getItemFromBlock(this);
		}
	}
	@Override
	public int damageDropped(IBlockState state) {
		if(drop!=null) {
		    return this.metadata;
		}else {
			return 0;
		}
	}
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		if(drop!=null) {
		    if(min==max) {
		    	return min;
		    }
		    return this.min + random.nextInt(this.max - this.min + fortune + 1);
		}else {
			return 1;
		}
	}
}
