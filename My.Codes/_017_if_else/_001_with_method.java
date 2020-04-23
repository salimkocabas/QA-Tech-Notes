package _017_if_else;

public class _001_with_method {

	public static void main(String[] args) {

		double number;

		number = -1;

		if (number > 0)   // if we have one line after "if" we dont need {}
			System.out.println("number is POSITIVE");
		
		else if (number < 0)
			System.out.println("number is NEGATIVE");
		
		else
			System.out.println("number is ZERO");

	}

}
