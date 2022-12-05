package plumber.model;

public enum ColorType {

	WHITE('W'),
	RED('R'),
	GREEN('G'),
	BLUE('B'),
	YELLOW('Y'),
	GRAY('#'),
	NONE('N');
	
	private char icon;
	
	private ColorType(char icon) {
		this.icon=icon;
	}
	
	public char getIcon() {
		return icon;
	}
	
	public static ColorType valueOfChar(char c) {
		for(ColorType v : values()) if(v.getIcon() == c) return v;
		
		return null;
	}
}
