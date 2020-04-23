package _3011_List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author bulent.geckin
 *
 * 
 *         x.add(value) add new value end of list
 *
 */

public class _04_ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");

		System.out.println(animals);
		Collections.sort(animals);
		System.out.println(animals);

		System.out.println("\nOption-1");
		Object[] array1 = animals.toArray();
		System.out.println(Arrays.toString(array1));

		System.out.println("\nOption-2");
		String[] array2 = new String[animals.size()];  // create array as size of ArrayList
		array2 = animals.toArray(array2);
		System.out.println(Arrays.toString(array2));
	}

}
