package _000_IQ;

public class NumberFullPyramid {

	public static void main(String[] args) {

		char fillOut = '*';
		char whiteSpace = ' ';

		int maxLine = 5;

		for (int currentLine = 1; currentLine <= maxLine; currentLine++) {

			for (int spaces = maxLine - currentLine; spaces > 0; spaces--) {
				System.out.print(whiteSpace);
			}
			for (int fill = 1; fill < currentLine * 2; fill++) {
				System.out.print(fillOut);
			}
			System.out.println();

		}

	}

}
