package _007_Date_Time;

import java.text.*;
import java.util.*;

/**
 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 */

public class j_040_DateClassCurrentDate2 {

	public static void main(String[] args) {

		Date currentTime = new Date();

		SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat month = new SimpleDateFormat("MMMMM EEEEE");
		SimpleDateFormat time = new SimpleDateFormat("H:MM:ss.SS");

		String dateNow = date.format(currentTime);
		String monthNow = month.format(currentTime);
		String timeNow = time.format(currentTime);
		System.out.println(dateNow);
		System.out.println(monthNow);
		System.out.println(timeNow);
	}

}
