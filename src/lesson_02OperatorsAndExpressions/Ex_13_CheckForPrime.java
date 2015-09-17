package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_13_CheckForPrime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("The number is prime!");
		}
		else {
			System.out.println("The number is NOT prime!");
		}
	}

}
