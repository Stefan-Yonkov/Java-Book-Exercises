package lesson_06Arrays;

import java.util.Scanner;

public class Ex_08_MostCommonElement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the arr: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter arr[%s] = ",i);
			arr[i] = input.nextInt();
		}
		int element = 0;
		int bestElement = 0;
		int count = 1;
		int maxCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			element = arr[i];
			count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] == element) {
				count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				bestElement = element;
			}
		}
		System.out.printf("%s - %s times.",bestElement,maxCount);
		//4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3
	}

}
