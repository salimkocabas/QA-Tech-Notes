package _070_Constractor0;

public class ConstructorDemo {

	/** Constructor 
	 *	- same name as Class Name        
	 *	- doesn't turn a return value  
	 *	- part of class
	 *	- Constructor are not inherited, you must create new
	 *	- SuperClass Constructor CAN'T be inherited extended class
	 *	- Constructor works without argument or with argument(s)
	 *  - The constructor is invoked automatically
	 */
	
	// without Parameter, it's default
	 ConstructorDemo() {
		System.out.println("I am a Constructor.... Without paramater...");
	}

	// Parameterized [String]
	 ConstructorDemo(String str) {
		System.out.println("I am a Constructor.... (string parameter) Hello, " + str);
	}

	// Parameterized [int]
	 ConstructorDemo(double x) {
		System.out.println("I am a Constructor.... PI  =" + x);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		ConstructorDemo cd = new ConstructorDemo(); // create an object, it is invoked automatically | if there is no
		ConstructorDemo cd2 = new ConstructorDemo("Angel...");  //it calls one of Constructors who as string parameter
		ConstructorDemo cd3 = new ConstructorDemo(Math.PI);    //it calls one of Constructors who as double parameter

	}

}
