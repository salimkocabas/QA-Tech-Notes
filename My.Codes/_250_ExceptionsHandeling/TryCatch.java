package _250_ExceptionsHandeling;

public class TryCatch {

	/**
	 * one try + one or more catch block is acceptable catch block must be end of
	 * try block
	 * 
	 * 
	 */

	public static void divide(int a, int b) {

		try {
			System.out.println(a / b); // Divide by zero ArithmeticException

			
			
			
		} catch (Exception e) {
			System.out.println("Exception : " + e.toString());
			System.out.println();
			System.out.println("Exception : " + e);
			System.out.println();
			e.printStackTrace(); //where Exception happen
		}

	}

	public static void main(String[] args) {

		divide(5, 0);

	}

}
