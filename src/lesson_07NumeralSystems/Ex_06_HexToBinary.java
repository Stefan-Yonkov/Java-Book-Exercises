package lesson_07NumeralSystems;

import java.util.Scanner;

public class Ex_06_HexToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your hexademical number: ");
		String hexNumber = input.next();
		char[] hexChars = hexNumber.toCharArray();
		StringBuilder binary = new StringBuilder();
		for (int i = 0; i < hexChars.length; i++) {
			binary.append(convertToBinary(hexChars[i]));
		}
		String binaryResult = binary.toString();
		System.out.printf("%s ==>>>> %s",hexNumber,binaryResult);
	}

	private static Object convertToBinary(char i) {
		String result = null;
		switch (i) {
		case '0':result = "0000";break;
		case '1':result = "0001";break;
		case '2':result = "0010";break;
		case '3':result = "0011";break;
		case '4':result = "0100";break;
		case '5':result = "0101";break;
		case '6':result = "0110";break;
		case '7':result = "0111";break;
		case '8':result = "1000";break;
		case '9':result = "1001";break;
		case 'A':result = "1010";break;
		case 'B':result = "1011";break;
		case 'C':result = "1100";break;
		case 'D':result = "1101";break;
		case 'E':result = "1110";break;
		case 'F':result = "1111";break;
		
		default:System.out.println("Error!!");break;
		}
		return result;
	}

}
