package krystacraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import krystacraft.Krystacraft;
import krystacraft.lib.Names;
import krystacraft.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockNewLeaf extends Block {

	public BlockNewLeaf(int id) {
		super(id, Material.leaves);
		
		this.setUnlocalizedName(Names.BlockNewLeaf_unlocalizedName);
		this.setCreativeTab(Krystacraft.krystacraftTab);
		this.setHardness(0.5f);
		this.setResistance(0.5F);
		this.setStepSound(Block.soundGrassFootstep);
		this.setLightValue(1.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(References.MOD_ID.toLowerCase() + ":block" + Names.BlockNewLeaf_unlocalizedName);
	}
}
