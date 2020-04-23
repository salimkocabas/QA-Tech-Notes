package _041_String_Array;

import java.util.Arrays;

public class _01_String_Array2StringBuilder {

	public static void main(String[] args) {

		String[] days = new String[7];

		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";

		StringBuilder allDays = new StringBuilder();
		
		for (String x : days) {
			allDays.append(x+" ");
		}

		System.out.println();
		System.out.println("Days, all ine one String : " + allDays);

		System.out.println("Days, Arrays.toSring()   : " + Arrays.toString(days));

	}
}
