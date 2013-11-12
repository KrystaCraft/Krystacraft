package krystacraft.items;

import krystacraft.KrystaCraft;
import krystacraft.lib.References;
import krystacraft.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMalachiteCrystalLarge extends Item {

	public ItemMalachiteCrystalLarge(int id) {
		super(id);
		
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setUnlocalizedName(Strings.ItemMalachiteCrystalLarge_unlocalizedName);
		this.setMaxStackSize(64);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(References.MOD_ID.toLowerCase() + ":item" + Strings.ItemHackmaniteCrystalLarge_unlocalizedName);
	}


}