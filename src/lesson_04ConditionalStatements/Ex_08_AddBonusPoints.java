package lesson_04ConditionalStatements;

import java.util.Scanner;

public class Ex_08_AddBonusPoints {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.printf("Enter points(1-9): ");
		int points = input.nextInt();
		
		switch (points) {
		case 1:
		case 2:
		case 3:points *= 10;break;
		case 4:
		case 5:
		case 6:points *= 100;break;
		case 7:
		case 8:
		case 9:points *= 1000;break;
		default:System.out.println("Error!");break;
		}
		System.out.printf("Points after bonus: %s.",points);
	}

}
