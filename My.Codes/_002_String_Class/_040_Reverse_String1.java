package _002_String_Class;

public class _040_Reverse_String1 {

	public static void main(String[] args) {

		String str1 = "Hello world, my name is Nemo!!! I was born year 2000";

		// 1. Yontem convert to charArray
		
		char[] chr1 = str1.toCharArray();

		System.out.println();
		for (int i = chr1.length - 1; i > 0; i--)
			System.out.print(chr1[i]);
		
		
		// 2. Yontem
		System.out.println();
		for (int i = chr1.length - 1; i > 0; i--)
			System.out.print(str1.charAt(i));
		
		
		

	}

}
