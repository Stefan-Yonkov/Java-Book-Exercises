package lesson_07NumeralSystems;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_07_BinaryToHex {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your binary number: ");
		String binaryNumber = input.next();
		char[] binary = binaryNumber.toCharArray();
		boolean correctLenght = true;
		char[] temp = null;
		String result;
		StringBuilder hexNumber = new StringBuilder();
		if (binary.length % 4 != 0) {
			correctLenght = false;
			int difference = 4 - binary.length % 4;
			temp = new char[binary.length + difference];
			for (int i = 0; i < difference; i++) {
				temp[i] = '0';
			}
			System.arraycopy(binary, 0, temp, difference, binary.length);
		}
		char[] binaryArr;
		if (correctLenght) {
			binaryArr = Arrays.copyOf(binary, binary.length);
		}
		else {
			binaryArr = Arrays.copyOf(temp, temp.length);
		}
		
		
		for (int i = 0; i <= binaryArr.length - 4; i+=4) {
			StringBuilder tempBinary = new StringBuilder();
			for (int j = i; j < i + 4; j++) {
				tempBinary.append(binaryArr[j]);
			}
			hexNumber.append(convertToHex(tempBinary));
		}
		result = hexNumber.toString();
		
		System.out.printf("%s ===>>>> %s",binaryNumber,result);
	}

	private static Object convertToHex(StringBuilder tempBinary) {
		String result = null;
		String key = tempBinary.toString();
		switch (key) {
		case "0000":result = "0";break;
		case "0001":result = "1";break;
		case "0010":result = "2";break;
		case "0011":result = "3";break;
		case "0100":result = "4";break;
		case "0101":result = "5";break;
		case "0110":result = "6";break;
		case "0111":result = "7";break;
		case "1000":result = "8";break;
		case "1001":result = "9";break;
		case "1010":result = "A";break;
		case "1011":result = "B";break;
		case "1100":result = "C";break;
		case "1101":result = "D";break;
		case "1110":result = "E";break;
		case "1111":result = "F";break;
		
		default:System.out.println("Error!!");break;
		}
		return result;
	}
}
