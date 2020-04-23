package _002_String_Class;

public class _040_reverse_string_with_method {

	public static String myMethod(String str) {
		String strR = "";

		for (int i = str.length() - 1; i >= 0; i--) 
			strR = strR + (str.charAt(i));
		return strR;

	}

	public static void main(String[] args) {

		String text = "Leon The King";
		System.out.println("text       : " + text);
		String result = myMethod(text);
		System.out.println("reversed   : " + result); // result come from method

	}

}
