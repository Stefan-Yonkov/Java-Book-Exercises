package lesson_06Arrays;

import java.util.Scanner;

public class Ex_09_FindTheSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the arr: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter arr[%s] = ",i);
			arr[i] = input.nextInt();
		}
		System.out.print("Enter the sum: ");
		int bestSum = input.nextInt();
		int start = 0;
		int sum = 0;
		boolean foundSum = false;

		for (int i = 0; i < arr.length - 2; i++) {
			sum = arr[i];
			for (int j = i + 1; j < i + 3; j++) {
				sum += arr[j];
				if (sum == bestSum) {
					foundSum = true;
					System.out.printf("Sum %s found!",bestSum);
					System.out.println();
					for (int j2 = i; j2 <= j; j2++) {
						System.out.print(arr[j2] + " ");
					}
					System.out.println();
				}
			}
		}
		if (!foundSum) {
			System.out.println("No sum found!");
		}
	}

}
