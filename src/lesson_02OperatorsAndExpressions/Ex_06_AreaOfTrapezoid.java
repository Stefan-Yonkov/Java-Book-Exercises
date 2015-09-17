package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_06_AreaOfTrapezoid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side A: ");
		double a = input.nextDouble();
		System.out.print("Enter side B: ");
		double b = input.nextDouble();
		System.out.print("Enter height: ");
		double h = input.nextDouble();
		
		double area = ((a + b) * h)/2;
		
		System.out.println("The area of the trapezoid is : " + area);
		
	}

}
