package lesson_03ConsoleIO;

import java.util.Scanner;

public class Ex_02_ParameterAndAreaOfCircle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter r: ");
		double r = input.nextDouble();
		
		double perimeter = 2 * Math.PI * r;
		double area = Math.PI * (r * r);
		
		System.out.printf("The area is %s and the perimeter is %s",area,perimeter);
		
	}

}
