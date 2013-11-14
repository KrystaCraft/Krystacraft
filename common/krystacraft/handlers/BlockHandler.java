package krystacraft.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import krystacraft.blocks.BlockNewLeaf;
import krystacraft.blocks.BlockNewLog;
import krystacraft.blocks.BlockOre;
import krystacraft.lib.BlockSettings;
import krystacraft.lib.BlockSettings.Leafs;
import krystacraft.lib.BlockSettings.Logs;
import krystacraft.lib.BlockSettings.Ores;

public class BlockHandler {
	
	public static void createBlocks() {
		createOres();
		createLogs();
		createLeafs();
	}
	
	public static void createOres() {
		for (BlockSettings.Ores o : Ores.values()){
			BlockOre ore = new BlockOre(o.getIdActual(), o.getUnLocName(), o.getIconPath(), o.getXpLow(), o.getXpHigh(), 
					ItemHandler.aquamarineCrystal.itemID, ItemHandler.aquamarineCrystalLarge.itemID);
			
			GameRegistry.registerBlock(ore, o.getName());
			LanguageRegistry.addName(ore, o.getName());
			MinecraftForge.setBlockHarvestLevel(ore, "pickaxe", 3);
			OreDictionary.registerOre(o.getUnLocName(), ore);
		}
	}
	
	public static void createLogs() {
		for (BlockSettings.Logs l : Logs.values()) {
			BlockNewLog log = new BlockNewLog(l.getIdActual(), l.getUnLocName(), l.getIconPaths());
			
			GameRegistry.registerBlock(log, l.name());
			LanguageRegistry.addName(log, l.name());
			MinecraftForge.setBlockHarvestLevel(log, "axe", 1);
		}
	}
	
	public static void createLeafs() {
		for (BlockSettings.Leafs le : Leafs.values()) {
			BlockNewLeaf leaf = new BlockNewLeaf(le.getIdActual(), Material.leaves, false, le.getUnLocName(), le.getIconPath());
			
			GameRegistry.registerBlock(leaf, le.name());
			LanguageRegistry.addName(leaf, le.name());
		}
	}
}
