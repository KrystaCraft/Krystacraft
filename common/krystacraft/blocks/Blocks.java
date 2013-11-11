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
	public static Block onyxOre;
	public static Block aquamarineOre;
	public static Block berylOre;
	public static Block chalcedonyOre;
	public static Block endTopazOre;
	public static Block fireOpalOre;
	public static Block hackmaniteOre;
	public static Block jadeOre;
	public static Block malachiteOre;
	public static Block netherGarnetOre;
	public static Block rhodoliteOre;
	public static Block roseQuartzOre;
	public static Block sugiliteOre;
	public static Block tanzaniteOre;
	public static Block tourmalineOre;

	

	public static void init() {
		krystaOre = new BlockKrystaOre(BlockIds.KrystaOre_Default);
		newLeaf = new BlockNewLeaf(BlockIds.NewLeaf_Default, Material.leaves, false);
		newLog = new BlockNewLog(BlockIds.NewLog_Default);
		sodaliteOre = new BlockSodaliteOre(BlockIds.SodaliteOre_Default);
		onyxOre = new BlockOnyxOre(BlockIds.OnyxOre_Default);
		aquamarineOre = new BlockAquamarineOre(BlockIds.AquamarineOre_Default);
		berylOre = new BlockBerylOre(BlockIds.BerylOre_Default);
		chalcedonyOre = new BlockChalcedonyOre(BlockIds.ChalcedonyOre_Default);
		endTopazOre = new BlockEndTopazOre(BlockIds.EndTopazOre_Default);
		fireOpalOre = new BlockFireOpalOre(BlockIds.FireOpalOre_Default);
		hackmaniteOre = new BlockHackmaniteOre(BlockIds.HackmaniteOre_Default);
		jadeOre = new BlockJadeOre(BlockIds.JadeOre_Default);
		malachiteOre = new BlockMalachiteOre(BlockIds.MalachiteOre_Default);
		netherGarnetOre = new BlockNetherGarnetOre(BlockIds.NetherGarnetOre_Default);
		rhodoliteOre = new BlockRhodoliteOre(BlockIds.RhodoliteOre_Default);
		roseQuartzOre = new BlockRoseQuartzOre(BlockIds.RoseQuartzOre_Default);
		sugiliteOre = new BlockSugiliteOre(BlockIds.SugiliteOre_Default);
		tanzaniteOre = new BlockTanzaniteOre(BlockIds.TanzaniteOre_Default);
		tourmalineOre = new BlockTourmalineOre(BlockIds.TourmalineOre_Default);
	
	
		
		GameRegistry.registerBlock(krystaOre, Strings.BlockKrystaOre_name);
		GameRegistry.registerBlock(newLeaf, Strings.BlockNewLeaf_name);
		GameRegistry.registerBlock(newLog, Strings.BlockNewLog_name);
		GameRegistry.registerBlock(sodaliteOre, Strings.BlockSodaliteOre_name);
		GameRegistry.registerBlock(onyxOre, Strings.BlockOnyxOre_name);
		GameRegistry.registerBlock(aquamarineOre, Strings.BlockAquamarineOre_name);
		GameRegistry.registerBlock(berylOre, Strings.BlockBerylOre_name);
		GameRegistry.registerBlock(chalcedonyOre, Strings.BlockChalcedonyOre_name);
		GameRegistry.registerBlock(endTopazOre, Strings.BlockEndTopazOre_name);
		GameRegistry.registerBlock(fireOpalOre, Strings.BlockFireOpalOre_name);
		GameRegistry.registerBlock(hackmaniteOre, Strings.BlockHackmaniteOre_name);
		GameRegistry.registerBlock(jadeOre, Strings.BlockJadeOre_name);
		GameRegistry.registerBlock(malachiteOre, Strings.BlockMalachiteOre_name);
		GameRegistry.registerBlock(netherGarnetOre, Strings.BlockNetherGarnetOre_name);
		GameRegistry.registerBlock(rhodoliteOre, Strings.BlockRhodoliteOre_name);
		GameRegistry.registerBlock(roseQuartzOre, Strings.BlockRoseQuartzOre_name);
		GameRegistry.registerBlock(sugiliteOre, Strings.BlockSugiliteOre_name);
		GameRegistry.registerBlock(tanzaniteOre, Strings.BlockTanzaniteOre_name);
		GameRegistry.registerBlock(tourmalineOre, Strings.BlockTourmalineOre_name);
	}

	public static void addNames() {
		LanguageRegistry.addName(krystaOre, Strings.BlockKrystaOre_name);
		LanguageRegistry.addName(newLeaf, Strings.BlockNewLeaf_name);
		LanguageRegistry.addName(newLog, Strings.BlockNewLog_name);
		LanguageRegistry.addName(sodaliteOre, Strings.BlockSodaliteOre_name);
		LanguageRegistry.addName(onyxOre, Strings.BlockOnyxOre_name);
		LanguageRegistry.addName(aquamarineOre, Strings.BlockAquamarineOre_name);
		LanguageRegistry.addName(berylOre, Strings.BlockBerylOre_name);
		LanguageRegistry.addName(chalcedonyOre, Strings.BlockChalcedonyOre_name);
		LanguageRegistry.addName(endTopazOre, Strings.BlockEndTopazOre_name);
		LanguageRegistry.addName(fireOpalOre, Strings.BlockFireOpalOre_name);
		LanguageRegistry.addName(hackmaniteOre, Strings.BlockHackmaniteOre_name);
		LanguageRegistry.addName(jadeOre, Strings.BlockJadeOre_name);
		LanguageRegistry.addName(malachiteOre, Strings.BlockMalachiteOre_name);
		LanguageRegistry.addName(netherGarnetOre, Strings.BlockNetherGarnetOre_name);
		LanguageRegistry.addName(rhodoliteOre, Strings.BlockRhodoliteOre_name);
		LanguageRegistry.addName(roseQuartzOre, Strings.BlockRoseQuartzOre_name);
		LanguageRegistry.addName(sugiliteOre, Strings.BlockSugiliteOre_name);
		LanguageRegistry.addName(tanzaniteOre, Strings.BlockTanzaniteOre_name);
		LanguageRegistry.addName(tourmalineOre, Strings.BlockTourmalineOre_name);
	}
	
	public static void setBlockHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(krystaOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(newLog, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(sodaliteOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(onyxOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(aquamarineOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(berylOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(chalcedonyOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(endTopazOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(fireOpalOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(hackmaniteOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(jadeOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(malachiteOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(netherGarnetOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(rhodoliteOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(roseQuartzOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(sugiliteOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(tanzaniteOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(tourmalineOre, "pickaxe", 3);
	}
}
