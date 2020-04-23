package _002_String_Class_IQ;

public class _04_ReverseString2StringBuffer {

	public static void reverseString(String str) {

		StringBuffer newStr = new StringBuffer(str.toLowerCase());

		if (newStr.toString().contentEquals(newStr.reverse().toString()))
			System.out.println(str + " is a palidrom");
		else
			System.out.println(str + " is not a palidrom");

	}

	public static void main(String[] args) {

		reverseString("Madam");
		reverseString("java");
		reverseString("101");
		reverseString("1010");

	}

}
