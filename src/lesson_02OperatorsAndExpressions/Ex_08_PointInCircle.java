package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_08_PointInCircle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x of the point: ");
		double x = input.nextDouble();
		System.out.print("Enter y of the point: ");
		double y = input.nextDouble();
		
		double result = Math.sqrt((x * x) + (y * y));
		if (result < 5) {
			System.out.println("The point is in the circle!");
		}
		else {
			System.out.println("The point is out of the circle!");
		}
		
	}

}
