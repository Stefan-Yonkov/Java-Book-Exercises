package lesson_06Arrays;

import java.util.Scanner;

public class Ex_05_LongestIncreasingRow {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the arr: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter arr[%s] = ",i);
			arr[i] = input.nextInt();
		}
		
		int element = Integer.MIN_VALUE;
		int currentLenght = 0;
		int maxLenght = Integer.MIN_VALUE;
		int lastElement = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > element) {
				element = arr[i];
				currentLenght++;
			}
			else {
				element = arr[i];
				currentLenght = 1;
			}
			if (currentLenght > maxLenght) {
				maxLenght = currentLenght;
				lastElement = i;
			}
		}
		int start = (lastElement - maxLenght) + 1;
		System.out.println("The lenght of the longest increasing row is: " + maxLenght);
		for (int i = start; i < start + maxLenght; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
