package _3023_Set_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * UNIQUE - no duplicates UNSORTED NO INDEX
 * SORTED
 *
 * Easily Print
 */

public class _02_TreeSet {

	public static void main(String[] args) {

		// // stores values unique - no sort
		TreeSet<String> days = new TreeSet<String>(); 
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");

		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");


		System.out.println("Values of Set      : " + days);
		
		


	}
}
