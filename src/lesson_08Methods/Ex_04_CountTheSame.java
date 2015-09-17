package lesson_08Methods;

import java.util.Scanner;

public class Ex_04_CountTheSame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the arr: ");
		int n = input.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Enter arr[%s]: ",i);
			numbers[i] = input.nextInt();
		}
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		int duplicates = findDuplicates(number,numbers);
		System.out.printf("%s ==>>>> %s times",number,duplicates);
	}

	private static int findDuplicates(int number, int[] numbers) {
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				counter++;
			}
		}
		return counter;
	}

}
