package _003_Char;

public class Char_to_String2 {

	public static void main(String[] args) {

		// print a to z
		String aToz="";

		for (char i = 'a'; i <= 'z'; ++i) {
			aToz+=i;
		}

		System.out.println(aToz);
		
		//char[] aTozChars; //= new char[26];
		
		char[] aTozChars= {'a','b'};
		//aTozChars=	aToz.toCharArray();
		
		System.out.println(aTozChars);
		System.out.println(aTozChars.toString());
		

	}

}
