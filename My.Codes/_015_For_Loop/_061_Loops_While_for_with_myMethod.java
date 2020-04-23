package _015_For_Loop;

public class _061_Loops_While_for_with_myMethod {

	static void myMethod() {
		int my_age = 50;
		String my_name = "Bulent";
		String my_message = "Hello world!!!";

		System.out.print(" My age is : " + my_age);
		System.out.print(" My name is : " + my_name);
		System.out.println(" My message is : " + my_message);

	}

	public static void main(String[] args) {

		int i = 0;

		while (i < 2) {
			myMethod();
			i++;

		}

		for (int x = 0; x < 2; x++) {
			myMethod();
		}

	}
}
