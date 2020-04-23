package _007_Date_Time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class j_002_LocalDate {

	public static void main(String[] args) {

		System.out.println("Date is		 	: " + LocalDate.now()); // Display the current date
		System.out.println("Time  is 		: " + LocalTime.now()); // Display the current date
		System.out.println("Date and Time  is 	: " + LocalDateTime.now()); // Display the current date

		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting	: " + myDateObj);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting	: " + formattedDate);

		myFormatObj = DateTimeFormatter.ofPattern("yyyy");
		formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Year			: " + formattedDate);

		myFormatObj = DateTimeFormatter.ofPattern("MMMM,yy");
		formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Year			: " + formattedDate);

		myFormatObj = DateTimeFormatter.ofPattern("E ,MMMM yyyy");
		formattedDate = myDateObj.format(myFormatObj);
		System.out.println("Year			: " + formattedDate);

		/*
		 * yyyy-MM-dd "1988-09-29" dd/MM/yyyy "29/09/1988" dd-MMM-yyyy "29-Sep-1988" E,
		 * MMM dd yyyy "Thu, Sep 29 1988"
		 */

		
		System.out.println(LocalDateTime.now());
		
		
	}
}
