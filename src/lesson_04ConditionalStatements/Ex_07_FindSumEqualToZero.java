package lesson_04ConditionalStatements;

import java.util.Scanner;

public class Ex_07_FindSumEqualToZero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a = ");
		int a = input.nextInt();
		System.out.print("Enter b = ");
		int b = input.nextInt();
		System.out.print("Enter c = ");
		int c = input.nextInt();
		boolean hasSubset = false;
		
		if (a + b == 0) {
			System.out.printf("Subset of %s + %s = 0",a,b);
			hasSubset = true;
		}
		if (a + c == 0) {
			System.out.printf("Subset of %s + %s = 0",a,c);
			hasSubset = true;

		}
		if (c + b == 0) {
			System.out.printf("Subset of %s + %s = 0",c,b);
			hasSubset = true;

		}
		if (a + b + c == 0) {
			System.out.printf("Subset of %s + %s + %s = 0",a,b,c);
			hasSubset = true;

		}
		if (!hasSubset) {
			System.out.println("No subset equal to zero.");
		}
	}

}
