package _008_IntegerClass;

public class _12_IntegerValuOf {

	public static void main(String[] args) {

		
		String number = "10";
		Integer result = Integer.valueOf(number);		
		System.out.println(result);
		
		
		/*
		String number2 = "10A";   // it gives error
		Integer result2 = Integer.valueOf(number2);		
		System.out.println(result2);
		*/
		
		String number2 = "$99.99";   // it gives error
		number2=number2.replaceAll("[^0-9.]", "");   //keep only numbers 0 to 9, delete everything
		Double result2 = Double.valueOf(number2);		
		System.out.println(result2);
		
		// For more Detail Look String Manipulation
		
		
		
	}

}
