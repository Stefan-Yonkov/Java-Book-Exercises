package lesson_06Arrays;

import java.util.Scanner;

public class Ex_04_FindTheMostIterativElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the arr: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter arr[%s] = ",i);
			arr[i] = input.nextInt();
		}
		int mostIterative = Integer.MIN_VALUE;
		int mostIteration = Integer.MIN_VALUE;
		int element = Integer.MIN_VALUE;
		int iteration = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (element == arr[i]) {
				iteration++;
			}
			else {
				element = arr[i];
				iteration = 1;
			}
			if (iteration > mostIteration) {
				mostIterative = element;
				mostIteration = iteration;
			}
		}
		System.out.printf("The most iterative element is: %s with %s iterations.",mostIterative,mostIteration);

	}

}
