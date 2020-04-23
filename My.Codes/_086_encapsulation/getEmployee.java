package _086_encapsulation;

public class getEmployee {
	public static void main(String[] args) {
		
		
		// Employee Class can accessible without IMPORTING
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
