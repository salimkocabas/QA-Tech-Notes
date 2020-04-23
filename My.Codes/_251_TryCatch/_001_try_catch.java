package _251_TryCatch;

import java.util.Scanner;

public class _001_try_catch {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = 0;
		int count = 1;
		try {

			while (number != 9) {
				System.out.printf("%ntry : %s",count++);
				System.out.print("\nguess my number :");
				number = scan.nextInt();
			}


		} catch (Exception e) {

			System.out.println("your input has to be a number!!!");

		} finally {

			System.err.println("\nyou got it....");
		}
	}

}
