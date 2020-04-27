package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JOptionPane;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("2"));
		list.add(new String("1"));
		list.add(new String("0"));
		list.add(new String("3"));
		list.add(new String("4"));

		// 2. print the third element in the array
		JOptionPane.showMessageDialog(null, list.get(2));
		// 3. set the third element to a different value
		list.set(2, "10");
		// 4. print the third element again
		JOptionPane.showMessageDialog(null, list.get(2));
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
for(int i =0; i<list.size(); i++) {
	JOptionPane.showMessageDialog(null, list);
	// 6. use a for loop to print all the values in the array
}
		// BE SURE TO USE THE ARRAY'S length VARIABLE
ArrayList<Integer> numbers = new ArrayList<Integer>(50);


		// 7. make an array of 50 integers

		// 8. use a for loop to make every value of the integer array a random number
for(int o=0; o<numbers.size(); o++) {
	Random random = new Random();
	numbers.set(o, random.nextInt());
}

		// 9. without printing the entire array, print only the smallest number on the
		// array


		// 10 print the entire array to see if step 8 was correct

		// 11. print the largest number in the array.

		// 12. print only the last element in the array
System.out.println(numbers.lastIndexOf(numbers));
	}
}
