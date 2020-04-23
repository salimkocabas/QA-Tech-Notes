package _020_Arrays;

import java.util.Arrays;

public class _043_ArrayCopy2 {

	public static void main(String[] args) throws InterruptedException {
		String[] arr1 = new String[] { "a", "b", "c", "d", "e", "f", "g" };
		String[] arr2 = new String[0];// array initialize with zero element

		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));

		System.out.println();
		arr2 = arr1; // basic copy
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));

		System.out.println();
		arr2 = Arrays.copyOf(arr1, 4); // it's copy x first value of master string
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println();

		arr2 = Arrays.copyOf(arr1, 11); // it's copy x first value of master string
		// if master array doesn't have enough value it puts "null"

		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println();

		arr2 = Arrays.copyOf(arr1, 2); // it can change dynamically change extend or shrink it

		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println();

	}

}
