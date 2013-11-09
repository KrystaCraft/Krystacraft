package krystacraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import krystacraft.lib.Ids;
import krystacraft.lib.Names;

public class Blocks {
	public static Block krystaOre;
	public static Block newLeaf;
	public static Block newLog;
	public static Block sodaliteOre;

	public static void init() {
		krystaOre = new BlockKrystaOre(Ids.KrystaOre_Default);
		newLeaf = new BlockNewLeaf(Ids.NewLeaf_Default);
		newLog = new BlockNewLog(Ids.NewLog_Default);
		sodaliteOre = new BlockSodaliteOre(Ids.SodaliteOre_Default);
		
		GameRegistry.registerBlock(krystaOre, Names.BlockKrystaOre_name);
		GameRegistry.registerBlock(newLeaf, Names.BlockNewLeaf_name);
		GameRegistry.registerBlock(newLog, Names.BlockNewLog_name);
		GameRegistry.registerBlock(sodaliteOre, Names.BlockSodaliteOre_name);
	}

	public static void addNames() {
		LanguageRegistry.addName(krystaOre, Names.BlockKrystaOre_name);
		LanguageRegistry.addName(newLeaf, Names.BlockNewLeaf_name);
		LanguageRegistry.addName(newLog, Names.BlockNewLog_name);
		LanguageRegistry.addName(sodaliteOre, Names.BlockSodaliteOre_name);
	}
	
	public static void setBlockHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(krystaOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(newLog, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(sodaliteOre, "pickaxe", 3);
	}
}
