package craft_0_0_3.level.tile;

public enum Face {
	Top,Bottom,Front,Back,Left,Right;
	
	public static Face getFace(int index) {
		for (Face face : Face.values()) {  
            if (face.ordinal() == index) {  
                return face;  
            }  
        }  
        return null;
	}
}
