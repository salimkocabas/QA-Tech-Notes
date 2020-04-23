package _020_Arrays;

public class _045_Print_A_to_Z_Char {

	public static void main(String[] args) {

		// all of them is same those ara A
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = (char) 65;

		System.out.println(ch1 + " " + ch2 + " " + ch3);

		for (int j = 0; j <= 1; ++j)
			for (int i = 65 + (j * 32); i <= 90 + (j * 32); ++i) {
				System.out.print((char) i);
				if ((char) i == 'Z') {
					System.out.println();
				}

			}

	}

}
