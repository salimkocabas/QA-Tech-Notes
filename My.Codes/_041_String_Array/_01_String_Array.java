package _041_String_Array;

import java.util.Arrays;

public class _01_String_Array {

	public static void main(String[] args) {

		String[] days = new String[7];

		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";

		String allDays = "";
		System.out.print("Days, print one by one   : ");
		for (String x : days) {
			System.out.print(x + ", ");
			allDays = allDays + x + " ";
		}
		System.out.println();
		System.out.println("Days, all ine one String : " + allDays);

		System.out.println("Days, Arrays.toSring()   : "+Arrays.toString(days));

	}
}
