package krystacraft.lib;

import net.minecraft.block.Block;
import net.minecraftforge.common.Configuration;
import krystacraft.blocks.BlockOre;
import krystacraft.handlers.ItemHandler;

public class BlockSettings {
	public enum Ores {
							/*Unlocalised Name, Name, ID, Lowest XP Dropped, Highest XP Dropped, 
							 *Small Crystal Dropped, Large Crystal Dropped, Max Y, Max Vein Size, Chance to spawn, Harvest Level*/
		krystaOre			("krystaOre","Krysta Ore", 500, 0, 2, "KrystaCrystal", "KrystaCrystalLarge", 160, 6, 30, 3),			
		sodaliteOre			("SodaliteOre","Sodalite Ore", 503, 0, 2, "SodaliteCrystal", "SodaliteCrystalLarge", 160, 6, 30, 3),
		onyxOre				("OnyxOre","Onyx Ore", 504, 0, 2, "OnyxCrystal", "OnyxCrystalLarge", 160, 6, 30, 3),
		aquamarineOre		("AquamarineOre","Aquamarine Ore", 505, 0, 2, "AquamarineCrystal", "AquamarineCrystalLarge", 160, 6, 30, 3),
		berylOre			("BerylOre","Beryl Ore", 506, 0, 2, "BerylCrystal", "BerylCrystalLarge", 160, 6, 30, 3),
		chalcedonyOre		("ChalcedonyOre","Chalcedony Ore", 507, 0, 2, "ChalcedonyCrystal", "ChalcedonyCrystalLarge", 160, 6, 30, 3),
		endTopazOre			("EndTopazOre","End Topaz Ore", 508, 0, 2, "EndTopazCrystal", "EndTopazCrystalLarge", 160, 6, 30, 3),
		fireOpalOre			("FireOpalOre","Fire Opal Ore", 509, 0, 2, "FireOpalCrystal", "FireOpalCrystalLarge", 160, 6, 30, 3),
		hackmaniteOre		("HackmaniteOre","Hackmanite Ore", 510, 0, 2, "HackmaniteCrystal", "HackmaniteCrystalLarge", 160, 6, 30, 3),
		jadeOre				("JadeOre","Jade Ore", 511, 0, 2, "JadeCrystal", "JadeCrystalLarge", 160, 6, 30, 3),
		malachiteOre		("MalachiteOre","Malachite Ore", 512, 0, 2, "MalachiteCrystal", "MalachiteCrystalLarge", 160, 6, 30, 3),
		netherGarnetOre		("NetherGarnetOre","Nether Garnet Ore", 513, 0, 2, "NetherGarnetCrystal", "NetherGarnetCrystalLarge", 160, 6, 30, 3),
		rhodoliteOre		("RhodoliteOre","Rhodolite Ore", 514, 0, 2, "RhodoliteCrystal", "RhodoliteCrystalLarge", 160, 6, 30, 3),
		roseQuartzOre		("RoseQuartzOre","Rose Quartz Ore", 515, 0, 2, "RoseQuartzCrystal", "RoseQuartzCrystalLarge", 160, 6, 30, 3),
		sugiliteOre			("SugiliteOre","Sugilite Ore", 516, 0, 2, "SugiliteCrystal", "SugiliteCrystalLarge", 160, 6, 30, 3),
		tanzaniteOre		("TanzaniteOre","Tanzanite Ore", 517, 0, 2, "TanzaniteCrystal", "TanzaniteCrystalLarge", 160, 6, 30, 3),
		tourmalineOre		("TourmalineOre","Tourmaline Ore", 518, 0, 2, "TourmalineCrystal", "TourmalineCrystalLarge", 160, 6, 30, 3);
		
		private String unLocName;
		private String name;
		private int idDefault;
		private int idActual;
		private int xpLow;
		private int xpHigh;
		private String firstItemDrop;
		private String secondItemDrop;
		private String iconPath;
		private int maxY;
		private int maxVeinSize;
		private int chanceToSpawn;
		private boolean willSpawn = true;
		private int harvestLevel;
		
		private Ores (String unLocName, String name, int id, int xpLow, int xpHigh, String firstItemDrop, String secondItemDrop,
				int maxY, int maxVeinSize, int chanceToSpawn, int harvestLevel){
			this.unLocName = unLocName;
			this.name = name;
			this.idDefault = id;
			this.xpLow = xpLow;
			this.xpHigh = xpHigh;
			this.firstItemDrop = firstItemDrop;
			this.secondItemDrop = secondItemDrop;
			this.iconPath = References.TEXTURE_PATH + "block" + unLocName;
			this.maxY = maxY;
			this.maxVeinSize = maxVeinSize;
			this.chanceToSpawn = chanceToSpawn;
			this.harvestLevel = harvestLevel;
		}

