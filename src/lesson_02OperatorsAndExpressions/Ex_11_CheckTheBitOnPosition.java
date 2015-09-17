package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_11_CheckTheBitOnPosition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		System.out.print("Enter the position of the bit: ");
		int position = input.nextInt();
		
		int mask = 1;
		
		mask = mask << position;
		mask = mask & number;
		mask = mask >> position;
		
		System.out.printf("The bit on the %s position is %s",position,mask);
	}

}
