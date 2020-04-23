package _002_String_Class_IQ;

import java.util.Arrays;

public class _02_Anagram {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "SILENT";
		

		if (str1.length() != str2.length())
			System.out.println("Size are different, these words could not be ANAGRAM");

		else {

			char[] char1 = str1.toLowerCase().toCharArray();
			char[] char2 = str2.toLowerCase().toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);

			
			
			//String str1copy=Arrays.toString(char1);
			//String str2copy=Arrays.toString(char2); 

			String str1copy=new String(char1);
			String str2copy=new String(char2);
			
			System.out.println(str1copy.hashCode());
			System.out.println(str2copy.hashCode());
			
			
			if (Arrays.equals(char1, char2))
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");

		}

		
	}

}
