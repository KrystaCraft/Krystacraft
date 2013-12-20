package krystacraft.lib;

import net.minecraftforge.common.Configuration;

public class ItemSettings {
	public enum Crystals {
		aquamarineCrystalLarge		("AquamarineCrystalLarge", "Large Aquamarine Crystal", 4000),
		aquamarineCrystal			("AquamarineCrystal", "Aquamarine Crystal", 4001),
		berylCrystalLarge			("BerylCrystalLarge", "Large Beryl Crystal", 4002),
		berylCrystal				("BerylCrystal", "Beryl Crystal", 4003),
		chalcedonyCrystalLarge		("ChalcedonyCrystalLarge", "Large Chalcedony Crystal", 4004),
		chalcedonyCrystal			("ChalcedonyCrystal", "Chalcedony Crystal", 4005),
		endTopazCrystalLarge		("EndTopazCrystalLarge", "Large EndTopaz Crystal", 4006),
		endTopazCrystal				("EndTopazCrystal", "EndTopaz Crystal", 4007),
		fireOpalCrystalLarge		("FireOpalCrystalLarge", "Large FireOpal Crystal", 4008),
		fireOpalCrystal				("FireOpalCrystal", "Large FireOpal Crystal", 4009),
		hackmaniteCrystalLarge		("HackmaniteCrystalLarge", "Large Hackmanite Crystal", 4010),
		hackmaniteCrystal			("HackmaniteCrystal", "Hackmanite Crystal", 4011),
		jadeCrystalLarge			("JadeCrystalLarge", "Large Jade Crystal", 4012),
		jadeCrystal					("JadeCrystal", "Jade Crystal", 4013),
		krystaCrystalLarge			("KrystaCrystalLarge", "Large Krysta Crystal", 4014),
		krystaCrystal				("KrystaCrystal", "Krysta Crystal", 4015),
		malachiteCrystalLarge		("MalachiteCrystalLarge", "Large Malachite Crystal", 4016),
		malachiteCrystal			("MalachiteCrystal", "Malachite Crystal", 4017),
		netherGarnetCrystalLarge	("NetherGarnetCrystalLarge", "Large Nether Garnet Crystal", 4018),
		netherGarnetCrystal			("NetherGarnetCrystal", "Nether Garnet Crystal", 4019),
		onyxCrystalLarge			("OnyxCrystalLarge", "Large Onyx Crystal", 4020),
		onyxCrystal					("OnyxCrystal", "Onyx Crystal", 4021),
		rhodoliteCrystalLarge		("RhodoliteCrystalLarge", "Large Rhodolite Crystal", 4022),
		rhodoliteCrystal			("RhodoliteCrystal", "Rhodolite Crystal", 4023),
		roseQuartzCrystalLarge		("RoseQuartzCrystalLarge", "Large Rose Quartz Crystal", 4024),
		roseQuartzCrystal			("RoseQuartzCrystal", "Rose Quartz Crystal", 4025),
		sodaliteCrystalLarge		("SodaliteCrystalLarge", "Large Sodalite Crystal", 4026),
		sodaliteCrystal				("SodaliteCrystal", "Sodalite Crystal", 4027),
		sugiliteCrystalLarge		("SugiliteCrystalLarge", "Large Sugilite Crystal", 4028),
		sugiliteCrystal				("SugiliteCrystal", "Sugilite Crystal", 4029),
		tanzaniteCrystalLarge		("TanzaniteCrystalLarge", "Large Tanzanite Crystal", 4030),
		tanzaniteCrystal			("TanzaniteCrystal", "Tanzanite Crystal", 4031),
		tourmalineCrystalLarge		("TourmalineCrystalLarge", "Large Tourmaline Crystal", 4032),
		tourmalineCrystal			("TourmalineCrystal", "Tourmaline Crystal", 4033),
		smallCrystal				("SmallCrystal", "Small Crystal", 4034);
		
		private String unLocName;
		private String name;
		private int idDefault;
		private int idActual;
		private String iconPath;
		
		private Crystals (String unLocName, String name, int id) {
			this.unLocName = unLocName;
			this.name = name;
			this.idDefault = id;
			this.iconPath = References.TEXTURE_PATH + "item" + unLocName;
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
			this.idActual = config.get(Configuration.CATEGORY_ITEM, this.name, this.idDefault).getInt();
		}
	}
	
	public enum BasicTools {
		sodalitePickaxe			("SodalitePickaxe", "Sodalite Pickaxe", 4035, 2, 1200, 10.0F, 6.0F, 18);
		
		private String unLocName;
		private String name;
		private int idDefault;
		private int idActual;
		private String iconPath;
		int harvestLevel;
		int maxUses;
		float efficiency;
		float damage;
		int enchantability;
		
		private BasicTools (String unLocName, String name, int id, int harvestLevel, 
				int maxUses, float efficiency, float damage, int enchantability) {
			this.unLocName = unLocName;
			this.name = name;
			this.idDefault = id;
			this.iconPath = References.TEXTURE_PATH + "item" + unLocName;
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.damage = damage;
			this.enchantability = enchantability;
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
			this.idActual = config.get(Configuration.CATEGORY_ITEM, this.name, this.idDefault).getInt();
		}

		public int getHarvestLevel() {
			return harvestLevel;
		}

		public int getMaxUses() {
			return maxUses;
		}

		public float getEfficiency() {
			return efficiency;
		}

		public float getDamage() {
			return damage;
		}

		public int getEnchantability() {
			return enchantability;
		}
	}
	
	public enum Dusts {
		krystaDust					("KrystaDust", "Krysta Dust", 4036);
		
		private String unLocName;
		private String name;
		private int idDefault;
		private int idActual;
		private String iconPath;
		
		private Dusts (String unLocName, String name, int id) {
			this.unLocName = unLocName;
			this.name = name;
			this.idDefault = id;
			this.iconPath = References.TEXTURE_PATH + "item" + unLocName;
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
			this.idActual = config.get(Configuration.CATEGORY_ITEM, this.name, this.idDefault).getInt();
		}
	}
}
