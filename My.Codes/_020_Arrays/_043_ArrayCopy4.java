package _020_Arrays;

// method: Arrays.copyOf(master,x)  master: master array: x:elements of array 0..x

import java.util.Arrays;

public class _043_ArrayCopy4 {

	public static void main(String[] args) throws InterruptedException {
		String[] arr1 = new String[] { "a", "b", "c", "d", "e", "f", "g" };
		String[] arr2 = new String[0];// array initialize with zero

		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println();

		// copy one by one :)
		System.out.println("copyiny one by one ");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr2 : " + Arrays.toString(arr2));
			Thread.sleep(50);
			arr2 = Arrays.copyOf(arr1, i + 1);
		}

		System.out.println();
		System.out.println("done");

		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println();

		// shrink one by one
		System.out.println("shrinking one by one ");	

		for (int i = arr1.length; i >= 0; i--) {
			arr2 = Arrays.copyOf(arr1, i);
			System.out.println("arr2 : " + Arrays.toString(arr2));
			Thread.sleep(50);
		}

		System.out.println();
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));

	}

}
