package lesson_06Arrays;

import java.util.Scanner;

public class Ex_10d_PrintMatrixD {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the lenght of the array: ");
		int n = input.nextInt();
		int counter = 1;
		int max = n * n;
		int [][] matrix = new int[n][n];
		goDown(counter, 0, 0, matrix, max);

	}
	public static void goDown(int counter, int n, int m, int[][] matrix, int max){
		int positionN = 0;
		for (int i = n; i < matrix.length - m; i++) {
			if (matrix[i][m] != 0) {
				break;
			}
			else{
				matrix[i][m] = counter++;
				positionN = i;
			}
		}
		goRight(counter, positionN, ++m, matrix, max);
		
	}
	public static void goRight(int counter, int n, int m, int[][] matrix, int max){
		int positionM = 0;
		for (int i = m; i < matrix[0].length; i++) {
			if (matrix[n][i] != 0) {
				break;
			}
			else{
				matrix[n][i] = counter++;
				positionM = i;	
			}
		}
		goUp(counter, --n, positionM, matrix, max);
	}
	public static void goUp(int counter, int n, int m, int[][] matrix, int max){
		int positionN = 0;
		for (int i = n; i >= 0; i--) {
			if (matrix[i][m] != 0) {
				break;
			}
			else{
				matrix[i][m] = counter++;
				positionN = i;		
			}
		}
		goLeft(counter, positionN, --m, matrix, max);
	}
	public static void goLeft(int counter, int n, int m,int[][] matrix, int max){
		int positionM = 0;
		for (int i = m; i >= 0; i--) {
			if(matrix[n][i] != 0){
				break;
			}
			else {
				matrix[n][i] = counter++;
				positionM = i;
			}
		}
		if (counter > max) {
			printMatrix(matrix);
		}
		else{
			goDown(counter, ++n, positionM, matrix,max);
		}
	}
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%4d",matrix[i][j]);
			}
			System.out.println();
		}
	}

}
