package lesson_05Loops;

import java.util.Scanner;

public class Ex_08_CatalansNumbers {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		double catalanNumber = (factorial(2 * n)) / (factorial(1 + n) * factorial(n));
		System.out.printf(" Catalan number: %s", catalanNumber);
		
	}
	public static int factorial(int number){
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
	
}
