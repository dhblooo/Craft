package craft.level;

public class Coord {
	public int x, y, z;

	public Coord(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Coord() {
	}

	public boolean equals(Object o) {
		Coord c = (Coord) o;
		return c.x == x && c.y == y && c.z == z;
	}
	
}
