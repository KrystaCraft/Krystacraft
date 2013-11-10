package krystacraft.wep.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class WorldGenOre{
	
	public void generateOre(Block block, Block blockToReplace, World world, Random rand, int blockXPos, int blockZPos, int maxY, int maxVeinSize, int chancesToSpawn)
	{
	      for (int i = 0; i < chancesToSpawn; ++i) {
	    	  final int x1 = blockXPos + rand.nextInt(16);
		      final int y1 = rand.nextInt(maxY) + 4;
		      final int z1 = blockZPos + rand.nextInt(16);
		      final int id = world.getBlockId(x1, y1, z1);
		      
		      if (id != 0&& Block.blocksList[id].isGenMineableReplaceable(
		    		  world, x1, y1, z1, blockToReplace.blockID)){
		    	  world.setBlock(x1, y1, z1, block.blockID); 
		      }
					
	      }
	}

}