package lesson_12TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01_PrintLines {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("ex01.txt");
		Scanner readFile = new Scanner(file);
		while (readFile.hasNext()) {
			System.out.println(readFile.nextLine());
			if (readFile.hasNext()) {
				readFile.nextLine();
			}	
		}
		readFile.close();
	}

}
