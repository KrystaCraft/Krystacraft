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
		ItemIds.SmallCrystal_Actual = config.getItem(Strings.ItemSmallCrystal_name, ItemIds.SmallCrystal_Default).getInt();
		ItemIds.AquamarineCrystalLarge_Actual = config.getItem(Strings.ItemAquamarineCrystalLarge_name, ItemIds.AquamarineCrystalLarge_Default).getInt();
		ItemIds.AquamarineCrystal_Actual = config.getItem(Strings.ItemAquamarineCrystal_name, ItemIds.AquamarineCrystal_Default).getInt();
		ItemIds.BerylCrystalLarge_Actual = config.getItem(Strings.ItemBerylCrystalLarge_name, ItemIds.BerylCrystalLarge_Default).getInt();
		ItemIds.BerylCrystal_Actual = config.getItem(Strings.ItemBerylCrystal_name, ItemIds.BerylCrystal_Default).getInt();
		ItemIds.ChalcedonyCrystalLarge_Actual = config.getItem(Strings.ItemChalcedonyCrystalLarge_name, ItemIds.ChalcedonyCrystalLarge_Default).getInt();
		ItemIds.ChalcedonyCrystal_Actual = config.getItem(Strings.ItemChalcedonyCrystal_name, ItemIds.ChalcedonyCrystal_Default).getInt();
		ItemIds.EndTopazCrystalLarge_Actual = config.getItem(Strings.ItemEndTopazCrystalLarge_name, ItemIds.EndTopazCrystalLarge_Default).getInt();
		ItemIds.EndTopazCrystal_Actual = config.getItem(Strings.ItemEndTopazCrystal_name, ItemIds.EndTopazCrystal_Default).getInt();
		ItemIds.FireOpalCrystalLarge_Actual = config.getItem(Strings.ItemFireOpalCrystalLarge_name, ItemIds.FireOpalCrystalLarge_Default).getInt();
		ItemIds.FireOpalCrystal_Actual = config.getItem(Strings.ItemFireOpalCrystal_name, ItemIds.FireOpalCrystal_Default).getInt();
		ItemIds.HackmaniteCrystalLarge_Actual = config.getItem(Strings.ItemHackmaniteCrystalLarge_name, ItemIds.HackmaniteCrystalLarge_Default).getInt();
		ItemIds.HackmaniteCrystal_Actual = config.getItem(Strings.ItemHackmaniteCrystal_name, ItemIds.HackmaniteCrystal_Default).getInt();
		ItemIds.JadeCrystalLarge_Actual = config.getItem(Strings.ItemJadeCrystalLarge_name, ItemIds.JadeCrystalLarge_Default).getInt();
		ItemIds.JadeCrystal_Actual = config.getItem(Strings.ItemJadeCrystal_name, ItemIds.JadeCrystal_Default).getInt();
		ItemIds.MalachiteCrystalLarge_Actual = config.getItem(Strings.ItemMalachiteCrystalLarge_name, ItemIds.MalachiteCrystalLarge_Default).getInt();
		ItemIds.MalachiteCrystal_Actual = config.getItem(Strings.ItemMalachiteCrystal_name, ItemIds.MalachiteCrystal_Default).getInt();
		ItemIds.NetherGarnetCrystalLarge_Actual = config.getItem(Strings.ItemNetherGarnetCrystalLarge_name, ItemIds.NetherGarnetCrystalLarge_Default).getInt();
		ItemIds.NetherGarnetCrystal_Actual = config.getItem(Strings.ItemNetherGarnetCrystal_name, ItemIds.NetherGarnetCrystal_Default).getInt();
		ItemIds.OnyxCrystalLarge_Actual = config.getItem(Strings.ItemOnyxCrystalLarge_name, ItemIds.OnyxCrystalLarge_Default).getInt();
		ItemIds.OnyxCrystal_Actual = config.getItem(Strings.ItemOnyxCrystal_name, ItemIds.OnyxCrystal_Default).getInt();
		ItemIds.RhodoliteCrystalLarge_Actual = config.getItem(Strings.ItemRhodoliteCrystalLarge_name, ItemIds.RhodoliteCrystalLarge_Default).getInt();
		ItemIds.RhodoliteCrystal_Actual = config.getItem(Strings.ItemRhodoliteCrystal_name, ItemIds.RhodoliteCrystal_Default).getInt();
		ItemIds.RoseQuartzCrystalLarge_Actual = config.getItem(Strings.ItemRoseQuartzCrystalLarge_name, ItemIds.RoseQuartzCrystalLarge_Default).getInt();
		ItemIds.RoseQuartzCrystal_Actual = config.getItem(Strings.ItemRoseQuartzCrystal_name, ItemIds.RoseQuartzCrystal_Default).getInt();
		ItemIds.SodaliteCrystalLarge_Actual = config.getItem(Strings.ItemSodaliteCrystalLarge_name, ItemIds.SodaliteCrystalLarge_Default).getInt();
		ItemIds.SodaliteCrystal_Actual = config.getItem(Strings.ItemSodaliteCrystal_name, ItemIds.SodaliteCrystal_Default).getInt();
		ItemIds.SugiliteCrystalLarge_Actual = config.getItem(Strings.ItemSugiliteCrystalLarge_name, ItemIds.SugiliteCrystalLarge_Default).getInt();
		ItemIds.SugiliteCrystal_Actual = config.getItem(Strings.ItemSugiliteCrystal_name, ItemIds.SugiliteCrystal_Default).getInt();
		ItemIds.TanzaniteCrystalLarge_Actual = config.getItem(Strings.ItemTanzaniteCrystalLarge_name, ItemIds.TanzaniteCrystalLarge_Default).getInt();
		ItemIds.TanzaniteCrystal_Actual = config.getItem(Strings.ItemTanzaniteCrystal_name, ItemIds.TanzaniteCrystal_Default).getInt();
		ItemIds.TourmalineCrystalLarge_Actual = config.getItem(Strings.ItemTourmalineCrystalLarge_name, ItemIds.TourmalineCrystalLarge_Default).getInt();
		ItemIds.TourmalineCrystal_Actual = config.getItem(Strings.ItemTourmalineCrystal_name, ItemIds.TourmalineCrystal_Default).getInt();
		
		//Tools
		ItemIds.SodalitePickaxe_Actual = config.getItem(Strings.ItemSodalitePickaxe_name, ItemIds.SodalitePickaxe_Default).getInt();
		
		config.save();
	}

}
