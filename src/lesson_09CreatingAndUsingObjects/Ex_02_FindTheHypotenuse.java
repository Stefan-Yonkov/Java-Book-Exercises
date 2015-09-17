package lesson_09CreatingAndUsingObjects;

import java.util.Scanner;

public class Ex_02_FindTheHypotenuse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first side: ");
		double sideA = input.nextDouble();
		System.out.print("Enter the second side: ");
		double sideB = input.nextDouble();
		double hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
		System.out.printf("The hypotenuse of the triangle is: %d",hypotenuse);
		
	}

}
