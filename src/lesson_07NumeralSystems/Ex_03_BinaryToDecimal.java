package lesson_07NumeralSystems;

import java.util.Scanner;

public class Ex_03_BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your bynary number: ");
		String binary = input.next();
		char[] chars = binary.toCharArray();
		int pow = 0;
		int decimal = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			if (chars[i] == '1') {
				decimal += Math.pow(2, pow);
			}
			pow++;
		}
		System.out.printf("%s =>>>>> %s",binary,decimal);

	}

}
