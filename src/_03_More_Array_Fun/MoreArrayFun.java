package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		printString();
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	private static void printString(){
		Random random = new Random();
		String[] strings = new String[random.nextInt()];
		for(int i=0; i<strings.length; i++) {
			System.out.println(strings);
		}
		
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	private static void printBack(){
		Random random = new Random();
		String[] strings = new String[random.nextInt()];
		for(int i=strings.length; i<strings.length; i++) {
			System.out.println(strings);
		}
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
