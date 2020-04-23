package _061_finalVariable;

import java.util.Arrays;

public class FinalChanged {

	public static void main(String[] args) {

		final String DAY[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		System.out.println(Arrays.toString(DAY));

		DAY[0] = "MONDAY"; // FINAL value is Changed  it's proof :)
		System.out.println(Arrays.toString(DAY));

	}

}
