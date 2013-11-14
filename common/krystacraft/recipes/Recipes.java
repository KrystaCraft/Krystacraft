package krystacraft.recipes;

import krystacraft.handlers.ItemHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class Recipes {
	
	public static void init() {
		
		//Soldalite Pickaxe
		CraftingManager.getInstance().addRecipe(new ItemStack(ItemHandler.soldalitePickaxe, 1), 
				"XXX",
				" Y ",
				" Y ",
				Character.valueOf('X'), ItemHandler.sodaliteCrystal,
				Character.valueOf('Y'), Item.stick);
	}
}
