package krystacraft.handlers;

import krystacraft.KrystaCraft;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipesHandler {
	
	public static void init() {
		writeSoldalitePickaxeRecipes();
	}
	
	private static void writeSoldalitePickaxeRecipes() {
		//Soldalite Pickaxe
		final IRecipe recipe = new ShapedOreRecipe(ItemHandler.toolMap.get("SodalitePickaxe"),
                new String[] { "xxx", " y ", " y " }, 'x', ItemHandler.crystalMap.get("SodaliteCrystal"), 'y', Item.stick);
        KrystaCraft.proxy.addRecipe(recipe);
	}
}
