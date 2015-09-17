package lesson_05Loops;

import java.util.Scanner;

public class Ex_10_FindZerosInFactorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		long factorial = factorial(n);
		long number = factorial;
		int count = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (number % 10 == 0) {
				count++;
				number /= 10;
			}
			else {
				break;
			}
		}
		System.out.printf("The zeroes of your factorial %s are %s",factorial,count);
		
	}
	public static long factorial(int number){
		long result = 1;
		for (int i = 1; i <= number; i++) {
			result *=i;
		}
		
		return result;
	}

}
