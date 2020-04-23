package _016_While_Do_Loop;

public class _063_While_and_Break_Continiue {

	public static void main(String args[]) {

		Boolean condition = false;

		do {
			System.out.println("1.Hello world");
		} while (condition);

		// ************************
		while (condition) {
			System.out.println("2.Hello world"); // the code is not executed because of condition is false
		}

		// ************************
		condition = true;

		while (condition) {
			System.out.println("3.hello world");
			break; // if you dont write break code works infinitly
		}

	}

}
