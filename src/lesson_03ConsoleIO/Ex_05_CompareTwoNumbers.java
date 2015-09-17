package lesson_03ConsoleIO;

import java.util.Scanner;

public class Ex_05_CompareTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Please enter the second number: ");
		int secondNumber = input.nextInt();
		
		System.out.println("The biggest number is: " + Math.max(firstNumber, secondNumber));

	}

}
