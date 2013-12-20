package krystacraft.handlers;

import java.io.File;
import java.util.logging.Level;

import krystacraft.helpers.LogHelper;
import krystacraft.lib.BlockSettings;
import krystacraft.lib.BlockSettings.Leafs;
import krystacraft.lib.BlockSettings.Logs;
import krystacraft.lib.ItemSettings;
import krystacraft.lib.ItemSettings.BasicTools;
import krystacraft.lib.ItemSettings.Crystals;
import krystacraft.lib.ItemSettings.Dusts;
import krystacraft.lib.References;
import krystacraft.lib.BlockSettings.Ores;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile) {
		final Configuration config = new Configuration(configFile);
		try {
			for (final BlockSettings.Ores setting : Ores.values()) {
				setting.load(config);
			}
			for (final BlockSettings.Logs setting : Logs.values()) {
				setting.load(config);
			}
			for (final BlockSettings.Leafs setting : Leafs.values()) {
				setting.load(config);
			}
			for (final ItemSettings.Crystals setting : Crystals.values()) {
				setting.load(config);
			}
			for (final ItemSettings.BasicTools setting : BasicTools.values()) {
				setting.load(config);
			}
			for (final ItemSettings.Dusts setting : Dusts.values()) {
				setting.load(config);
			}
		} catch (final Exception e) {
	        LogHelper.log(Level.SEVERE, e, "%s had had a problem loading its configuration", References.MOD_NAME);
	    } finally {
	        config.save();
	    }
	}	
}
