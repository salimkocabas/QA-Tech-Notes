package _003_Char;

public class _Char_to_String {

	public static void main(String[] args) {

		char[] ch = { 'H', 'e', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' , '!'};
		System.out.println(ch);
		
		// convert char array to a string
		String string = new String(ch);
		System.out.println(string);

	}

}
