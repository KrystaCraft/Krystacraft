package krystacraft.wep.worldgen;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGen {

	public static WorldGenManager worldGen;
	
	public static void init() {
		worldGen = new WorldGenManager();
	}
	
	public static void registerWorldGenerators() {
		GameRegistry.registerWorldGenerator(worldGen);
	}
}
