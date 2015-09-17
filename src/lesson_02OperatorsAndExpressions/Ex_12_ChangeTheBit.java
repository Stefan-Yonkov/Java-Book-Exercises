package lesson_02OperatorsAndExpressions;

import java.util.Scanner;

public class Ex_12_ChangeTheBit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		System.out.print("Enter the position of the bit: ");
		int position = input.nextInt();
		System.out.print("Enter the value of the bit: ");
		int value = input.nextInt();
		int result;
		
		int mask = 1;
		mask = mask << position;
		result = mask ^ number;
		System.out.printf("The old number is %s and the new one is %s",number,result);

	}

}
