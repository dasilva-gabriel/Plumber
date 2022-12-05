package plumber.utils;

import plumber.model.Board;
import plumber.model.ColorType;
import plumber.model.Level;
import plumber.model.Pipe;
import plumber.model.PipesType;

public class LevelBuilder {

	private int witdh = 0, heigth = 0;
	private String[][] board;

	public LevelBuilder() {
	}

	public LevelBuilder(Parser parser) throws IllegalArgumentException {
		String[] stringSize = parser.getNextLine().trim().split(" ");
		witdh = Integer.parseInt(stringSize[0]);
		heigth = Integer.parseInt(stringSize[1]);

		board = new String[witdh][heigth];

		for (int i = 0; i < witdh; i++) {
			board[i] = parser.getNextLine().trim().split(" +");
		}
		
	}

	public LevelBuilder setWidth(int w) {
		witdh = w;
		if (heigth > 0) {
			board = new String[witdh][heigth];
		}
		return this;
	}

	public LevelBuilder setHeigth(int h) {
		heigth = h;
		if (witdh > 0) {
			board = new String[witdh][heigth];
		}
		return this;
	}

	public Level build() throws InstantiationException {
		if (board != null) {
			Pipe[][] grid = new Pipe[witdh][heigth];
			for (int i = 0; i < grid.length; i++) {

				for (int j = 0; j < grid.length; j++) {
					String[] chars = board[i][j].split("");
					PipesType type = PipesType.valueOfChar(chars[0].charAt(0));
					ColorType color = ColorType.NONE;
					if (i == 0 || i == board.length - 1 || j == 0 || j == board[i].length - 1) {
						if (type == null) {
							type = PipesType.STARTER;
							color = ColorType.valueOfChar(chars[0].charAt(0));
						}
					}

					Pipe pipe = new Pipe(type, (chars.length == 1) ? 0 : Byte.parseByte(chars[1]), color);

					grid[i][j] = pipe;
				}
			}

			Board board = new Board(grid);
			return new Level(board);
		}
		throw new InstantiationException();
	}

}
