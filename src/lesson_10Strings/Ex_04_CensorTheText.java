package lesson_10Strings;

import java.util.Scanner;

public class Ex_04_CensorTheText {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = input.nextLine();
		System.out.println("Enter the words: ");
		String censore = input.nextLine();
		String[] words = censore.split("[,.]+");
		String word = null;
		String stars = null;
		for (int i = 0; i < words.length; i++) {
			word = words[i];
			stars = generateStars(word);
			text = text.replaceAll(word, stars);
		}
		System.out.println(text);
	}

	private static String generateStars(String word) {
		StringBuilder stars = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			stars.append('*');
		}
		return stars.toString();
	}	

}
