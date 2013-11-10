/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 * 
 * Code attributed to the ExtrabiomesXL mod
 */

package krystacraft.wep.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import krystacraft.blocks.Blocks;
import krystacraft.wep.TreeSoilRegistry;

public class WorldGenKrystalTree extends WorldGenerator{

	private static final int	trunkBlock					= Blocks.newLog.blockID;
	private static final int	leafBlock					= Blocks.newLeaf.blockID;
	
	private static final int	BASE_HEIGHT					= 4;
	private static final int	CANOPY_HEIGHT				= 3;
	private static final int	CANOPY_RADIUS_EXTRA_RADIUS	= 0;
	private static final int	MAX_VARIANCE_HEIGHT			= 2;
	
	private static boolean isBlockSuitableForGrowing(final World world, final int x, final int y, final int z) {
		final int id = world.getBlockId(x, y, z);
		return TreeSoilRegistry.isValidSoil(id);
	}
	
	private static boolean isRoomToGrow(final World world, final int x, final int y, final int z, final int height) {
		for (int i = y; i <= y + 1 + height; ++i) {

			if (i < 0 || i >= 256) return false;

			int radius = 1;

			if (i == y) radius = 0;

			if (i >= y + 1 + height - 2) radius = 2;

			for (int x1 = x - radius; x1 <= x + radius; ++x1) {
				for (int z1 = z - radius; z1 <= z + radius; ++z1) {
					final int id = world.getBlockId(x1, i, z1);

					if (Block.blocksList[id] != null && !Block.blocksList[id].isLeaves(world, x1, i, z1) && id != Block.grass.blockID && !Block.blocksList[id].isWood(world, x1, i, z1)) return false;
				}
			}
		}
		
		return true;
	}
	
	// Store the last seed that was used to generate a tree
    private static long lastSeed = 0;

    @Override
    public boolean generate(World world, Random rand, int x, int y, int z) {
    	// Store the seed
    	lastSeed = rand.nextLong();
    	
        return generateTree(world, new Random(lastSeed), x, y, z);
    }
    
    public boolean generate(World world, long seed, int x, int y, int z) {
    	// Store the seed
    	lastSeed = seed;
    	
        return generateTree(world, new Random(seed), x, y, z);
    }
    
    private boolean generateTree(World world, Random rand, int x, int y, int z) {
		final int height = rand.nextInt(MAX_VARIANCE_HEIGHT + 1) + BASE_HEIGHT;

		if (y < 1 || y + height + 1 > 256) return false;

		if (!isBlockSuitableForGrowing(world, x, y - 1, z))
			return false;

		if (!isRoomToGrow(world, x, y, z, height)) return false;

		world.setBlock(x, y - 1, z, Block.dirt.blockID);
		growLeaves(world, rand, x, y, z, height, leafBlock);
		growTrunk(world, x, y, z, height, trunkBlock);

		return true;
	}

	private void growLeaves(final World world, final Random rand, final int x, final int y, final int z, final int height, int leafID) {
		for (int y1 = y - CANOPY_HEIGHT + height; y1 <= y + height; ++y1) {
			final int canopyRow = y1 - (y + height);
			final int radius = CANOPY_RADIUS_EXTRA_RADIUS + 1
					- canopyRow / 2;

			for (int x1 = x - radius; x1 <= x + radius; ++x1) {
				final int xDistanceFromTrunk = x1 - x;

				for (int z1 = z - radius; z1 <= z + radius; ++z1) {
					final int zDistanceFromTrunk = z1 - z;

					final Block block = Block.blocksList[world
							.getBlockId(x1, y1, z1)];

					if ((Math.abs(xDistanceFromTrunk) != radius || Math.abs(zDistanceFromTrunk) != radius || rand.nextInt(2) != 0 && canopyRow != 0) && (block == null || block.canBeReplacedByLeaves(world, x1, y1, z1))) {
						setBlock(world, x1, y1, z1, leafID);
					}
				}
			}
		}
	}

	private void growTrunk(final World world, final int x, final int y, final int z, final int height, int woodID) {
		for (int y1 = 0; y1 < height; ++y1) {
			final int id = world.getBlockId(x, y + y1, z);

			if (Block.blocksList[id] == null || Block.blocksList[id].isLeaves(world, x, y + y1, z)) {
				setBlock(world, x, y + y1, z, woodID);
			}
		}
	}
    
    public static long getLastSeed(){ 
    	return lastSeed;
    }
}
