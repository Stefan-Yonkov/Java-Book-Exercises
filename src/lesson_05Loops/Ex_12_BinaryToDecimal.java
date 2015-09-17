package lesson_05Loops;

import java.util.Scanner;

public class Ex_12_BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your number in binary: ");
		String binary = input.next();
		StringBuilder reversed = new StringBuilder(binary);
		reversed = reversed.reverse();
		String reversedBinary = reversed.toString();
		System.out.printf("The number %s in decimal is: %s",binary,convertToDecimal(reversedBinary));
		
		
	}
	public static int convertToDecimal(String binary){
		char[] digits = binary.toCharArray();
		int decimal = 0;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == '1') {
				decimal += Math.pow(2, i);
			}
		}
		
		return decimal;
	}

}
