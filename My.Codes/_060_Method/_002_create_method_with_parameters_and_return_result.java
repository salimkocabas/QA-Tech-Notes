package _060_Method;

public class _002_create_method_with_parameters_and_return_result {

	static void myMethod(String str) {
		System.out.println(str.toUpperCase());
	}

	public static int myMethod(int x) {
		return (int) Math.pow(x, 2); // x^2
	}

	public static void main(String[] args) {

		myMethod("Hello"); // HELLO

		System.out.println(myMethod(3)); // 3^2 = 9

	}
}
