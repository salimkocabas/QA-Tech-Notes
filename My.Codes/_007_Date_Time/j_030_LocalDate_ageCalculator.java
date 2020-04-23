package _007_Date_Time;

import java.text.ParseException;
import java.time.*;

public class j_030_LocalDate_ageCalculator {
	
	
	public static void main(String[] args) throws ParseException {
				
		
		// date of birth
		LocalDate dob = LocalDate.of(1970, 9, 5);   
		
		// today
		LocalDate now = LocalDate.now();
		
		// calculate differential
		Period diff = Period.between(dob, now); 
		
		System.out.println("DOB     : "+dob);
		System.out.println("Now     : "+now);
		System.out.printf(""
				+ "Years   : %s%n"
				+ "Months  : %s%n"
				+ "Days    : %s "
				,diff.getYears(),diff.getMonths(),diff.getDays());

	}
}