package lesson_03ConsoleIO;

import java.util.Scanner;

public class Ex_03_CompanyInfo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter company name: ");
		String companyName = input.next();
		System.out.print("Enter company adress: ");
		String companyAdress = input.next();
		System.out.print("Enter company phone number: ");
		String companyPhoneNumber = input.next();
		System.out.print("Enter company fax: ");
		String companyFax = input.next();
		System.out.print("Enter manager's first name: ");
		String managerFirstName = input.next();
		System.out.print("Enter manager's last name: ");
		String managerLastName = input.next();
		System.out.print("Enter manager's phone number: ");
		String managerPhoneNumber = input.next();
		
		System.out.printf("The company %s is placed on: %s with phone number: %s"
				+ " and fax: %s. The manager is %s %s and his number is %s. ",companyName,companyAdress,
				companyPhoneNumber,companyFax,managerFirstName,managerLastName,managerPhoneNumber);
		
		
		
	}

}
