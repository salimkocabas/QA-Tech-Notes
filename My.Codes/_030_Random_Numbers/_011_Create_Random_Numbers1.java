package _030_Random_Numbers;

import java.util.Arrays;
import java.util.Random;

public class _011_Create_Random_Numbers1 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int size = 20;
		int maxRandomNum=255;
		int[] arr = new int[size];

		for (int i = 0; i < size; ++i) {

			arr[i]=rand.nextInt(maxRandomNum);
		}
		
		System.out.println("Your array that randolmy generated \n"+Arrays.toString(arr));

	}

}
