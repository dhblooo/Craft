package craft.entity;

import java.util.ArrayList;

import craft.Player;
import craft.phys.AABB;
import craft.renderer.Tesselator;
import craft.world.World;
import craft.world.tile.LiquidTile.LiquidType;

public class Entity {
	/**上下视野范围*/
	public static final float ENTITY_FIELD_OF_VIEW_X = 90.0F;
	/**视野旋转速度*/
	public static final float ENTITY_FIELD_OF_VIEW_MOVE_SPEED = 0.15F;
	/**普通跳跃高度*/
	public static final float ENTITY_JUMP_HEIGHT = 0.3F;
	/**普通移动速度*/
	public static final float ENTITY_WALK_SPEED = 0.075F;
	/**普通掉落速度 
	 * (重力值，越大，引力越大)*/
	public static final float ENTITY_GRAVITY = 0.035F;
	/**水平方向速度衰减
	 * 惯性值：(0~1)越小衰减越快*/
	public static final float ENTITY_HORIZONTAL_SPEED_DECAY = 0.82F;
	/**竖直方向速度衰减
	 * 惯性值：(0~1)越小衰减越快*/
	public static final float ENTITY_VERTICAL_SPEED_DECAY = 0.95F;	
	/**着地速度衰减
	 * 惯性值：(0~1)越小衰减越快*/
	public static final float ENTITY_ONGROUND_SPEED_DECAY = 0.7F;
	/**在液体中的掉落速度*/
	public static final float ENTITY_IN_LIQUID_GRAVITY = 0.01F;
	/**在液体中的移动速度*/
	public static final float ENTITY_IN_LIQUID_SPEED = 0.03F;
	/**在液体中的跳跃速度*/
	public static final float ENTITY_IN_LIQUID_JUMP_SPEED = 0.02F;
	/**在水中的速度衰减*/
	public static final float ENTITY_IN_WATER_SPEED_DECAY = 0.8F;
	/**实体在岩浆中的速度衰减*/
	public static final float ENTITY_IN_LAVA_SPEED_DECAY = 0.5F;	
	/**实体在液体中的碰到岸边的跳跃高度*/
	public static final float ENTITY_IN_LIQUID_JUMP_HEIGHT = 0.2F;
	protected World world;
	public float xo, yo, zo, x, y, z, xd, yd, zd;
	public float xRot, yRot;
	public AABB aabb;
	/**实体着地*/
	public boolean onGround = false;
	/**实体是否横向碰撞*/
	public boolean horizontalCollision = false;
	/**实体是否被移除*/
	public boolean removed = false;	
	/**高度偏移*/
	protected float heightOffset = 0.0F;
	/**AABB宽度*/
	protected float aabbWidth = 0.0F;
	/**AABB高度*/
	protected float aabbHeight = 0.0F;
	/**上次行走距离*/
	public float walkDistO = 0.0F;
	/**行走距离*/
	public float walkDist = 0.0F;
	/**行走下一步步数*/
	public int nextStep = 1;
	/**掉落距离*/
	public float fallDistant = 0.0F;

	public Entity(World world) {
		this.world = world;
		this.aabb = new AABB();
		resetPos();
	}

	public void resetPos() {
		int x = (int) (world.x0 + Math.random() * world.length);
		int y = world.maxHeight + 2;
		int z = (int) (world.z0 + Math.random() * world.width);
		while (world.isAirBlock(x, y - 1, z)) y--;
		y += 2;
		setPos(x, y, z);
	}

	public void remove() {
		this.removed = true;
	}

	protected void setSize(float width, float height) {
		this.aabbWidth = width;
		this.aabbHeight = height;
		this.heightOffset = height / 2;
	}

	/**直接的瞬间移动*/
	protected void setPos(float x, float y, float z) {
		this.xo = x;
		this.yo = y;
		this.zo = z;
		this.x = x;
		this.y = y;
		this.z = z;
		float w = aabbWidth / 2.0F;
		float h = aabbHeight / 2.0F;
		aabb.setBounds(x - w, y - h, z - w, x + w, y + h, z + w);
		walkDist = 0.0F;
		walkDistO = 0.0F;
		nextStep = 1;
	}
	
	/**带动画效果的移动*/
	protected void setPosWithMoving(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
		float w = aabbWidth / 2.0F;
		float h = aabbHeight / 2.0F;
		aabb.setBounds(x - w, y - h, z - w, x + w, y + h, z + w);
	}

