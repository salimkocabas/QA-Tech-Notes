package _020_Arrays;

import java.util.Arrays;

public class _001_integer_Array {

	public static void main(String[] args) {

		// 3 different way to initialize array

		int[] arr1 = { 11, 12, 13 };
		int[] arr2 = new int[] { 21, 22, 23 };
		int[] arr3 = new int[3]; // reserved size start 0,1,2
				
		arr3[0] = 31;
		arr3[1] = 32;
		// arr3[2] = 33; arr3[2] is still ZERO!!!! "look at Console"

		
		
		System.out.println();
		System.out.println("print array elements as Array format");
		System.out.println("array 1:"+Arrays.toString(arr1));
		System.out.println("array 2:"+Arrays.toString(arr2));
		
		System.out.println("array 3:"+Arrays.toString(arr3));
		arr3=new int[3];   //re-initialized, all data gone
		System.out.println("array 3:"+Arrays.toString(arr3));

	}

}
