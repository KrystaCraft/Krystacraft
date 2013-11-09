package krystacraft.lib;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		config.load();

		//Block ID's
		Ids.KrystaOre_Actual = config.getBlock(Names.BlockKrystaOre_name, Ids.KrystaOre_Default).getInt();
		Ids.NewLeaf_Actual = config.getBlock(Names.BlockNewLeaf_name, Ids.NewLeaf_Default).getInt();
		Ids.NewLog_Actual = config.getBlock(Names.BlockNewLog_name, Ids.NewLog_Default).getInt();
		Ids.SodaliteOre_Actual = config.getBlock(Names.BlockSodaliteOre_name, Ids.SodaliteOre_Default).getInt();
		
		//Item ID's
		Ids.KrystaDust_Actual = config.getItem(Names.ItemKrystaDust_name, Ids.KrystaDust_Default).getInt();
		
		//Crystals
		Ids.LargeCrystal_Actual = config.getItem(Names.ItemLargeCrystal_name, Ids.LargeCrystal_Default).getInt();
		Ids.SmallCrystal_Actual = config.getItem(Names.ItemSmallCrystal_name, Ids.SmallCrystal_Default).getInt();
		Ids.SodaliteCrystal_Actual = config.getItem(Names.ItemSodaliteCrystal_name, Ids.SodaliteCrystal_Default).getInt();
		
		//Tools
		Ids.SodalitePickaxe_Actual = config.getItem(Names.ItemSodalitePickaxe_name, Ids.SodalitePickaxe_Default).getInt();
		
		config.save();
	}

}
