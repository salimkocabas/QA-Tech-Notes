package _001_Basic;

import java.util.*;

/* Java Program to check whether entered number is EVEN or ODD */

public class _007_Numbers_EVEND_ODD {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// input from keyboard

		System.out.print("Enter an integer number: ");
		int num = input.nextInt();
		input.close();

		// check EVEN or ODD
		if (num % 2 == 0) {
			System.out.println(num + " is an EVEN number.");
		} else {
			System.out.println(num + " is an ODD number.");

		}
	}
}