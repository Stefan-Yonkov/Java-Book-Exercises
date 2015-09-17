package lesson_10Strings;

import java.util.Scanner;

public class Ex_01_ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String text = input.next();
		StringBuilder reversedText = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
			reversedText.append(text.charAt(i));
		}
		System.out.printf("%s --->> %s",text,reversedText.toString());
		
	}

}
