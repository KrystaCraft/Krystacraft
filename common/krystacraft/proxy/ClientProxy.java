package krystacraft.proxy;

import net.minecraftforge.common.ForgeDirection;
 
public class ClientProxy extends CommonProxy {
    
	@Override
	public void registerKeyBindingHandler() {

    }
	
	@Override
    public void registerRenderTickHandler() {

    }

	@Override
    public void registerDrawBlockHighlightHandler() {

    }

	@Override
    public void setKeyBinding(String name, int value) {

    }

	@Override
    public void registerSoundHandler() {

    }

	@Override
    public void initRenderingAndTextures() {

    }

	@Override
    public void registerTileEntities() {
    	
    }
    
	@Override
    public void sendRequestEventPacket(byte eventType, int originX, int originY, int originZ, byte sideHit, byte rangeX, byte rangeY, byte rangeZ, String data) {

    }

	@Override
    public void handleTileEntityPacket(int x, int y, int z, ForgeDirection orientation, byte state, String customName) {

    }

	@Override
    public void handleTileWithItemPacket(int x, int y, int z, ForgeDirection orientation, byte state, String customName, int itemID, int metaData, int stackSize, int color) {

    }
}