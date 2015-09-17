package lesson_05Loops;

import java.util.Scanner;

public class Ex_07_CalculationsWithFactorials {

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
			int result = (factorial(n) * factorial(k)) / (factorial(n-k));
			System.out.printf("The result N! * K! / (N-K)! = %s",result);			
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
