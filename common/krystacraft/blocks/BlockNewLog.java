package krystacraft.blocks;

import krystacraft.Krystacraft;
import krystacraft.lib.Names;
import krystacraft.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNewLog extends Block {

	public BlockNewLog(int id) {
		super(id, Material.wood);
		
		this.setUnlocalizedName(Names.BlockNewLog_unlocalizedName);
		this.setCreativeTab(Krystacraft.krystacraftTab);
		this.setHardness(2f);
		this.setResistance(2F);
		this.setStepSound(Block.soundWoodFootstep);
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister Icon){
		topIcon = Icon.registerIcon(References.MOD_ID.toLowerCase() + ":blockLogNewTreeTop");
		bottomIcon = Icon.registerIcon(References.MOD_ID.toLowerCase() + ":blockLogNewTreeTop");
		sideIcon = Icon.registerIcon(References.MOD_ID.toLowerCase() + ":blockLogNew");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata){
		if (side == 0){
			return bottomIcon;
		} else if(side == 1){
			return topIcon;
		} else {
			return sideIcon;
		}
	}

}
