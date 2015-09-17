package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_10_OperationsOnDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		
		int number = input.nextInt();
		int d = number % 10;
		number /= 10;
		int c = number % 10;
		number /= 10;
		int b = number % 10;
		number /= 10;
		int a = number;
		
		int sum = a + b + c + d;
		String reversed = "" + d + c + b + a;
		String dabc = "" + d + a + b + c;
		String acbd = "" + a + c + b + d;
		System.out.printf("The sum is %s, reversed is %s, dabc - %s and acbd - %s",sum,reversed,dabc,acbd);
		
	}

}
