package lesson_05Loops;

import java.util.Scanner;

public class Ex_14_ConvertHexToDecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your hex: ");
		String hex = input.next();
		hex = hex.toUpperCase();
		StringBuilder reversedHex = new StringBuilder(hex);
		reversedHex = reversedHex.reverse();
		System.out.printf("Number %s in decimal is: %s",hex,convertToDecimal((reversedHex).toString()));
		
	}
	public static int convertToDecimal(String hex){
		int decimal = 0;
		char[] digits = hex.toCharArray();
		for (int i = 0; i < hex.length(); i++) {
			decimal += Math.pow(16, i) * convertHexChar(digits[i]);
		}
		
		return decimal;
	}
	public static int convertHexChar(char digit){
		int number = 0;
		switch (digit) {
		case '0':number = 0;break;
		case '1':number = 1;break;
		case '2':number = 2;break;
		case '3':number = 3;break;
		case '4':number = 4;break;
		case '5':number = 5;break;
		case '6':number = 6;break;
		case '7':number = 7;break;
		case '8':number = 8;break;
		case '9':number = 9;break;
		case 'A':number = 10;break;
		case 'B':number = 11;break;
		case 'C':number = 12;break;
		case 'D':number = 13;break;
		case 'E':number = 14;break;
		case 'F':number = 15;break;
		default:System.out.println("error");break;
		}
		
		return number;
	}

}
