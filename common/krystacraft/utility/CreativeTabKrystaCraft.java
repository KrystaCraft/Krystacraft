package krystacraft.utility;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import krystacraft.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabKrystaCraft extends CreativeTabs {

	public CreativeTabKrystaCraft(int id, String name) {
		super(id, name);

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return ItemHandler.crystalMap.get("HackmaniteCrystalLarge").itemID;
	}

}
