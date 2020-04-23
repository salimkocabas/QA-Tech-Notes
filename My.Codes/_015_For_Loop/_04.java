package _015_For_Loop;

import java.util.Arrays;

public class _04 {
	public static void main(String[] args) {

		/*
		 * 
		 * for(data_type item : collection) {
		 * 
		 * code
		 * 
		 * }
		 * 
		 */

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < vowels.length; ++i)
			System.out.print(vowels[i]);

		System.out.println();

		// foreach loop print char array
		for (char i : vowels)
			System.out.print(i);

		System.out.println();

		// print a to z

		for (char i = 'a'; i <= 'z'; ++i)
			System.out.print(i + " ");

		// print integer arrays

		int[] numbers = { 1, 2, 4 };
		int sum = 0;

		for (int number : numbers)
			sum += number;

		System.out.println("\r");

		System.out.print(Arrays.toString(numbers));

		System.out.print(" Sum of string =  " + sum);

	}

}
