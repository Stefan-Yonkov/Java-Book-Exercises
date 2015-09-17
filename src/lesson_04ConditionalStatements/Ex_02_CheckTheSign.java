package lesson_04ConditionalStatements;

import java.util.Scanner;

public class Ex_02_CheckTheSign {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();
		
		if ((firstNumber > 0 && secondNumber > 0) || (firstNumber < 0 && secondNumber < 0)) {
			System.out.println("The sign is \"+\"");
		}
		else if (firstNumber == 0 || secondNumber == 0) {
			System.out.println("The result is 0");
		}
		else {
			System.out.println("The sign is \"-\"");
		}

	}

}
