package _020_Arrays;

import java.io.*;
import java.util.Arrays;

public class _00_integer_Array2 {

	public static void main(String[] args) throws IOException {
		int[] arr0;

		arr0 = new int[2];System.out.println(Arrays.toString(arr0));
		arr0[0] = 1;
		arr0[1] = 1;
		System.out.println(Arrays.toString(arr0));
		
		arr0 = new int[3]; System.out.println(Arrays.toString(arr0));
		arr0[0] = 1;
		arr0[1] = 1;
		arr0[2] = 2;
		System.out.println(Arrays.toString(arr0));
		
		
		arr0 = new int[2];
		System.out.println(Arrays.toString(arr0));

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = new int[] { 1, 2, 3 };
		int[] arr3 = new int[3];

	}
}
