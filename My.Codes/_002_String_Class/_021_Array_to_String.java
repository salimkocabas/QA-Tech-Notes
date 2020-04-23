package _002_String_Class;

import java.util.Arrays;

public class _021_Array_to_String {

	public static void main(String[] args) {

		String strArray1 = "its a beatiful day";
		String[] strArray2 = strArray1.split(" ");

		System.out.println(strArray1);
		System.out.println(Arrays.toString(strArray2));

		// word by word

		System.out.println();
		System.out.printf("There is %d word in all string\r", strArray2.length);

		int x = 0;

		for (String i : strArray2) {
			System.out.print(++x + " ");
			System.out.println(i.trim() + " ");

		}

	}

}
