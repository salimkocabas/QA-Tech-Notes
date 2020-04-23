package _002_String_Class;

public class _008_Conversion_valueOf2 {

	public static void main(String[] args) {

		char[] charArray = { 'M', 'r', '.', ' ', 'N', 'e', 'm', 'o' };
		String str = String.valueOf(charArray);

		System.out.println("charArray : " + charArray);
		System.out.println("charArray : " + charArray.toString());
		System.out.println("string    : " + str);

		
		
		System.out.println();
		
		if (str == "Mr. Nemo")
			System.out.println("1: True");
		else
			System.out.println("1: False");

		if (str.contentEquals("Mr. Nemo"))
			System.out.println("2: True");
		else
			System.out.println("2: False");

	}

}
