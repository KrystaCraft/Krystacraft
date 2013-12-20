package krystacraft.proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import krystacraft.handlers.WorldGenHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy {
	
	public void addName(Block block, String name) {
		LanguageRegistry.addName(block, name);
	}
	
	public void addName(Item item, String name) {
		LanguageRegistry.addName(item, name);
	}
	
	public void registerBlock(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}
	
	public void registerItem(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}
	
	public void setBlockHarvestLevel(Block block, String toolType, int harvestLevel) {
		MinecraftForge.setBlockHarvestLevel(block, toolType, harvestLevel);
	}
	
	public void registerOre(String unLocalizedName, Block block) {
		OreDictionary.registerOre(unLocalizedName, block);
	}
	
	public void registerWorldGen() {		
		GameRegistry.registerWorldGenerator(new WorldGenHandler());
	}
	
	public void addRecipe(IRecipe recipe) {
        CraftingManager.getInstance().getRecipeList().add(recipe);
    }
	
	public void addToolMaterial(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
		EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
	}
	 
	public void registerKeyBindingHandler() {

    }

    public void registerRenderTickHandler() {

    }

    public void registerDrawBlockHighlightHandler() {

    }

    public void setKeyBinding(String name, int value) {

    }

    public void registerSoundHandler() {

    }

    public void initRenderingAndTextures() {

    }

    public void registerTileEntities() {
    	
    }
    
    public void sendRequestEventPacket(byte eventType, int originX, int originY, int originZ, byte sideHit, byte rangeX, byte rangeY, byte rangeZ, String data) {

    }

    public void handleTileEntityPacket(int x, int y, int z, ForgeDirection orientation, byte state, String customName) {

    }

    public void handleTileWithItemPacket(int x, int y, int z, ForgeDirection orientation, byte state, String customName, int itemID, int metaData, int stackSize, int color) {

    }
    
}
