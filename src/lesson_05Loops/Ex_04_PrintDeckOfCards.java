package lesson_05Loops;

public class Ex_04_PrintDeckOfCards {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= 14; j++) {
				switch (j) {
				case 2:System.out.print("Two of ");break;
				case 3:System.out.print("Three of ");break;
				case 4:System.out.print("Four of ");break;
				case 5:System.out.print("Five of ");break;
				case 6:System.out.print("Six of ");break;
				case 7:System.out.print("Seven of ");break;
				case 8:System.out.print("Eight of ");break;
				case 9:System.out.print("Nine of ");break;
				case 10:System.out.print("Ten of ");break;
				case 11:System.out.print("Jack of ");break;
				case 12:System.out.print("Queen of ");break;
				case 13:System.out.print("King of ");break;
				case 14:System.out.print("Ace ");break;
				default:System.out.println("Error");break;
				}
				switch (i) {
				case 1:System.out.println("Spades");break;
				case 2:System.out.println("Clubs");break;
				case 3:System.out.println("Hearts");break;
				case 4:System.out.println("Diamonds");break;
				default:System.out.println("Error");break;
				}
			}
		}
	}

}
