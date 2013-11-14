package krystacraft.handlers;

import java.io.File;
import java.util.logging.Level;

import krystacraft.helpers.LogHelper;
import krystacraft.lib.BlockSettings;
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
		} catch (final Exception e) {
	        LogHelper.log(Level.SEVERE, e, "%s had had a problem loading its configuration", References.MOD_NAME);
	    } finally {
	        config.save();
	    }
	}	
}
