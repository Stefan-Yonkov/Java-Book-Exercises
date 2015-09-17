package lesson_11Classes;

public class GSMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSM sony = new GSM("Xperia", "Sony", "980", "Pesho");
		sony.printInfo();
		System.out.println();
		sony.getNokiaInfo();
		
		GSM nokia = new GSM("Lumia", "Nokia", "870", "Ivan");
		GSM motorola = new GSM("Razor", "Motorola", "480", "Asen");
		GSM samsung = new GSM("S6", "Samsung", "990", "Andrei");
		
		Call first = new Call();
		String asd = "";
		for (int i = 0; i < 1000; i++) {
			asd += i;
		}
		first.endCall();
		Call second = new Call();
		for (int i = 0; i < 10000; i++) {
			asd += i;
		}
		second.endCall();
		
		nokia.addCall(first);
		nokia.addCall(second);
		nokia.printCalls();
		
	}

}
