package lesson_08Methods;

import java.util.Scanner;

public class Ex_05_CheckTheNeighbors {

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
		checkNeighbours(arr,position);
	}

	private static void checkNeighbours(int[] arr, int position) {
		if (position == 0) {
			if (arr[position] > arr[position + 1]) {
				System.out.println("The ellement is bigger!");
			}
			else {
				System.out.println("The ellement is smaller!");
			}
		}
		else if (position == arr.length - 1) {
			if (arr[position - 1] > arr[position]) {
				System.out.println("The ellement is smaller!");
			}
			else {
				System.out.println("The ellement is bigger!");
			}
		}
		else {
			if (arr[position - 1] < arr[position] && arr[position] > arr[position + 1]) {
				System.out.println("The ellement is bigger!");
			}
			else if (arr[position - 1] > arr[position] && arr[position] < arr[position + 1]) {
				System.out.println("The ellement is smaller!");
			}
		}
		
	}

}
