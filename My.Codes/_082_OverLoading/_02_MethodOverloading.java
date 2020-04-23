package _082_OverLoading;

import java.util.Calendar;

public class _02_MethodOverloading {

	// Method without parameter
	static void myMethod() {
		System.out.println("no parameter");
		System.out.println("Hello");
	}

	// Method with parameter -Overloading it -
	static void myMethod(String str) {
		System.out.println("with parameter");
		System.out.println("Hello " + str);
	}

	// Method with parameter -Overloading it -
	 static void myMethod(int dob) {
			System.out.println("with parameter");
			System.out.println("Your age ="+(Calendar.getInstance().get(Calendar.YEAR)-dob) );
		}

	 
	public static void main(String[] args) {

		myMethod();

		System.out.println();
		myMethod("Angel");
		
		System.out.println();
		myMethod(1970);
		

	}
}
