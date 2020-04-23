package _014_ScannerClass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _Scanner_hasNextLine {
	public static void main(String[] argv) throws Exception {

		try {

			// Get the string to be searched
			String s = "Hello great World, What a beatiful day!";

			// Print the string
			System.out.println("Target String:\n" + s);

			// create a new scanner
			// with the specified String Object
			Scanner scanner = new Scanner(s);

			// string iÃ§indeki baÅŸka bir stringi search ediyor ... noktalar bulduktan ı
			// sonra/veya Ã¶nce ne kadarÄ±nÄ± yazmasÄ± gerektiÄŸini sÃ¶ylÃ¼yor

			
			System.out.println("\n" + scanner.findInLine(Pattern.compile("......World.......")));

			// close the scanner
			scanner.close();
		} catch (IllegalStateException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
