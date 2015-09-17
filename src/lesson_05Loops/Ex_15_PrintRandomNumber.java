package lesson_05Loops;

import java.util.Random;
import java.util.Scanner;

public class Ex_15_PrintRandomNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		Random rand = new Random();
		System.out.printf("Random number between %s and %s: %s",0,number,rand.nextInt(number + 1));
	}

}
