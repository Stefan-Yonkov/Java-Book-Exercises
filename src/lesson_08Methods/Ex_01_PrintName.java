package lesson_08Methods;

import java.util.Scanner;

public class Ex_01_PrintName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();
		printName(name);
	}

	private static void printName(String name) {
		System.out.printf("Hello %s!",name);
		
	}

}
