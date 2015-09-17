package lesson_12TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_02_SortFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File unsortedFile = new File("names.txt");
		File sorted = new File("sortedNames.txt");
		Scanner readNames = new Scanner(unsortedFile);
		ArrayList<String> names = new ArrayList<>();
		while (readNames.hasNextLine()) {
			names.add(readNames.nextLine());
		}
		String[] sortedName = new String[names.size()];
		sortedName = names.toArray(sortedName);
		Arrays.sort(sortedName);
		PrintStream writeFile = new PrintStream(sorted);
		String name = "";
		for (int i = 0; i < sortedName.length; i++) {
			name = sortedName[i];
			writeFile.println(name);
		}
		
		readNames.close();
		writeFile.close();
	}

}
