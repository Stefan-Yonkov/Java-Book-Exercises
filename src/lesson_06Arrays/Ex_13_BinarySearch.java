package lesson_06Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_13_BinarySearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the arr: ");
		int lenght = input.nextInt();
		int[] arr = new int[lenght];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter arr[%d] = ",i);
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter the element: ");
		int element = input.nextInt();
		binarySearch(arr,element,0,lenght);
	}

	private static void binarySearch(int[] arr, int element, int min, int max) {
		while (max >= min) {
			int midElement = findMid(min,max);
			if (arr[midElement] == element) {
				System.out.printf("Element found at: arr[%s]",midElement);
				break;
			}
			else if (element > arr[midElement]) {
				min = midElement + 1;
			}
			else if (element < arr[midElement]) {
				max = midElement - 1;
			}
			else {
				System.out.println("Element not found!");
			}
		}
		
	}

	private static int findMid(int min, int max) {
		return (min + max) / 2;
	}

}
