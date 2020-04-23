package _014_ScannerClass;

import java.util.*;

public class _01_Read_and_print {

	public static Scanner read_value;

	public static void main(String args[]) {

		int a, b;

		read_value = new Scanner(System.in);

		System.out.print("Enter value of a 	:");
		a = read_value.nextInt();
		System.out.print("Enter value of b 	:");
		b = read_value.nextInt();

		System.out.println("Value of a^2		:" + Math.pow(a, 2));
		System.out.println("Value of b^2		:" + Math.pow(b, 2));

		System.out.println("Square Root of " + a + "	:" + Math.sqrt(a));
		System.out.println("Square Root of " + b + "	:" + Math.sqrt(b));

	}

}
