package lesson_08Methods;

import java.util.Scanner;

public class Ex_02_GetMaxNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		System.out.print("Enter fthird number: ");
		int c = input.nextInt();
		int max = getMax(getMax(a,b), c);
		System.out.println("The bigges number is: " + max);
		
	}
	private static int getMax(int a, int b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}

}
