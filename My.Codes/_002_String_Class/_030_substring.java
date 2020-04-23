package _002_String_Class;

public class _030_substring {

	public static void main(String[] args) {

		
		String str="123456789";
		
		System.out.println(str.substring(0));  // starts index(0)
		System.out.println(str.substring(3));   // starts index(3)   means 4rd character
		System.out.println(str.substring(3, 5));  //start index(3) to index(5) [not included] 

	}

}
