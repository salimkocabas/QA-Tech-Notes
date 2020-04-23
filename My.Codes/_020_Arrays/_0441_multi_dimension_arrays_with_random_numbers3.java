
package _020_Arrays;

import java.util.Arrays;
import java.util.Random;

public class _0441_multi_dimension_arrays_with_random_numbers3 {
	public static void main(String[] args) throws InterruptedException {

		Random random = new Random();

		int arr_sizeRow = 5;
		int arr_sizeCol = 6;
		int arr_oneDim = arr_sizeRow * arr_sizeCol;
		int[][] my_arr_2d = new int[arr_sizeRow][arr_sizeCol];
		int[] my_arr_1d = new int[arr_oneDim];
		int[] sum = new int[arr_sizeRow];

		// generating random numbers
		System.out.println("Generating  Numbers...");
		int howBigNum = 99;
		
		int count = 0;
		for (int i = 0; i < arr_sizeRow; i++) {
			for (int y = 0; y < arr_sizeCol; y++) {
				int randonNum = random.nextInt(howBigNum);
				my_arr_2d[i][y] = randonNum;
				my_arr_1d[count++] = randonNum;
				sum[i] = sum[i] + my_arr_2d[i][y];
			}
			System.out.println("Row [" + i + "]   " + Arrays.toString(my_arr_2d[i]));
			Thread.sleep(300);

		}

		System.out.println();
		System.out.println("Row [All] "+Arrays.toString(my_arr_1d));
		Arrays.sort(my_arr_1d);;
		System.out.println("Row [Srt] "+Arrays.toString(my_arr_1d));
		System.out.println("Row [Min] "+"["+my_arr_1d[0]+"]");
		System.out.println("Row [Max] "+"["+my_arr_1d[arr_oneDim-1]+"]");
		System.out.println();

		// arrays are sorting....
		for (int i = 0; i < arr_sizeRow; i++) {
			Arrays.sort(my_arr_2d[i]);
		}

		System.out.println("Sorted Results...");
		for (int i = 0; i < arr_sizeRow; i++) {
			System.out.println(
					"Row [" + i + "]   " + Arrays.toString(my_arr_2d[i]) 
					+ " \t\tSum [" + i + "] = " + sum[i]
					+ " \tMin [" + i + "] = " + my_arr_2d[i][0] 
					+ " \tMax [" + i + "] = " + my_arr_2d[i][arr_sizeCol - 1] 
					+ " \tAverage [" + i + "] = " + sum[i] / arr_sizeCol);
		}
	}
}
