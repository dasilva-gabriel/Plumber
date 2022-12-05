package plumber.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
	private File file;
	private Scanner scanner; 
	
	public Parser(String path) {
		try {
			file = new File(path);
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getNextLine() {
		if (!scanner.hasNextLine()) {
			scanner.close();
			return null;
		}
		return scanner.nextLine();
	}
}
