package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_05_PerimeterAndAreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side: ");
		double side = input.nextDouble();
		System.out.print("Enter height: ");
		double height = input.nextDouble();
		
		double perimeter = (2*side) + (2*height);
		double area = side * height;
		
		System.out.printf("The perimeter is %s and the area is %s",perimeter,area);
	}
	
}
