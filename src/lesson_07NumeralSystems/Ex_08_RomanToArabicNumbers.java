package lesson_07NumeralSystems;

import java.util.Scanner;

public class Ex_08_RomanToArabicNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the roman number: ");
		String number = input.next().toUpperCase();
		char[] romanNumber = number.toCharArray();
		int result = 0;
		for (int i = 0; i < romanNumber.length; i++) {
			int currentNumber = convertToArab(romanNumber[i]);
			if (i == romanNumber.length - 1) {
				result += currentNumber;
			}
			else {
				if (currentNumber < convertToArab(romanNumber[i+1])) {
					result -= currentNumber;
				}
				else {
					result += currentNumber;
				}
			}
		}
		System.out.printf("%s ====>>>> %s",number,result);
	}

	private static int convertToArab(char c) {
		int result = 0;
		switch (c) {
		case 'I':result = 1;break;
		case 'V':result = 5;break;
		case 'X':result = 10;break;
		case 'L':result = 50;break;
		case 'C':result = 100;break;
		case 'D':result = 500;break;
		case 'M':result = 1000;break;
	
		default:System.out.println("Error!!!");break;
		}
		return result;
	}

}
