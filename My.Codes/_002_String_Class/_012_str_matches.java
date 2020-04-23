package _002_String_Class;

public class _012_str_matches {

	public static void main(String[] args) {

		/// string.matches()

		// Initializing String
		String Str = new String("Life is short time is fast");

		// Testing if regex is present
		System.out.print("Does String contains regex (.*)geeks(.*) ? : ");
		System.out.println(Str.matches("(.*)short(.*)"));

		// Testing if regex is present
		System.out.print("Does String contains regex short ? : ");
		System.out.println(Str.matches("short"));

		// string.regionMatches()

		// Initializing String
		String Str1 = new String("Welcome to geeksforgeeks");

		// Initializing test String
		String Str2 = new String("GEEKS");

		// Tests whether GEEKS starts in geeksforgeeks starting from pos 11
		// and from 0 ( i.e starting in GEEKS) and ignores case
		// and compares 5 characters of GEEKS
		System.out.print("Checking if GEEKS is in geeksforgeeks( case insensitive ) : ");
		System.out.println(Str1.regionMatches(true, 11, Str2, 0, 5));

		// Tests whether GEEKS starts in geeksforgeeks starting from pos 11
		// and compares 5 characters of GEEKS
		System.out.print("Checking if GEEKS is in geeksforgeeks( case sensitive ) : ");
		System.out.println(Str1.regionMatches(11, Str2, 0, 5));

	}

}
