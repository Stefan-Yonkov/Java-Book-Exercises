package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_01_OddOrEven {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter your number: ");
		number = input.nextInt();
		
		if (number % 2 != 0) {
			System.out.println("The number is ODD!");
		}
		else {
			System.out.println("The number is EVEN!");
		}
	}

}
