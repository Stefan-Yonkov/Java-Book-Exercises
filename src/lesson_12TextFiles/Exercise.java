package lesson_12TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("sample.txt");
		Scanner fileReader = new Scanner(file);
		int lineNumber = 0;
		
		while (fileReader.hasNext()) {
			lineNumber++;
			System.out.printf("Line %d : %s%n ",lineNumber,fileReader.nextLine());
		}
		fileReader.close();
	}

}
