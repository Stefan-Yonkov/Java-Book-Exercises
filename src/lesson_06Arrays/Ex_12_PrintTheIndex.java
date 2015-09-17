package lesson_06Arrays;

import java.util.Scanner;

public class Ex_12_PrintTheIndex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your word: ");
		String word = input.next();
		char[] letters = word.toCharArray();
		char[] alphabet = new char[52];
		int numberOfLetters = 65;
		for (int i = 0; i < alphabet.length; i++) {
			if (numberOfLetters == 91) {
				numberOfLetters = 97;
			}
			alphabet[i] = (char)numberOfLetters;
			numberOfLetters++;
		}
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (letters[i] == alphabet[j]) {
					System.out.print(j + " ");
				}
			}
		}

	}

}
