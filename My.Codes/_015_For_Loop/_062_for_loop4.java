package _015_For_Loop;

public class _062_for_loop4 {

	public static void main(String args[]) {

		int[] numbers = { 1, 2, 3 };

		// method 1:

		for (int x : numbers) {
			System.out.println(x);
		}

		// method 2:

		// (numbers.length) tell us how many items in numbers array

		for (int x = 0; x < numbers.length; x++) {
			System.out.println(numbers[x]);
		}
	}

}