		public String getUnLocName() {
			return unLocName;
		}

		public String getName() {
			return name;
		}

		public int getIdDefault() {
			return idDefault;
		}
		
		public int getIdActual() {
			return idActual;
		}

		public int getXpLow() {
			return xpLow;
		}

		public int getXpHigh() {
			return xpHigh;
		}

		public String getFirstItemDrop() {
			return firstItemDrop;
		}

		public String getSecondItemDrop() {
			return secondItemDrop;
		}
		
		public String getIconPath() {
			return iconPath;
		}

		public int getMaxY() {
			return maxY;
		}

		public int getMaxVeinSize() {
			return maxVeinSize;
		}

		public int getChanceToSpawn() {
			return chanceToSpawn;
		}
		
		public boolean getWillSpawn() {
			return willSpawn;
		}
		
		public int getHarvestLevel() {
			return harvestLevel;
		}
		
		public void load(Configuration config) {
			//Property property;
			
			this.idActual = config.get(Configuration.CATEGORY_BLOCK, this.name, this.idDefault).getInt();
			this.willSpawn = config.get("World Gen", this.name, this.willSpawn).getBoolean(willSpawn);
		}
	}
	
	public Block getOreBlock (String name){
		BlockOre ore = null;
		
		for (Ores o : Ores.values()){
			if (o.getUnLocName().equals(name)) {
				ore = new BlockOre(o.getIdActual(), o.getUnLocName(), o.getIconPath(), o.getXpLow(), o.getXpHigh(), 
						ItemHandler.aquamarineCrystal.itemID, ItemHandler.aquamarineCrystalLarge.itemID);
			}	
		}
		
		return ore;
	}
	
	public Ores getOreSettings (String name){
		Ores ore = null;
		
		for (Ores o : Ores.values()){
			if (o.getUnLocName().equals(name)) {
				ore = o;
			}	
		}
		
		return ore;
	}
	
	public enum Logs {
		newLog				("NewLog","New Log", 502, 1);
		
		private String unLocName;
		private String name;
		private int idDefault;
		private int idActual; 
		private String [] iconPaths;
		private int harvestLevel;
		
		private Logs(String unLocName, String name, int id, int harvestLevel) {
			this.unLocName = unLocName;
			this.name = name;
			this.idDefault = id;
			this.iconPaths = this.setIconPaths();
			this.harvestLevel = harvestLevel;
		}

		public String getUnLocName() {
			return unLocName;
		}

		public String getName() {
			return name;
		}

		public int getIdDefault() {
			return idDefault;
		}

		public int getIdActual() {
			return idActual;
		}

		public String [] getIconPaths() {
			return iconPaths;
		}
		
		public String [] setIconPaths() {
			String topBottomTexture = References.TEXTURE_PATH + "block" + this.unLocName + "TreeTop";
			String sideTexture = References.TEXTURE_PATH + "block" + this.unLocName;
			String iconPaths[] = {topBottomTexture,topBottomTexture,sideTexture};
			
			return iconPaths;
		}
		
		public int getHarvestLevel() {
			return harvestLevel;
		}
		
		public void load(Configuration config) {
			//Property property;
			
			this.idActual = config.get(Configuration.CATEGORY_BLOCK, this.name, this.idDefault).getInt();
		}
	}
	
	public enum Leafs {
		newLeaf				("NewLeaf","New Leaf", 501);
		
		private String unLocName;
		private String name;
		private int idDefault;
		private int idActual; 
		private String iconPath;
		
		private Leafs(String unLocName, String name, int id) {
			this.unLocName = unLocName;
			this.name = name;
			this.idDefault = id;
			this.idActual = id;
			this.iconPath = References.TEXTURE_PATH + "block" + unLocName;
		}

		public String getUnLocName() {
			return unLocName;
		}

		public String getName() {
			return name;
		}

		public int getIdDefault() {
			return idDefault;
		}

		public int getIdActual() {
			return idActual;
		}

		public String getIconPath() {
			return iconPath;
		}
		
		public void load(Configuration config) {
			//Property property;
			
			this.idActual = config.get(Configuration.CATEGORY_BLOCK, this.name, this.idDefault).getInt();
		}
	}
}
