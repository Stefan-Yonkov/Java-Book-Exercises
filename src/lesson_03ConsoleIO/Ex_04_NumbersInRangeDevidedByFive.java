package lesson_03ConsoleIO;

import java.util.Scanner;

public class Ex_04_NumbersInRangeDevidedByFive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Please enter the second number: ");
		int secondNumber = input.nextInt();
		for (int i = firstNumber; i <= secondNumber; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
