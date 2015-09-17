package lesson_01PrimitiveDataTypes;

public class Ex_03_Concatenate {

	public static void main(String[] args) {

		String hello = "Hello";
		String world = "world";
		Object concatenation = hello + " " + world;
		System.out.println(concatenation);
		String word = (String) concatenation;
	}

}
