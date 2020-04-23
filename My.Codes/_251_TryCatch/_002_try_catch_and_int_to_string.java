package _251_TryCatch;

import java.util.Scanner;

public class _002_try_catch_and_int_to_string {

	public static void main(String[] args) {

		try {

			Scanner input = new Scanner(System.in);
			String str;
			System.out.println("Enter any number :");

			str = input.next();  // scanner read as  integer
			int num = Integer.parseInt(str);

			System.out.println("Your number is: " + num);

			// this statement will execute
			// as no any exception is raised by above statement
			System.out.println("string to integer transformation successfull");

		}

		catch (NumberFormatException ex) {

			System.out.println("it's not an integer");

		}

		System.out.println("Outside try-catch clause");
	}

}
