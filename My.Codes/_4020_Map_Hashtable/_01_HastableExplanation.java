package _4020_Map_Hashtable;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 
 * 1) HashMap is non-synchronized. This means if it’s used in multithread
 * environment then more than one thread can access and process the HashMap
 * simultaneously.
 * 
 * Hashtable is synchronized. It ensures that no more than one thread can access
 * the Hashtable at a given moment of time. The thread which works on Hashtable
 * acquires a lock on it to make the other threads wait till its work gets
 * completed.
 * 
 * 2) HashMap allows one null key and any number of null values.
 * 
 * Hashtable doesn’t allow null keys and null values.
 * 
 * 3) HashMap implementation LinkedHashMap maintains the insertion order and
 * TreeMap sorts the mappings based on the ascending order of keys.
 * 
 * Hashtable doesn’t guarantee any kind of order. It doesn’t maintain the
 * mappings in any particular order.
 * 
 * 4) Initially Hashtable was not the part of collection framework it has been
 * made a collection framework member later after being retrofitted to implement
 * the Map interface.
 * 
 * HashMap implements Map interface and is a part of collection framework since
 * the beginning.
 * 
 * 5) Another difference between these classes is that the Iterator of the
 * HashMap is a fail-fast and it throws ConcurrentModificationException if any
 * other Thread modifies the map structurally by adding or removing any element
 * except iterator’s own remove() method. In Simple words fail-fast means: When
 * calling iterator.next(), if any modification has been made between the moment
 * the iterator was created and the moment next() is called, a
 * ConcurrentModificationException is immediately thrown.
 * 
 * 
 */

public class _01_HastableExplanation {

	public static void main(String[] args) {
		
		
		String nullStr = null;
		
		HashMap<String, String> myHashMap = new HashMap<>();
		myHashMap.put("USA", "1");
		myHashMap.put("UK", "44");
		myHashMap.put("France", "33");
		myHashMap.put(nullStr, "99"); // Accepts null KEY
		myHashMap.put("Japan", nullStr); // Accepts null VALUE
		System.out.println(myHashMap);

		Hashtable<String, String> myhashtable = new Hashtable<>();
		myhashtable.put("USA", "1");
		myhashtable.put("UK", "44");
		myhashtable.put("France", "33");
		//myhashtable.put(nullStr, 33); // Does not accept null KEY table    {java.lang.NullPointerException}
		//myhashtable.put("UnKnown", nullStr); // Does not accept null VALUE 
		System.out.println(myhashtable);
		
		 // {java.lang.NullPointerException} because myHashMap has NULL value(s) or key(s)
		// Hashtable<String, String> xx = new Hashtable<>(myHashMap); 	System.out.println(xx); 

		
		// Works fine
		HashMap<String, String> yy = new HashMap<>(myhashtable); System.out.println(yy);   // Thats OK
		

	}
}
