package lesson_08Methods;

import java.util.Scanner;

public class Ex_03_PrintLastNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		printNumber(number % 10);
	}

	private static void printNumber(int i) {
		switch (i) {
		case 1:System.out.println("One");break;
		case 2:System.out.println("Two");break;
		case 3:System.out.println("Three");break;
		case 4:System.out.println("Four");break;
		case 5:System.out.println("Five");break;
		case 6:System.out.println("Six");break;
		case 7:System.out.println("Seven");break;
		case 8:System.out.println("Eight");break;
		case 9:System.out.println("Nine");break;
		
		default:System.out.println("Error!");break;
		}
		
	}

}
