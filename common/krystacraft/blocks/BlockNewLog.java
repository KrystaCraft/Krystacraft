package krystacraft.blocks;

import java.util.Random;

import krystacraft.KrystaCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNewLog extends BlockLog {
	
	private String[] iconPaths;
	
	public BlockNewLog(int id, String unlocalizedName, String[] iconPaths) {
		super(id);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setHardness(2f);
		this.setResistance(2F);
		this.setStepSound(Block.soundWoodFootstep);
		this.setIconPaths(iconPaths);
	}
	
	public int idDropped(int i, Random rand, int j){
		return this.blockID;
	}
	
	@Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
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
		topIcon = Icon.registerIcon(this.iconPaths[0]);
		bottomIcon = Icon.registerIcon(this.iconPaths[1]);
		sideIcon = Icon.registerIcon(this.iconPaths[2]);
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

	public String[] getIconPaths() {
		return iconPaths;
	}

	public void setIconPaths(String[] iconPaths) {
		this.iconPaths = iconPaths;
	}

}
