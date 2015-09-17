package lesson_06Arrays;

import java.util.Scanner;

public class Ex_11_FindMaxSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the matrix: ");
		int n = input.nextInt();
		System.out.print("Enter submatrix size: ");
		int m = input.nextInt();
		int[][] matrix = new int[n][n];
		int maxSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("Enter matrix[%s][%s] = ",i,j);
				matrix[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length - m; i++) {
			for (int j = 0; j < matrix[0].length - m; j++) {
				int sum = findMax(i,j,m, matrix);
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.println(maxSum);
	}

	private static int findMax(int i, int j, int m, int[][] matrix) {
		int sum = 0;
		for (int k = i; k <= m + i; k++) {
			for (int l = j; l <= m + j; l++) {
				sum += matrix[k][l];
			}
		}
		return sum;
	}

}
