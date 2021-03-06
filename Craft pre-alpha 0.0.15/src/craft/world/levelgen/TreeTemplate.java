package craft.world.levelgen;

import craft.world.tile.Tile;

public class TreeTemplate {
	public static final int Count = 30;
	private static int c = Tile.trunk.id;
	private static int l = Tile.leaf.id;
	private static int[][][] t0 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t1 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t2 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t3 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t4 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {l, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {l, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t5 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t6 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t7 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t8 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t9 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t10 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {l, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {l, l, l, l, l}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t11 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {l, 0, 0, l, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, l, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t12 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t13 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {l, l, l, l, l}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, l, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {l, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t14 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {0, l, l, l, l}, {0, 0, 0, l, l}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, l}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, l, l, l}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t15 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, l}, {0, 0, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, 0}, {l, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t16 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t17 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t18 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t19 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t20 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {l, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {l, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t21 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},{l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t22 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0},{l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t23 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t24 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0},  {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t25 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {0, l, l, l, l}, {l, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, l, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t26 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {l, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0},  {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, 0}, {l, l, l, l, l}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t27 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {0, l, l, l, l}, {l, l, l, l, 0}, {l, 0, 0, l, 0}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {0, l, l, l, l}, {0, l, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t28 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, 0}, {0, l, l, l, l}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, l, l, l, l}, {l, l, l, l, l}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t29 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, 0}, {l, l, l, l, l}, {0, 0, 0, 0, l}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, l, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0}, {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {0, l, l, l, l}, {l, l, l, l, 0}, {l, 0, 0, 0, 0}, {0, 0, 0, 0, 0}
		},
	};
	private static int[][][] t30 = {
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {0, l, l, l, l}, {0, 0, 0, l, l}, {0, 0, 0, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, 0}, {0, l, l, 0, 0}
		},
		{
			{0, 0, c, 0, 0}, {0, 0, c, 0, 0},  {l, l, c, l, l}, {l, l, c, l, l}, {0, l, c, l, 0}, {0, l, l, l, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {l, l, l, l, l}, {l, l, l, l, l}, {0, l, l, l, l}, {0, 0, l, 0, 0}
		},
		{
			{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},  {0, l, l, l, l}, {l, l, l, l, 0}, {0, 0, l, l, l}, {0, 0, 0, 0, 0}
		},
	};
	public static int[][][] getTree(int index) {
		switch(index) {
		case 0:
			return t0;
		case 1:
			return t1;
		case 2:
			return t2;
		case 3:
			return t3;
		case 4:
			return t4;
		case 5:
			return t5;
		case 6:
			return t6;
		case 7:
			return t7;
		case 8:
			return t8;
		case 9:
			return t9;
		case 10:
			return t10;
		case 11:
			return t11;
		case 12:
			return t12;
		case 13:
			return t13;
		case 14:
			return t14;
		case 15:
			return t15;
		case 16:
			return t16;
		case 17:
			return t17;
		case 18:
			return t18;
		case 19:
			return t19;
		case 20:
			return t20;
		case 21:
			return t21;
		case 22:
			return t22;
		case 23:
			return t23;
		case 24:
			return t24;
		case 25:
			return t25;
		case 26:
			return t26;
		case 27:
			return t27;
		case 28:
			return t28;
		case 29:
			return t29;
		case 30:
			return t30;
		default:
			return t0;
		}
	}
}
