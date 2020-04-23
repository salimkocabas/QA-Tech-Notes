package _002_String_Class;

public class _040_reverse_string_value {

	public static void main(String[] args) {

		// initialize etmeden bir kelimeyi elle tesrten yazma

		for (int i = 4; i >= 0; i--)
			System.out.print("Hello".charAt(i));

		// initialize edilmis bir degeri terse cevirme

		String str = "World";

		System.out.println();
		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));

	}

}
