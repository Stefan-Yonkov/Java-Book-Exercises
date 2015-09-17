package lesson_07NumeralSystems;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class Ex_09_ArabicToRomanNumbers {
	public static StringBuilder result = new StringBuilder();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.print("Enter your number: ");
		number = input.nextInt();
		convertToRoman(number/1000,'M','D','C');
		convertToRoman(number/100 % 10, 'C', 'D', 'M');
		convertToRoman(number/10 % 10, 'X', 'L', 'C');
		convertToRoman(number % 10, 'I', 'V', 'X');
		System.out.println(result.toString());
	}
	private static void convertToRoman(int i, char a, char b, char c) {
		
		switch (i) {
		case 0 :break;
		case 1 :result.append(a);break;
		case 2 :result.append(a).append(a);break;
		case 3 :result.append(a).append(a).append(a);break;
		case 4 :result.append(a).append(b);break;
		case 5 :result.append(b);break;
		case 6 :result.append(b).append(a);break;
		case 7 :result.append(b).append(a).append(a);break;
		case 8 :result.append(b).append(a).append(a).append(a);break;
		case 9 :result.append(a).append(c);break;
		default:System.out.println("Error!!!");break;
		}
		
	}

}
