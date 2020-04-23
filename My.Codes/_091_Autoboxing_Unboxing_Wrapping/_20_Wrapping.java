package _091_Autoboxing_Unboxing_Wrapping;

public class _20_Wrapping {

	public static void main(String[] args) {

		// int data type
		int intA = 10;

		// wrapping around Integer object
		Integer intObjA = new Integer(intA);

		
		// objects to data types (retrieving data types from objects) 
        // unwrapping objects to primitive data types 
        int intB = intObjA; 
	
        System.out.println(intA+","+intObjA+","+intB);
        
        
		
		
	}

}
