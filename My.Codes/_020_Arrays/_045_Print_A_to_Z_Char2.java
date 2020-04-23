package _020_Arrays;

public class _045_Print_A_to_Z_Char2 {

	public static void main(String[] args) {

		int[][] array = new int[26][2];

		for (int i = 0; i < array.length; ++i) {
			array[i][0] = 65 + i;
			array[i][1] = 65 + 32 + i;

		}
		

		for (int i = 0; i < array.length; ++i) {
			System.out.print((char) array[i][0] + "" + (char) array[i][1] + " ");
		}

	}

}
