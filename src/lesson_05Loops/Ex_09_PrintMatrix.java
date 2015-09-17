package lesson_05Loops;

import java.util.Scanner;

public class Ex_09_PrintMatrix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter n: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n + i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
