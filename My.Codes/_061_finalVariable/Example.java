package _061_finalVariable;

public class Example {

	public static void main(String[] args) {

		final String MY_NAME = "Nemo";
		System.out.println(MY_NAME);
		// invalid compilation error you CAN NOT change it
		// LOAN = new String("loan");
		// LOAN = "new value";

		final Integer MY_AGE = 3;
		System.out.println(MY_AGE);
		// MY_AGE=51;

	}

}
