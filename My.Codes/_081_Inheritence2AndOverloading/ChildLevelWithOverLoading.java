package _081_Inheritence2AndOverloading;

/**
 *  @author bulent.geckin
 *
 *  FUNCTION OVERLOADING
 *  Multiple Method with Same Name with Different Data (and Type Arguments)
 *
 */


public class ChildLevelWithOverLoading extends ChildClass {

	public void getData(int a) {
		System.out.printf("%s ^2  = %s%n",a,a*a);
	}

	
	public void getData(double a) {
		System.out.printf("%s / 10  = %s%n",a,a/10);
	}
	
	//function overloading, we use same method name with arguments (or different argument types)
	//either argument count should be different or argument data type should be different
	public void getData(String a) {
		
		System.out.println(a.toUpperCase());
		
	}

	public static void main(String[] args) {

		ChildLevelWithOverLoading cl = new ChildLevelWithOverLoading();
		cl.audioSystems(); // can access methods in ParentClass
		System.out.println(cl.color); // can access variables in ParentClass
		
		System.out.println("------------------------------");
		//same method name with different arguments
		cl.getData(10);  //int
		cl.getData(10D);  // Double
		cl.getData("Hello");
	}

}
