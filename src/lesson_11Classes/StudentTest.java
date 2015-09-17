package lesson_11Classes;

public class StudentTest {
	
	private static Student firstStudent;
	private static Student secondStudent;
	private static Student thirdStudent;
	private static Student fourthStudent;

	public static void main(String[] args) {
		
//		Student firstStudent = new Student();
//		System.out.println(firstStudent.getFirstName());
		Student ivan = new Student("Ivan","Ivanov","Petrov");
		ivan.setPhoneNumber("0898457754");
		ivan.printStudentInfo();
		createStudents();
		firstStudent.printStudentInfo();
		secondStudent.printStudentInfo();
		thirdStudent.printStudentInfo();
		fourthStudent.printStudentInfo();
		

	}
	public static void createStudents(){
		firstStudent = new Student("Petar", "Georgiev", "Ivanov");
		secondStudent = new Student();
		thirdStudent = new Student("Geogrgi", "Ivanov", "Petrov", "georgi.ivanov@yahoo.com", "0895432987");
		fourthStudent = new Student();
	}

}
