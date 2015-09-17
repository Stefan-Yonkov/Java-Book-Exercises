package lesson_08Methods;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex_09_MultipleTasks {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Wellkome to our task manager! "
				+ "\n Press 1 if you want to reverse a number!"
				+ "\n Press 2 if you want to find the average in a line!"
				+ "\n Press 3 if you want to solve linear equation!");
		System.out.print("Enter: ");
		int n = input.nextInt();
		
		switch (n) {
		case 1:
			int number = -1;
			while (number < 0 && number < 10) {
				System.out
						.println("Please enter positive number greater than 9: ");
				number = input.nextInt();
				System.out.println("Your reversed number is "
						+ reverseNumber(number));
			}
			break;
		case 2:
			calculateAverage();
			break;
		case 3:
			calculateEquation();
			break;
		default:
			break;
		}
			
			
	}

	private static void calculateEquation() {
		double a = 0;
		while (a == 0) {
			System.out.print("Enter a : ");
			a = input.nextInt();
		}
		System.out.print("Enter b: ");
		double b = input.nextInt();
		double result = (b * -1)/ a;
		System.out.printf("x = %s", result);
	}

	private static void calculateAverage() {
		int n = 0;
		while (n <= 0) {
			System.out.print("Enter the lenght of the line: ");
			n = input.nextInt();
			int[] arr = new int[n];
			int average = 0;
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("Enter arr[%s] = ",i);
				average += arr[i] = input.nextInt();
			}
			System.out.printf("The average of your line is: %s",average/n);
		}
	}

	private static String reverseNumber(int number) {
		StringBuilder transformation = new StringBuilder();
		while (number > 0) {
			transformation.append(number % 10);
			number /= 10;
		}
		return transformation.toString();
	}

}
