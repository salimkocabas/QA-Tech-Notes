package _004_Sysout;

public class _04_Sysout_printf_decimal {

	public static void main(String args[]) {

		int i = 50;
		double r = Math.sqrt(i);

		System.out.println(r); // normal print
		System.out.format("%n%.2f", r); // 2basamak
		System.out.format("%n%.3f", r); // 3basamak

		System.out.format("%nThe square root of %d is %f", i, r); // floating point olarak print edildi

		 System.out.format("%n%f, %<010.20f %n", Math.PI);
		 System.out.format("%f, %1$+020.10f %n", Math.PI);
		 System.out.format("%,20.3f %n", 999999.999);
		 System.out.format("%1$+,020.3f %n", 99989.999);
		 System.out.format("%1$+,020.3f %n", -99989.999);
	}
}

//http://www.javawithus.com/tutorial/displaying-text-using-printf-method
//https://www.baeldung.com/java-printstream-printf