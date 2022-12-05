package plumber.model;

public class Pipe {

	private final PipesType type;
	private byte rotation;
	private ColorType color;
	
	public Pipe(PipesType type, byte rotation, ColorType color) {
		this.type = type;
		this.rotation = rotation;
		this.color = color;
	}
	
	public PipesType getType() {
		return type;
	}
	
	public byte getRotation() {
		return rotation;
	}
	
	public void setRotation(byte rotation) {
		this.rotation = rotation;
	}
	
	public ColorType getColor() {
		return color;
	}
	
	public void setColor(ColorType color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		String res = ""+this.type.getIcon();
		
		if(type == PipesType.STARTER) {
			res = ""+this.color.getIcon();
		}
		
		if(type != PipesType.WALL && type != PipesType.EMPTY) {
			res += "" + this.rotation;
		}
		
		return res;
	}
}
