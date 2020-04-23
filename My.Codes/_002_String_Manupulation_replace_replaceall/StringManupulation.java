package _002_String_Manupulation_replace_replaceall;

import java.util.Arrays;
import java.util.List;

public class StringManupulation {

	public static void main(java.lang.String[] args) {

		//string manupulation, convert numbers in a string to int
		
		String  price="Price is $100";
		price=price.replaceAll("[^0-9]", "");
		System.out.println(price);
		
		
		String str = "product quantity is 25 total price 4250";      
		str = str.replaceAll("[^-?0-9]+", " "); 
		System.out.println(str);
		System.out.println(Arrays.asList(str.trim().split(" ")));  //split gives as array list
		
		List<String> productDetails=Arrays.asList(str.trim().split(" "));
		System.out.println("quantitiy ="+productDetails.get(0));
		System.out.println("totalprice ="+productDetails.get(1));
		
		int quantity=Integer.valueOf(productDetails.get(0));
		int total=Integer.valueOf(productDetails.get(1));
		System.out.println("unit price ="+(total/quantity));
		
		
	
		
		
		
		
	}

}
