package _200_Sort_Algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A003_Bubble_Sort1_random_numbers2 {
	public static void main(String[] args) {

		Random random = new Random();

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers  : ");
		int arr_len = scan.nextInt();

		System.out.println("What is the upper limit of the numbers :");
		int biggest = scan.nextInt();

		int[] my_arr = new int[arr_len];

		System.out.printf("\n%d random integer numbers created...%n", arr_len);

		// creates random numbers
		// *************************************
		for (int i = 0; i < arr_len; i++) {
			my_arr[i] = random.nextInt(biggest); // 100 mean random number 1-100 range
		}

		System.out.println(Arrays.toString(my_arr));

		Arrays.sort(my_arr);

		System.out.println("\nJava sorted...");
		System.out.println(Arrays.toString(my_arr));

	}

}
