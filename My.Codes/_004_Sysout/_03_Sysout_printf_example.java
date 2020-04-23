package _004_Sysout;

public class _03_Sysout_printf_example {

	public static void main(String args[]) {

		int i = 50;
		double r = Math.sqrt(i);

		System.out.println(r); // normal print
		System.out.format("%n%.2f", r); // 2basamak
		System.out.format("%n%.3f", r); // 3basamak

		System.out.format("%nThe square root of %d is %f", i, r); // floating point olarak print edildi

	}
}

//http://www.javawithus.com/tutorial/displaying-text-using-printf-method
//https://www.baeldung.com/java-printstream-printf