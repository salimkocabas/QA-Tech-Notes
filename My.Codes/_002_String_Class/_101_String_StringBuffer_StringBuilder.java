package _002_String_Class;

public class _101_String_StringBuffer_StringBuilder {

	// Concatenates to String
	public static void concat1(String s1) {
		s1 = s1 + "angel";
	}

	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2) {
		s2.append(" angel");
	}

	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3) {
		s3.append(" angel");
	}

	public static void main(String[] args) {

		String s1 = "Hello";
		concat1(s1); // s1 is not changed  because String method is  immutable
		System.out.println("String: " + s1);

		StringBuilder s2 = new StringBuilder("Hello");
		concat2(s2); // s2 is changed
		System.out.println("StringBuilder: " + s2);

		StringBuffer s3 = new StringBuffer("Hello");
		concat3(s3); // s3 is changed
		System.out.println("StringBuffer: " + s3);
	}
}