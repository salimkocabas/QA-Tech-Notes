package _007_Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class j_001_LocalDate {

	public static void main(String[] args) {

		
		 System.out.println(LocalDateTime.now());
		 System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy")));
		 System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM")));  
		 System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd")));
		 System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH")));
		 System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("mm")));
		 System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ss")));
		 System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss.SSS")));
		
		 
		 
		 
		
	}

}
