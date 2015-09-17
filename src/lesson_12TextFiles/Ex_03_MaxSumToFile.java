package lesson_12TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex_03_MaxSumToFile {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("matrix.txt");
		File result = new File("maxSum.txt");
		Scanner input = new Scanner(file);
		int n = input.nextInt();
		int[][] matrix = new int[n][n];
		fillMatrix(matrix, input);
		int maxSum = findMaxSum(matrix);
		PrintStream write = new PrintStream(result);
		write.println(maxSum);
		input.close();
		write.close();
		
	}

	private static int findMaxSum(int[][] matrix) {
		int maxSum = 0;
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[0].length - 1; j++) {
				int sum = findMax(i,j,matrix);
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}

	private static int findMax(int i, int j, int[][] matrix) {
		int sum = 0;
		for (int k = i; k < 2 + i; k++) {
			for (int l = j; l < 2 + j; l++) {
				sum += matrix[k][l];
			}
		}
		return sum;
	}

	private static void fillMatrix(int[][] matrix, Scanner input) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = input.nextInt();
			}
			if (input.hasNextLine()) {
				input.nextLine();				
			}
		}
		
	}

}
