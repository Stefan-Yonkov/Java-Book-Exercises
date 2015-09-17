package lesson_10Strings;

import java.util.Scanner;

public class Ex_06_ReverseWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the info: ");
		String text = input.nextLine();
		String[] words = text.split("[ ,.]+");
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i] + " ");
		}
		System.out.println(reversed.toString());
	}

}
