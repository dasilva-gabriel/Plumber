package plumber.model;

public enum PipesType {

	LINE('L', true),
	OVER('O', false),
	TURN('T', true),
	FORK('F', true),
	CROSS('C', false),
	WALL('X', false),
	EMPTY('.', false),
	STARTER('#', true);
	
	private char icon;
	private boolean turnable;
	
	private PipesType(char icon, boolean turnable) {
		this.icon = icon;
		this.turnable = turnable;
	}

	public char getIcon() {
		return icon;
	}

	public boolean isTurnable() {
		return turnable;
	}
	
	public static PipesType valueOfChar(char c) {
		
		for(PipesType v : values()) if(v.getIcon() == c) return v;
		
		return null;
		
		
	}
	
}


