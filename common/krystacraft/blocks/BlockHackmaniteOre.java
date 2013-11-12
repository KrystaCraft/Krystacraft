package krystacraft.blocks;

import java.util.ArrayList;
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
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockHackmaniteOre extends Block {

	public BlockHackmaniteOre(int id) {
		super(id, Material.rock);

		this.setUnlocalizedName(Strings.BlockHackmaniteOre_unlocalizedName);
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setHardness(4.0f);
		this.setResistance(15F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setLightValue(0.5F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(References.MOD_ID.toLowerCase()
				+ ":block" + Strings.BlockHackmaniteOre_unlocalizedName);
	}

	@Override
	public int idDropped(int metadata, Random random, int fortune) {
		return 0;
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return 2 + par1Random.nextInt(2);
	}

	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3,
			int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5,
				par6, par7);

		if (this.idDropped(par5, par1World.rand, par7) != this.blockID) {
			int j1 = 1 + par1World.rand.nextInt(5);
			this.dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
		}
	}

	public ArrayList<ItemStack> getBlockDropped(World world, int x, int y,
			int z, int metadata, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

		// Gets how much items this block will drop
		int count = quantityDropped(metadata, fortune, world.rand);


		// Here I make it drop random items
		double luckDraw;
		int idDropped = 0;
		int metaDropped = 0;

		for (int i = 0; i < count; i++) {
			// Gets a number between 0 and 4
			luckDraw = Math.random();
			idDropped = 0;
			metaDropped = 0;

			// Choose what will be on the list
			if (luckDraw <= 0.25) {
				idDropped = Items.largeCrystal.itemID;
				metaDropped = 1;
			}
			else if (luckDraw <= 1.00) {
				idDropped = Items.smallCrystal.itemID;
				metaDropped = 3;
			}
			
			
			// Adds the block to the return list
			if (idDropped > 0) {
				ret.add(new ItemStack(idDropped, 1, metaDropped));
			}

			//return ret;
		}
		return ret;

	}
}
