package lesson_12TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex_04_ReplaceWords {

	public static void main(String[] args) throws FileNotFoundException {

		File text = new File("text.txt");
		File replaced = new File("replaced.txt");
		Scanner input = new Scanner(text);
		StringBuilder info = new StringBuilder();
		while (input.hasNextLine()) {
			info.append(input.nextLine());
		}
		String mask = info.toString();
		mask = mask.replaceAll("\\b(?i)start\\b", "finish");
		PrintStream write = new PrintStream(replaced);
		write.print(mask);
		input.close();
		write.close();
	}

}
