package lesson_05Loops;

import java.util.Scanner;

public class Ex_05_FibonacciNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Plese enter n: ");
		int n = input.nextInt();
		int first = 0;
		int second = 1;
		int fib = first;
		for (int i = 0; i <= n; i++) {
			System.out.print(fib + " ");
			first = second;
			second = fib;
			fib = first + second;
		}

	}

}
