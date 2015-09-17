package lesson_07NumeralSystems;

import java.util.Scanner;

public class Ex_04_DecimalToHexademical {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int test = number;
		StringBuilder numberInHex = new StringBuilder();
		while (test > 0) {
			int n = test % 16;
			if (n > 9) {
				numberInHex.append(addHex(n));
			}
			else {
				numberInHex.append(n);
			}
			test /= 16;
		}
		String hex = numberInHex.reverse().toString();
		System.out.printf("%s =>>>>> %s",number,hex);
		
	}
	private static String addHex(int n) {
		String result = null;
		switch (n) {
		case 10:result = "A";break;
		case 11:result = "B";break;
		case 12:result = "C";break;
		case 13:result = "D";break;
		case 14:result = "E";break;
		case 15:result = "F";break;

		default:System.out.println("Error!!");break;
		}
		
		return result;
	}

}
