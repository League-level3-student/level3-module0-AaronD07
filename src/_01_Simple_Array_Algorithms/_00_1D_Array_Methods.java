package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int x=0;
		for(int o=0; o<values.length; o++) {
	x=x+values[o];	

	}
		return x;
		

	}
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		int y=0;
		int z=values.length;
		for(int o=0; o<values.length; o++) {
	y=y+values[o];	

	}
		return (double)y/(double)z;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		
		boolean w=true;
		 for(int o=0; o<array.length; o++) {
			if (array[o]!=value) {
				w=false;
				
				
			}
			else {
				w=true;
			}
		

			}
		return w;

	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		int p = -1;
		for(int o=0; o<arr.length; o++) {
			 if (arr[o]==value) {
				 p=o;
				 return p;
			 }
			
		 }
		return p;
	}
}
