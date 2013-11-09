package krystacraft.lib;

import krystacraft.items.Items;
import net.minecraft.creativetab.CreativeTabs;

public class KrystacraftTab extends CreativeTabs {

	public KrystacraftTab(int id, String name) {
		super(id, name);

	}
	
	@Override
	public int getTabIconItemIndex() {
		return Items.largeCrystal.itemID;
	}

}
