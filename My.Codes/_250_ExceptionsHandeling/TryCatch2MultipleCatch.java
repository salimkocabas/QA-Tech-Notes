package _250_ExceptionsHandeling;

public class TryCatch2MultipleCatch {

	/**
	 * one try + one or more catch block is acceptable catch block must be end of
	 * try block
	 * 
	 * 
	 */

	public static void divide(int a, int b) {

		try {
			System.out.println(a / b); // Divide by zero ArithmeticException

		} catch (ArithmeticException e)   // only arithmetic exceptions can handle here
		{		System.out.println("Arithmetic Exception "+e.getMessage());
		
		} catch (Exception e) // All exceptions handling here
		{
			System.out.println("Exception : " + e);
		}

	}

	public static void main(String[] args) {

		divide(5, 0);
		divide(0, 5);
		divide(5, 2);

	}

}
