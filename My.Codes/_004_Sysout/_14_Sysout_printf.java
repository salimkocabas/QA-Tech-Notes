package _004_Sysout;

public class _14_Sysout_printf {

	public static void main(String[] args) {

		System.out.printf("positive number : +%d %n", 1534632142);
		System.out.printf("negative number : -%d %n", 989899);

		// printing floating point number with System.format()
		System.out.printf("%f %n", Math.PI);

		// 3 digit after decimal point
		System.out.printf("%.3f %n", Math.PI);

		// 8 Character in width and 3 digit after decimal point
		System.out.printf("%,20.3f %n", Math.PI);
		System.out.printf("%,20.3f %n", 12345678.4567);
		System.out.printf("%,20.3f %n", 456.798789798);

		// adding comma into long numbers
		System.out.printf("Total %,d messages processed today", 10000000);
	}

}
