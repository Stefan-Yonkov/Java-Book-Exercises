package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_03_CheckTheThirdDigitForSeven {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter your number: ");
		number = input.nextInt();
		
		number = number / 100;
		number = number % 10;
		if (number == 7) {
			System.out.println("The third digit is Seven");
		}
		else {
			System.out.println("The third digit is NOT Seven");
		}
	}

}
