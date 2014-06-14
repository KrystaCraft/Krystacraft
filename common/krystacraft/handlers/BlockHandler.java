package krystacraft.handlers;

import java.util.HashMap;

import net.minecraft.block.material.Material;
import krystacraft.blocks.BlockNewLeaf;
import krystacraft.blocks.BlockNewLog;
import krystacraft.blocks.BlockOre;
import krystacraft.items.ItemCrystal;
import krystacraft.lib.BlockSettings;
import krystacraft.lib.BlockSettings.Leafs;
import krystacraft.lib.BlockSettings.Logs;
import krystacraft.lib.BlockSettings.Ores;
import krystacraft.proxy.CommonProxy;

public class BlockHandler {
	
	public static HashMap<String, BlockOre> oreMap = new HashMap<String, BlockOre>();
	
	public static void createBlocks() {
		createOres();
		createLogs();
		createLeafs();
	}

	public static void createOres() {
		for (BlockSettings.Ores o : Ores.values()) {
			ItemCrystal firstDrop = ItemHandler.crystalMap.get(o.getFirstItemDrop());
			ItemCrystal secondDrop = ItemHandler.crystalMap.get(o.getSecondItemDrop());
			
			if (firstDrop != null || secondDrop != null) {
				BlockOre ore = new BlockOre(o.getIdActual(), o.getUnLocName(),
						o.getIconPath(), o.getXpLow(), o.getXpHigh(),
						firstDrop.get,
						secondDrop.itemID,
						o.getMaxY(), o.getMaxVeinSize(), o.getChanceToSpawn(), o.getWillSpawn());
	
				final CommonProxy proxy = new CommonProxy();
				proxy.registerBlock(ore, o.getName());
				proxy.addName(ore, o.getName());
				proxy.setBlockHarvestLevel(ore, "pickaxe", o.getHarvestLevel());
				proxy.registerOre(o.getUnLocName(), ore);
				
				oreMap.put(o.getUnLocName(), ore);
			}
		}
	}

	public static void createLogs() {
		for (BlockSettings.Logs l : Logs.values()) {
			BlockNewLog log = new BlockNewLog(l.getIdActual(),
					l.getUnLocName(), l.getIconPaths());

			final CommonProxy proxy = new CommonProxy();
			proxy.registerBlock(log, l.name());
			proxy.addName(log, l.name());
			proxy.setBlockHarvestLevel(log, "axe", l.getHarvestLevel());
		}
	}

	public static void createLeafs() {
		for (BlockSettings.Leafs le : Leafs.values()) {
			BlockNewLeaf leaf = new BlockNewLeaf(le.getIdActual(),
					Material.leaves, false, le.getUnLocName(), le.getIconPath());

			final CommonProxy proxy = new CommonProxy();
			proxy.registerBlock(leaf, le.name());
			proxy.addName(leaf, le.name());
		}
	}
}
