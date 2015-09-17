package lesson_10Strings;

import java.util.Scanner;

public class Ex_03_ChangeToUpperCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = input.nextLine();
		int index = 0;
		StringBuilder upperText = new StringBuilder(text);
		index = upperText.indexOf("<", index + 1);
		while (index != -1) {
			int startIndex = upperText.indexOf(">", index) + 1;
			int endIndex = upperText.indexOf("</", startIndex);
			int finalIndex = upperText.indexOf(">", endIndex) + 1;
			String sub = upperText.substring(startIndex,endIndex);
			replaceText(upperText,sub,index,finalIndex);
			index = upperText.indexOf("<", index + 1);
		}
		System.out.println(upperText.toString());
	}

	private static void replaceText(StringBuilder upperText, String sub,
			int startIndex, int finalIndex) {
		upperText.replace(startIndex, finalIndex, sub.toUpperCase());
	}

}
