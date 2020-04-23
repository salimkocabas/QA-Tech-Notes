package _060_Method;

import java.util.Scanner;

public class _003_check_and_control {

	public static void checkAge(int age) {

		if (age < 21) {
			System.out.println("Access denied - your are so young");

		} else {
			System.out.println("Access granted - IT's Ok you are adult");
		}

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		System.out.println("Your age please :");
		int age = read.nextInt();

		checkAge(age);
	}
}
