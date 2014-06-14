package krystacraft.handlers;

import java.util.HashMap;

import krystacraft.items.ItemCrystal;
import krystacraft.items.ItemBasicPickaxe;
import krystacraft.items.ItemDust;
import krystacraft.lib.ItemSettings;
import krystacraft.lib.ItemSettings.BasicTools;
import krystacraft.lib.ItemSettings.Crystals;
import krystacraft.lib.ItemSettings.Dusts;
import krystacraft.proxy.CommonProxy;

public class ItemHandler {
	
	public static HashMap<String, ItemCrystal> crystalMap = new HashMap<String, ItemCrystal>();
	public static HashMap<String, ItemBasicPickaxe> toolMap = new HashMap<String, ItemBasicPickaxe>();
	public static HashMap<String, ItemDust> dustMap = new HashMap<String, ItemDust>();
	
	public static void createItems() {
		createCrystals();
		createBasicPickaxes();
		createDusts();
	}
	
	public static void createCrystals() {
		for (ItemSettings.Crystals c : Crystals.values()) {
			ItemCrystal crystal = new ItemCrystal(c.getIdActual(), c.getUnLocName(), 64, c.getIconPath());

			final CommonProxy proxy = new CommonProxy();
			proxy.registerItem(crystal, c.getUnLocName());
			proxy.addName(crystal, c.getName());
			
			crystalMap.put(c.getUnLocName(), crystal);
		}
	}
	
	public static void createBasicPickaxes() {
		for (ItemSettings.BasicTools t : BasicTools.values()) {
			EnumToolMaterial pickMaterial = EnumHelper.addToolMaterial(t.getUnLocName(), t.getHarvestLevel(),
					t.getMaxUses(), t.getEfficiency(), t.getDamage(), t.getEnchantability());
			ItemBasicPickaxe pickaxe = new ItemBasicPickaxe(t.getIdActual(), pickMaterial ,t.getUnLocName(), t.getIconPath());

			final CommonProxy proxy = new CommonProxy();
			proxy.registerItem(pickaxe, t.getUnLocName());
			proxy.addName(pickaxe, t.getName());
			
			toolMap.put(t.getUnLocName(), pickaxe);
		}
	}
	
	public static void createDusts() {
		for (ItemSettings.Dusts d : Dusts.values()) {
			ItemDust dust = new ItemDust(d.getIdActual(), d.getUnLocName(), 64, d.getIconPath());

			final CommonProxy proxy = new CommonProxy();
			proxy.registerItem(dust, d.getUnLocName());
			proxy.addName(dust, d.getName());
			
			dustMap.put(d.getUnLocName(), dust);
		}
	}
}
