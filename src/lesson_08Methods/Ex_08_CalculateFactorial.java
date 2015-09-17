package lesson_08Methods;

import java.math.BigInteger;

public class Ex_08_CalculateFactorial {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%s! ==>>>> %s",i,findFactorial(i));
			System.out.println();
		}
	}

	private static BigInteger findFactorial(int i) {
		BigInteger factorial = BigInteger.valueOf(1);
		for (int j = 1; j <= i; j++) {
			factorial = factorial.multiply(BigInteger.valueOf(j));
		}
		return factorial;
	}

}
