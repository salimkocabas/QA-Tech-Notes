package _002_String_Manupulation_replace_replaceall;

public class _01_replace {

	public static void main(String[] args) {

		//replace
		
		String str="life is short, time is fast...";
		System.out.println(str);
		
		
		
		str=str.replace('l', 'L');  // change only one Char
		System.out.println(str);
		
		str=str.replace("time", "TIME");  // chan any string in source string
		System.out.println(str);
		
		System.out.println(str.replace(" ","")); //detele spaces
		
		
		
		
		
		
	}

}
