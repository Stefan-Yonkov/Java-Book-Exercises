package lesson_05Loops;

import java.util.Scanner;

public class Ex_11_DecimalToBinary {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int decimal = input.nextInt();
		System.out.printf("The number %s in binary is %s.",decimal,convertToBinary(decimal));
		
		
	}
	public static String convertToBinary(int number){
		StringBuilder binary = new StringBuilder();
		while (number > 0) {
			if (number % 2 == 0) {
				binary.append('0');
			}
			else {
				binary.append('1');
			}
			number /= 2;
		}
		binary = binary.reverse();
		String binaryNumber = binary.toString();
		return binaryNumber;
	}

}
