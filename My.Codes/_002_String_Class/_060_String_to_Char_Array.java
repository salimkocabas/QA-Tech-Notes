package _002_String_Class;

public class _060_String_to_Char_Array {

	public static void main(String[] args) {

		String str1 = "Welcome To Syntax Solutions";

		char[] charArray = str1.toCharArray();

		for (char x : charArray) {
			System.out.println(x);
		}

	}

}
