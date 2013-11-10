package krystacraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import krystacraft.KrystaCraft;
import krystacraft.lib.References;
import krystacraft.lib.Strings;

public class ItemKrystaDust extends Item {

	public ItemKrystaDust(int id) {
		super(id);
		
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setUnlocalizedName(Strings.ItemKrystaDust_unlocalizedName);
		this.setMaxStackSize(64);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(References.MOD_ID.toLowerCase() + ":item" + Strings.ItemKrystaDust_unlocalizedName);
	}
}