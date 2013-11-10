package krystacraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import krystacraft.lib.BlockIds;
import krystacraft.lib.Strings;

public class Blocks {
	public static Block krystaOre;
	public static Block newLeaf;
	public static Block newLog;
	public static Block sodaliteOre;

	public static void init() {
		krystaOre = new BlockKrystaOre(BlockIds.KrystaOre_Default);
		newLeaf = new BlockNewLeaf(BlockIds.NewLeaf_Default, Material.leaves, false);
		newLog = new BlockNewLog(BlockIds.NewLog_Default);
		sodaliteOre = new BlockSodaliteOre(BlockIds.SodaliteOre_Default);
		
		GameRegistry.registerBlock(krystaOre, Strings.BlockKrystaOre_name);
		GameRegistry.registerBlock(newLeaf, Strings.BlockNewLeaf_name);
		GameRegistry.registerBlock(newLog, Strings.BlockNewLog_name);
		GameRegistry.registerBlock(sodaliteOre, Strings.BlockSodaliteOre_name);
	}

	public static void addNames() {
		LanguageRegistry.addName(krystaOre, Strings.BlockKrystaOre_name);
		LanguageRegistry.addName(newLeaf, Strings.BlockNewLeaf_name);
		LanguageRegistry.addName(newLog, Strings.BlockNewLog_name);
		LanguageRegistry.addName(sodaliteOre, Strings.BlockSodaliteOre_name);
	}
	
	public static void setBlockHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(krystaOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(newLog, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(sodaliteOre, "pickaxe", 3);
	}
}
