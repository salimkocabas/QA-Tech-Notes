package _002_String_Class_IQ;

import java.util.Arrays;

public class _03_AnagramHashCode {

	public static Boolean checkAnagram(String str1, String str2) {

		Boolean result = false;

		if (str1.length() == str2.length()) {

			char[] char1 = str1.toLowerCase().toCharArray();
			char[] char2 = str2.toLowerCase().toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);

			if (Arrays.hashCode(char1) == Arrays.hashCode(char2)) {
				result = true;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(checkAnagram("silent", "listen"));
		System.out.println(checkAnagram("emin", "mine"));
		System.out.println(checkAnagram("xxx", "yyy"));

	}

}
