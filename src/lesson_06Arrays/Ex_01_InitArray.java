package lesson_06Arrays;

import java.lang.reflect.Array;

public class Ex_01_InitArray {

	public static void main(String[] args) {
		
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 5;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
