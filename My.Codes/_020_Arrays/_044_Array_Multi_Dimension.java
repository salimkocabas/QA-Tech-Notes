package _020_Arrays;

import java.util.Arrays;

public class _044_Array_Multi_Dimension {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };  // different way to initialize array
		int[] arr2 = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 

		
		int[][] arr3 = new int[][] { { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8, 10,11 } };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		System.out.println();
		System.out.println(Arrays.toString(arr3));
		// Output : [[I@15db9742, [I@6d06d69c]

		System.out.println(Arrays.deepToString(arr3));
		// Output : [[1, 3, 5, 7, 9], [2, 4, 6, 8, 10]]

		System.out.println("\nLenght");
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		System.out.println(arr3[1].length);
        
	}
}