package _091_Autoboxing_Unboxing_Wrapping;

class _01_AutoBoxing_Basics {

	public static void main(String[] args) {

		char ch = 'a';

		// Autoboxing- primitive to Character object conversion
		Character a = ch;
		System.out.println(ch + "," + a);

		int x = 1;
		Integer y = x;
		System.out.println(x + "," + y);

	}
}