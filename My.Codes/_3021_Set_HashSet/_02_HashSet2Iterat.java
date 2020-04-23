package _3021_Set_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * HashSet implements SET interface
 * 
 * UNIQUE - no duplicates UNSORTED NO INDEX
 * 
 * No guarantee elements store in sequential order, randomly order
 *
 * Easily Print
 */

public class _02_HashSet2Iterat {

	public static void main(String[] args) {

		// // stores values unique - no sort
		HashSet<String> cars = new HashSet<String>(); // Set<String> days = new HashSet<String>();
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Audi");
		cars.add("Mercedes");
		cars.add("Tesla");
		cars.add("Alfa-Romeo");
		
		Iterator<String> it=cars.iterator();
		do {
			System.out.print(it.next()+",");
		} while (it.hasNext());
		
		
		System.out.println();
		
		
		TreeSet<String> carS = new TreeSet<String>(cars); // Set<String> days = new HashSet<String>();

		Iterator<String> itx=carS.iterator();
		do {
			System.out.printf(itx.next()+",");
		} while (itx.hasNext());
		
		
		

	}
}
