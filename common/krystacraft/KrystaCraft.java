package krystacraft;


import net.minecraft.creativetab.CreativeTabs;
import krystacraft.handlers.BlockHandler;
import krystacraft.handlers.ConfigurationHandler;
import krystacraft.handlers.ItemHandler;
import krystacraft.helpers.LogHelper;
import krystacraft.lib.References;
import krystacraft.network.PacketHandler;
import krystacraft.proxy.CommonProxy;
import krystacraft.recipes.Recipes;
import krystacraft.utility.CreativeTabKrystaCraft;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(
		modid = References.MOD_ID, 
		name = References.MOD_NAME, 
		version = References.VERSION_NUMBER,
		dependencies = References.DEPENDENCIES)
@NetworkMod(
		channels = {References.CHANNEL},
		clientSideRequired = true, 
		serverSideRequired = true,
		packetHandler = PacketHandler.class)

public class KrystaCraft {
	
	// The instance of your mod that Forge uses.
	@Instance(References.MOD_NAME)
	public static KrystaCraft instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide=References.CLIENT_PROXY_CLASS, serverSide=References.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static CreativeTabs krystacraftTab = new CreativeTabKrystaCraft(CreativeTabs.getNextID(), References.MOD_NAME);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) throws Exception {
		LogHelper.info("Initializing.");
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());

		ItemHandler.init();
		BlockHandler.createBlocks();
		proxy.registerWorldGen();
		Recipes.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) throws Exception {
		ItemHandler.addNames();
		
		LanguageRegistry.instance().addStringLocalization("itemGroup." + References.MOD_NAME, "en_US", References.MOD_NAME);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("Successfully Loaded.");
	}
       
}