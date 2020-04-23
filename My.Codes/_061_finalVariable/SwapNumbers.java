package _061_finalVariable;

import java.util.Arrays;

public class SwapNumbers {

	public static void main(String[] args) {

		int[] num = new int[2];
		num[0] = 3;
		num[1] = 4;

		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(numberSwap(num[0], num[1])));
	}

	final static int[] numberSwap(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		int[] nums = new int[2];
		nums[0] = a;
		nums[1] = b;

		return nums;
	}

}
