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
