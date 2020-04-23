package _251_TryCatch;

public class _003_try_catch_general_error {
	public static void main(String[] args) {

		int[] myNumbers = { 1, 2, 3 };

		try {
			System.out.println(myNumbers[10]);

		} catch (Exception error) {
			System.out.println("Something went wrong.");
			System.out.printf("problem is: [%s]", error);
		}
	}
}
