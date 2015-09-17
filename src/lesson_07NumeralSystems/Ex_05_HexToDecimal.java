package lesson_07NumeralSystems;

import java.util.Scanner;

public class Ex_05_HexToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Hexademical number: ");
		String hex = input.next();
		char[] hexChars = hex.toCharArray();
		int decimal = 0;
		int pow = 0;
		for (int i = hexChars.length - 1; i >= 0; i--) {
			int n = convertChar(hexChars[i]);
			decimal += Math.pow(16, pow) * n;
			pow++;	
		}
		System.out.printf("%s ==>>>>> %s",hex,decimal);
	}

	private static int convertChar(char c) {
		int result = 0;
		switch (c) {
		case '1':result = 1;break;
		case '2':result = 2;break;
		case '3':result = 3;break;
		case '4':result = 4;break;
		case '5':result = 5;break;
		case '6':result = 6;break;
		case '7':result = 7;break;
		case '8':result = 8;break;
		case '9':result = 9;break;
		case 'A':result = 10;break;
		case 'B':result = 11;break;
		case 'C':result = 12;break;
		case 'D':result = 13;break;
		case 'E':result = 14;break;
		case 'F':result = 15;break;
		

		default:System.out.println("Error !!!");break;
		}
		return result;
	}

}
