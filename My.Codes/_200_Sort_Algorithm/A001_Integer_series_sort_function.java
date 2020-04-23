package _200_Sort_Algorithm;

import java.util.*;

public class A001_Integer_series_sort_function {
	@SuppressWarnings({ "resource" })

	public static void main(String[] args) {

		System.out.println("Enter 5 numbers....");

		int size=5;
		int i[] = new int[size];
		
		Scanner readit = new Scanner(System.in);

		for (int x = 1; x <= size; ++x) {

			System.out.printf("Enter %d number 	:", x);
			i[x - 1] = readit.nextInt();
		}

		System.out.printf("\nYou entered   %s", Arrays.toString(i)); // prints numbers that you entered
		Arrays.sort(i); // sort command
		System.out.printf("\nSorted Result %s", Arrays.toString(i)); // prints sorted result

	}

}
