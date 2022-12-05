package plumber.model;

public class Level {
	
	private Board board;
	
	public Level(Board board) {
		this.board = board;
	}
	
	@Override
	public String toString() {
		return board.toString();
	}
}


