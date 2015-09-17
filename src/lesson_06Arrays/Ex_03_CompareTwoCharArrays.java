package lesson_06Arrays;

import java.util.Scanner;

public class Ex_03_CompareTwoCharArrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first arr: ");
		String firstChars = input.next();
		char[] firstArr = firstChars.toCharArray();
		System.out.print("Enter your second arr: ");
		String secondChars = input.next();
		char[] secondArr = secondChars.toCharArray();
		int lenght = (firstArr.length > secondArr.length) ? secondArr.length : firstArr.length;
		boolean equals = true;
		for (int i = 0; i < lenght; i++) {
			if (firstArr[i] > secondArr[i]) {
				System.out.println("The first array is befor the second.");
				equals = false;
				break;
			}
			else if (secondArr[i] > firstArr[i]) {
				System.out.println("The second array is befor the first.");
				equals = false;
				break;
			}
		}
		if (equals) {
			System.out.println("The arrays are equals.");	
		}
	}
}
