package lesson_04ConditionalStatements;

import java.util.Scanner;

public class Ex_09_NumbersInBulgarian2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		if (number < 20) {
			printFirstTwenty(number);
		}
		else if ((number >= 20) && (number < 100) ) {
			if (number % 10 == 0) {
				printTens(number / 10);
			}
			else {
				printTens(number / 10);
				System.out.print(" � ");
				printFirstTwenty(number % 10);
			}
		}
		else if (number > 99) {
			if (number % 100 == 0) {
				printHundreds(number / 100);
			}
			else if (number % 100 < 20) {
				printHundreds(number / 100);
				System.out.print(" � ");
				printFirstTwenty(number % 100);
			}
			else if ((number % 100 > 19) && ((number % 100) % 10 == 0)) {
				printHundreds(number / 100);
				System.out.print(" � ");
				printTens((number % 100) / 10);
			}
			else if ((number % 100 > 19) && ((number % 100) % 10 != 0)){
				printHundreds(number / 100);
				System.out.print(" ");
				printTens((number % 100) / 10);
				System.out.print(" � ");
				printFirstTwenty((number % 100) % 10);
			}
		}
		
		
	}
	public static void printTens(int number){
		switch (number) {
		case 2:System.out.print("��������");break;
		case 3:System.out.print("��������");break;
		case 4:System.out.print("�����������");break;
		case 5:System.out.print("��������");break;
		case 6:System.out.print("���������");break;
		case 7:System.out.print("����������");break;
		case 8:System.out.print("���������");break;
		case 9:System.out.print("����������");break;
		default:System.out.println("������!");break;
		}
	}
	public static void printHundreds(int number){
		switch (number) {
		case 1:System.out.print("���");break;
		case 2:System.out.print("������");break;
		case 3:System.out.print("������");break;
		case 4:System.out.print("������������");break;
		case 5:System.out.print("���������");break;
		case 6:System.out.print("��������");break;
		case 7:System.out.print("�����������");break;
		case 8:System.out.print("����������");break;
		case 9:System.out.print("�����������");break;
		default:System.out.println("������!");break;
		}
	}
	public static void printFirstTwenty(int number){
		switch (number) {
		case 1:System.out.println("����");break;
		case 2:System.out.println("���");break;
		case 3:System.out.println("���");break;
		case 4:System.out.println("������");break;
		case 5:System.out.println("���");break;
		case 6:System.out.println("����");break;
		case 7:System.out.println("�����");break;
		case 8:System.out.println("����");break;
		case 9:System.out.println("�����");break;
		case 10:System.out.println("�����");break;
		case 11:System.out.println("����������");break;
		case 12:System.out.println("����������");break;
		case 13:System.out.println("����������");break;
		case 14:System.out.println("�������������");break;
		case 15:System.out.println("����������");break;
		case 16:System.out.println("�����������");break;
		case 17:System.out.println("������������");break;
		case 18:System.out.println("�����������");break;
		case 19:System.out.println("������������");break;

		default:System.out.println("������");break;
		}
	}

}
