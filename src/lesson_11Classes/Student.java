package lesson_11Classes;

public class Student {
	
	private String firstName;
	private String secondName;
	private String thirdName;
	private enum specialty {MANAGEMENT, ECONOMICS, IT, PHILOSOPHY,};
	private enum university {UNSS, SOFIAN_UNIVERSITY, UEVARNA, TU};
	private String eMail;
	private String phoneNumber;
	public static int studentCount = 0;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public Student(String firstName, String secondName, String thirdName) {
		this();
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		
	}
	
	public Student(String firstName, String secondName, String thirdName,
			String eMail, String phoneNumber) {
		this(firstName,secondName,thirdName);
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
	}

	public Student() {
		this.firstName = null;
		this.secondName = null;
		this.thirdName = null;
		this.eMail = null;
		this.phoneNumber = null;
		studentCount++;
	}
	
	public void printStudentInfo(){
		System.out.printf("First name: %s \n"
						+ "Second name: %s \n"
						+ "Third name: %s \n"
						+ "E-mail: %s \n"
						+ "Phone number: %s ",firstName,secondName,thirdName,eMail,phoneNumber);
		System.out.println();
	}
	

}
