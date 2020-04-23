package _002_String_Class;

public class _005_String_Class {

	public static void main(String[] args) {

		// String class comes in java lang package

		// assging a strting a value
		String str1 = "Hello";
		String str2 = new String("hello");

		System.out.println(str1);
		System.out.println(str2);

		// string.length()
		System.out.println("size of str1 : " + str1.length());

		// string.toUpperCase()
		System.out.println(str1.toLowerCase()); // hello

		// string.toLowerCase()
		System.out.println(str1.toUpperCase()); // Hello

		// string.substring(x) or string.substring(x,y)
		System.out.println(str2.substring(0, 1).toUpperCase() + str2.substring(1)); // hello to Hello

		// string.isEmpty()
		System.out.println(str1.isEmpty()); // false

		// string.contains("text")
		str1 = "Life is short, time is fast.";
		System.out.println(str1.contains("is")); // True

		// string.startsWith("text",x)
		System.out.println(str1.startsWith("Life")); // true
		System.out.println(str1.startsWith("Life", 1)); // false   because it start 2nd character

		// string.endsWith("text",x)
		System.out.println(str1.endsWith("fast")); // false
		System.out.println(str1.endsWith("fast.")); // true

	}

}
