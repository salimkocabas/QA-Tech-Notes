package _002_String_Manupulation_replace_replaceall;

import java.util.Arrays;
import java.util.List;

public class StringManupulation2 {

	public static void main(java.lang.String[] args) {

		String str = "Total paymenents $100 paid";

		System.out.println(str.indexOf("$"));   //$ is at that index | 17

		
		
		System.out.println(str.substring(str.indexOf("$"), str.indexOf("$")+4));   // $100
		System.out.println(str.substring(str.indexOf("$")+1, str.indexOf("$")+4));  //100   its still String

		Integer paidAmount=Integer.valueOf(str.substring(str.indexOf("$")+1, str.indexOf("$")+4));  //convert to Integer
		
		System.out.println(paidAmount);
		
	
	}

}
