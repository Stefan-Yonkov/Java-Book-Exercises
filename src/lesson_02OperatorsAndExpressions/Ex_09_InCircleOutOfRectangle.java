package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_09_InCircleOutOfRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x of the point: ");
		double x = input.nextDouble();
		System.out.print("Enter y of the point: ");
		double y = input.nextDouble();
		
		double resultInCircle = Math.sqrt((x * x) + (y * y));
		boolean inCircle = resultInCircle < 5;
		boolean outOfRectangle = false;
		
		if (x < -1 || x > 5 && y < -1 || y > 5) {
			outOfRectangle = true;
		}
		
		if (inCircle && outOfRectangle) {
			 System.out.println("The point is in the circle and out of the rectangle.");
		}

	}

}
