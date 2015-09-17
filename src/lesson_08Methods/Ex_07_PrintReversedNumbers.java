package lesson_08Methods;

import java.util.Scanner;

public class Ex_07_PrintReversedNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		String result = reverseNumber(number);
		System.out.printf("%s ===>>>>> %s",number,result);
	}

	private static String reverseNumber(int number) {
		StringBuilder transformation = new StringBuilder();
		while (number > 0) {
			transformation.append(number % 10);
			number /= 10;
		}
		return transformation.toString();
	}

}
