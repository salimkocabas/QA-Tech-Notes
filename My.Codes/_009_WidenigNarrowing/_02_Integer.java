package _009_WidenigNarrowing;

public class _02_Integer {

	public static void main(String[] args) {

		int a = 5;
		int b = 2;

		double c, d;
		c = a / b;
		d = (double) a / (double) b;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("int   a/b           = " + a / b); // 2
		System.out.println("double(a)/double(b) = " + (double) a / (double) b); // 2.5

		System.out.println("------------------");

		System.out.println(c); // 2.0
		System.out.println(d); // 2.5

	}

}
