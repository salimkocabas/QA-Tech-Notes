package _002_String_Class;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class _062_StringCharacterIterator {

	// Iterate over characters of a String
	public static void main(String[] args) {
		String str = "Aksam oldu huzunlendim ben yine";

		CharacterIterator it = new StringCharacterIterator(str);

		while (it.current() != CharacterIterator.DONE) {
			System.out.print(it.current());
			it.next();
		}

		
		
	}

}
