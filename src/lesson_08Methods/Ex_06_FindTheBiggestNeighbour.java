package lesson_08Methods;

import java.util.Scanner;

public class Ex_06_FindTheBiggestNeighbour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter lenght: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter arr[%s] = ",i);
			arr[i] = input.nextInt();
		}
		System.out.print("Enter position: ");
		int position = input.nextInt();
		int result = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			result = checkNeighbours(arr,i);
			if (result == 0) {
				break;
			}
		}
	}

	private static int checkNeighbours(int[] arr, int position) {
		if (arr[position - 1] < arr[position]
				&& arr[position] > arr[position + 1]) {
			System.out.printf("The ellement on position %s is bigger than his neighbours!", position);
			return 0;
		}
		else {
			System.out.println("-1");
			return -1;
		}
		

	}

}
