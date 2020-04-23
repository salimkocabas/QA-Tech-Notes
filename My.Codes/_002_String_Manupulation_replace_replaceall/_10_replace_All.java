package _002_String_Manupulation_replace_replaceall;

public class _10_replace_All {

	public static void main(String args[]) {

		// replaceAll
		String str = "Life42343214 is 123123132short, t4242432ime is fa143241234st...";
		
		
		System.out.println(str.replaceAll("[0-9]", "")); // delete numbers
		
		System.out.println(str.replaceAll("[\\d]", "")); // delete numbers \\d same as 0-9
		
		System.out.println(str.replaceAll("[^0-9]", "")); // delete except numbers
		
		System.out.println(str.replaceAll("[\\D]", "")); // delete numbers \\D same as ^0-9
		
		
		str = "Life42343214 is 123%$#@%$#%@#$123132short, t4242432ime is fa1432%#$@%#&41234st...";
		
		
		System.out.println(str.replaceAll("[0-9a-zA-Z]","")); // delete alpha numeric charecters
		System.out.println(str.replaceAll("[^a-zA-Z\\s]","").replaceAll("", " ")); // keep alpha numeric charecters and Space \\s
		System.out.println(str.replaceAll("[\\d\\W]",""));
		
		
		
	}
}
