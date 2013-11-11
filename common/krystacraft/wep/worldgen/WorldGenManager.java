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
        case "Plains": generatePlains(world, random, chunkX, chunkZ);
        case "Desert": generateDesert(world, random, chunkX, chunkZ);
        case "Extreme Hills": generateExtremeHills(world, random, chunkX, chunkZ);
        case "Forest": generateForest(world, random, chunkX, chunkZ);
        case "Taiga": generateTaiga(world, random, chunkX, chunkZ);
        case "Swampland": generateSwampland(world, random, chunkX, chunkZ);
        case "River": generateRiver(world, random, chunkX, chunkZ);
        case "Hell": generateHell(world, random, chunkX, chunkZ);
        case "Sky": generateSky(world, random, chunkX, chunkZ);
        case "FrozenOcean": generateFrozenOcean(world, random, chunkX, chunkZ);
        case "FrozenRiver": generateFrozenRiver(world, random, chunkX, chunkZ);
        case "Ice Plains": generateIcePlains(world, random, chunkX, chunkZ);
        case "Ice Mountains": generateIceMountains(world, random, chunkX, chunkZ);
        case "MushroomIsland": generateMushroomIsland(world, random, chunkX, chunkZ);
        case "MushroomIslandShore": generateMushroomIslandShore(world, random, chunkX, chunkZ);
        case "Beach": generateBeach(world, random, chunkX, chunkZ);
        case "DesertHills": generateDesertHills(world, random, chunkX, chunkZ);
        case "ForestHills": generateForestHills(world, random, chunkX, chunkZ);
        case "TaigaHills": generateTaigaHills(world, random, chunkX, chunkZ);
        case "Extreme Hills Edge": generateExtremeHillsEdge(world, random, chunkX, chunkZ);
        case "Jungle": generateJungle(world, random, chunkX, chunkZ);
        case "JungleHills": generateJungleHills(world, random, chunkX, chunkZ);
        }
        
        //Generate OverWorld items
        if (world.provider.dimensionId == 0){
        	generateSurface(world, random, chunkX, chunkZ);
        }
	}
	
	private void generateOcean(World world, Random random, int x, int z){
		
	}
	
	private void generatePlains(World world, Random random, int x, int z){
		oreGen.generateOre(Blocks.krystaOre, Block.stone, world , random, x, z, 160, 6, 30);
    	oreGen.generateOre(Blocks.sodaliteOre, Block.stone, world, random, x, z, 160, 6, 50);
    	oreGen.generateOre(Blocks.onyxOre, Block.stone, world, random, x, z, 160, 6, 50);
	}
	
	private void generateDesert(World world, Random random, int x, int z){
		
	}
	
	private void generateExtremeHills(World world, Random random, int x, int z){
		
	}
	
	private void generateForest(World world, Random random, int x, int z){
		
	}
	
	private void generateTaiga(World world, Random random, int x, int z){
		
	}
	
	private void generateSwampland(World world, Random random, int x, int z){
		
	}
	
	private void generateRiver(World world, Random random, int x, int z){
		
	}
	
	private void generateHell(World world, Random random, int x, int z){
		oreGen.generateOre(Blocks.krystaOre, Block.netherrack, world , random, x, z, 160, 4, 30);
	}
	
	private void generateSky(World world, Random random, int x, int z){
		
	}
	
	private void generateFrozenOcean(World world, Random random, int x, int z){
		
	}
	
	private void generateFrozenRiver(World world, Random random, int x, int z){
		
	}
	
	private void generateIcePlains(World world, Random random, int x, int z){
		
	}
	
	private void generateIceMountains(World world, Random random, int x, int z){
		
	}
	
	private void generateMushroomIsland(World world, Random random, int x, int z){
		
	}
	
	private void generateMushroomIslandShore(World world, Random random, int x, int z){
		
	}
	
	private void generateBeach(World world, Random random, int x, int z){
		
	}
	
	private void generateDesertHills(World world, Random random, int x, int z){
		
	}
	
	private void generateForestHills(World world, Random random, int x, int z){
		
	}
	
	private void generateTaigaHills(World world, Random random, int x, int z){
		
	}
	
	private void generateExtremeHillsEdge(World world, Random random, int x, int z){
		
	}
	
	private void generateJungle(World world, Random random, int x, int z){
		
	}
	
	private void generateJungleHills(World world, Random random, int x, int z){
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		//Generate Trees
		int Xcoord1 = x + random.nextInt(16); //where in chuck it generates
		int Ycoord1 = random.nextInt(100); //how high it generates
		int Zcoord1 = z + random.nextInt(16); //where in chunk it generates
		worldGen.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
	}
}