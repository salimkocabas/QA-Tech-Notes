package _086_encapsulation2;

import _086_encapsulation.Employee;

public class getEmployee {
	public static void main(String[] args) {
		
		
		
		// Employee Class CAN NOT  accessible without IMPORTING
		//MUST be imported : import encapsulation.Employee;
		Employee e=new Employee();
		
		//public (access modifier) variable behavior on other class (same package)
		System.out.println("1- "+e.getName()); //variable access by method
		System.out.println("2- "+e.name);     //variable direct access
		
		e.setName("Angel");  // variable can change via method
		System.out.println("3- "+e.getName());

		e.name="James";      // variable can change directly
		System.out.println("4- "+e.getName());
		
		
		
		//private (access modifier) variable behavior on other class (same package)
		System.out.println("5- "+e.getSSN()); //variable access by method
		//System.out.println(e.ssn)   // CAN NOT ACCESIBLE
		
		e.setSSN("333-4444-9999");  // can change if there is a change method
		System.out.println("6- "+e.getSSN());
		
		
		
		
	}

}
