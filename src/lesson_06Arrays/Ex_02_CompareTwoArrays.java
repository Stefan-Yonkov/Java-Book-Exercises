package lesson_06Arrays;

import java.util.Scanner;

public class Ex_02_CompareTwoArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the arrays: ");
		int lenght = input.nextInt();
		int[] firstArr = new int[lenght];
		int[] secArr = new int[lenght];
		boolean same = true;
		for (int i = 0; i < lenght; i++) {
			System.out.printf("FirstArr[%s] = ",i);
			firstArr[i] = input.nextInt();
		}
		for (int i = 0; i < lenght; i++) {
			System.out.printf("SecondArr[%s] = ",i);
			secArr[i] = input.nextInt();
			if (firstArr[i] != secArr[i]) {
				same = false;
			}
		}
		if (same) {
			System.out.println("The arrays are same!");
		}
		else {
			System.out.println("The arrays are different!");
		}
	}

}
