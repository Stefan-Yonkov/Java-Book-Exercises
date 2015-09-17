package lesson_06Arrays;

public class Ex_10b_PrintMstrixB {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		int count = 1;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
					matrix[col][row] = count;
					count++;			
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
