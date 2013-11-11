package krystacraft.configuration;

import java.io.File;

import krystacraft.lib.BlockIds;
import krystacraft.lib.ItemIds;
import krystacraft.lib.Strings;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		config.load();

		//Block ID's
		BlockIds.KrystaOre_Actual = config.getBlock(Strings.BlockKrystaOre_name, BlockIds.KrystaOre_Default).getInt();
		BlockIds.NewLeaf_Actual = config.getBlock(Strings.BlockNewLeaf_name, BlockIds.NewLeaf_Default).getInt();
		BlockIds.NewLog_Actual = config.getBlock(Strings.BlockNewLog_name, BlockIds.NewLog_Default).getInt();
		BlockIds.SodaliteOre_Actual = config.getBlock(Strings.BlockSodaliteOre_name, BlockIds.SodaliteOre_Default).getInt();
		BlockIds.OnyxOre_Actual = config.getBlock(Strings.BlockOnyxOre_name, BlockIds.OnyxOre_Default).getInt();
		BlockIds.AquamarineOre_Actual = config.getBlock(Strings.BlockAquamarineOre_name, BlockIds.AquamarineOre_Default).getInt();
		BlockIds.BerylOre_Actual = config.getBlock(Strings.BlockBerylOre_name, BlockIds.BerylOre_Default).getInt();
		BlockIds.ChalcedonyOre_Actual = config.getBlock(Strings.BlockChalcedonyOre_name, BlockIds.ChalcedonyOre_Default).getInt();
		BlockIds.EndTopazOre_Actual = config.getBlock(Strings.BlockEndTopazOre_name, BlockIds.EndTopazOre_Default).getInt();
		BlockIds.FireOpalOre_Actual = config.getBlock(Strings.BlockFireOpalOre_name, BlockIds.FireOpalOre_Default).getInt();
		BlockIds.HackmaniteOre_Actual = config.getBlock(Strings.BlockHackmaniteOre_name, BlockIds.HackmaniteOre_Default).getInt();
		BlockIds.JadeOre_Actual = config.getBlock(Strings.BlockJadeOre_name, BlockIds.JadeOre_Default).getInt();
		BlockIds.MalachiteOre_Actual = config.getBlock(Strings.BlockMalachiteOre_name, BlockIds.MalachiteOre_Default).getInt();
		BlockIds.NetherGarnetOre_Actual = config.getBlock(Strings.BlockNetherGarnetOre_name, BlockIds.NetherGarnetOre_Default).getInt();
		BlockIds.RhodoliteOre_Actual = config.getBlock(Strings.BlockRhodoliteOre_name, BlockIds.RhodoliteOre_Default).getInt();
		BlockIds.RoseQuartzOre_Actual = config.getBlock(Strings.BlockRoseQuartzOre_name, BlockIds.RoseQuartzOre_Default).getInt();
		BlockIds.SugiliteOre_Actual = config.getBlock(Strings.BlockSugiliteOre_name, BlockIds.SugiliteOre_Default).getInt();
		BlockIds.TanzaniteOre_Actual = config.getBlock(Strings.BlockTanzaniteOre_name, BlockIds.TanzaniteOre_Default).getInt();
		BlockIds.TourmalineOre_Actual = config.getBlock(Strings.BlockTourmalineOre_name, BlockIds.TourmalineOre_Default).getInt();
		
		//Item ID's
		ItemIds.KrystaDust_Actual = config.getItem(Strings.ItemKrystaDust_name, ItemIds.KrystaDust_Default).getInt();
		
		//Crystals
		ItemIds.LargeCrystal_Actual = config.getItem(Strings.ItemLargeCrystal_name, ItemIds.LargeCrystal_Default).getInt();
		ItemIds.SmallCrystal_Actual = config.getItem(Strings.ItemSmallCrystal_name, ItemIds.SmallCrystal_Default).getInt();
		ItemIds.SodaliteCrystal_Actual = config.getItem(Strings.ItemSodaliteCrystal_name, ItemIds.SodaliteCrystal_Default).getInt();
		
		//Tools
		ItemIds.SodalitePickaxe_Actual = config.getItem(Strings.ItemSodalitePickaxe_name, ItemIds.SodalitePickaxe_Default).getInt();
		
		config.save();
	}

}
