package lesson_06Arrays;

public class Ex_16_PrintPrimeNumbers {

	public static void main(String[] args) {
		boolean prime = true;
		for (int i = 3; i <= 10000000; i++) {
			prime = true;
			int max = (int) Math.sqrt(i);
			for (int j = 2; j <= max; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.println(i);
			}
		}

	}

}
