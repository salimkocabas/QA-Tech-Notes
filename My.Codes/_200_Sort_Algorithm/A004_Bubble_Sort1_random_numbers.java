package _200_Sort_Algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class A004_Bubble_Sort1_random_numbers {
	public static void main(String[] args) {

		Random random = new Random();
		
		@SuppressWarnings("resource")
		
		Scanner scan= new Scanner(System.in);
		System.out.println("How many numbers  : ");
		int arr_len=scan.nextInt();
	
		System.out.println("What is the upper limit of the numbers :");
		int biggest=scan.nextInt();
		
		int[] my_arr = new int[arr_len];

		System.out.printf("\n... %d random integer numbers created...%n", arr_len);

		// creates random numbers
		// *************************************
		for (int i = 0; i < arr_len; i++) {
			my_arr[i] = random.nextInt(biggest); // 100 mean random number 1-100 range
		}

		System.out.println(Arrays.toString(my_arr));

		// *************************************

		// java sort option is easy
//		Arrays.sort(my_arr);
//		System.out.println("\nJava sorted...");
//		System.out.println(Arrays.toString(my_arr));

		int temp;
		int z = 0;

		for (int x = 0; x < arr_len; ++x) {

			for (int y = 0; y < (arr_len - 1); ++y) {
				if (my_arr[y] > my_arr[y + 1]) {
					temp = my_arr[y];
					my_arr[y] = my_arr[y + 1];
					my_arr[y + 1] = temp;
					z++;

				}
			}

		}

		System.out.printf("%nit takes %d steps %n%n", z);
		System.out.println("My code sorted...");
		System.out.println(Arrays.toString(my_arr));

	}

}
