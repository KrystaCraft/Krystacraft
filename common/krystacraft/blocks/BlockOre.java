package krystacraft.blocks;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import krystacraft.KrystaCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockOre extends Block {

	private String iconPath;
	private int xpDropLow;
	private int xpDropHigh;
	private int firstItemDrop;
	private int secondItemDrop;
	private int maxY;
	private int maxVeinSize;
	private int chanceToSpawn;
	private boolean willSpawn;
	
	public BlockOre(int id, String unlocalizedName, String iconPath, int xpLow, int xpHigh,
			int firstItemDrop, int secondItemDrop, int maxY, int maxVeinSize, int chanceToSpawn, boolean willSpawn) {
		super(Material.rock);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setHardness(4.0f);
		this.setResistance(15F);
		this.setStepSound(Block.soundTypeStone);
		this.setLightValue(0.5F);
		this.setIconPath(iconPath);
		this.setXpDropLow(xpLow);
		this.setXpDropHigh(xpHigh);
		this.setFirstItemDrop(firstItemDrop);
		this.setSecondItemDrop(secondItemDrop);
		this.setMaxY(maxY);
		this.setMaxVeinSize(maxVeinSize);
		this.setChanceToSpawn(chanceToSpawn);
		this.setWillSpawn(willSpawn);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(this.iconPath);
	}

	@Override
	public int idDropped(int metadata, Random random, int fortune){
		return 0;
	}
	
	@Override
	public int quantityDropped(Random par1Random){
        return 2 + par1Random.nextInt(2);
    }
	
	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int j1 = MathHelper.getRandomIntegerInRange(par1World.rand, this.xpDropLow, this.xpDropHigh);
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
				idDropped = this.secondItemDrop;
				metaDropped = 1;
			}
			else if (luckDraw <= 1.00) {
				idDropped = this.firstItemDrop;
				metaDropped = 3;
			}
			
			
			// Adds the block to the return list
			if (idDropped > 0) {
				ret.add(new ItemStack(idDropped, 1, metaDropped));
			}
		}
		return ret;
	}
	
	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public int getXpDropLow() {
		return xpDropLow;
	}

	public void setXpDropLow(int xpDropLow) {
		this.xpDropLow = xpDropLow;
	}

	public int getXpDropHigh() {
		return xpDropHigh;
	}

	public void setXpDropHigh(int xpDropHigh) {
		this.xpDropHigh = xpDropHigh;
	}

	public int getFirstItemDrop() {
		return firstItemDrop;
	}

	public void setFirstItemDrop(int firstItemDrop) {
		this.firstItemDrop = firstItemDrop;
	}

	public int getSecondItemDrop() {
		return secondItemDrop;
	}

	public void setSecondItemDrop(int secondItemDrop) {
		this.secondItemDrop = secondItemDrop;
	}

	public boolean getWillSpawn() {
		return willSpawn;
	}

	public void setWillSpawn(boolean willSpawn) {
		this.willSpawn = willSpawn;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

	public int getMaxVeinSize() {
		return maxVeinSize;
	}

	public void setMaxVeinSize(int maxVeinSize) {
		this.maxVeinSize = maxVeinSize;
	}

	public int getChanceToSpawn() {
		return chanceToSpawn;
	}

	public void setChanceToSpawn(int chanceToSpawn) {
		this.chanceToSpawn = chanceToSpawn;
	}
}
