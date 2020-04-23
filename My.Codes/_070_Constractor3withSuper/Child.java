package _070_Constractor3withSuper;

public class Child extends Parent {

	
	public Child(String str) {
		
		super(str); // invoke parent constructor with same sign
		System.out.println("2: Goodby " + str);
	}

	public Child(String str, String str2) {
		System.out.println("\n3: How are you today " + str + " " + str2);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 1,2
		Child co1 = new Child("Angel");  
		
		//3
		Child co2 = new Child("Angela", "John"); 

		/**
		 * This child class, you extended If you use one of Constructor sign with
		 * parameter it needs default Constructor or same sign on Parent Thats mean if
		 * here a string parametized Constructor exist parent should have same or
		 * default or you must write super(<parameter sign>) in first line which
		 * constructor you wanted to run
		 * 
		 * Run Order: 1. Parent 2. Child
		 * 
		 *
		 * 
		 */

	}

}
