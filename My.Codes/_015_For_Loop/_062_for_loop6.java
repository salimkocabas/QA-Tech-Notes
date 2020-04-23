package _015_For_Loop;

public class _062_for_loop6 {

	public static void main(String args[]) {

		int[] numbers = { 1, 2, 3 };

		System.out.printf("you have %d numbers in your series\n", numbers.length);

		// method 1:

		for (int x : numbers) {
			System.out.printf(" %d",x);
		}

		System.out.println();

		// method 2:

		// (numbers.length) tell us how many items in numbers array

		for (int x = 0; x < numbers.length; x++) {
			System.out.print(numbers[x] + " ");
		}
	}

}
