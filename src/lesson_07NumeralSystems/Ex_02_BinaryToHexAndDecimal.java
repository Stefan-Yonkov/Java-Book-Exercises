package lesson_07NumeralSystems;

public class Ex_02_BinaryToHexAndDecimal {

	public static void main(String[] args) {
		String binary = "1111010110011110";
		char[] number = binary.toCharArray();
		int numberInDec = 0;
		StringBuilder numberInHex = new StringBuilder();
		int pow = 0;
		for (int i = number.length - 1; i >= 0; i--) {
			if (number[i] == '1') {
				numberInDec += Math.pow(2, pow);
			}
			pow++;
		}
		int test = numberInDec;
		while (test > 0) {
			int n = test % 16;
			if (n > 9) {
				numberInHex.append(addHex(n));
			}
			else {
				numberInHex.append(n);
			}
			test /= 16;
		}
		String hex = numberInHex.reverse().toString();
		System.out.printf("%s in Decimal is: %s and in Hexademical is: %s",binary,numberInDec,hex);
	}

	private static String addHex(int n) {
		String result = null;
		switch (n) {
		case 10:result = "A";break;
		case 11:result = "B";break;
		case 12:result = "C";break;
		case 13:result = "D";break;
		case 14:result = "E";break;
		case 15:result = "F";break;

		default:System.out.println("Error!!");break;
		}
		
		return result;
	}

}
