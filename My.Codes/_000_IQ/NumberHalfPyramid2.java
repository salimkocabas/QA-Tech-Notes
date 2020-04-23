package _000_IQ;

public class NumberHalfPyramid2 {

	public static void main(String[] args) {

		for (int i = 0, line = 1; i < 10;) {

			for (int j = 0; j < line; j++) {
				System.out.print(i++ +" ");
			}
			line++;
			System.out.println();

		}

	}

}
