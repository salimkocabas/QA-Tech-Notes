package _001_Basic;

public class _011_Integer_Method {

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		System.out.println("The sum is =" + Integer.sum(a, b));

		a = 7;
		b = 9;
		System.out.printf("%n %s,  %s : Integer.compare(a, b) result : %s", a, b, Integer.compare(a, b));

		a = 4;
		b = 4;
		System.out.printf("%n %s,  %s : Integer.compare(a, b) result : %s", a, b, Integer.compare(a, b));

		a = 8;
		b = 1;
		System.out.printf("%n %s,  %s : Integer.compare(a, b) result : %s", a, b, Integer.compare(a, b));

	}

}
