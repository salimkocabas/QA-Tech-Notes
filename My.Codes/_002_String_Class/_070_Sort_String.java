package _002_String_Class;

import java.util.Arrays;

public class _070_Sort_String {

	public static void main(String[] args) {

		String[] names = { "Zoro", "alex", "Superman", "Nemo", "Hulk", "Tom", "Mike", "nemo" };

		System.out.println(Arrays.toString(names)); // printing before
		Arrays.sort(names);
		System.out.println(Arrays.toString(names)); // printing after

	}
}
