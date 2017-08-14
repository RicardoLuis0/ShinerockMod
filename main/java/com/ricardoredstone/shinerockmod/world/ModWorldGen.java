package com.ricardoredstone.shinerockmod.world;

import java.util.Random;

import com.ricardoredstone.shinerockmod.init.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator{
	@Override
	public void generate(Random random,int chunkX,int chunkZ,World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case 0:
			generateOverworld(random,chunkX,chunkZ,world,chunkGenerator,chunkProvider);
			break;
		}
	}
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(BlockInit.shinerock_ore.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 20, 8 + random.nextInt(8), 16);
		generateOre(BlockInit.ettroite_ore.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 8, 32, 4 + random.nextInt(4), 8);
	}
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
