package _020_Arrays;

import java.util.Arrays;

//arraycopy

// public static native void arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);

public class _043_ArrayCopy5 {

	public static void main(String[] args) throws InterruptedException {

		int[] masterArray = { 1, 2, 3, 4, 5 };
		int[] copyArray = new int[10];
		System.out.println(Arrays.toString(copyArray));
		System.out.println("Master array :" +Arrays.toString(masterArray));

		System.out.println();
		System.arraycopy(masterArray, 0, copyArray, 2, 5);// 5 is the length to copy
		System.out.println(Arrays.toString(copyArray));

		System.arraycopy(masterArray, 0, copyArray, 0, 1); // start to change 0 to 1, mean only changed first value of
															// array
		System.out.println(Arrays.toString(copyArray));

	}

}
