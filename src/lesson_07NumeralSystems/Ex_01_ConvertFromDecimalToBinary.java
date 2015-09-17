package lesson_07NumeralSystems;

import java.util.Scanner;

public class Ex_01_ConvertFromDecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number in decimal: ");
		int decimalNumber = input.nextInt();
		String binary = convertToBinary(decimalNumber);
		System.out.printf("%s in binary is %s",decimalNumber,binary);

	}

	private static String convertToBinary(int decimalNumber) {
		StringBuilder binary = new StringBuilder();
		String result = "";
		int number = decimalNumber;
		while (number > 0) {
			if (number % 2 == 0) {
				binary.append("0");
			}
			else {
				binary.append("1");
			}
			number /= 2;
		}
		binary = binary.reverse();
		return result = binary.toString();
	}

}
