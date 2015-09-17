package lesson_04ConditionalStatements;

import java.util.Scanner;

public class Ex_05_QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a = ");
		double a = input.nextDouble();
		System.out.print("Enter b = ");
		double b = input.nextDouble();
		System.out.print("Enter c = ");
		double c = input.nextDouble();
		double x1;
		double x2;
		
		double descriminant = (b * b) - (4 * (a * c));
		if (descriminant > 0) {
			x1 = (- b + Math.sqrt(descriminant)) / (2 * a);
			x2 = (- b - Math.sqrt(descriminant)) / (2 * a);
			System.out.printf("The equation has two roots x1 = %s and x2 = %s",x1,x2);
		}
		else if (descriminant == 0) {
			x1 = -b / (2 * a);
			System.out.printf("The equation has one root x1 = %s ",x1);
		}
		else {
			System.out.println("The equation has no roots");

		}

	}

}
