package plumber.model;

import plumber.model.Pipe;

public class Board {

	private Pipe[][] grid;
	
	public Board(Pipe[][] grid) {
		this.grid=grid;
	}
	
	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				res+=grid[i][j] + " ";
			}
			res+="\n";
		}
		return res;
	}
}
