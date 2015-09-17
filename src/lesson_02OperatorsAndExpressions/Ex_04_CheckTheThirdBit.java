package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_04_CheckTheThirdBit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter your number: ");
		number = input.nextInt();
		
		number = number & 8;
		if (number == 8) {
			System.out.println("The third bit of the number is 1");
		}
		else {
			System.out.println("The third bit of the number is 0");
		}
	}

}
