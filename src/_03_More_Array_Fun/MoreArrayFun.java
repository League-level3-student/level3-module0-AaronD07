package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		printString();
		printBack();
		EveryOther();
		RandomOne();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	private static void printString() {

		String[] strings = { "0", "10", "Hello", "Hi" };
		for (int i = 0; i < strings.length; i++) {

			System.out.println(strings[i]);
		}

	}

	private static void printBack() {

		String[] strings = { "0", "10", "Hello", "Hi" };
		for (int i = strings.length - 1; i > -1; i--) {

			System.out.println(strings[i]);
		}

	}

	private static void EveryOther() {

		String[] strings = { "0", "10", "Hello", "Hi" };
		for (int i = 0; i < strings.length; i++) {
			if (i % 2 == 0) {
				System.out.println(strings[i]);
			}

		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	private static void RandomOne() {

		String[] strings = { "0", "10", "Hello", "Hi" };

		for (int i = 0; i < strings.length; i++) {
			Random random = new Random();
				System.out.println(strings[random.nextInt(3)]);
			

		}

	}
}
