package _004_Sysout;

public class _13_sysout_usage3_format_output2 {

	public static void main(String args[]) {

		System.out.printf("%5d\n", 1);
		System.out.printf("%5d\n", 12);
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);

		String s = "Nemo";

		System.out.printf("Hello Mr. %s %s %s%n", s, s, s);
		System.out.printf("%5s%n", s);
		System.out.printf("%5s,%6s%n", s, s);

	}

}

/*
 * 
 * s – formats strings d – formats decimal integers f – formats the
 * floating-point numbers t– formats date/time values
 * 
 */