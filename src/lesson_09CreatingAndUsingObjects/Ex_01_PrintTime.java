package lesson_09CreatingAndUsingObjects;

public class Ex_01_PrintTime {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		long seconds = time / 1000;
		System.out.println(seconds);
		int days = (int) (seconds / 86400);
		seconds = seconds % 86400;
		int hours = (int) (seconds / 3600);
		seconds = seconds % 3600;
		int minutes = (int) (seconds / 60);
		seconds = seconds % 60;
		System.out.printf("There are exactly %s Days, %s Hours, %s Minutes and %s Seconds"
				+ "from 01.01.1970 till now.",days,hours,minutes,seconds);
	}

}
