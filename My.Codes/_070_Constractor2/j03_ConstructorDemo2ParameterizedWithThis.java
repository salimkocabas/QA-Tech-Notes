package _070_Constractor2;

public class j03_ConstructorDemo2ParameterizedWithThis {

	// Default
	public j03_ConstructorDemo2ParameterizedWithThis() {
		System.out.print("I'm  *** Constructor ***             | ");
		System.out.println("Have a beatiful day... ");
	}

	// Parameterized
	public j03_ConstructorDemo2ParameterizedWithThis(String str) {
		this();   // it will call default Constructor
		System.out.print("I'm  *** Constructor w/Parameter *** | ");
		System.out.println("Have a beatiful day... [" + str + "]");
	}

	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// if we put this() to other Constructor it call automatically default + own
		//j03_ConstructorDemo2ParameterizedWithThis defaultOne = new j03_ConstructorDemo2ParameterizedWithThis();  
		
		j03_ConstructorDemo2ParameterizedWithThis param = new j03_ConstructorDemo2ParameterizedWithThis("Angel");

	}

}
