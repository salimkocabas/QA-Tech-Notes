package _250_ExceptionsHandeling;

public class TryCatch3FinallyBlock {

	static int result;

	@SuppressWarnings("finally")
	public static int divide(int a, int b) {

		try {
			result = a / b;

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception " + e.getMessage());

		} finally {
			return result;
		}

	}

	public static void main(String[] args) {

		System.out.println(divide(1, 10000000));

	}

}
