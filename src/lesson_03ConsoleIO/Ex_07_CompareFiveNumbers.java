package lesson_03ConsoleIO;

import java.util.Scanner;

public class Ex_07_CompareFiveNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int maxNumber = Integer.MIN_VALUE;
		int number = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Enter number %s: ",i);
			number = input.nextInt();
			if (number > maxNumber) {
				maxNumber = number;
			}
		}
		System.out.println("The biggest number is : " + maxNumber);

	}

}
