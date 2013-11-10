package krystacraft.blocks;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import krystacraft.KrystaCraft;
import krystacraft.lib.Strings;
import krystacraft.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class BlockNewLeaf extends BlockLeavesBase implements IShearable {
	
	private static final int METADATA_BITMASK       = 0x3;
	
	private static int unmarkedMetadata(int metadata) {
        return metadata & METADATA_BITMASK;
    }

	public BlockNewLeaf(int id, Material material, boolean useFastGraphics) {
		super(id, material, useFastGraphics);
		
		this.setUnlocalizedName(Strings.BlockNewLeaf_unlocalizedName);
		this.setCreativeTab(KrystaCraft.krystacraftTab);
		this.setHardness(0.5f);
		this.setResistance(0.5F);
		this.setStepSound(Block.soundGrassFootstep);
		this.setLightValue(1.0F);
		this.setLightOpacity(1);
	}
	
	@Override
    public void harvestBlock(World world, final EntityPlayer player, final int x, final int y, final int z, final int md) {
        super.harvestBlock(world, player, x, y, z, md);
    }
	
    @Override
    public int idDropped(int metadata, Random rand, int par3) {
        return Blocks.newLeaf.blockID;
    }
    
    @Override
    public boolean isLeaves(World world, int x, int y, int z) {
        return true;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return Block.leaves.isOpaqueCube();
    }
    
    @Override
    public boolean isShearable(ItemStack item, World world, int x, int y, int z) {
        return true;
    }
    
    @Override
    public int quantityDropped(Random rand) {
        return rand.nextInt(20) == 0 ? 1 : 0;
    }
    
    @Override
    public boolean shouldSideBeRendered(IBlockAccess par1iBlockAccess, int par2, int par3, int par4, int par5) {
        graphicsLevel = !Block.leaves.isOpaqueCube(); // fix leaf render
                                                      // bug
        return super.shouldSideBeRendered(par1iBlockAccess, par2, par3, par4, par5);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(References.MOD_ID.toLowerCase() + ":block" + Strings.BlockNewLeaf_unlocalizedName);
	}

	@Override
    public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x, int y, int z, int fortune) {
        final ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, unmarkedMetadata(world.getBlockMetadata(x, y, z))));
        return ret;
    }
}
