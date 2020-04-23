package _000_IQ;

public class NumberFullPyramid2 {

	public static void main(String[] args) {

		char whiteSpace = ' ';

		int maxLine = 9;

		for (int currentLine = 1; currentLine <= maxLine; currentLine++) {

			for (int spaces = maxLine - currentLine; spaces > 0; spaces--) {
				System.out.print(whiteSpace);
				
				
			}
			for (int fill = 1; fill < currentLine; fill++) {
				System.out.print(fill);
			}
			
			for (int fill = currentLine; fill > 0; fill--) {
				System.out.print(fill);
			}
			System.out.println();

		}

	}

}
