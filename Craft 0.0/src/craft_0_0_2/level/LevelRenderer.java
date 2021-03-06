package craft_0_0_2.level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.lwjgl.opengl.GL11;

import craft_0_0_2.HitResult;
import craft_0_0_2.Player;
import craft_0_0_2.level.tile.Face;
import craft_0_0_2.level.tile.Tile;
import craft_0_0_2.phys.AABB;
import craft_0_0_2.renderer.Frustum;

public class LevelRenderer implements LevelListener {
	public static final int MAX_REBUILDS_PER_FRAME = 8;
	public static final int CHUNK_SIZE = 16;
	private Level level;
	private Chunk[][][] chunks;
	private int xChunks;
	private int yChunks;
	private int zChunks;

	public LevelRenderer(Level level) {
		this.level = level;
		level.setLevelListener(this);
		
		xChunks = level.length / CHUNK_SIZE;
		yChunks = level.height / CHUNK_SIZE;
		zChunks = level.width / CHUNK_SIZE;
		
		chunks = new Chunk[xChunks][yChunks][zChunks];
		for (int x = 0; x < this.xChunks ; x++)
		      for (int y = 0; y < this.yChunks; y++)
		    	  for (int z = 0; z < this.zChunks; z++)
		    	  {
		    		  int x0 = x * 16;
		    		  int y0 = y * 16;
		    		  int z0 = z * 16;
			          int x1 = (x + 1) * 16;
			          int y1 = (y + 1) * 16;
			          int z1 = (z + 1) * 16;
			          
			          x0 -= level.length / 2;
			          x1 -= (level.length / 2 + 1);
			          z0 -= level.width / 2;
			          z1 -= (level.width / 2 + 1);
			          y1 --;
	
			          if (x1 > level.x1) x1 = level.x1;
			          if (y1 > level.y1) y1 = level.y1;
			          if (z1 > level.z1) z1 = level.z1;
			          chunks[x][y][z] = new Chunk(level, x0, y0, z0, x1, y1, z1);
			          //System.out.printf("%d,%d,%d,%d,%d,%d,%d,%d,%d\n", x, y, z, x0, y0, z0, x1, y1, z1);
		        }
	}
	public void render(Player player) {
//		GL11.glLoadIdentity();
//		GL11.glTranslatef(0.0f, 0.0f, -0.3f);
//		GL11.glRotatef(player.xRot, 1, 0, 0);
//		GL11.glRotatef(player.yRot, 0, 1, 0);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		Frustum frustum = Frustum.getFrustum();
		for(int x = 0; x < xChunks; x++)
			for(int z = 0; z < zChunks; z++)
				for(int y = 0; y < yChunks; y++) {
					if(frustum.isVisible(chunks[x][y][z].aabb))
						chunks[x][y][z].render();
				}
		GL11.glDisable(GL11.GL_TEXTURE_2D);
	}
	
	private List<Chunk> getAllDirtyChunks() {
		ArrayList<Chunk> dirtyChunks = null;
		for(int x = 0; x < xChunks; x++)
			for(int y = 0; y < yChunks; y++)
				for(int z = 0; z < zChunks; z++) {
					Chunk chunk = chunks[x][y][z];
					if(chunk.isDirty()) {
						if(dirtyChunks == null)
							dirtyChunks = new ArrayList<Chunk>();
						dirtyChunks.add(chunk);
					}
		}
		return dirtyChunks;
	}
	
	public void updateDirtyChunks(Player player) {
		List<Chunk> dirtyChunks = getAllDirtyChunks();
		if (dirtyChunks == null)
			return;
		Collections.sort(dirtyChunks, new DirtyChunkSorter(player, Frustum.getFrustum()));
		for (int i = 0; (i < MAX_REBUILDS_PER_FRAME) && (i < dirtyChunks.size()); i++) {
	      dirtyChunks.get(i).rebuild();
	    }
	}
	
	public void setDirty(int x0, int y0, int z0, int x1, int y1, int z1) {
		x0 += level.length / 2;
		z0 += level.width / 2;
		x1 += level.length / 2;
		z1 += level.width / 2;
		
	    x0 /= CHUNK_SIZE;
	    x1 /= CHUNK_SIZE;
	    y0 /= CHUNK_SIZE;
	    y1 /= CHUNK_SIZE;
	    z0 /= CHUNK_SIZE;
	    z1 /= CHUNK_SIZE;

	    if (x0 < 0) x0 = 0;
	    if (y0 < 0) y0 = 0;
	    if (z0 < 0) z0 = 0;
	    if (x1 >= this.xChunks) x1 = this.xChunks - 1;
	    if (y1 >= this.yChunks) y1 = this.yChunks - 1;
	    if (z1 >= this.zChunks) z1 = this.zChunks - 1;

	    for (int x = x0; x <= x1; x++)
	      for (int y = y0; y <= y1; y++)
	        for (int z = z0; z <= z1; z++)
	        	this.chunks[x][y][z].setDirty();
	}
	
	public void pick(Player player) {
	    AABB box = player.aabb.grow(Player.PLAYER_PICK_LENGTH, Player.PLAYER_PICK_LENGTH, Player.PLAYER_PICK_LENGTH);
	    int x0 = (int)box.x0;
	    int x1 = (int)(box.x1 + 1.0F);
	    int y0 = (int)box.y0;
	    int y1 = (int)(box.y1 + 1.0F);
	    int z0 = (int)box.z0;
	    int z1 = (int)(box.z1 + 1.0F);

	    GL11.glInitNames();
	    for (int x = x0; x < x1; x++) {
	    	GL11.glPushName(x);
	    	for (int y = y0; y < y1; y++) {
	    		GL11.glPushName(y);
	    		for (int z = z0; z < z1; z++) {
	    			GL11.glPushName(z);
	    			if (this.level.isSolidBlock(x, y, z)) {
	    				GL11.glPushName(0);
	    				for(Face face : Face.values()) {
	    					GL11.glPushName(face.ordinal());
	    					Tile.renderFaceNoTexture(x, y, z, face);
	    					GL11.glPopName();
	    				}
	    				GL11.glPopName();
	    			}
	    			GL11.glPopName();
	    		}
	    		GL11.glPopName();
	    	}
	    	GL11.glPopName();
	    }
	}

	public void renderHit(HitResult h) {
	    GL11.glColor4f(0.8F, 0.8F, 0.8F, 1.0F);
	    GL11.glLineWidth(2.5F);
	    Tile.renderLine(h.x, h.y, h.z);
	    GL11.glEnable(GL11.GL_BLEND);
	    GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_TRUE);
	    GL11.glColor4f(1.0F, 1.0F, 1.0F, ((float)Math.sin(System.currentTimeMillis() / 100.0D) * 0.2F + 0.4F) * 0.5F);
	    //System.out.printf("%d %d %d %s\n", h.x, h.y, h.z, h.face.name());
	    Tile.renderFaceNoTexture(h.x, h.y, h.z, h.face);
	    GL11.glDisable(GL11.GL_BLEND);
	}
	
	@Override
	public void blockChanged(int x, int y, int z) {
		setDirty(x - 1, y - 1, z - 1, x + 1, y + 1, z + 1);
	}

	@Override
	public void lightColumnChanged(int x, int z, int y0, int y1) {
		setDirty(x - 1, y0 - 1, z - 1, x + 1, y1 + 1, z + 1);
	}

	@Override
	public void allChanged() {
		setDirty(level.x0, level.y0, level.z0, level.x1, level.y1, level.z1);
	}

}
