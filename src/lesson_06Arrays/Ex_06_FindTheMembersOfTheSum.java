package lesson_06Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_06_FindTheMembersOfTheSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the arr: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter arr[%s] = ",i);
			arr[i] = input.nextInt();
		}
		System.out.print("Enter number of member: ");
		int k = input.nextInt();
		Arrays.sort(arr);
		int sum = 0;
		System.out.print("Elements: ");
		for (int i = arr.length -1 ; i >= arr.length - k; i--) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("And sum = " + sum);

	}

}
