package _000_IQ2;

public class _01_AccessModifier {

	/** access modifier
	
				 class	package		subClass	other package
	public			+		+			+			+	
	protected		+		+			+			
	default			+		+
	private			+
	
	*/
	
	
	//no access modifier, it means default
	static void demoDefault() {
		System.out.println("default access modifier");
	}

	public static void demoPublic() {
		System.out.println("public access modifier");
	}

	protected static void demoProtected() {
		System.out.println("protected access modifier");
	}
	
	private static void demoPrivate() {
		System.out.println("private access modifier");
	}

	static void testPrivate() {
		System.out.print("via testPrivate()...");demoPrivate();
	}
	

	public static void main(String[] args) {
		demoDefault();
		demoPublic();
		demoProtected();
		demoPrivate(); 
		
		testPrivate();	  
		

	}

}
