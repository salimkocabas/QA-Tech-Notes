package _002_String_Class;

public class _010_String_equals__content_equal {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = new String("Hello");
		StringBuilder str3 = new StringBuilder(str1);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("str1.equals(str2): " + (str1.equals(str2)));
		System.out.println("str1.contentEquals(str2): " + (str1.contentEquals(str2)));
		System.out.println("str1.equals(str3): " + (str1.equals(str3)));
		System.out.println("str1.contentEquals(str3): " + (str1.contentEquals(str3)));
	}

}
