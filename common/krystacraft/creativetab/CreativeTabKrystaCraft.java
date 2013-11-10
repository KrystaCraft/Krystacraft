package krystacraft.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import krystacraft.items.Items;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabKrystaCraft extends CreativeTabs {

	public CreativeTabKrystaCraft(int id, String name) {
		super(id, name);

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return Items.largeCrystal.itemID;
	}

}
