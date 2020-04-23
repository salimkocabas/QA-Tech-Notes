package _3011_List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bulent.geckin
 *
 *	
 *	x.add(value)		add new value end of list
 *
 */

public class _02_ArrayListSort {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cat"); 
		animals.add("Dog"); 
		animals.add("Bird");
		animals.add("Fish");
		animals.add("Zebra");
		animals.add("Elephant");
		

		System.out.println("Array List");
		System.out.println(animals);
		
		String [] animalsArray = new String[animals.size()];
		animalsArray=animals.toArray(animalsArray);
		
		System.out.println("\nBasic Array");
		System.out.println(Arrays.toString(animalsArray));
		
		System.out.println("\nget 5th indexed (6th) element");
		System.out.println(animals.get(5));
		System.out.println(animalsArray[5]);
		
		System.out.println(animals.get(5).contentEquals(animalsArray[5]));
		
		
		
		System.out.println("\nSorted");
		Arrays.sort(animalsArray); System.out.println(Arrays.toString(animalsArray));
		Collections.sort(animals); System.out.println(animals);
		

		
		
	}

}
