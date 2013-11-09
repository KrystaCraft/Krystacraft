package krystacraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import krystacraft.Krystacraft;
import krystacraft.lib.References;
import krystacraft.lib.Names;


public class ItemLargeCrystal extends Item {

	public ItemLargeCrystal(int id) {
		super(id);
		
		this.setCreativeTab(Krystacraft.krystacraftTab);
		this.setUnlocalizedName(Names.ItemLargeCrystal_unlocalizedName);
		this.setMaxStackSize(64);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(References.MOD_ID.toLowerCase() + ":item" + Names.ItemLargeCrystal_unlocalizedName);
	}

}
