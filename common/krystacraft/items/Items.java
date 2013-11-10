package krystacraft.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import krystacraft.lib.ItemIds;
import krystacraft.lib.Strings;
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
		krystaDust 			= new ItemKrystaDust(ItemIds.KrystaDust_Default);
		largeCrystal 		= new ItemLargeCrystal(ItemIds.LargeCrystal_Default);
		smallCrystal 		= new ItemSmallCrystal(ItemIds.SmallCrystal_Default);
		sodaliteCrystal 	= new ItemSodaliteCrystal(ItemIds.SodaliteCrystal_Default);
		
		sodalite = EnumHelper.addToolMaterial("SodalitePickaxe", 2, 1200, 10.0F, 6.0F, 18);
		soldalitePickaxe 	= new ItemSodalitePickaxe(ItemIds.SodalitePickaxe_Default, sodalite);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(krystaDust, Strings.ItemKrystaDust_name);
		LanguageRegistry.addName(largeCrystal, Strings.ItemLargeCrystal_name);
		LanguageRegistry.addName(smallCrystal, Strings.ItemSmallCrystal_name);
		LanguageRegistry.addName(sodaliteCrystal, Strings.ItemSodaliteCrystal_name);
		LanguageRegistry.addName(soldalitePickaxe, Strings.ItemSodalitePickaxe_name);
	}
	
}
