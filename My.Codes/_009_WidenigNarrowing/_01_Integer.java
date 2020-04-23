package _009_WidenigNarrowing;

public class _01_Integer {

	public static void main(String[] args) {

		int x = 5;
		double y = x;
		float z = x;

		System.out.println(x); // 5
		System.out.println(y); // 5.0
		System.out.println(z); // 5.0

		System.out.println((x == y)); // 5=5.0 true
		System.out.println((x == z)); // 5=5.0 true
		System.out.println((y == x)); // 5.0=5.0 true

	}

}
