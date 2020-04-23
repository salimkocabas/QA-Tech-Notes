package _002_String_Class;

public class _051_String_Manupulation_substring_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello world, my name is Nemo!!! I was born year 2000";
		System.out.println(str1.replaceAll("my", "My"));
		System.out.println(str1.replaceAll("[a-z]", ".")); // a dan z ye kucuk haffler . oldu
		System.out.println(str1.replaceAll("[A-Z]", ".")); // A dan Z ye kucuk haffler . oldu
		System.out.println(str1.replaceAll("[a-zA-Z]", ".")); // a dan Z ye kucuk haffler . oldu
		System.out.println(str1.replaceAll("[a-zA-Z,!]", ".")); // a dan Z ye kucuk haffler . oldu ilave , ve ! lerde
		System.out.println(str1.replaceAll(" ", ".")); // bosluklar nokta ile dolduruldu
		System.out.println(str1.replaceAll("[0-9]", "*")); // sayilar * yapildi
		System.out.println(str1.replaceAll("[\\d]", "*")); // sayilar * yapildi  \\d  0-9 demek 
		System.out.println(str1.replaceAll("[\\D]", "*")); // \\D sayilar haric demek
		System.out.println(str1.replaceAll("[^ae]", "*")); // a harfi harici her seyi degistir

	}

}
