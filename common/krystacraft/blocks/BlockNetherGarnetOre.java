package krystacraft.blocks;

import java.util.Random;

import krystacraft.KrystaCraft;
import krystacraft.items.Items;
import krystacraft.lib.References;
import krystacraft.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlockNetherGarnetOre extends Block {

	public BlockNetherGarnetOre(int id) {
		super(id, Material.rock);
		
		this.setUnlocalizedName(Strings.BlockNetherGarnetOre_unlocalizedName);
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setHardness(4.0f);
		this.setResistance(15F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setLightValue(0.5F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(References.MOD_ID.toLowerCase() + ":block" + Strings.BlockNetherGarnetOre_unlocalizedName);
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		return Items.krystaDust.itemID;
	}
	
	public int quantityDropped(Random par1Random)
    {
        return 2 + par1Random.nextInt(2);
    }
	
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int j1 = 1 + par1World.rand.nextInt(5);
            this.dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
        }
    }


}
