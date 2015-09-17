package lesson_05Loops;

import java.util.Scanner;

import javax.sound.midi.ControllerEventListener;

public class Ex_02_NumbersIndivisableBySevenAndFive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n= ");
		int n = input.nextInt();
		
		for (int i = 1; i < n; i++) {
			if ((i % 3 == 0) && (i % 7 == 0)) {
				continue;
			}
			System.out.print(i + " ");
			
		}
	}

}
