package plumber;

import plumber.model.Level;
import plumber.utils.LevelBuilder;
import plumber.utils.Parser;

public class Plumber {
	
	public static void main(String[] args) {
		Level l = null;
		try {
			l = new LevelBuilder(new Parser("./res/level1.p")).build();
		} catch (InstantiationException | IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println(l);
	}
	
}
