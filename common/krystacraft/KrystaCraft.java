package krystacraft;


import net.minecraft.creativetab.CreativeTabs;
import krystacraft.blocks.Blocks;
import krystacraft.configuration.ConfigurationHandler;
import krystacraft.core.proxy.CommonProxy;
import krystacraft.creativetab.CreativeTabKrystaCraft;
import krystacraft.items.Items;
import krystacraft.lib.References;
import krystacraft.network.PacketHandler;
import krystacraft.recipes.Recipes;
import krystacraft.wep.worldgen.WorldGen;
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
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());

		Items.init();
		Blocks.init();
		WorldGen.init();
		Recipes.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Items.addNames();
		Blocks.addNames();
		WorldGen.registerWorldGenerators();
		
		LanguageRegistry.instance().addStringLocalization("itemGroup." + References.MOD_NAME, "en_US", References.MOD_NAME);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
       
}