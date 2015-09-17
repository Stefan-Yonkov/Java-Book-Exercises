package lesson_05Loops;

import java.util.Scanner;

public class Ex_03_BiggestAndSmallestInSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the lenght of the sequence: ");
		int length = input.nextInt();
		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;
		int currentNumber = 0;
		for (int i = 0; i < length; i++) {
			System.out.print("Entet number: ");
			currentNumber = input.nextInt();
			if (maxNumber < currentNumber ) {
				maxNumber = currentNumber;
			}
			if (minNumber > currentNumber) {
				minNumber = currentNumber;
			}
		}
		System.out.printf("Max number is %s and min number is %s. ",maxNumber,minNumber);
	}

}
