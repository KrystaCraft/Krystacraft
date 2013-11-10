package krystacraft.wep.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenOre{
	
	public void generateOre(Block block, Block blockToReplace, World world, Random rand, int blockXPos, int blockZPos, int maxY, int maxVeinSize, int chancesToSpawn)
	{
		final WorldGenerator oreGen = new WorldGenMinable(block.blockID, maxVeinSize, blockToReplace.blockID); 
		
	      for (int i = 0; i < chancesToSpawn; ++i) {
	    	  final int x1 = blockXPos + rand.nextInt(16);
		      final int y1 = rand.nextInt(maxY);
		      final int z1 = blockZPos + rand.nextInt(16);
		          	  
			  oreGen.generate(world, rand, x1, y1, z1);
	      }
	}
}