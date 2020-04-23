package _070_Constractor2;

public class j02_ConstructorDemo2Parameterized {

	/**
	 * Constructor name must be same name as ClassName
	 * 
	 */

	// Constructor | same name as ClassName | **** Default constructor ****
	public j02_ConstructorDemo2Parameterized() {
		System.out.print("I'm  *** Constructor ***             | ");
		System.out.println("Have a beatiful day... ");
	}

	
	
	// Constructor | same name as ClassName | **** Default constructor ****
	public j02_ConstructorDemo2Parameterized(String str) {
		System.out.print("I'm  *** Constructor w/Parameter *** | ");
		System.out.println("Have a beatiful day... [" + str + "]");

	}

	// name can be different
	public void methodDemo() {
		System.out.println("I'm  *** Method *** ");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		j02_ConstructorDemo2Parameterized defaultOne = new j02_ConstructorDemo2Parameterized();
		j02_ConstructorDemo2Parameterized param = new j02_ConstructorDemo2Parameterized("Angel");
		// when ever create an object Constructor is called | Result: I'm Constructor |
		// compiler will call implicitly Constructor if it's exists
		// if there is no Constructor, there is no error.

	}

}
