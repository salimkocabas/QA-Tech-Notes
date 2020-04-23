package _001_Basic;

import java.util.*;

public class _004_Square_cube_and_square_cub {

	private static Scanner sc;

	public static void main(String args[]) {

		sc = new Scanner(System.in);

		int num;

		System.out.print("Enter a integer number : ");
		num = sc.nextInt();

		System.out.println("Squara of " + num + " is " + Math.pow(num, 2));
		System.out.println("Squara of " + num + " is " + Math.pow(num, 3));
		System.out.println("Squara Root of " + num + " is " + Math.sqrt(num));

	}

}
