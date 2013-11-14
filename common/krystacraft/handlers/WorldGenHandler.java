package krystacraft.handlers;

import java.util.Random;

import krystacraft.blocks.BlockOre;
import krystacraft.lib.BlockSettings;
import krystacraft.lib.BlockSettings.Leafs;
import krystacraft.lib.BlockSettings.Logs;
import krystacraft.lib.BlockSettings.Ores;
import krystacraft.wep.worldgen.WorldGenKrystalTree;
import krystacraft.wep.worldgen.WorldGenOre;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandler implements IWorldGenerator {
	

	private WorldGenOre oreGen = new WorldGenOre();
	private WorldGenKrystalTree worldGenKrystalTree;
	private BlockSettings blockSettings = new BlockSettings();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		chunkZ = chunkZ << 4;
		chunkX = chunkX << 4;
		
		BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        
	    switch(b.biomeName){
	    case "Ocean": generateOcean(world, random, chunkX, chunkZ);
        	break;
        case "Plains": generatePlains(world, random, chunkX, chunkZ);
        	break;
        case "Desert": generateDesert(world, random, chunkX, chunkZ);
        	break;
        case "Extreme Hills": generateExtremeHills(world, random, chunkX, chunkZ);
        	break;
        case "Forest": generateForest(world, random, chunkX, chunkZ);
        	break;
        case "Taiga": generateTaiga(world, random, chunkX, chunkZ);
        	break;
        case "Swampland": generateSwampland(world, random, chunkX, chunkZ);
        	break;
        case "River": generateRiver(world, random, chunkX, chunkZ);
        	break;
        case "Hell": generateHell(world, random, chunkX, chunkZ);
        	break;
        case "Sky": generateSky(world, random, chunkX, chunkZ);
        	break;
        case "FrozenOcean": generateFrozenOcean(world, random, chunkX, chunkZ);
        	break;
        case "FrozenRiver": generateFrozenRiver(world, random, chunkX, chunkZ);
        	break;
        case "Ice Plains": generateIcePlains(world, random, chunkX, chunkZ);
        	break;
        case "Ice Mountains": generateIceMountains(world, random, chunkX, chunkZ);
        	break;
        case "MushroomIsland": generateMushroomIsland(world, random, chunkX, chunkZ);
        	break;
        case "MushroomIslandShore": generateMushroomIslandShore(world, random, chunkX, chunkZ);
        	break;
        case "Beach": generateBeach(world, random, chunkX, chunkZ);
        	break;
        case "DesertHills": generateDesertHills(world, random, chunkX, chunkZ);
        	break;
        case "ForestHills": generateForestHills(world, random, chunkX, chunkZ);
        	break;
        case "TaigaHills": generateTaigaHills(world, random, chunkX, chunkZ);
        	break;
        case "Extreme Hills Edge": generateExtremeHillsEdge(world, random, chunkX, chunkZ);
        	break;
        case "Jungle": generateJungle(world, random, chunkX, chunkZ);
        	break;
        case "JungleHills": generateJungleHills(world, random, chunkX, chunkZ);
        	break;
	        }
        
        //Generate OverWorld items
        if (world.provider.dimensionId == 0){
        	generateSurface(world, random, chunkX, chunkZ);
        }
	}
	
	private void generateOre(String[] ores, World world, Random random, int x, int z, Block blockToReplace) {
		
		for (int i = 0; i < ores.length - 1; i++){
			Ores oreSetting = blockSettings.getOreSettings(ores[i]);
			if (oreSetting.getWillSpawn() == true){
				Block oreBlock = new BlockOre(oreSetting.getIdActual(), oreSetting.getUnLocName(), oreSetting.getIconPath(),
						oreSetting.getXpLow(), oreSetting.getXpHigh(), 
						ItemHandler.aquamarineCrystal.itemID, ItemHandler.aquamarineCrystalLarge.itemID);
				
				oreGen.generateOre(oreBlock, blockToReplace, world , random, x, z, oreSetting.getMaxY(), 
						oreSetting.getMaxVeinSize(), oreSetting.getChanceToSpawn());
			}
		}
	}
	
	private void generateKrystalTree(World world, Random random, int x, int z) {
		worldGenKrystalTree = new WorldGenKrystalTree(Logs.newLog.getIdActual(), Leafs.newLeaf.getIdActual());
		
		//Generate Trees
		int Xcoord1 = x + random.nextInt(16); //where in chuck it generates
		int Ycoord1 = random.nextInt(100); //how high it generates
		int Zcoord1 = z + random.nextInt(16); //where in chunk it generates
		worldGenKrystalTree.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
	}
	
	private void generateOcean(World world, Random random, int x, int z){
		String[] ores = {"TanzaniteOre","ChalcedonyOre","AquamarineOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generatePlains(World world, Random random, int x, int z){
		String[] ores = {"MalachiteOre","RoseQuartzOre","BerylOre","KrystaOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateDesert(World world, Random random, int x, int z){
		String[] ores = {"FireOpalOre","RhodoliteOre","SodaliteOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateExtremeHills(World world, Random random, int x, int z){
		String[] ores = {"OnyxOre","HackmaniteOre","AquamarineOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);	
	}
	
	private void generateForest(World world, Random random, int x, int z){
		String[] ores = {"JadeOre","TourmalineOre","SugiliteOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateTaiga(World world, Random random, int x, int z){
		String[] ores = {"HackmaniteOre","AquamarineOre","OnyxOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateSwampland(World world, Random random, int x, int z){
		String[] ores = {"AquamarineOre","HackmaniteOre","OnyxOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateRiver(World world, Random random, int x, int z){
		String[] ores = {"SodaliteOre","FireOpalOre","RhodoliteOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateHell(World world, Random random, int x, int z){
		String[] ores = {"NetherGarnetOre"};
		
		generateOre(ores, world, random, x, z, Block.netherrack);
	}
	
	private void generateSky(World world, Random random, int x, int z){
		String[] ores = {"EndTopazOre"};
		
		generateOre(ores, world, random, x, z, Block.whiteStone);
	}
	
	private void generateFrozenOcean(World world, Random random, int x, int z){
		String[] ores = {"RoseQuartzOre","MalachiteOre","BerylOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateFrozenRiver(World world, Random random, int x, int z){
		String[] ores = {"TourmalineOre","JadeOre","SugiliteOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateIcePlains(World world, Random random, int x, int z){
		String[] ores = {"ChalcedonyOre","TanzaniteOre","AquamarineOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateIceMountains(World world, Random random, int x, int z){
		String[] ores = {"SugiliteOre","JadeOre","TourmalineOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateMushroomIsland(World world, Random random, int x, int z){}
	
	private void generateMushroomIslandShore(World world, Random random, int x, int z){}
	
	private void generateBeach(World world, Random random, int x, int z){
		String[] ores = {"BerylOre","MalachiteOre","RoseQuartzOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
		
	}
	
	private void generateDesertHills(World world, Random random, int x, int z){
		String[] ores = {"FireOpalOre","RhodoliteOre","SodaliteOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateForestHills(World world, Random random, int x, int z){
		String[] ores = {"JadeOre","TourmalineOre","SugiliteOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateTaigaHills(World world, Random random, int x, int z){
		String[] ores = {"HackmaniteOre","OnyxOre","AquamarineOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateExtremeHillsEdge(World world, Random random, int x, int z){
		String[] ores = {"OnyxOre","HackmaniteOre","AquamarineOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
	}
	
	private void generateJungle(World world, Random random, int x, int z){
		String[] ores = {"RhodoliteOre","FireOpalOre","SodaliteOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);
		
	}
	
	private void generateJungleHills(World world, Random random, int x, int z){
		String[] ores = {"RhodoliteOre","FireOpalOre","SodaliteOre"};
		
		generateOre(ores, world, random, x, z, Block.stone);

	}

	private void generateSurface(World world, Random random, int x, int z) {
		generateKrystalTree(world, random, x, z);
	}
}