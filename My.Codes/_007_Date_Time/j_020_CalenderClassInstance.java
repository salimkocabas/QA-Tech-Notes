package _007_Date_Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 * @author bulent.geckin
 *         https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
 * 
 *         Calender.getInstance().get(Calendar.XXX)) Calender.getTime();
 * 
 */

public class j_020_CalenderClassInstance {
	public static void main(String[] args) {

		System.out.println("Calender Class full path of method");
		System.out.println(Calendar.getInstance().get(Calendar.YEAR)); // LONG WAY
		System.out.println();

		System.out.println("Calender method usage as an Object creationg");
		Calendar cal = Calendar.getInstance();
		System.out.println("Year	:" + cal.get(Calendar.YEAR));
		System.out.println("Month	:" + cal.get(Calendar.MONTH));
		System.out.println("Day  	:" + cal.get(Calendar.DAY_OF_MONTH));

		
		System.out.println("\n getTime() method without format {raw format}");
		System.out.println(cal.getTime());
		
		
		System.out.println("\n getTime() method with with yyy/MM/dd Format}");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(cal.getTime()));

	}
}