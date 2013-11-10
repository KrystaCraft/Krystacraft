package krystacraft.blocks;

import java.util.Random;

import krystacraft.KrystaCraft;
import krystacraft.lib.Strings;
import krystacraft.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNewLog extends BlockLog {

	public BlockNewLog(int id) {
		super(id);
		
		this.setUnlocalizedName(Strings.BlockNewLog_unlocalizedName);
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setHardness(2f);
		this.setResistance(2F);
		this.setStepSound(Block.soundWoodFootstep);
	}
	
	public int idDropped(int i, Random rand, int j){
		return Blocks.newLog.blockID;
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
