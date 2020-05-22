package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] list = { "0", "5", "4", "1", "2" };
		// 2. print the third element in the array
		JOptionPane.showMessageDialog(null, list[2]);
		// 3. set the third element to a different value
		list[2] = "10";
		// 4. print the third element again
		JOptionPane.showMessageDialog(null, list[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < list.length; i++) {
			JOptionPane.showMessageDialog(null, list[i]);
			// 6. use a for loop to print all the values in the array
		}
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		Integer[] numbers = new Integer[50];
		// 7. make an array of 50 integers
		// 8. use a for loop to make every value of the integer array a random number
		for (int o = 0; o < numbers.length; o++) {
			Random random = new Random();
			numbers[o] = random.nextInt(100);
			System.out.println(numbers[o]);
		}

		// 9. without printing the entire array, print only the smallest number on the
		// array

		int x = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < x) {
				x = numbers[i];

			}
		}
		System.out.println(x);

		int y = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > y) {
				y = numbers[i];

			}
		}
		System.out.println(y);

		System.out.println(numbers[49]);
	}
	// 10 print the entire array to see if step 8 was correct

	// 11. print the largest number in the array.

	// 12. print only the last element in the array

}
