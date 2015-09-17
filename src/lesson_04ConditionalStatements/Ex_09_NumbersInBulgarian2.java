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
				System.out.print(" и ");
				printFirstTwenty(number % 10);
			}
		}
		else if (number > 99) {
			if (number % 100 == 0) {
				printHundreds(number / 100);
			}
			else if (number % 100 < 20) {
				printHundreds(number / 100);
				System.out.print(" и ");
				printFirstTwenty(number % 100);
			}
			else if ((number % 100 > 19) && ((number % 100) % 10 == 0)) {
				printHundreds(number / 100);
				System.out.print(" и ");
				printTens((number % 100) / 10);
			}
			else if ((number % 100 > 19) && ((number % 100) % 10 != 0)){
				printHundreds(number / 100);
				System.out.print(" ");
				printTens((number % 100) / 10);
				System.out.print(" и ");
				printFirstTwenty((number % 100) % 10);
			}
		}
		
		
	}
	public static void printTens(int number){
		switch (number) {
		case 2:System.out.print("Двадесет");break;
		case 3:System.out.print("Тридесет");break;
		case 4:System.out.print("Четиредесет");break;
		case 5:System.out.print("Петдесет");break;
		case 6:System.out.print("Шестдесет");break;
		case 7:System.out.print("Седемдесет");break;
		case 8:System.out.print("Осемдесет");break;
		case 9:System.out.print("Деветдесет");break;
		default:System.out.println("Грешка!");break;
		}
	}
	public static void printHundreds(int number){
		switch (number) {
		case 1:System.out.print("Сто");break;
		case 2:System.out.print("Двеста");break;
		case 3:System.out.print("Триста");break;
		case 4:System.out.print("Четиристотин");break;
		case 5:System.out.print("Петстотин");break;
		case 6:System.out.print("Шестотин");break;
		case 7:System.out.print("Седемстотин");break;
		case 8:System.out.print("Осемстотин");break;
		case 9:System.out.print("Деветстотин");break;
		default:System.out.println("Грешка!");break;
		}
	}
	public static void printFirstTwenty(int number){
		switch (number) {
		case 1:System.out.println("Едно");break;
		case 2:System.out.println("Две");break;
		case 3:System.out.println("Три");break;
		case 4:System.out.println("Четири");break;
		case 5:System.out.println("Пет");break;
		case 6:System.out.println("Шест");break;
		case 7:System.out.println("Седем");break;
		case 8:System.out.println("Осем");break;
		case 9:System.out.println("Девет");break;
		case 10:System.out.println("Десет");break;
		case 11:System.out.println("Единадесет");break;
		case 12:System.out.println("Дванадесет");break;
		case 13:System.out.println("Тринадесет");break;
		case 14:System.out.println("Четиринадесет");break;
		case 15:System.out.println("Петнадесет");break;
		case 16:System.out.println("Шестнадесет");break;
		case 17:System.out.println("Седемнадесет");break;
		case 18:System.out.println("Осемнадесет");break;
		case 19:System.out.println("Деветнадесет");break;

		default:System.out.println("Грешка");break;
		}
	}

}
