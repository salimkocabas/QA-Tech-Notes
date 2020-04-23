package _002_String_Class;

public class _000_StringClassLiteral_Object {

	public static void main(String[] args) {

		String str1 = "Hello"; // string literal
		String str2 = "Hello"; // string literal
		String str1copy = str1;
		String str2copy = str1;

		if (str1 == str2) {
			System.out.println("str1 == str2");
		}

		if (str1 == str1copy) {
			System.out.println("str1 == str1 copy");
		}

		System.out.println("******************************");

		String strO1 = new String("Hello");
		String strO1copy = new String(strO1);

		if (strO1 == strO1copy) {
			System.out.println("str1 == str2");    //the content are equals but they are different object that object are different.. This line doesn't work
		} else
			System.out.println();
		System.out.println("strO1 [not equal] strO2");  // Java print this line those are different objects

	}

}
