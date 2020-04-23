package _002_String_Class;

import java.util.Scanner;

public class _011_Compare_string_ignore_case {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two words");
		String word1 = input.next();
		String word2 = input.next();

		if (word1 == word2) {
			System.out.println("word1 == word2 | you entered same words...");

		} else {
			System.out.println("word1 == word2 | you entered different words...");
		}

		if (word1.contentEquals(word2)) {
			System.out.println("word1.contentEquals(word2) | YOU you entered same words...");

		} else {
			System.out.println("word1.contentEquals(word2) | YOU  entered different words...");
		}

		if (word1.equalsIgnoreCase(word2)) {
			System.out.println("word1.equalsIgnoreCase(word2) | YOU  entered same words...");

		} else {
			System.out.println("word1.equalsIgnoreCase(word2)  | YOU  entered different words...");
		}

	}
}
