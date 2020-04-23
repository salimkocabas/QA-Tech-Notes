package _020_Arrays;

import java.util.*;

public class _001_integer_Array2 {

	public static void main(String[] args) {

		// 3 different way to initialize array

		int[] arr1 = { 10, 11, 12};

		System.out.println(Arrays.toString(arr1));
		
		arr1[1] = 42; // you can change it
		//arr1[2] = 99.99; // it s double can not change it
		// or we can cast it
		arr1[2] = (int) 99.99;   //its casting double to int
		System.out.println(Arrays.toString(arr1));

		
		
		
		
		
	}

}
