package _002_String_Class;

public class _021_Split_Method {

	public static void main(String[] args) {

		/*
		 * .split() This method splits this string around matches of the given regular
		 * expression.
		 */

		// split the following string into array of strings/work
		String str = "Video provides a powerful way to help you prove your point.";
		String[] array = str.split(" ");
		System.out.printf("There is %d words in string\r", array.length);
		
		for (int i = 0; i < array.length; i++) 
			System.out.println(array[i]);


	}

}
