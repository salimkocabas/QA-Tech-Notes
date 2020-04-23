package _070_Constractor2;

public class j03_ConstructorDemo2ParameterizedWithThis2 {

	// Default
	public j03_ConstructorDemo2ParameterizedWithThis2() {
		System.out.print("I'm  *** Constructor ***             | ");
		System.out.println("Have a beatiful day... ");
	}

	// Parameterized
	public j03_ConstructorDemo2ParameterizedWithThis2(String str) {
		this(); // it will call default Constructor
		System.out.print("I'm  *** Constructor w/Parameter *** | ");
		System.out.println("Have a beatiful day... [" + str + "]");
	}

	
	
	//  ***************  Constructor with Method  ****************
	@SuppressWarnings("unused")
	public static  void mYmethod(String str) {
		j03_ConstructorDemo2ParameterizedWithThis2 param = new j03_ConstructorDemo2ParameterizedWithThis2(str);
	}

	public static void main(String[] args) {

		mYmethod("Angel");
		
		
		
	}

}
