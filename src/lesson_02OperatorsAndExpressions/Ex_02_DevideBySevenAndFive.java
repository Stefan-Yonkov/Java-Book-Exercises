package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_02_DevideBySevenAndFive {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter your number: ");
		number = input.nextInt();
		
		if (number % 35 != 0) {
			System.out.println("The number can NOT be devided by 7 and 5");
		}
		else {
			System.out.println("The number can be devided by 7 and 5");
		}
	}

}