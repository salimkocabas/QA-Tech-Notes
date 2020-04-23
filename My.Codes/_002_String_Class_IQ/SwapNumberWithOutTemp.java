package _002_String_Class_IQ;

public class SwapNumberWithOutTemp {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		System.out.println(a + " " + b);

		a = a + b; // a=5 b=3
		b = a - b; // b=2 a=5
		a = a - b; // b=2 a=3

		System.out.println(a + " " + b);

	}
}
