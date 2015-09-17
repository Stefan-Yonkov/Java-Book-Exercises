package lesson_09CreatingAndUsingObjects;

import java.awt.Event;
import java.util.Random;

public class Ex_04_GenerateMessage {
	
	private static final String[] FRAZES = {"Продуктът е отличен.", "Това е страхотен продукт.", 
		"Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория."};
	private static final String[] EVENTS = {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.",
		"Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
	private static final String[] FIRSTNAME = {"Диана", "Петя", "Стела", "Елена", "Катя"};
	private static final String[] SECONDNAME = {"Иванова", "Петрова", "Кирова"};
	private static final String[] TOWNS = {"София", "Пловдив", "Варна", "Русе", "Бургас"};
	private static StringBuilder message = new StringBuilder();
	private static Random rand = new Random();

	public static void main(String[] args) {
		generateFraze();
		generateEvent();
		generateFirstname();
		generateSecondName();
		generateTown();
		System.out.println(message.toString());
	}

	private static void generateTown() {
		message.append(TOWNS[rand.nextInt(TOWNS.length)]);
		message.append(".");

	}

	private static void generateSecondName() {
		message.append(" ");
		message.append(SECONDNAME[rand.nextInt(SECONDNAME.length)]);
		message.append(", ");
	}

	private static void generateFirstname() {
		message.append("\n");
		message.append(FIRSTNAME[rand.nextInt(FIRSTNAME.length)]);
		
	}

	private static void generateEvent() {
		message.append(" ");
		message.append(EVENTS[rand.nextInt(EVENTS.length)]);
	}

	private static void generateFraze() {
		message.append(FRAZES[rand.nextInt(FRAZES.length)]);
	}

}
