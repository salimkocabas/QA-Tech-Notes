package _000_IQ2;

public class _01_AccessModifier2CallMethodDifferentClass extends _01_AccessModifier {


	/** access modifier
	
				 class	package		subClass	other package
	public			+		+			+			+	
	protected		+		+			+			
	default			+		+
	private			+
	
	*/
	
	
	
	public static void main(String[] args) {

		demoDefault();
		demoPublic();
		demoProtected();
		//demoPrivate();  // can not accessible
		
		testPrivate();	  //private class can be accessible same class	
		
	}

}
