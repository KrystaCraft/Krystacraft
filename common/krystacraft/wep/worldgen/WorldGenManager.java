package krystacraft.wep.worldgen;

import java.util.Random;

import krystacraft.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenManager implements IWorldGenerator {
	

	final WorldGenOre oreGen = new WorldGenOre();
	final WorldGenKrystalTree worldGen = new WorldGenKrystalTree();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		chunkZ = chunkZ << 4;
		chunkX = chunkX << 4;
		
		BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        
        switch(b.biomeName){
        case "Ocean": generateOcean(world, random, chunkX, chunkZ);
        case "Plains": generateOcean(world, random, chunkX, chunkZ);
        case "Desert": generateOcean(world, random, chunkX, chunkZ);
        case "Extreme Hills": generateOcean(world, random, chunkX, chunkZ);
        case "Forest": generateOcean(world, random, chunkX, chunkZ);
        case "Taiga": generateOcean(world, random, chunkX, chunkZ);
        case "Swampland": generateOcean(world, random, chunkX, chunkZ);
        case "River": generateOcean(world, random, chunkX, chunkZ);
        case "Hell": generateOcean(world, random, chunkX, chunkZ);
        case "Sky": generateOcean(world, random, chunkX, chunkZ);
        case "FrozenOcean": generateOcean(world, random, chunkX, chunkZ);
        case "FrozenRiver": generateOcean(world, random, chunkX, chunkZ);
        case "Ice Plains": generateOcean(world, random, chunkX, chunkZ);
        case "Ice Mountains": generateOcean(world, random, chunkX, chunkZ);
        case "MushroomIsland": generateOcean(world, random, chunkX, chunkZ);
        case "MushroomIslandShore": generateOcean(world, random, chunkX, chunkZ);
        case "Beach": generateOcean(world, random, chunkX, chunkZ);
        case "DesertHills": generateOcean(world, random, chunkX, chunkZ);
        case "ForestHills": generateOcean(world, random, chunkX, chunkZ);
        case "TaigaHills": generateOcean(world, random, chunkX, chunkZ);
        case "Extreme Hills Edge": generateOcean(world, random, chunkX, chunkZ);
        case "Hungle": generateOcean(world, random, chunkX, chunkZ);
        case "JungleHills": generateOcean(world, random, chunkX, chunkZ);
        }
        
		switch(world.provider.dimensionId){
		case -1: generateNether(world, random, chunkX, chunkZ);
		case 0: generateSurface(world, random, chunkX, chunkZ);
		case 1: generateEnd(world, random, chunkX, chunkZ);
		}

	}
	
	private void generateOcean(World world, Random random, int x, int z){
		
	}

	private void generateEnd(World world, Random random, int x, int z) {

	}

	private void generateSurface(World world, Random random, int x, int z) {
		//Generate Trees
		int Xcoord1 = x + random.nextInt(16); //where in chuck it generates
		int Ycoord1 = random.nextInt(100); //how high it generates
		int Zcoord1 = z + random.nextInt(16); //where in chunk it generates
		worldGen.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		
		//Generate Ores
		BiomeGenBase b = world.getBiomeGenForCoords(x, z);
        if(b.biomeName.equals("Plains")) {
        	oreGen.generateOre(Blocks.krystaOre, Block.stone, world , random, x, z, 160, 4, 30);
        	oreGen.generateOre(Blocks.sodaliteOre, Block.stone, world, random, x, z, 160, 4, 50);
        }
	}

	private void generateNether(World world, Random random, int x, int z) {
		oreGen.generateOre(Blocks.krystaOre, Block.netherrack, world , random, x, z, 160, 4, 30);
	}
}