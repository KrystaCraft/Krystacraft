package krystacraft.worldgen;

import java.util.Random;

import krystacraft.blocks.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenTrees;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenManager implements IWorldGenerator {

	public static WorldGenOre oreGen = new WorldGenOre();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}

	}

	private void generateEnd(World world, Random random, int x, int z) {

	}

	private void generateSurface(World world, Random random, int x, int z) {
		//Generate Trees
		for (int i = 0; i < 10; i++){
			int Xcoord1 = x + random.nextInt(16); //where in chuck it generates
			int Ycoord1 = random.nextInt(100); //how high it generates
			int Zcoord1 = z + random.nextInt(16); //where in chunk it generates

			new WorldGenTree(false).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
		//Generate Ores
		oreGen.addOreSpawn(Blocks.krystaOre, world, random, x, z, 16, 16, 4, 30, 12, 160);
        oreGen.addOreSpawn(Blocks.sodaliteOre, world, random, x, z, 16, 16, 4, 50, 12, 160);

	}

	private void generateNether(World world, Random random, int x, int z) {

	}
}