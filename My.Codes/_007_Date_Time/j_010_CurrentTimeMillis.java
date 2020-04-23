package _007_Date_Time;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class j_010_CurrentTimeMillis {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		long startTime; // start time
		long endTime; // end time
		double time; // time difference

		Scanner read = new Scanner(System.in);
		System.out.print("How many number Java would genarete :");

		int size = read.nextInt();
		int maxRandomNum = 255;
		Random rand = new Random();

		int[] arr = new int[size];

		startTime = System.currentTimeMillis(); // start time

		for (int i = 0; i < size; ++i) {

			arr[i] = rand.nextInt(maxRandomNum);
		}

		endTime = System.currentTimeMillis();
		time = (endTime - startTime) / 1000.0;

		
		System.out.print("Your array generated in second \n"+time);

		//System.out.print(Arrays.toString(arr));

	}

}
