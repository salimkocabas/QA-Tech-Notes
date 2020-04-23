package _015_For_Loop;

public class _062_for_loop3 {

	public static void main(String args[]) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		// method 1:

		for (int i = 0; i < vowels.length; ++i) {
			System.out.print(vowels[i] + ", ");
		}

		System.out.println();

		// method 2:
		for (char x : vowels) {
			System.out.print(x + ", ");
		}

	}

}
