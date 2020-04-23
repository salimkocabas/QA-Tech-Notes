package _002_String_Class_IQ;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class dateDemo {

	public static void main(String[] args) {

		// 1 : System.out.println(LocalDateTime.now());
		System.out.println("n1: java.time.LocalDateTime.class");
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy")));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("M")));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("d")));

		// 2:
		System.out.println("\n2: java.util.Calendar.class");
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));   //Returns int value, easily use
		System.out.println(Calendar.getInstance().get(Calendar.MONTH)); 
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)); 

		// 3:
		System.out.println("\n3: java.util.Date.class");
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
		System.out.println(sdf.format(d));

	}

}
