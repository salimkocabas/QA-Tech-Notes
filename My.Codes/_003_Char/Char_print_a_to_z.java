package _003_Char;

public class Char_print_a_to_z {

	public static void main(String[] args) {

		// print a to z

		for (char i = 'a'; i <= 'z'; ++i) {
			System.out.print(i + " ");

		}

//		// print Z TO A
		System.out.println();
		for (char i = 'Z'; i >= 'A'; --i)
			System.out.print(i + " ");

	}

}
