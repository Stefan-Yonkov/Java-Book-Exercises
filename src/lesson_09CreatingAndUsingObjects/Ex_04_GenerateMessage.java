package lesson_09CreatingAndUsingObjects;

import java.awt.Event;
import java.util.Random;

public class Ex_04_GenerateMessage {
	
	private static final String[] FRAZES = {"��������� � �������.", "���� � ��������� �������.", 
		"��������� ������� ���� �������.", "���� � ���-������� ������� �� ���� ���������."};
	private static final String[] EVENTS = {"���� �� �������� �����.", "����� �� �� �������.", "��� ������� ����.",
		"�� ���� �� ��������, �� ���� �� �������� ���������.", "�������� � ���. �� ��� ����� �������."};
	private static final String[] FIRSTNAME = {"�����", "����", "�����", "�����", "����"};
	private static final String[] SECONDNAME = {"�������", "�������", "������"};
	private static final String[] TOWNS = {"�����", "�������", "�����", "����", "������"};
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
