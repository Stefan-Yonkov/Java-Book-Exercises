package lesson_06Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_15_QuickSort {
	
	private int[] array;
	private int length;
	
	public void sort(int[] inputArray){
		if (inputArray == null || inputArray.length == 0) {
			return;
		}
		this.array = inputArray;
		length = inputArray.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {
	
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[(lowerIndex + higherIndex)/ 2];
		while (i <= j) {
			
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumber(i, j);
				i++;
				j--;
			}
		}
		if (lowerIndex < j) {
			quickSort(lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}

	}

	private void exchangeNumber(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter lenght: ");
		int lenght = input.nextInt();
		int[] arr = new int[lenght];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%s] = ",i);
			arr[i] = input.nextInt();
		}
		Ex_15_QuickSort sorter = new Ex_15_QuickSort();
		sorter.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
