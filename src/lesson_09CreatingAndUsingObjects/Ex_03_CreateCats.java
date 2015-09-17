package lesson_09CreatingAndUsingObjects;

import chapter09.Cat;
import chapter09.Sequence;

public class Ex_03_CreateCats {

	public static void main(String[] args) {
		String name;
		for (int i = 0; i < 10; i++) {
			name = "Cat" + Sequence.nextValue();
			Cat myCat = new Cat(name, "White");
			myCat.sayMiau();
			name = null;
		}

	}

}
