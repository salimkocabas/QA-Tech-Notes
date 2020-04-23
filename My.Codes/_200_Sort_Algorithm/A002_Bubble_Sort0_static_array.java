package _200_Sort_Algorithm;

import java.util.Arrays;

public class A002_Bubble_Sort0_static_array {
	public static void main(String[] args) {

		int[] my_array = { 4144, 85, 124, -56, 143, 1, 5, 54, -22, -23, 66, 1, -99, -77, 2132, 9, 423423, 11, -833 };

		int temp;
		int z = 0;

		long startTime; // start time
		long endTime; // end time
		double time; // time difference

		int arrayLength = my_array.length;

		System.out.println(Arrays.toString(my_array));
		System.out.println("Array lenght: " + arrayLength);

		startTime = System.currentTimeMillis(); // start time

		for (int x = 0; x < arrayLength; ++x) {

			for (int y = 0; y < (arrayLength - 1); ++y) {
				if (my_array[y] > my_array[y + 1]) {
					temp = my_array[y];
					my_array[y] = my_array[y + 1];
					my_array[y + 1] = temp;
					z++;

				}
			}

		}

		System.out.println(z + " step");

		endTime = System.currentTimeMillis();
		time = (endTime - startTime) / 1000.0;

		System.out.print("takes " + time);

		System.out.println("\n" + Arrays.toString(my_array));
	}
}