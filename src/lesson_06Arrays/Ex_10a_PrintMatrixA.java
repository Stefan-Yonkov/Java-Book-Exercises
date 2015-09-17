package lesson_06Arrays;

public class Ex_10a_PrintMatrixA {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		int count = 0;
		int number = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			count++;
			number = count;
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = number;
				number +=4;
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + "  ");
			}
			System.out.println();
		}
	}

}
