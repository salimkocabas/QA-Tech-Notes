package _3011_List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author bulent.geckin
 *
 *	Normal array is fixed size, cannot increase-decrease ArrayList is
 *	dynamic, easily add or delete
 *	
 *	Popular methods
 *	==========================
 *	x.add(value)		add new value end of list
 *	x.add(index,value)	insert other and a value that index
 *	x.set(index,value)	change specified index of value
 *	x.remove(index)		remove specified index of value
 *	x.removeAll(x)		removes all
 *	x.size()			integer	
 *	x.contains(value) 	true/false
 *	x.indexOf(value)	integer / gives index number of value
 *	x.toArays()			convert list values as array values |Arrays.toString(x.toArray())|
 *
 */

public class _03_ArrayListGetAll {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cat");   // added new               {Cat}
		animals.add("Dog");  //  added new               {Car, Dog}
		animals.add("Bird");	// added new	   	     {Dog,Bird}
		

		// 1: Print all elements
		System.out.println("\n1: Basic");
		System.out.println(animals);

		// 2.1: Lambda Expression
		System.out.println("\n2.1:Lamda-1");
		animals.forEach(System.out::println);

		// 2.2
		System.out.println("\n2.2: Lamda-2");
		animals.forEach(x -> System.out.println(x));

		// 3: print one by one with for-loop
		System.out.println("\n3: For Loop");
		for (String x : animals)
			System.out.println(x);

		// 3.1: print one by one with for-loop
		System.out.println("\n3.1: For Loop w/index");
		for (int i = 0; i < animals.size(); i++)
			System.out.println(animals.get(i));

		// 4.1: iterator
		System.out.println("\n4: Iterator");
		Iterator<String> it = animals.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		// 4.1: iterator
		System.out.println("\n4.2: ListIterator");
		ListIterator<String> it2 = animals.listIterator();
		while (it2.hasNext())
			System.out.println(it2.next());

	}

}
