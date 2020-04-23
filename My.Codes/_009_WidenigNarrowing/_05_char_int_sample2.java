package _009_WidenigNarrowing;

public class _05_char_int_sample2 {

	public static void main(String[] args) {

		// Autoboxing- primitive to Character object conversion
		char ch1 = 'a';
		Character a = ch1;

		System.out.println(ch1); // console > a
		System.out.println(a); // console > a
		System.out.println(ch1 + a); // console > 194 OOo, what is? See the explanation

		// Explanation
		int numValuOfch1 = ch1;
		System.out.println(numValuOfch1); // it is UTF-16/ASCII decimal value
											// more info
											// https://naveenr.net/unicode-character-set-and-utf-8-utf-16-utf-32-encoding/
		
		int numValuOfa = a;
		System.out.println(numValuOfa);
		System.out.println(numValuOfch1 + numValuOfa); // that is the solutions

		System.out.println(ch1 + " " + a); //

		
		
		System.out.println("---------------------------------");
		Character ch2 = 'b';

		// Unboxing - Character object to primitive conversion
		char b = ch2;
		int numValuOfch2 = ch2;  
		int numValuOfb = b;
		
		System.out.println(ch2+" "+b);
		System.out.println(numValuOfch2+" "+numValuOfb);
	}

}
