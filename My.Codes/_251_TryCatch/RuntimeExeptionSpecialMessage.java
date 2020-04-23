package _251_TryCatch;

public class RuntimeExeptionSpecialMessage {

	public static void main(String[] args) {
		comparingNumber(11);
		comparingNumber(9);
		System.out.println("The java code is still running, not crashed");
	}

	public static void comparingNumber(int num1) {

		try {

			if (num1 > 10)
				System.out.println("Number is greater than 10");

			else
				throw new RuntimeException("Number is less than 10");
			
		} catch (RuntimeException e) {
			
			System.err.println(e);
			
		}
		
	}
}