package _020_Arrays;

import java.util.Arrays;

public class _042_Array_and_string2 {

	public static void main(String[] args) {

		String[] months1 = { "January", "February", "March", "June" };
		String[] months2 = { "January", "February", "March", "June" };

		Arrays.sort(months1);
		Arrays.sort(months2);

		String mon1 = Arrays.toString(months1);
		String mon2 = Arrays.toString(months2);

		System.out.println(mon1);
		System.out.println(mon2);

		System.out.println(mon1.equals(mon2));

	}

}
