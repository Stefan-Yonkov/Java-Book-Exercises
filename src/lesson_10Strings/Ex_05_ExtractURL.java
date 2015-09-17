package lesson_10Strings;

import java.util.Scanner;

public class Ex_05_ExtractURL {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the adress: ");
		String adress = input.nextLine();
		int doubleSlashIndex = adress.indexOf("//");
		String protocol = adress.substring(0, adress.indexOf(':'));
		String server = adress.substring(doubleSlashIndex + 2, adress.indexOf('/', doubleSlashIndex + 2));
		String resource = adress.substring(adress.indexOf('/',doubleSlashIndex + 2));
		System.out.printf("[protocol] = \"%s\" \n"
						+ "[server] = \"%s\" \n"
						+ "[resource] = \"%s\"",protocol,server,resource);
	}

}
