package krystacraft.items;

import krystacraft.KrystaCraft;
import krystacraft.lib.References;
import krystacraft.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemTourmalineCrystalLarge extends Item {

	public ItemTourmalineCrystalLarge(int id) {
		super(id);
		
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setUnlocalizedName(Strings.ItemTourmalineCrystalLarge_unlocalizedName);
		this.setMaxStackSize(64);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(References.MOD_ID.toLowerCase() + ":item" + Strings.ItemAquamarineCrystal_unlocalizedName);
	}

}
