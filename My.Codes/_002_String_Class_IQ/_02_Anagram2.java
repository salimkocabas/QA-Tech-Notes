package _002_String_Class_IQ;

import java.util.Arrays;

public class _02_Anagram2 {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "SILENT";
		int count = 0;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		

		if (str1.length() != str2.length())
			System.out.println("Size are different, these words could not be ANAGRAM");

		else {

			char[] char1 = str1.toCharArray();			Arrays.sort(char1);
			char[] char2 = str2.toCharArray();			Arrays.sort(char2);

			for (int i = 0; i < str1.length(); i++) {
				if (char1[i] == char2[i]) {
					count++;
				}

			}

		}

		if (count == str1.length()) {
			System.out.printf("[%s] ANAGRAM [%s] %n", str1, str2);
		}

		else {
			System.out.printf("[%s] IS NOT ANAGRAM [%s] %n", str1, str2);

		}

	}

}
