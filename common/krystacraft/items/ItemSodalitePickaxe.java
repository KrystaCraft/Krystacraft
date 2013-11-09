package krystacraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import krystacraft.Krystacraft;
import krystacraft.lib.Names;
import krystacraft.lib.References;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemSodalitePickaxe extends ItemPickaxe {

	public ItemSodalitePickaxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		
		this.setCreativeTab(Krystacraft.krystacraftTab);
		this.setUnlocalizedName(Names.ItemSodalitePickaxe_unlocalizedName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(References.MOD_ID.toLowerCase() + ":item" + Names.ItemSodalitePickaxe_unlocalizedName);
	}

}
