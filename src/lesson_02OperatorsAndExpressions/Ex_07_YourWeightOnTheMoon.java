package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_07_YourWeightOnTheMoon {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your weight in kg: ");
		double weightOnEarth = input.nextDouble();
		double weightOnMoon = weightOnEarth * 0.17;
		System.out.println("Your weight on moon is " + weightOnMoon);
	}

}
