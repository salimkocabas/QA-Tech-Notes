package _007_Date_Time;

import java.text.*;
import java.util.*;

public class j_040_DateClassCurrentDate {

	public static void main(String[] args) {

		
		System.out.println((new SimpleDateFormat("yyyy")).format(new Date())); 
		System.out.println((new SimpleDateFormat("yyyy/MM")).format(new Date())); 
		System.out.println((new SimpleDateFormat("yyyy/MMM")).format(new Date())); 
		System.out.println((new SimpleDateFormat("yyyy/MMMM")).format(new Date())); 
		System.out.println((new SimpleDateFormat("yyyy/MM/dd")).format(new Date())); 
		System.out.println((new SimpleDateFormat("HH")).format(new Date())); 
		System.out.println((new SimpleDateFormat("HH:mm")).format(new Date())); 
		System.out.println((new SimpleDateFormat("HH:mm:ss")).format(new Date())); 
		System.out.println((new SimpleDateFormat("dd MMM yyyy  HH:mm")).format(new Date())); 
		System.out.println((new SimpleDateFormat("dd")).format(new Date())); 
		
		
	}

}
