package lesson_03ConsoleIO;

import java.util.Scanner;

public class Ex_06_SumFiveNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Enter number %s: ",i);
			sum += input.nextInt();
		}
		System.out.println("The sum is: " + sum);
		
	}
}
