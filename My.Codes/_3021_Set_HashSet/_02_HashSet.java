package _3021_Set_HashSet;

import java.util.HashSet;

/**
 * HashSet implements SET interface
 * 
 * UNIQUE - no duplicates UNSORTED NO INDEX
 * 
 * No guarantee elements store in sequential order, randomly order
 *
 * Easily Print
 */

public class _02_HashSet {

	public static void main(String[] args) {

		// // stores values unique - no sort
		HashSet<String> days = new HashSet<String>(); // Set<String> days = new HashSet<String>();
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

		// days.remove("Monday");
		// days.removeAll(days);

		System.out.println("Hash Set [Unique Values]");
		System.out.println("Size  of Set      "
				+ " : " + days.size());
		System.out.println("Values of Set       : " + days);

		System.out.println("Contains Monday     :" + days.contains("Monday"));
		System.out.println("Contains xyz        :" + days.contains("xxxxx"));
		System.out.println("Is array empty      :" + days.isEmpty());
		days.clear();
		System.out.println("days.clear()");
		System.out.println("Is array empty now? :" + days.isEmpty());

	}
}
