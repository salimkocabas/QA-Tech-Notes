package _070_Constractor2;

public class j01_ConstructorDemo {

	/**
	 * Constructor name must be same name as ClassName
	 * 
	 */

	// Constructor | same name as ClassName |
	public j01_ConstructorDemo() {
		System.out.println("I'm  *** Constructor *** ");
		System.out.println("Have a beatiful day... ");
	}

	
	
	// name can be different
	public void methodDemo() {
		System.out.println("I'm  *** Method *** ");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		j01_ConstructorDemo cd=new j01_ConstructorDemo();  
		// when ever create an object Constructor is called  | Result: I'm Constructor |
		// compiler will call implicitly Constructor if it's exists
		// if there is no Constructor, there is no error. 
		
		
		
		
		
	}

}
