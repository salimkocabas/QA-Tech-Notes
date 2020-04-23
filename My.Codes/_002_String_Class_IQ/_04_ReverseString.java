package _002_String_Class_IQ;

public class _04_ReverseString {

	public static void reverseString(String str) {

		String newStr = "";
		for (int i = str.length(); i > 0; newStr += str.charAt(--i));

		if (str.equalsIgnoreCase(newStr))
			System.out.println(str + "\t is a palidrom");

		else
			System.out.println(str + "\t is not a palidrom");

	}

	public static void main(String[] args) {

		reverseString("man");
		reverseString("madam");

	}

}
