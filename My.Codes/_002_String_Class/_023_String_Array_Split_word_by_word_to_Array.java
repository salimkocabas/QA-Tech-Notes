package _002_String_Class;

import java.util.Arrays;

public class _023_String_Array_Split_word_by_word_to_Array {

	public static void main(String[] args) throws InterruptedException {

		String str1 = "Any fool can know The point is to understand";
		String str2[]  = str1.split(" ");

		System.out.println(str1);
		System.out.println();

		char[] ch;

		for (int i = 0; i < str2.length; i++) {
			ch = str2[i].toCharArray();
			System.out.printf("%35S%S%n", Arrays.toString(ch),Arrays.toString(ch));
			Thread.sleep(100 * i);

		}

	}

}
