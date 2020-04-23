package _002_String_Class;

public class _041_Reverse_String2_word_by_word {

	public static void main(String[] args) {

		String str1 = "Hello world, my name is Nemo!!! I was born year 2000";
		System.out.println(str1);

		String[] str2 = str1.split(" "); // boslukra gore cumle kelimelere ayrildi

		// cumle kelime kelime tersten yazildi

		for (int i = str2.length - 1; i > 0; i--)
			System.out.print(str2[i] + " ");

		// cumle duz ama kelimeler terse cevriliyor
		System.out.println();

		for (int i = 0; i < str2.length; i++) { // kelimeler cikartiliyor
			for (int j = str2[i].length() - 1; j >= 0; j--) { // kelime tersten yazdiriliyor
				System.out.print(str2[i].charAt(j));

			}
			System.out.print(" ");
		}

	}

}