	/**实体转向*/
	public void turn(float xo, float yo) {
		this.yRot = (float)(this.yRot + xo * ENTITY_FIELD_OF_VIEW_MOVE_SPEED);
		this.xRot = (float)(this.xRot - yo * ENTITY_FIELD_OF_VIEW_MOVE_SPEED);
		if (this.yRot >= 180) this.yRot -= 360.0F;
		if (this.yRot <= -180) this.yRot += 360.0F;
		if (this.xRot < -ENTITY_FIELD_OF_VIEW_X) this.xRot = -ENTITY_FIELD_OF_VIEW_X;
		if (this.xRot > ENTITY_FIELD_OF_VIEW_X) this.xRot = ENTITY_FIELD_OF_VIEW_X;
	}

	public void tick() {
		this.xo = this.x;
		this.yo = this.y;
		this.zo = this.z;
		this.walkDistO = this.walkDist;
	}

	/**@param withBorderary 是否有边界*/
	private void move(float xa, float ya, float za, boolean withBorderary) {
		float xaOrg = xa;
		float yaOrg = ya;
		float zaOrg = za;
		
		float xo = x, zo = z;

		ArrayList<AABB> aABBs = world.getCubes(aabb.expand(xa, ya, za));
		if (withBorderary) aABBs.addAll(world.getWallCubes());

		for (int i = 0; i < aABBs.size(); i++)
			ya = aABBs.get(i).clipYCollide(aabb, ya);
		aabb.move(0.0F, ya, 0.0F);

		for (int i = 0; i < aABBs.size(); i++)
			xa = aABBs.get(i).clipXCollide(aabb, xa);
		aabb.move(xa, 0.0F, 0.0F);

		for (int i = 0; i < aABBs.size(); i++)
			za = aABBs.get(i).clipZCollide(aabb, za);
		aabb.move(0.0F, 0.0F, za);

		horizontalCollision = ((xaOrg != xa) || (zaOrg != za));
		onGround = ((yaOrg != ya) && (yaOrg < 0.0F));
		
		if (onGround) {
			if (fallDistant > 0.0F) {
				causeFallDamage(fallDistant);
				fallDistant = 0.0F;
			}
		} else if (yd < 0.0F)
			fallDistant -= yd;
		
		if (xaOrg != xa) this.xd = 0.0F;
		if (yaOrg != ya) this.yd = 0.0F;
		if (zaOrg != za) this.zd = 0.0F;

		x = ((aabb.x0 + aabb.x1) / 2.0F);
		y = (aabb.y0 + heightOffset);
		z = ((aabb.z0 + aabb.z1) / 2.0F);
		
		float xt = x - xo;
		float zt = z - zo;
		walkDist += Math.sqrt(xt * xt + zt * zt) * 0.6D;
	}

	/**没有边界的移动*/
	protected void move(float xa, float ya, float za) {
		move(xa, ya, za, false);
	}
	
	/**带边界的移动*/
	protected void moveWithBorderary(float xa, float ya, float za) {
		move(xa, ya, za, true);
	}

	protected void moveRelative(float xa, float za, float speed) {
		float dist = xa * xa + za * za;
		if (dist < 0.01F) return;

		dist = speed / (float)Math.sqrt(dist);
		xa *= dist;
		za *= dist;

		float sin = (float)Math.sin(yRot * Math.PI / 180.0D);
		float cos = (float)Math.cos(yRot * Math.PI / 180.0D);

		xd += xa * cos - za * sin;
		zd += za * cos + xa * sin;
	}

	public boolean isLit() {
		int xTile = (int)Math.floor(this.x);
		int yTile = (int)Math.floor(this.y);
		int zTile = (int)Math.floor(this.z);
		return world.isLit(xTile, yTile, zTile);
	}

	public boolean isInWater() {
		return world.containsLiquid(aabb.grow(0.0F, -0.4F, 0.0F), LiquidType.Water);
	}

	public boolean isInLava() {
		return world.containsLiquid(aabb.grow(0.0F, -0.1F, 0.0F), LiquidType.Lava);
	}

	public boolean isFree(float xa, float ya, float za) {
		AABB box = aabb.cloneMove(xa, ya, za);
		ArrayList<AABB> aABBs = this.world.getCubes(box);
		if (aABBs.size() > 0) return false;
		if (this.world.containsAnyLiquid(box)) return false;
		return true;
	}
	
	public float distanceToSqr(Player player) {
		float xd = player.x - this.x;
		float yd = player.y - this.y;
		float zd = player.z - this.z;
		return xd * xd + yd * yd + zd * zd;
	}
	
	public void render(Tesselator t, float a) {
	}
	
	public byte getBrightness() {
		return world.getBrightness((int) Math.floor(x), (int) Math.floor(y), (int) Math.floor(z));
	}

	protected void causeFallDamage(float fallDistant) {
		
	}
	
}
