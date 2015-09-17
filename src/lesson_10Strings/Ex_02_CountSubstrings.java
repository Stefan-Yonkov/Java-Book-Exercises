package lesson_10Strings;

import java.util.Scanner;

public class Ex_02_CountSubstrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = input.nextLine();
		System.out.print("Enter the substring: ");
		String key = input.nextLine();
		int count = 0;
		int index = 0;
		while (index != -1) {
			index = text.indexOf(key, index + 1);
			count++;
		}
		System.out.printf("%s ----> %d times",key,count);
	}

}
