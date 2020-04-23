package _002_String_Class;

public class _061_str_getChars {

	// https://www.javatpoint.com/java-string-getchars
	public static void main(String[] args) {

		String str = new String("hello man  how r u");
		char[] ch = new char[10];
		try {
			str.getChars(6, 10, ch, 0);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
