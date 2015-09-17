package lesson_04ConditionalStatements;

import java.util.Scanner;

public class Ex_03_FindMaxNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int maxNumber = Integer.MIN_VALUE;
		int number = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.printf("Enter number %s: ",i);
			number = input.nextInt();
			if (number > maxNumber) {
				maxNumber = number;
			}
		}
		System.out.println("The biggest number is : " + maxNumber);

	}

}
