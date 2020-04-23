package _002_String_Class;

import java.util.Scanner;

public class _011_Compare_string_ignore_case2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String word1, word2, word3;

		word1 = "elma";
		word2 = "elma";
		word3 = "ELMA";

		if (word1 == word2) {
			System.out.println("word1 == word2 |same words...");

		} else {
			System.out.println("word1 == word2 | you entered different words...");
		}

		System.out.println(1 + " " + word1.equals(word2)); // true
		System.out.println(2 + " " + word1.equals(word3)); // false

		System.out.println(3 + " " + word1.contentEquals(word2)); // true
		System.out.println(4 + " " + word1.contentEquals(word2)); // true

		System.out.println(5 + " " + word1.equalsIgnoreCase(word2)); // true
		System.out.println(6 + " " + word1.equalsIgnoreCase(word3)); // true

		// lets tray with input

		Scanner read = new Scanner(System.in);

		System.out.println("word 1:");
		word1 = read.next();
		System.out.println("word 2:");
		word2 = read.next();
		System.out.println("word 3:");
		word3 = read.next();

		if (word1 == word2) {
			System.out.println("word1 == word2 |same words...");

		} else {
			System.out.println("word1 == word2 | you entered different words...");
		}

		System.out.println(1 + " " + word1.equals(word2)); // true
		System.out.println(2 + " " + word1.equals(word3)); // false

		System.out.println(3 + " " + word1.contentEquals(word2)); // true
		System.out.println(4 + " " + word1.contentEquals(word2)); // true

		System.out.println(5 + " " + word1.equalsIgnoreCase(word2)); // true
		System.out.println(6 + " " + word1.equalsIgnoreCase(word3)); // true

	}
}
