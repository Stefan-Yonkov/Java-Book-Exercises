package lesson_06Arrays;

public class Ex_10c_PrintMatrixC {

	private static int[][] matrix = new int[8][8];
	private static int counter = 1;
	private static int row = 0;
	private static int col = 0;
	private static int startPos = 0;

	public static void main(String[] args) {
		for (int i = matrix.length - 1; i >= 0; i--) {
			row = i;
			col = 0;
			startPos = i;
			moveDown(i);
		}
		for (int i = 1; i < matrix.length ; i++) {
			row = 0;
			col = i;
			startPos = i;
			moveDown(i);
		}
		printMatrix();

	}

	private static void printMatrix() {
		for (int j = 0; j < matrix.length; j++) {
			for (int j2 = 0; j2 < matrix[0].length; j2++) {
				System.out.printf("%4d",matrix[j][j2]);
			}
			System.out.println();
		}
		
	}

	private static void moveDown(int i) {
		for (int j2 = 0; j2 < matrix.length - startPos; j2++) {
			matrix[row][col] = counter++;
			row++;
			col++;
		}
	}

}
