package _030_Random_Numbers;

import java.util.Arrays;
import java.util.Random;

public class _011_Create_Random_Chars {

	public static void main(String[] args) {

		Random randomNumber = new Random();
		
		int size = 20;
		int maxRandomNum=90;
		int[] arr = new int[size];

		for (int i = 0; i < size; ++i) {

			arr[i]=randomNumber.nextInt(maxRandomNum)+65;
			System.out.print(Character.toString((char) arr[i])+" ");
		}
		
		System.out.println("\nYour array that randolmy generated \n"+Arrays.toString(arr));
	
	
	}

}
