package lesson_04ConditionalStatements;

import java.util.Scanner;

public class Ex_01_SwitchValueIfBigger {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();
		if (firstNumber > secondNumber) {
			secondNumber = firstNumber + secondNumber;
			firstNumber = secondNumber - firstNumber;
			secondNumber = secondNumber - firstNumber;
		}
		System.out.printf("First number is: %s and the second number is: %s",firstNumber,secondNumber);
		
	}

}
