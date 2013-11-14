package krystacraft.items;

import krystacraft.KrystaCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemCrystal extends Item {
	
	private String iconPath;
	
	public ItemCrystal(int id, String unlocalizedName, int stackSize, String iconPath) {
		super(id);
		
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setUnlocalizedName(unlocalizedName);
		this.setMaxStackSize(stackSize);
		this.setIconPath(iconPath);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(this.getIconPath());
	}

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
}
