package _3011_List_ArrayList;

import java.util.ArrayList;

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
 *  x.remove(<value>)   remove value - if there is more delete only one of them
 *	x.removeAll(x)		removes all
 *	x.size()			integer	
 *	x.contains(value) 	true/false
 *	x.indexOf(value)	integer / gives index number of value
 *	x.toArays()			convert list values as array values |Arrays.toString(x.toArray())|
 *
 */

public class _01_ArrayListExplantion {

	public static void main(String[] args) {
		

		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cat");   // added new               {Cat}
		animals.add("Dog");  //  added new               {Cat, Dog}
		animals.add("Dog");  //  added new               {Cat, Dog, Dog}   // ArrayList accept duplicate value
		System.out.println(animals);

		animals.remove(0); // remove first index         {Dog, Dog}
		animals.add("Bird");	// added new	   	     {Dog,Dog, Bird}
		animals.set(0,"Fish");  //set/replace/change     {Fish,Dog,Bird}
		animals.add(0,"Wolf");  //inserted               {Wolf,Fish,Dog,Bird}
		animals.remove("Fish"); //deleted 				 {Wolf,Dog,Bird}
		
		//animals.removeAll(animals);   //remove All 
		System.out.println(animals.contains("Dog"));  //false
		System.out.println(animals.contains("Fish"));  //true
		System.out.println(animals.get(0));  // Wolf
		

		System.out.println("\n1: Arrays.toString & toArray");
		System.out.println(animals);

	}

}
