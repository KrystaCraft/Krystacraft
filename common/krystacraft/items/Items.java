package krystacraft.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import krystacraft.lib.Ids;
import krystacraft.lib.Names;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class Items {
	
	public static EnumToolMaterial sodalite;
	
	public static Item krystaDust;
	public static Item largeCrystal;
	public static Item smallCrystal;
	public static Item sodaliteCrystal;
	public static Item soldalitePickaxe;
	
	public static void init() {
		krystaDust 			= new ItemKrystaDust(Ids.KrystaDust_Default);
		largeCrystal 		= new ItemLargeCrystal(Ids.LargeCrystal_Default);
		smallCrystal 		= new ItemSmallCrystal(Ids.SmallCrystal_Default);
		sodaliteCrystal 	= new ItemSodaliteCrystal(Ids.SodaliteCrystal_Default);
		
		sodalite = EnumHelper.addToolMaterial("SodalitePickaxe", 2, 1200, 10.0F, 6.0F, 18);
		soldalitePickaxe 	= new ItemSodalitePickaxe(Ids.SodalitePickaxe_Default, sodalite);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(krystaDust, Names.ItemKrystaDust_name);
		LanguageRegistry.addName(largeCrystal, Names.ItemLargeCrystal_name);
		LanguageRegistry.addName(smallCrystal, Names.ItemSmallCrystal_name);
		LanguageRegistry.addName(sodaliteCrystal, Names.ItemSodaliteCrystal_name);
		LanguageRegistry.addName(soldalitePickaxe, Names.ItemSodalitePickaxe_name);
	}
	
}
