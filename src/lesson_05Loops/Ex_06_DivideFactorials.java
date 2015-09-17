package lesson_05Loops;

import java.util.Scanner;

public class Ex_06_DivideFactorials {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N and K (1<K<N");
		System.out.print("K = ");
		int k = input.nextInt();
		System.out.print("N = ");
		int n = input.nextInt();
		boolean error = false;
		if ((n < k) || (n < 1) || (k < 1))  {
			System.out.println("Error in data, please enter correct data!");
			error = true;
		}
		if (!error) {
			int division = factorial(n) / factorial(k);
			System.out.printf("The result N!/K! = %s",division);			
		}
	}
	public static int factorial(int number){
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

}
